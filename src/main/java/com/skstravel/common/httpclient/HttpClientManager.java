package com.skstravel.common.httpclient;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContextBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * http连接池管理类
 * 
 * @author qiuwei
 *
 */
public class HttpClientManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(HttpClientManager.class);

    /**
     * 最大连接数400
     */
    private static int MAX_TOTAL = 400;

    /**
     * 单路由最大连接数80
     */
    private static int MAX_PER_ROUTE = 80;

    private static Object LOCAL_LOCK = new Object();

    private static PoolingHttpClientConnectionManager connectionManager = null;

    static {
        if(null == connectionManager) {
            synchronized(LOCAL_LOCK) {
                if(null == connectionManager) {
                    SSLContextBuilder sslContextBuilder = new SSLContextBuilder();
                    try {
                        sslContextBuilder.loadTrustMaterial(null, new TrustSelfSignedStrategy());
                        SSLConnectionSocketFactory socketFactory = new SSLConnectionSocketFactory(sslContextBuilder.build());
                        Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory> create()
                            .register("https", socketFactory).register("http", new PlainConnectionSocketFactory()).build();
                        connectionManager = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
                        connectionManager.setMaxTotal(MAX_TOTAL);
                        connectionManager.setDefaultMaxPerRoute(MAX_PER_ROUTE);
                    } catch(Exception e) {
                        LOGGER.error("Init PoolingHttpClientConnectionManager Error", e);
                    }

                }
            }
        }
    }

    /**
     * 创建线程安全的HttpClient
     * 
     * @param config
     *        客户端超时设置
     * 
     * @return
     */
    public static CloseableHttpClient getHttpsClient(RequestConfig config) {
        CloseableHttpClient httpClient =
            HttpClients.custom().setDefaultRequestConfig(config).setConnectionManager(connectionManager).build();
        return httpClient;
    }

}
