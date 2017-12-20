<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <c:set var="prc" value="${pageContext.request.contextPath }"></c:set>
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="${prc }/assets/css/public.css"/>
    <link rel="stylesheet" href="${prc }/assets/css/style.css"/>
    <link rel="stylesheet" href="${prc }/assets/css/font-awesome.css"/>
    <script src="${prc }/assets/js/jquery-3.2.1.min.js"></script>
    <link rel="stylesheet" href="${prc }/assets/css/n-date.css"/>
    <script src="${prc }/assets/js/n-date.js"></script>
    <script src="${prc }/assets/js/iscroll.js"></script>
</head>
<body class="gary-bg">
<div class="wrapper bot60">
    <header>
        <div class="mobile-nav">
            <span></span>
            <span></span>
            <span></span>
        </div>
        <img src="${prc }/assets/images/logo.png" alt="" width="80"/>
        <div class="center">
            <a href="center.html"><img src="${prc }/assets/images/my.png " alt=""/></a>
        </div>
    </header>
    <div class="orderCheckDetail">
        <ul>
            <li>订单号：${order.orderSn }</li>
            <li>下单时间：${order.addTime }</li>
            <li>订单状态：已取消</li>
            <li>付款状态：未付款</li>
            <li>金额：¥ ${order.orderAmount }</li>
        </ul>
    </div>
    <div class="orderCheckDetail">
        <ul>
            <li>订单号：2017110112062</li>
            <li>合同编号：2017110112062</li>
            <li>下单时间：2017-11-01 17:11:45</li>
            <li>订单状态：<font color="red">支付成功</font></li>
            <li>付款状态：<font color="green">已付款</font></li>
            <li>单票：瑞士西部滑雪5晚7天主题游</li>
            <li>套餐：无</li>
            <li>酒店：Holiday Inn Lyon Vai</li>
            <li>机票：无</li>
        </ul>
    </div>
    <div class="addList">
        <div class="nickname"><span>姓名：</span><span>步步高</span></div>
        <div class="e-mail">护照号码：E05746286</div>
        <div class="e-mail">详细地址：深圳市南山区科技园南区R2-B三楼步步高</div>
        <div class="e-mail">电子邮件：34345656@qq.com</div>
        <div class="e-mail">手机：13901203948</div>
    </div>
</div>
</body>
</html>