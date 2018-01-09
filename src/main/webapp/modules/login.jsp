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
    			<div>${msg }</div>
        <div class="loginInputWrap">
            <input type="text"  name="mobilePhone"   placeholder="在这里输入手机号"/>
        </div>
    </div>
    <div class="loginList">
        <div class="loginInputWrap"><input type="password"  name="password"   placeholder="请输入密码"/></div>
    </div>
    <div class="min-login-a">
        <a href="setPassword.html" class="forget">忘记密码</a>
        <a href="${prc }/login/registerUI" class="register">注册</a>
    </div>
</div>
<div class="addLinkbtns">
    <a  href="javascript:subm()"       >登 录</a> 
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
</body>
</html>