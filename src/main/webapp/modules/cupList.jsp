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
    <div class="cupList">
        <ul>
            <li>
                <a href="subjectList.jsp">
                    <div class="copListImg">
                        <p class="copListTitle">2016-2017英格兰足球超级联赛</p>
                        <p class="copListItem"><span>足球</span></p>
                        <p class="copListPrice">场地预订7000元起</p>
                    </div>
                </a>

            </li>
            
           <!--  <li>
                <a href="subjectList.html">
                    <div class="copListImg">
                        <p class="copListTitle">2016-2017英格兰足球超级联赛</p>
                        <p class="copListItem"><span>足球</span></p>
                        <p class="copListPrice">场地预订7000元起</p>
                    </div>
                </a>

            </li> -->
        </ul>
    </div>

</div>
</body>
</html>