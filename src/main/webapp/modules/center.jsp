<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
     <c:set var="prc" value="${pageContext.request.contextPath }"></c:set><!--
    这是我设置的一个别名  ,主要是用来简化写    ${prc } 这样获取 -->
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <!-- 这个就 相当与 ${prc }   == ${pageContext.request.contextPath }  就是项目名称  -->
    <link rel="stylesheet" href="${prc }/assets/css/public.css"/>
    <link rel="stylesheet" href="${prc }/assets/css/style.css"/>
    <link rel="stylesheet" href="${prc }/assets/css/font-awesome.css"/>
    <link href="${prc }/assets/css/swiper.min.css" rel="stylesheet" />
    <script src="${prc }/assets/js/jquery-3.2.1.min.js"></script>
    <link rel="stylesheet" href="${prc }/assets/css/n-date.css"/>
    <script src="${prc }/assets/js/n-date.js"></script>
    <script type = "text/javascript" src = "${prc }/assets/js/cmblifeSDK.js"></script>
</head>
<body class="gary-bg">
<div class="wrapper bot60">
    <header>
        <div class="mobile-nav">
            <span></span>
            <span></span>
            <span></span>
        </div>
        <img src="/assets/images/logo.png" alt="" width="80"/>
        <div class="center">
            <a href="/user/center.controller"><img src="/assets/images/my.png " alt=""/></a>
        </div>
    </header>
    <div class="user">
        <div class="userHeadImg">
            <img src="/assets/images/userhead.png" alt=""/>
        </div>
        欢迎：用户${userName}
    </div>
    <div class="myWrap">
        <ul>
            <li><a href="/orderinfo/{myorder}.controller"><span><img src="/assets/images/order04.png" alt=""/></span>我的订单</a></li>
            <li><a href="/user/addresslist.controller"><span><img src="/assets/images/order05.png" alt=""/></span>联系地址管理</a></li>
            <li><a href="voucher.html"><span><img src="/assets/images/order06.png" alt=""/></span>付款凭证</a></li>
            <li><a href="/user/beare.controller"><span><img src="/assets/images/order07.png" alt=""/></span>持票人信息</a></li>
        </ul>
    </div>
    <div class="myWrap">
        <ul>
            <li><a href="/user/todetail.controller"><span><img src="/assets/images/order08.png" alt=""/></span>个人资料</a></li>
            <%--<li><a href="password.html"><span><img src="/assets/images/order09.png" alt=""/></span>修改密码</a></li>--%>
        </ul>
    </div>
</div>
</body>
</html>