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
    <c:forEach  items="${orderList }"  var ="o">
	    <div class="myOrderWrap">
	        <div class="myOrderWrapList">
	            <ul>
	                <li>
	                    <span>订单编号 :</span>
	                    ${o.orderSn }
	                </li>
	                <li>
	                    <span>合同编号 :</span>
	                    ${o.cardNum }
	                </li>
	                <li>
	                    <span>下单时间 :</span>
	                    ${o.addTime }
	                </li>
	                <li>
	                    <span>订单金额 :</span>
	                    <font class="colorRed">¥ ${o.orderAmount }</font>
	                </li>
	            </ul>
	        </div>
	        <div class="gap"><img src="${prc }/assets/images/gap2.png" alt=""/></div>
	        <div class="orderState">
	            订单状态 : <span>${o.orderStatus }</span>
	            <span class="orderCheck"><a href="javascript:void(0)">取消订单</a><a href="/getorderinfo.controller?orderId=${o.orderId }" class="checkOrderBtns">查看订单</a></span>
	        </div>
	    </div>
    </c:forEach>
    <!-- <div class="myOrderWrap">
        <div class="myOrderWrapList">
            <ul>
                <li>
                    <span>订单编号 :</span>
                    12345345
                </li>
                <li>
                    <span>合同编号 :</span>
                    12345345
                </li>
                <li>
                    <span>下单时间 :</span>
                    2017-07-07 15:43:23
                </li>
                <li>
                    <span>订单金额 :</span>
                    <font class="colorRed">¥ 45000</font>
                </li>
            </ul>
        </div>
        <div class="gap"><img src="/assets/images/gap2.png" alt=""/></div>
        <div class="orderState">
            订单状态 : <span>已取消</span>
            <span class="orderCheck"><a href="javascript:void(0)" style="color:#f00;">继续支付</a><a href="myOrderDetail.html" class="checkOrderBtns">查看订单</a></span>
        </div>
    </div>
    <div class="myOrderWrap">
        <div class="myOrderWrapList">
            <ul>
                <li>
                    <span>订单编号 :</span>
                    12345345
                </li>
                <li>
                    <span>合同编号 :</span>
                    12345345
                </li>
                <li>
                    <span>下单时间 :</span>
                    2017-07-07 15:43:23
                </li>
                <li>
                    <span>订单金额 :</span>
                    <font class="colorRed">¥ 45000</font>
                </li>
            </ul>
        </div>
        <div class="gap"><img src="/assets/images/gap2.png" alt=""/></div>
        <div class="orderState">
            订单状态 : <span>支付成功</span>
            <span class="orderCheck"><a href="myOrderDetail.html" class="checkOrderBtns">查看订单</a></span>
        </div>
    </div> -->
    
</div>
</body>
</html>