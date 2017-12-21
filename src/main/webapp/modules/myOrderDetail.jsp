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
            <c:choose>
            	<c:when test="${order.orderStatus==0 }">
	            	<li>订单状态：未支付</li>
            	</c:when>
            	<c:when test="${order.orderStatus==1 }">
	            	<li>付款状态：已支付</li>
            	</c:when>
            	<c:when test="${order.orderStatus==2 }">
	            	<li>付款状态：已取消</li>
            	</c:when>
            </c:choose>
            <c:choose>
            	<c:when test="${order.payStatus==0 }">
	            	<li>付款状态：未支付</li>
            	</c:when>
            	<c:when test="${order.payStatus==1 }">
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
            	<c:when test="${order.orderStatus==0 }">
	            	 <li>订单状态：<font color="red">支付成功</font></li>
            	</c:when>
            	<c:when test="${order.orderStatus==1 }">
	            	 <li>订单状态：<font color="red">待付款</font></li>
            	</c:when>
            	<c:when test="${order.orderStatus==2 }">
	            	 <li>订单状态：<font color="red">已取消</font></li>
            	</c:when>
            </c:choose>
            <c:choose>
            	<c:when test="${order.payStatus==0 }">
	            	<li>付款状态：<font color="green">未付款</font></li>
            	</c:when>
            	<c:when test="${order.payStatus==1 }">
	            	<li>付款状态：<font color="green">已付款</font></li>
            	</c:when>
            </c:choose>
            <li>单票：${orderCombo.goodsName }</li>
            <li>套餐：${order.packName }</li>
            <li>酒店：Holiday Inn Lyon Vai</li>
            <li>机票：无</li>
        </ul>
    </div>
    <div class="addList">
        <div class="nickname"><span>姓名：</span><span>${order.consignee }</span></div>
        <div class="e-mail">护照号码：${order.cardNum }</div>
        <div class="e-mail">详细地址：深圳市南山区科技园南区R2-B三楼步步高</div>
        <div class="e-mail">电子邮件：34345656@qq.com</div>
        <div class="e-mail">手机：13901203948</div>
    </div>
</div>
</body>
</html>