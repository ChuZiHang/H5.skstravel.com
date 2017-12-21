<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title></title>
    <c:set var="prc" value="${pageContext.request.contextPath }"></c:set><!--
    这是我设置的一个别名  ,主要是用来简化写    ${prc } 这样获取 -->
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <script src="${prc }/assets/js/jquery-3.2.1.min.js"></script>
    <!-- 这个就 相当与 ${prc }   == ${pageContext.request.contextPath }  就是项目名称  -->
    <script type = "text/javascript" src = "${prc }/assets/js/cmblifeSDK.js"></script>
</head>
<body>

</body>
<script>
    $(function () {
        $.ajax({
            type: 'POST',
            url: "/h5/zhaohang/index.controller",
            data: {},
            dataType: JSON,
            success: function (res) {
                window.location=res;

            }

        });
    })
</script>
</html>
