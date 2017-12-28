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
    <script src="${prc }/assets/js/iscroll.js"></script>
    <script type = "text/javascript" src = "${prc }/assets/js/cmblifeSDK.js"></script>
</head>
<body class="gary-bg">
<div class="wrapper bot60">
    <%@ include file="/modules/header.jsp"%>
    <%--<header>
        <div class="mobile-nav">
            <span></span>
            <span></span>
            <span></span>
        </div>
        <img src="/assets/images/logo.png" alt="" width="80"/>
        <div class="center">
            <a href="center.html"><img src="/assets/images/my.png " alt=""/></a>
        </div>
    </header>--%>
    <c:forEach items="${beanList}" var="bean">
        <div class="addList">
            <div class="nickname"><span>姓名：</span><span>${bean.cnCustomerName}</span></div>
            <div class="e-mail">护照号码：${bean.passportNumber}</div>
            <div class="e-mail">详细地址：${bean.cnNameStreet}</div>
            <div class="e-mail">电子邮件：${bean.mail}</div>
            <div class="e-mail">手机：${bean.mobile}</div>
            <div class="opt">
                <span><i class="fa fa-edit"></i><a href="/user/tomodify.controller?id=${bean.id}" style="color: #cca152">编辑</a> </span>
                <span id="del" data-id="${bean.id}"><i class="fa fa-trash"></i> 删除</span>
            </div>
        </div>
    </c:forEach>
    <div class="addressAdd">
        <a href="/user/toaddbearer.controller"><i class="fa fa-plus"></i> 添加持票人信息</a>
    </div>
</div>
</body>
<script>
    $("#del").click(function () {
        var id = $(this).attr("data-id");
        $.ajax({
            type: 'POST',
            url: "/user/delbeare.controller",
            data: {'id':id},
            dataType: "json",
            success: function (res) {
                if(res.code == 0){
                    window.location.reload();
                }
            },
            error: function (res) {
                cmblife.showToast("系统异常，请稍后重试");
            }
        });
    })
</script>
</html>