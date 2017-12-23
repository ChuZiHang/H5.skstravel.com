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
    <div class="order-top">
        <div class="order-top-txt">
            <div class="order-name">${goods.goodsName }</div>
            <div class="order-item"><span>套餐类型：</span>
            	<input type="hidden" value="${goods.goodsType }" id="goodsType">
            	<input type="hidden" value="${goods.goodsId }" id="goodsId">
            	<c:choose>
            	<c:when test="${goods.goodsType==0 }">
	            	2018FIFA俄罗斯世界杯
            	</c:when>
            </c:choose>
            </div>
            <div class="order-item"><span>举办地址：</span>俄罗斯</div>
        </div>
        <div class="order-tips">
            即时确认<br />
            卖家承诺此商品拍下付款后即可按期顺利出行，无需等待确认
        </div>
    </div>
    <div class="orderPrice">
        <span>套餐</span>
        <span class="orderPriceColor">¥<em>${goods.shopPrice }</em></span>
        <div class="orderPriceOpera">
            <em id="sPlus" class="plusBig sum floatLeft aligncenter"><i class="fa fa-plus"></i></em>
            <span id="totalNum" class="aligncenter sumNum floatLeft">1</span>
            <em id="sMinus" class="plusSml sum floatLeft aligncenter"><i class="fa fa-minus"></i></em>
        </div>
    </div>
    <div class="orderProduct">
        <div class="orderProductItem">
            <span><img src="${prc }/assets/images/order01.png"></span>
            官方纪念品
            <div class="checkbox">
                <input type="checkbox">
                <label></label>
            </div>
        </div>
        <div class="orderAccessory none souvenir">
            <div class="souvenirLeft">
                <img src="${prc }/assets/images/lion.png" alt=""/>
            </div>
            <c:forEach  items="${jxwList }"  var ="x">
            <div class="souvenirRight">
                <div class="soucenirName"><span>${x.goodsName }</span></div>
                <div class="soucenirTxt">
                    <span>25CM</span>
                    <span>¥<em id="jnpPrice">${x.shopPrice }</em></span>
                    <div class="soucenirNum">
                        <em class="soPlus soBtns"><i class="fa fa-plus"></i></em>
                        <em class="soNum" id="jinianpin">1</em>
                        <em class="soMinus soBtns"><i class="fa fa-minus"></i></em>
                    </div>
                </div>
            </div>
            </c:forEach>
        </div>
        <div class="orderProductItem">
            <span><img src="${prc }/assets/images/order02.png"></span>
            订机票
            <div class="checkbox">
                <input type="checkbox">
                <label></label>
            </div>
        </div>
        <div class="orderAccessory none airticket">
            <div class="air-ticket">
                <div class="ticketTitle">去程</div>
                <c:forEach  items="${jpList }"  var ="p">
                <div class="ticketList">
                	<input type="hidden" id="fromCity">
                	<input type="hidden" id="toCity">
                	<input type="hidden" id="title">
                	<input type="hidden" id="fly_time1">
                	<input type="hidden" id="return_fly_time">
                    <ul>
                        <li><span>出发城市</span><em style="color:#333" >${p.cname }</em></li>
                        <li><span>抵达城市</span><em style="color:#333">${p.dname }</em></li>
                        <li><span>航程选择</span>${p.title }</li>
                        <li><span>出发日期</span>${p.fly_time1 }</li>
                        <li>
                            <span>数量</span>
                            <div class="soucenirNum ticketNum">
                                <em class="soPlus soBtns"><i class="fa fa-plus" id="jipiaoa"></i></em>
                                <em class="soNum" id="jipiaov">1</em>
                                <em class="soMinus soBtns"><i class="fa fa-minus" id="jipiaoj"></i></em>
                            </div>
                        </li>
                    </ul>
                </div>
                
                <div class="gap"><img src="${prc }/assets/images/gap2.png" alt=""/></div>
                <div class="ticketTitle">返程</div>
                <div class="ticketList">
                    <ul>
                        <li><span>返程出发城市</span><em style="color:#cca152">${p.dname }</em></li>
                        <li><span>返程抵达城市</span><em style="color:#cca152">${p.cname }</em></li>
                        <li><span>航程选择</span>${p.title }</li>
                        <li><span>返程出发日期</span>${p.return_fly_time }</li>
                        <li><span>数量</span><font color="#65f23f">1</font></li>
                    </ul>
                </div>
                </c:forEach>
            </div>
        </div>
        <div class="orderProductItem">
            <span><img src="${prc }/assets/images/order03.png"></span>
            订酒店
            <div class="checkbox">
                <input type="checkbox">
                <label></label>
            </div>
        </div>
        <div class="orderAccessory none hotel">
            <div class="noHotel">
                <img src="${prc }/assets/images/hotel.png" alt=""/>
            </div>

        </div>
    </div>
</div>
<div class="orderBtns">
    <span class="orderTatalPrice">¥45，0000</span>
    <span class="orderTatalBtns"><a href="order-pay.html">提交订单</a></span>
</div>
<script>
    $(function(){

        // 订单选择附属产品展示
        $("input[type=checkbox]").click(function(){
            if ($(this).is(':checked')) {
                $(this).parents(".orderProductItem").next().show();
            }
            else{
                $(this).parents(".orderProductItem").next().hide();
            }

        })
        /*商品*/
        $('.orderPrice .fa-plus').click(function(){
        	var sumNum = $('.orderPrice .sumNum').text();
        	sumNum++;
        	$('.orderPrice .sumNum').text(sumNum);
        });
        $('.orderPrice .fa-minus').click(function(){
        	var sumNum = $('.orderPrice .sumNum').text();
        	sumNum--;
        	if(sumNum<0){
        		sumNum=0;
        	}
        	$('.orderPrice .sumNum').text(sumNum);
        });
		/*纪念品*/
        $('.orderProduct .fa-plus').click(function(){
        	var sumNum = $('#jinianpin').text();
        	sumNum++;
        	$('#jinianpin').text(sumNum);
        });
        $('.orderProduct .fa-minus').click(function(){
        	var sumNum = $('#jinianpin').text();
        	sumNum--;
        	if(sumNum<0){
        		sumNum=0;
        	}
        	$('#jinianpin').text(sumNum);
        });
        /*机票*/
        $('#jipiaoa').click(function(){
        	var sumNum = $('#jipiaov').text();
        	sumNum++;
        	$('#jipiaov').text(sumNum);
        });
        $('#jipiaoj').click(function(){
        	var sumNum = $('#jipiaov').text();
        	sumNum--;
        	if(sumNum<0){
        		sumNum=0;
        	}
        	$('#jipiaov').text(sumNum);
        });
        //提交订单
        $('.orderTatalBtns').click(function(){
        	var data = {"1111":111,"222":222,"333":333};
        	//商品信息
        	data['goodsName'] = $('.order-name').val();
        	data['goodsId'] = $('#goodsId').val();
        	data['goodsType'] = $('#goodsType').val();
        	data['sumNum'] = $('.orderPrice .sumNum').text();
        	data['shopPrice'] = $('.orderPriceColor em').text();
        	//纪念品信息
        	data['soucenirName'] = $('.soucenirName').text();
        	data['jnpPrice'] = $('#jnpPrice').text();
        	data['jinianpinum'] = $('#jinianpin').text();
        	//机票
        	data['fromCity'] = $('#fromCity').val();
        	data['toCity'] = $('#toCity').val();
        	data['title'] = $('#title').val();
        	data['fly_time'] = $('#fly_time1').val();
        	data['return_fly_time'] = $('#return_fly_time').val();
        	data['jipiaonum'] = $('#jipiaov').text();
        	//酒店
        	
	        $.ajax({
				type : "POST",
				url : "/createOrder.controller",
				data:JSON.stringify(data), 
				async : false,
				error : function(request) {
					alert("错误!","网络异常", "error");
				},
				success : function(data) {
					
				}
			 });
        });
    })
</script>
</body>
</html>