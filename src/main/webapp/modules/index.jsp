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
    <link href="${prc }/assets/css/swiper.min.css" rel="stylesheet" />
    <script src="${prc }/assets/js/jquery-3.2.1.min.js"></script>
</head>
<body>
<div class="wrapper">
    <header>
        <div class="mobile-nav">
            <span></span>
            <span></span>
            <span></span>
        </div>
        <a href="index.html"><img src="${prc }/assets/images/logo.png" alt="" width="80"/></a>
        <div class="center">
            <a href="center.html">
                <img src="${prc }/assets/images/my.png " alt=""/>
            </a>
        </div>
    </header>
    <div class="swiper-container">
        <div class="swiper-wrapper">
            <div class="swiper-slide">
                <a href="subject.html">
                    <img src="${prc }/assets/images/banner.png">
                    <div class="bannerTxt"></div>
                </a>
            </div>
        </div>
        <div class="swiper-pagination"></div>
    </div>
    <div class="navgation">
       <%--  <ul>
            <li><a href="cupList.html"><p><img alt="" src="${prc }/assets/images/football.png"></p><p class="indexItem">球票</p></a></li>
            <li><a href="cupList.html"><p><img alt="" src="${prc }/assets/images/golf.png"></p><p class="indexItem">观赛套餐</p></a></li>
            <li><a href="cupList.html"><p><img alt="" src="${prc }/assets/images/outside.png"></p><p class="indexItem">周边商品</p></a></li>
        </ul> --%>
    </div>
    <div class="matchTit">
        <div>精彩赛事</div>
        <div class="min-title">不容错过的精彩比赛</div>
    </div>
    <div class="matchList">
        <ul>
        	<c:forEach  items="${matcheList }"  var ="m">
            <li>
                <a href="detail.html">
                <div class="matchImg">
                    <div class="matchImgWrap">
                        <img src="${m.matchImg }" alt=""/>
                    </div>
                </div>
                <div class="matchText">
                    <div class="matchTitle">${m.matchTitle }</div>
                    <div class="matchTime">${m.matchTime }</div>
                    <div class="matchAddress">${m.matchAddress }</div>
                    <div class="matchPrice"><span>酒店+机票</span><em>${m.matchPrice }元起</em></div>
                    <div class="match-txt">票价包含一张当日球票+一晚当晚三星级酒店,酋长 ...  </div>
                </div>
                </a>
            </li>
           </c:forEach>
            
            <%-- <li>
                <a href="detail.html">
                <div class="matchImg">
                    <div class="matchImgWrap">
                        <img src="${prc }/assets/images/product.jpg" alt=""/>
                    </div>
                </div>
                <div class="matchText">
                    <div class="matchTitle">阿森纳 vs 埃佛顿</div>
                    <div class="matchTime">2017-05-21 00:00:00</div>
                    <div class="matchAddress">伦敦 酋长球场</div>
                    <div class="matchPrice"><span>酒店+机票</span><em>3819元起</em></div>
                    <div class="match-txt">票价包含一张当日球票+一晚当晚三星级酒店,酋长 ...  </div>
                </div>
                </a>
            </li> --%>
        </ul>
    </div>
    <footer>
        <div class="footNav">
            <a href="about.html">关于我们</a>
            <a href="#">赛事</a>
            <a href="#">帮助</a>
            <a href="#">购票相关</a>
            <a href="#">关注我们</a>
        </div>
        <p>© 2012 Shankai Sports International</p>
        <p>京ICP备14000536号-2</p>
        <p>咨询热线：400-885-0132</p>
    </footer>
    <div class="mobileNavgation">
        <ul>
            <li><a href="${prc }/modules/cupList.jsp">足球</a></li>
            <li><a href="${prc }/modules/cupList.jsp">高尔夫</a></li>
            <li><a href="${prc }/modules/cupList.jsp">滑雪</a></li>
            <li><a href="${prc }/modules/cupList.jsp">户外</a></li>
            <li><a href="${prc }/modules/cupList.jsp">NFL橄榄球</a></li>
            <li class="closeNav"><i class="fa fa-times close"></i></li>
        </ul>
    </div>
</div>
<script>
$(function(){
    $(".mobile-nav").click(function(){
        $(".mobileNavgation").animate({
            height:'100%',
        });
    })

    $(".close").click(function(){
        $(".mobileNavgation").animate({
            height:'0',
        });
    })
})
</script>
</body>
</html>
