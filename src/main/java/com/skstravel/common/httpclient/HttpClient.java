package com.skstravel.common.httpclient;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * http协议工具类
 * 
 * @author qiuwei
 *
 */
@Component
public class HttpClient {

    private RequestConfig requestConfig;

    public HttpClient() {
        this.requestConfig = RequestConfig.custom().setCookieSpec(CookieSpecs.DEFAULT).build();
    }

    public HttpClient(int timeout) {
        this.requestConfig = RequestConfig.custom().setCookieSpec(CookieSpecs.DEFAULT).setConnectTimeout(timeout).build();
    }

    /**
     * post提交content
     * 
     * @param url
     * @param charset
     * @param content
     * @return
     */
    public String post(String url, String charset, String content) {
        String result = "";
        HttpPost httppost = null;
        try {
            // 创建httppost
            httppost = new HttpPost(url);
            // httppost.setConfig(requestConfig);
            // 创建参数队列
            if(content != null) {
                httppost.setEntity(new StringEntity(content, charset));
            }
            CloseableHttpResponse response = HttpClientManager.getHttpsClient(requestConfig).execute(httppost);
            try {
                HttpEntity entity = response.getEntity();
                if(entity != null) {
                    long len = entity.getContentLength();
                    if(len != -1 && len < 2048) {
                        result = EntityUtils.toString(entity, charset);
                    } else {
                        BufferedReader bufferedReader = null;
                        InputStream instream = entity.getContent();
                        try {
                            StringBuffer stringBuffer = new StringBuffer();
                            bufferedReader = new BufferedReader(new InputStreamReader(instream));
                            String tmp = "";
                            while((tmp = bufferedReader.readLine()) != null) {
                                stringBuffer.append(tmp);
                            }
                            result = stringBuffer.toString();
                        } finally {
                            bufferedReader.close();
                            instream.close();
                        }
                    }
                }
            } finally {
                response.close();
            }
        } catch(ClientProtocolException e) {
            e.printStackTrace();
        } catch(UnsupportedEncodingException e1) {
            e1.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            httppost.releaseConnection();
        }
        return result;
    }

    public String post(String url, String charset, Map<String, String> parameters) {
        String result = "";
        HttpPost httppost = null;
        try {
            // 创建httppost
            httppost = new HttpPost(url);
            // httppost.setConfig(requestConfig);
            // 创建参数队列
            if(parameters != null) {
                List<NameValuePair> params = new ArrayList<NameValuePair>();
                for(Entry<String, String> parm: parameters.entrySet()) {
                    params.add(new BasicNameValuePair(parm.getKey(), parm.getValue()));
                }
                httppost.setEntity(new UrlEncodedFormEntity(params, charset));
            }
            CloseableHttpResponse response = HttpClientManager.getHttpsClient(requestConfig).execute(httppost);
            try {
                HttpEntity entity = response.getEntity();
                if(entity != null) {
                    long len = entity.getContentLength();
                    if(len != -1 && len < 2048) {
                        result = EntityUtils.toString(entity, charset);
                    } else {
                        BufferedReader bufferedReader = null;
                        InputStream instream = entity.getContent();
                        try {
                            StringBuffer stringBuffer = new StringBuffer();
                            bufferedReader = new BufferedReader(new InputStreamReader(instream));
                            String tmp = "";
                            while((tmp = bufferedReader.readLine()) != null) {
                                stringBuffer.append(tmp);
                            }
                            result = stringBuffer.toString();
                        } finally {
                            bufferedReader.close();
                            instream.close();
                        }
                    }
                }
            } finally {
                response.close();
            }
        } catch(ClientProtocolException e) {
            e.printStackTrace();
        } catch(UnsupportedEncodingException e1) {
            e1.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            httppost.releaseConnection();
        }
        return result;
    }

    public String get(String url, String charset, Map<String, String> parameters) {
        String result = "";
        HttpGet httpget = null;
        try {
            URI uri = null;
            try {
                URIBuilder uriBuilder = new URIBuilder(url);
                // 创建参数队列
                if(parameters != null) {
                    List<NameValuePair> params = new ArrayList<NameValuePair>();
                    for(Entry<String, String> parm: parameters.entrySet()) {
                        params.add(new BasicNameValuePair(parm.getKey(), parm.getValue()));
                    }
                    uriBuilder.addParameters(params);
                    uriBuilder.setCharset(Charset.forName(charset));
                }
                uri = uriBuilder.build();
            } catch(URISyntaxException e) {
                e.printStackTrace();
            }
            httpget = new HttpGet(uri);
            // httpget.setConfig(requestConfig);
            CloseableHttpResponse response = HttpClientManager.getHttpsClient(requestConfig).execute(httpget);
            try {
                HttpEntity entity = response.getEntity();
                if(entity != null) {
                    long len = entity.getContentLength();
                    // System.out.println("len----------" + len);
                    if(len != -1 && len < 2048) {
                        result = EntityUtils.toString(entity, charset);
                    } else {
                        BufferedReader bufferedReader = null;
                        InputStream instream = entity.getContent();
                        try {
                            StringBuffer stringBuffer = new StringBuffer();
                            bufferedReader = new BufferedReader(new InputStreamReader(instream));
                            String tmp = "";
                            while((tmp = bufferedReader.readLine()) != null) {
                                stringBuffer.append(tmp);
                            }
                            result = stringBuffer.toString();
                        } finally {
                            bufferedReader.close();
                            instream.close();
                        }
                    }
                }
            } finally {
                response.close();
            }
        } catch(ClientProtocolException e) {
            e.printStackTrace();
        } catch(UnsupportedEncodingException e1) {
            e1.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            httpget.releaseConnection();
        }
        return result;
    }
}