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
    <script src="${prc }/assets/js/iscroll.js"></script>
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
        <input type="hidden" name="id" value="${bean.id}">
    <div class="fillBox">
        <ul>
            <li>
                <span class="bearSpan">客人姓名/Name</span>
                <input type="text" class="linkInput" placeholder="" name="cnCustomerName" value="${bean.cnCustomerName}"/>
                <em class="starRed">*</em>
            </li>
            <li>
                <span class="bearSpan">性别称谓/Title</span>
                <input type="text" class="linkInput" placeholder="" name="genderAppellation" value="${bean.genderAppellation}"/>
            </li>
            <li>
                <span class="bearSpan">护照号码/Passports Number</span>
                <input type="text" class="linkInput"  placeholder="" name="passportNumber" value="${bean.passportNumber}"/>
                <em class="starRed">*</em>
            </li>
            <li>
                <span class="bearSpan">出生日期/Date of Birth</span>
                <input type="" class="linkInput" placeholder="" id="birth" name="dateBirth" value="${bean.dateBirth}"/>
            </li>
            <li>
                <span class="bearSpan">护照签发日期/Issue Date</span>
                <input type="text" class="linkInput" placeholder="" id="IssueDate" name="issueDate" value="${bean.issueDate}"/>
            </li>
            <li>
                <span class="bearSpan">护照有效期/Expire Date</span>
                <input type="text" class="linkInput"  placeholder="" id="ExpireDate" name="expireDate" value="${bean.expireDate}"/>
                <em class="starRed">*</em>
            </li>
            <li>
                <span class="bearSpan">国籍/Nationality</span>
                <input type="text" class="linkInput" id="Nationality" name="cnCountry" value="${bean.cnCountry}"/>
            </li>
            <li>
                <span class="bearSpan">街道门牌</span>
                <input type="text" class="linkInput" placeholder="" name="cnNameStreet" value="${bean.cnNameStreet}"/>
                <em class="starRed">*</em>
            </li>
            <li>
                <span class="bearSpan">邮编/Post Code</span>
                <input type="text" class="linkInput" name="postCode" value="${bean.postCode}"/>
            </li>
            <li>
                <span class="bearSpan">座机电话/Telephone No.</span>
                <input type="text" class="linkInput" placeholder="" name="telephone" value="${bean.telephone}"/>
                <em class="starRed">*</em>
            </li>
            <li>
                <span class="bearSpan">手机电话/Mobile Telephone No.</span>
                <input type="text" class="linkInput" placeholder="" name="mobile" value="${bean.mobile}"/>
                <em class="starRed">*</em>
            </li>
            <li>
                <span class="bearSpan">电子邮件/E-Mail</span>
                <input type="tel" class="linkInput" placeholder="" name="mail" value="${bean.mail}"/>
                <em class="starRed">*</em>
            </li>
        </ul>
    </div>
    </form>
    <div class="mobileTips">
        手机号码前加国家区号（如：加86）
    </div>
    <div id="datePlugin"></div>
    <div class="addLinkbtns">
        <a href="javascript:void(0);" id="add">提 交</a>
    </div>
    </div>
<script>

    $("#add").click(function () {
        alert("999999");
        var cnCustomerName = $("input[name='cnCustomerName']").val();
        if($.trim(cnCustomerName).length == 0){
//            cmblife://web/widget/showtoast?msg=请填写客人姓名；
            return;
        }
        var passportNumber = $("input[name='passportNumber']").val();
        if($.trim(passportNumber).length == 0){
//            cmblife://web/widget/showtoast?msg=请填写护照号码；
            return;
        }
        var expireDate = $("input[name='expireDate']").val();
        if($.trim(expireDate).length == 0){
//            cmblife://web/widget/showtoast?msg=请填写护照有效期；
            return;
        }
        var cnNameStreet = $("input[name='cnNameStreet']").val();
        if($.trim(cnNameStreet).length == 0){
//            cmblife://web/widget/showtoast?msg=请填写街道门牌；
                return;
        }
        var mobile = $("input[name='mobile']").val();
        if($.trim(mobile).length == 0){
//            cmblife://web/widget/showtoast?msg=请填写手机电话；
            return;
        }
        var mail = $("input[name='mail']").val();
        if($.trim(mail).length == 0){
//            cmblife://web/widget/showtoast?msg=请填写电子邮件；
            return;
        }
        $.ajax({
            type: 'POST',
            url: "/user/addbeare.controller",
            data: $("#f1").serialize(),
            dataType: "json",
            success: function (res) {
                if(res.code == 0){
                    location.href= "/user/beare.controller";
                }
            },
            error: function (res) {
                cmblife.showToast("系统异常，请稍后重试");
            }
        });
    })

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