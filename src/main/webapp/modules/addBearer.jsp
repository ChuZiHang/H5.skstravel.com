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
            <a href="center.html"><img src="/assets/images/my.png " alt=""/></a>
        </div>
    </header>
    <div class="fillBox">
        <ul>
            <li>
                <span class="bearSpan">客人姓名/Name</span>
                <input type="text" class="linkInput" placeholder=""/>
                <em class="starRed">*</em>
            </li>
            <li>
                <span class="bearSpan">特别称谓/Title</span>
                <input type="text" class="linkInput" placeholder=""/>
            </li>
            <li>
                <span class="bearSpan">护照号码/Passports Number</span>
                <input type="text" class="linkInput"  placeholder=""/>
                <em class="starRed">*</em>
            </li>
            <li>
                <span class="bearSpan">出生日期/Date of Birth</span>
                <input type="text" class="linkInput" placeholder="" id="birth"/>
            </li>
            <li>
                <span class="bearSpan">护照签发日期/Issue Date</span>
                <input type="text" class="linkInput" placeholder="" id="IssueDate"/>
            </li>
            <li>
                <span class="bearSpan">护照有效期/Expire Date</span>
                <input type="text" class="linkInput"  placeholder="" id="ExpireDate"/>
                <em class="starRed">*</em>
            </li>
            <li>
                <span class="bearSpan">国籍/Nationality</span>
                <input type="text" class="linkInput" id="Nationality"/>
            </li>
            <li>
                <span class="bearSpan">街道门牌</span>
                <input type="text" class="linkInput" placeholder=""/>
                <em class="starRed">*</em>
            </li>
            <li>
                <span class="bearSpan">邮编/Post Code</span>
                <input type="text" class="linkInput"/>
            </li>
            <li>
                <span class="bearSpan">座机电话/Telephone No.</span>
                <input type="text" class="linkInput" placeholder="" name="homePhone" value="${bean.homePhone}"/>
                <em class="starRed">*</em>
            </li>
            <li>
                <span class="bearSpan">手机电话/Mobile Telephone No.</span>
                <input type="text" class="linkInput" placeholder="" name="mobilePhone" value="${bean.mobilePhone}"/>
                <em class="starRed">*</em>
            </li>
            <li>
                <span class="bearSpan">电子邮件/E-Mail</span>
                <input type="tel" class="linkInput" placeholder="" name="email" value="${bean.email}"/>
                <em class="starRed">*</em>
            </li>
        </ul>
    </div>
    <div class="mobileTips">
        手机号码前加国家区号（如：加86）
    </div>
    <div id="datePlugin"></div>
    <div class="addLinkbtns">
        <a href="bearer.html">提 交</a>
    </div>
    </div>
<script>
    $(function(){

        // Nationality
        $("#Nationality").zydate({
            theme: "diydata",
            diydata: ["中国", "美国","俄罗斯"]
        }, function (d) {
            $("#Nationality").val(d);
        });

        // birth
        $("#birth").zydate({
            theme: "data",
            diydata: []
        }, function (d) {
            $("#birth").val(d);
        });

        //IssueDate
        $("#IssueDate").zydate({
            theme: "data",
            diydata: []
        }, function (d) {
            $("#IssueDate").val(d);
        });

        //ExpireDate
        $("#ExpireDate").zydate({
            theme: "data",
            diydata: []
        }, function (d) {
            $("#ExpireDate").val(d);
        });
    })
</script>
</body>
</html>