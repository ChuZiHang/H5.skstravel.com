<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <c:set var="prc" value="${pageContext.request.contextPath }"></c:set>
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="${prc }/assets/css/public.css"/>
    <link rel="stylesheet" href="${prc }/assets/css/style.css"/>
    <link rel="stylesheet" href="${prc }/assets/css/login.css"/>
    <link rel="stylesheet" href="${prc }/assets/css/font-awesome.css"/>
    <script src="${prc }/assets/js/jquery-3.2.1.min.js"></script>
    <link rel="stylesheet" href="${prc }/assets/css/n-date.css"/>
    <script src="${prc }/assets/js/n-date.js"></script>
    <script src="${prc }/assets/js/iscroll.js"></script>
    <script src="${prc }/assets/js/jquery.cookie.js"></script>
</head>
<body>
<header>
    <div class="mobile-nav">
        <span></span>
        <span></span>
        <span></span>
    </div>
    <img src="${prc }/assets/images/logo.png" alt="" width="80"/>
</header>

<form action="${prc }/login/login"  method="post"  id="loginForm"  >
<div class="loginWrap">
    <div class="loginLogo"><img src="${prc }/assets/images/logo01.png" alt=""/></div>
    <div class="loginList">
    			<div><c:if  test="${errorMsg !=null }">${errorMsg}</c:if></div>
        <div class="loginInputWrap">
            <input type="text"  name="mobilePhone"  id="mobilePhone"     placeholder="在这里输入手机号"/>
        </div>
    </div>

    <div class="loginList">
        <div class="loginInputWrap"><input type="text"  name="mobileValidateCode"    placeholder="手机验证码"/>
            <input type="button"   value="获取验证码"  class="getCheckCode"    id="getting"   /></div>
    </div>


    <div class="min-login-a">
       <%-- <a href="setPassword.html" class="forget">忘记密码</a>--%>
        <a href="${prc }/login/registerUI" class="register">注册</a>
    </div>
</div>
<div class="addLinkbtns">
    <a  href="javascript:subm()">登 录</a>
   <!-- <button type="submit" value="登录" class="login">登录</button> -->
</div>
<script type="text/javascript">
	function subm(){
		//alert("aaa");
		$("#loginForm").submit();
	}
</script>
<div class="min-login-a">
    <!--<a></a>-->
    <input type="checkbox" name="remember">自动登录
    <!--<span>自动登录</span>-->
</div>
</form>
<script  >
    $(function(){
        var flag="";
        $("#getting").click(function(){
            var mobilePhone=$("#mobilePhone").val();
            var url="../login/getMobileCode";
            //alert(mobilePhone);
            if(mobilePhone==null ||mobilePhone==""){
                alert("请输入手机号码");
                flag=false;
                return ;
            }else{
                $.post(
                    url,
                    {"mobilePhone":mobilePhone},
                    function(data){
                        //alert(data);
                        if(data=='1'){
                            alert("短信已发送，请注意查收!!!");
                        }else{
                            alert("系统异常，短信发送失败！！请稍后再试");
                        }
                    }
                );

            }})

        //	alert(flag);


        if(flag){
            /*仿刷新：检测是否存在cookie*/
            if($.cookie("captcha")){
                var count = $.cookie("captcha");
                var btn = $('#getting');
                btn.val(count+'秒后可重新获取').attr('disabled',true).css('cursor','not-allowed');
                var resend = setInterval(function(){
                    count--;
                    if (count > 0){
                        btn.val(count+'秒后可重新获取').attr('disabled',true).css('cursor','not-allowed');
                        $.cookie("captcha", count, {path: '/', expires: (1/86400)*count});
                    }else {
                        clearInterval(resend);
                        btn.val("获取验证码").removeClass('disabled').removeAttr('disabled style');
                    }
                }, 1000);
            }
            /*点击改变按钮状态，已经简略掉ajax发送短信验证的代码*/
            $('#getting').click(function(){
                var btn = $(this);
                var count = 60;
                var resend = setInterval(function(){
                    count--;
                    if (count > 0){
                        btn.val(count+"秒后可重新获取");
                        $.cookie("captcha", count, {path: '/', expires: (1/86400)*count});
                    }else {
                        clearInterval(resend);
                        btn.val("获取验证码").removeAttr('disabled style');
                    }
                }, 1000);
                btn.attr('disabled',true).css('cursor','not-allowed');
            });
        }
    });
</script>
</body>
</html>