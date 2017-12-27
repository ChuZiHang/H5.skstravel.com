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
    <%@ include file="/modules/header.jsp"%>
    <div class="orderCheckDetail">
        <ul>
            <li>订单号：${order.orderSn }</li>
            <li>下单时间：${order.addTime }</li>
            <c:choose>
            	<c:when test="${order.orderStatus==false }">
	            	<li>订单状态：未支付</li>
            	</c:when>
            	<c:when test="${order.orderStatus==true }">
	            	<li>付款状态：已支付</li>
            	</c:when>
            	<c:when test="${order.orderStatus==true }">
	            	<li>付款状态：已取消</li>
            	</c:when>
            </c:choose>
            <c:choose>
            	<c:when test="${order.payStatus==false }">
	            	<li>付款状态：未支付</li>
            	</c:when>
            	<c:when test="${order.payStatus==true }">
	            	<li>付款状态：已支付</li>
            	</c:when>
            </c:choose>
            <li>金额：¥ ${order.orderAmount }</li>
        </ul>
    </div>
    <div class="orderCheckDetail">
        <ul>
            <li>订单号：${order.orderSn }</li>
            <li>合同编号：${order.cardNum }</li>
            <li>下单时间：${order.addTime }</li>
            <c:choose>
            	<c:when test="${order.orderStatus==false }">
	            	 <li>订单状态：<font color="red">支付成功</font></li>
            	</c:when>
            	<c:when test="${order.orderStatus==true }">
	            	 <li>订单状态：<font color="red">待付款</font></li>
            	</c:when>
            	<c:when test="${order.orderStatus==true }">
	            	 <li>订单状态：<font color="red">已取消</font></li>
            	</c:when>
            </c:choose>
            <c:choose>
            	<c:when test="${order.payStatus==false }">
	            	<li>付款状态：<font color="green">未付款</font></li>
            	</c:when>
            	<c:when test="${order.payStatus==true }">
	            	<li>付款状态：<font color="green">已付款</font></li>
            	</c:when>
            </c:choose>
            <li>单票：${orderCombo.goodsName }</li>
            <li>套餐：${order.packName }</li>
            <li>酒店：${hotel.hotelName }</li>
            <li>机票：无</li>
        </ul>
    </div>
    <div class="addList">
        <div class="nickname"><span>姓名：</span><span>${order.consignee }</span></div>
        <div class="e-mail">护照号码：${skBearerInfo.passportNumber }</div>
        <div class="e-mail">详细地址：${userAddress.addressName }</div>
        <div class="e-mail">电子邮件：${order.email }</div>
        <div class="e-mail">手机：${order.mobile }</div>
    </div>
</div>
</body>
</html>