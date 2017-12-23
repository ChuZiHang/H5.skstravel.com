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
            <a href="center.html"><img src="/assets/images/my.png " alt=""/></a>
        </div>
    </header>
    <form id="f1">
        <c:forEach items="${beanList}" var="bean">
    <div class="fillBox">
        <ul>
            <li>
                <span>姓名</span>
                <input type="text" class="linkInput" placeholder="" name="userName" value="${bean.userName}"/>
            </li>
            <li>
                <span>性别</span>
                <input type="text" class="linkInput" placeholder="" id="sex" name="sex" value="${bean.sex}"/>
            </li>
            <li>
                <span>出生日期</span>
                <input type="text" class="linkInput" placeholder="" id="birth" name="birthday" value="${bean.birthday}"/>
            </li>
            <li>
                <span>电子邮件</span>
                <input type="text" class="linkInput" placeholder="" name="email" value="${bean.email}"/>
            </li>
            <li>
                <span>公司名称</span>
                <input type="text" class="linkInput" name="companyName" value="${bean.companyName}"/>
            </li>
            <li>
                <span>联系地址</span>
                <input type="text" class="linkInput" placeholder="" name="adress" value="${bean.adress}"/>
            </li>
            <li>
                <span>手机</span>
                <input type="tel" class="linkInput" placeholder="" name="mobilePhone" value="${bean.mobilePhone}"/>
            </li>
            <li>
                <span>座机</span>
                <input type="tel" class="linkInput" placeholder="" name="officePhone" value="${bean.officePhone}"/>
            </li>
            <li>
                <span>紧急联系人电话</span>
                <input type="tel" class="linkInput" placeholder="" name="emergencyPhone" value="${bean.emergencyPhone}"/>
            </li>
        </ul>
    </div>
        </c:forEach>
    </form>
    <div class="mobileTips">
        手机号码前加国家区号（如：加86）
    </div>
    <div id="datePlugin"></div>
    <div class="addLinkbtns">
        <a href="#">保 存 修 改</a>
    </div>
</div>
<script>
    $(function(){

        // sex
        $("#sex").zydate({
            theme: "diydata",
            diydata: ["男", "女"]
        }, function (d) {
            $("#sex").val(d);
        });

        // birth
        $("#birth").zydate({
            theme: "data",
            diydata: []
        }, function (d) {
            $("#birth").val(d);
        });
        
        
        $(".addLinkbtns").click(function () {
            $.ajax({
                type: 'POST',
                url: "/user/updateUser.controller",
                data: $("#f1").serialize(),
                dataType: JSON,
                success: function (res) {
                    if(res.code == 1){
                        window.location.reload();
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