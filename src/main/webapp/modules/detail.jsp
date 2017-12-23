<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
      <c:set var="prc" value="${pageContext.request.contextPath }"></c:set>
    <link rel="stylesheet" href="${prc }/assets/css/public.css"/>
    <link rel="stylesheet" href="${prc }/assets/css/style.css"/>
    <link rel="stylesheet" href="${prc }/assets/css/font-awesome.css"/>
    <script src="${prc }/assets/js/jquery-3.2.1.min.js"></script>
</head>
</head>
<body>
<div class="wrapper">
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
    <div class="top-wrap">
        <div class="top-wrap-img">
            <div class="matchImgWrap"><img src="${pageBean.big_pitch_img}" alt=""/></div>

        </div>
        <div class="introduce">
            <h2>[2018]FIFA俄罗斯世界杯开幕大战</h2>
            <div class="introduce-state">预售中</div>
            <div class="introduce-price">55，000元/每人</div>
        </div>
    </div>
    <div class="jag"><img src="${prc }/assets/images/jag.png" alt=""/></div>
    <div class="buyBtn"><a href="${prc }/queryOrderInfo?goodsId=${str.str}">立即购买</a></div>
    <div class="venue">
        <div class="venueTitle">
            <span class="venueIco"><img src="${prc }/assets/images/venueIco.png" alt=""/></span>
           ${pageBean.pitch_name}
        </div>
        <div class="venueText">
           ${pageBean.combo_pitch_desc}
        </div>
    </div>
    <div class="gap"><img src="${prc }/assets/images/gap.png" alt=""/></div>
    <div class="venueTab bomBor tabs pat0">
        <span class="current"><a href="#p1">行程</a></span>
        <span><a href="#p2">预订</a></span>
        <span><a href="#p3">费用</a></span>
        <span><a href="#p4">签证</a></span>
        <div class="buy"><a href="order.html">立即预订</a></div>
    </div>
    <div id="p1" class="venueDetail padB0">
        <div class="dayWarp">
            <div class="venueH3"><i></i>第一天 6月12日 北京-莫斯科</div>
            <div class="venuetxt marB10">国内/北京-莫斯科 乘坐国际航班前往莫斯科，下飞机后，乘大巴车前往酒店，入住酒店休息。</div>
            <div class="venueDetailImg"><img src="${prc }/assets/images/pro01.jpg" alt=""/></div>
        </div>
        <div class="dayWarp">
            <div class="venueH3"><i></i>第二天 6月13日 莫斯科</div>
            <div class="venuetxt marB10">早餐后游览革命胜地-红场、原苏联的巡礼地—列宁墓（周一，五不开放则只能外观，其他时间入内参观30分钟)、圣瓦西里升天大教堂（外观），克里姆林宫（入内参观，含门票）；无名烈士墓、亚历山大花园，前往俄罗斯最大的购物中心-尊百货。晚餐后送回酒店休息。</div>
            <div class="venueDetailImg"><img src="${prc }/assets/images/pro02.png" alt=""/></div>
        </div>
        <div class="dayWarp">
            <div class="venueH3"><i></i>第三天 6月14日 圣彼得堡-北京</div>
            <div class="venuetxt marB10">早餐后自由活动和购物，于指定时间集合，乘国际航班返回国内。</div>
            <div class="venueDetailImg"><img src="${prc }/assets/images/pro03.jpg" alt=""/></div>
        </div>
        <div class="dayWarp">
            <div class="venueH3"><i></i>第四天 6月15日 国内</div>
            <div class="venuetxt marB10">抵达国内</div>
        </div>
    </div>
    <div class="gap"><img src="${prc }/assets/images/gap.png" alt=""/></div>
    <div id="p2" class="detailModule">
        <div class="moduleTitle">
            <span></span>
            预订须知
        </div>
        <div class="moduleTxt">
            由于世界杯分组结果未出，出发日期未定，行程中景点安排顺序可能微调,以出团通知为准。
            若世界杯分组抽签后此队在莫斯科和圣彼得堡没有小组赛比赛，可以选择24小时内退款或更换成其他相同级别套餐。
        </div>
    </div>
    <div class="gap"><img src="${prc }/assets/images/gap.png" alt=""/></div>
    <div id="p3" class="detailModule">
        <div class="moduleTitle">
            <span></span>
            费用说明
        </div>
        <div class="moduleTxt">
            费用包含——
            1住宿四星酒店双人间或同级酒店6晚住宿
            2行程所述当地地面交通服务费用：空调旅游巴士（俄罗斯每天用车不超过10小时，第一天和最后一天仅含接送机费用）
            3    行程所述景点首道门票：冬宫、夏宫花园、克林姆林宫
            4    行程所列餐食，正餐为7顿中式团餐和1顿俄式特色餐。
            5    全程中文导游，当地司机、导游服务费及小费。
            6    莫斯科-圣彼得堡高铁二等座费用
            7    国际段经济舱机票费用
            8    小组赛俱乐部坐席贵宾款待票
            9   俄罗斯旅游签证费用

            费用不包含——
            1   个人消费及自费项目
            2   用车超时费
            3   因不可抗力因素更改行程所产生的费用
            4  单房差：11000元/人
            5  以上未列出项

            此产品25人成团
        </div>
    </div>
    <div class="gap"><img src="${prc }/assets/images/gap.png" alt=""/></div>
    <div id="p4" class="detailModule">
        <div class="moduleTitle">
            <span></span>
            签证信息
        </div>
        <div class="moduleTxt">
            含签证
        </div>
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
</div>
<script>
    $(function(){
        $(".venueTab span").click(function(){
            $(this).addClass("current").siblings().removeClass("current")
        })
    })
</script>
</body>
</html>