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
    
    <!--
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
    <%@ include file="/modules/header.jsp"%>
    <%--<header>--%>
        <%--<div class="mobile-nav">--%>
            <%--<span></span>--%>
            <%--<span></span>--%>
            <%--<span></span>--%>
        <%--</div>--%>
        <%--<img src="/assets/images/logo.png" alt="" width="80"/>--%>
        <%--<div class="center">--%>
            <%--<a href="center.html"><img src="/assets/images/my.png " alt=""/></a>--%>
        <%--</div>--%>
    <%--</header>--%>
    <form id="f1">
        <input type="hidden" name="addressId" value="${bean.addressId}">
    <div class="fillBox">
        <ul>
            <li>
                <span>姓名</span>
                <input type="text" class="linkInput" name="consignee" value="${bean.consignee}"/>
            </li>
            <li>
                <span>常用邮箱</span>
                <input type="text" class="linkInput" name="email" value="${bean.email}"/>
            </li>
            <li>
                <span>证件类型</span>
                <c:if test="${bean.cardTyp eq 0}">
                    <input type="text" class="linkInput" id="CardType" name="cardType" value="身份证"/>
               </c:if>
               <c:if test="${bean.cardTyp eq 1}">
                    <input type="text" class="linkInput" id="CardType" name="cardType" value="护照:"/>
                </c:if>
                <c:if test="${bean.cardTyp eq 2}">
                    <input type="text" class="linkInput" id="CardType" name="cardType" value="驾驶证"/>
               </c:if>
            </li>
            <li>
                <span>证件号码</span>
                <input type="text" class="linkInput" name="cardNum" value="${bean.cardNum}"/>
            </li>
            <li>
                <span>手机号</span>
                <input type="tel" class="linkInput" name="mobile" value="${bean.mobile}"/>
            </li>
        </ul>
    </div>
    </form>
    <div class="mobileTips">
        手机号码前加国家区号（如：加86）
    </div>
    <div id="datePlugin"></div>
    <div class="addLinkbtns">
        <a href="javascript:void(0);">确 定</a>
    </div>
</div>
<script>
    $(function(){
        $("#CardType").zydate({
            theme: "diydata",
            diydata: ["身份证", "护照","驾驶证"]
        }, function (d) {
            $("#CardType").val(d);
        });

        $("#addLinkbtns").click(function () {
            $.ajax({
                type: 'POST',
                url: "/user/updateAddress.controller",
                data: $("#f1").serialize(),
                dataType: JSON,
                success: function (res) {
                    if(res.code == 1){
                        location.href = "/user/addresslist.controller";
                    }
                },
                error: function (res) {
                    cmblife.showToast("系统异常，请稍后重试");
                }
            });
        })
    })
</script>
</body>
</html>