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
    <style>
       	#linkMan,#email,#phone,#type,#typeCode {
       		padding: 6px 12px;
       		width: 260px;
       		border-radius: 5px;
       		margin-left: 3px;
       	}
       	.addItem:nth-child(1) {
       		display: inline-block;
       		width:65px;
       	}            
    </style>
</head>
<body class="gary-bg">
<div class="wrapper bot60">
   <%@ include file="/modules/header.jsp"%>
    <div class="order-top">
    	<input type="hidden" id="entityId" value="${orderInfo.orderId }">
        <div class="order-top-txt">
            <div class="order-name">跟队系列小组赛单场套餐</div>
            <div class="order-item"><span>套餐类型：</span>2018FIFA俄罗斯世界杯</div>
            <div class="order-item"><span>举办地址：</span>俄罗斯</div>
        </div>
        <div class="order-tips">
            价格：<span class="orderPriceColor">¥ <em id="priductPrice">${orderInfo.goodsAmount }</em></span>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;数量：<span class="ariNum">${goods.goodsNumber }</span>
        </div>
    </div>
    <div class="orderProduct">
        <div class="orderProductItem">
            <span><img src="${prc }/assets/images/order01.png"></span>
            官方纪念品
        </div>
        <div class="orderAccessory souvenir">
            <div class="souvenirLeft">
                <img src="${prc }/assets/images/lion.png" alt=""/>
            </div>
            <div class="souvenirRight">
                <div class="soucenirName"><span>2018世界杯官方吉祥物</span></div>
                <div class="soucenirTxt">
                    <span>25CM</span>
                    <span>¥<em id="jnpprice">128</em></span>
                    <div class="soucenirNum">
                        <span class="ariNum">${goods.productId }</span>
                    </div>
                </div>
            </div>
        </div>
        <div class="orderProductItem">
            <span><img src="${prc }/assets/images/order02.png"></span>
            订机票
        </div>
        <div class="orderAccessory airInfo">
         <c:choose>
         	<c:when test="${plane.flag eq '8' }">
         	<%-- <c:out value="${plane.flag }"/></br> --%>
            <ul>
                <li><em class="colorGary">北京-莫斯科 往返 7月8日-16日 </em><span class="colorCca">${plane.goodsNumber }</span></li>
                <li>去程 <span>CA909 北京 - 莫斯科卢日尼基</span></li>
                <li>返程 <span>CA910 莫斯科卢日尼基 - 北京</span></li>
            </ul>
            </c:when>
            <c:otherwise>
            <ul>
                <li><em class="colorGary">北京-莫斯科 往返 7月9日-17日 </em><span class="colorCca">${plane.goodsNumber }</span></li>
                <li>去程 <span>CA909 北京 - 莫斯科卢日尼基</span></li>
                <li>返程 <span>CA910 莫斯科卢日尼基 - 北京</span></li>
            </ul>
            </c:otherwise>
        </c:choose>
            <div class="airPirce">价格：<span class="orderPriceColor">¥<em id="planePrice">${plane.goodsPrice }</em></span></div>
        </div>
        <div class="orderProductItem">
            <span><img src="${prc }/assets/images/order04.png"></span>
            取票方式
        </div>
        <div class="orderAccessory airInfo">
            <div class="radioPosition">
                <em>
                    <input type="checkbox" id="isGet" name="isGet" value="1" class="regular-radio big-radio">
                    <label for="isGet"></label>
                    国外自取
                </em>
            </div>
        </div>
        <div class="orderProductItem">
            <span><img src="${prc }/assets/images/order05.png"></span>
            联系地址
        </div>
        <div class="orderAccessory airInfo">
            <div class="contactAddress">
                <ul>
                    <li><span class="addItem">联系人：</span><input type="text" name="linkMan" id="linkMan" placeholder="请输入联系人"></li>
                    <li><span class="addItem">常用邮箱：</span><input type="text" name="email" id="email" placeholder="请输入常用邮箱"></li>
                    <li><span class="addItem">手机号码：</span><input type="text" name="phone" id="phone" placeholder="请输入手机号码"></li>
                    <li><span class="addItem">证件类型：</span><input type="text" name="type" id="type" placeholder="请输入证件类型"></li>
                    <li><span class="addItem">证件号码：</span><input type="text" name="typeCode" id="typeCode" placeholder="请输入证件号码"></li>
                </ul>
                <!-- <div class="addContact"><a href="#"> 保存联系人信息</a></div> -->
            </div>
        </div>
        <div class="orderProductItem">
            <span><img src="${prc }/assets/images/order06.png"></span>
            付款方式
        </div>
        <div class="orderAccessory airInfo">
            <div class="radioPosition payTarget">
                <em>
                    <input type="radio" id="isCMB" name="isoutLine" value="1" checked class="regular-radio big-radio">
                    <label for="isCMB"></label>
                    招商掌上支付<br>
                </em>
            </div>
        </div>
        <div class="orderProductItem">
            <span><img src="${prc }/assets/images/order07.png"></span>
            发票信息
        </div>
        <div class="orderAccessory airInfo">
            <div class="radioPosition payTarget">
                <em>
                    <input type="radio" id="isinvoice0" name="invoice"  value="1" class="regular-radio big-radio">
                    <label for="isinvoice0"></label>
                    不需要发票
                </em>
            </div>
            <div class="radioPosition payTarget">
                <em>
                    <input type="radio" id="isinvoice1" name="invoice" checked  value="2" class="regular-radio big-radio">
                    <label for="isinvoice1"></label>
                    需要发票
                </em>
            </div>
            <div class="isinvoice">
                <div>
                    <select name="" id="invoiceType" class="invoiceInput">
                        <option value="1">普通发票</option>
                        <option value="2">普通发票</option>
                    </select>
                </div>
                <div><input type="text" placeholder="个人/单位名称" class="invoiceInput" id="unit"/></div>
                <div><input type="text" placeholder="服务费" class="invoiceInput" id="fee"/></div>
            </div>
        </div>
    </div>
    <div class="agreement">
        <div class="radioPosition payTarget checkAgreement">
            <em>
                <input type="radio" id="isagreement" name="agreement" class="regular-radio big-radio">
                <label for="isagreement"></label>
                我已阅读并同意 <a href="#" style="color:#cca152;">购买协议书</a>
            </em>
        </div>
    </div>
</div>
<div class="orderBtns">
    <span class="orderTatalPrice">${orderInfo.goodsAmount }</span>
    <span class="orderTatalBtns"><a href="#">确认支付</a></span>
</div>
<script type = "text/javascript" src = "${prc }/assets/js/cmblifeSDK.js"></script>
<script>
    $(function(){
        // 是否需要发票
        $('input[name = "invoice"]').click(function(){
            var va = $(this).attr("value");
            if(va == 1){
                $(".isinvoice").addClass("onhide")
            }
            else{
                $(".isinvoice").removeClass("onhide")
            }
        })
        
        //初始化总价格
        //发票
        var invoiceVal = $('input[name="invoice"]:checked').val()
        var obj = {};
        obj['payType']=1;
        if("1"==invoiceVal){
	        obj['invoice']=invoiceVal;
        }else{
	        obj['invoice']=invoiceVal;
	        var invoiceType = $('#invoiceType option:selected').val();
	        obj['invoiceType'] = invoiceType;
	        obj['unit'] = $('#unit').val();
	        obj['fee'] = $('#fee').val();
        }
        //联系人信息
        obj['linkMan'] = $('#linkMan').val();
        obj['email'] = $('#email').val();
        obj['phone'] = $('#phone').val();
        obj['type'] = $('#type').val();
        obj['typeCode'] = $('#typeCode').val();
        
        
        
        //防止二次提交
        var flag = false;
        $('.orderTatalBtns').unbind('click').on('click',function(){
        	if(flag){
        		return;
        	}
        	flag = true;
        	var isAgree = document.getElementById('isagreement').checked;
        	if(!isAgree){
        		alert("请阅读购买协议!")
        		return;
        	}
        	var linkMan = $('#linkMan').val();
            var email = $('#email').val();
            var phone = $('#phone').val();
            var type = $('#type').val();
            var typeCode = $('#typeCode').val();
            if(!linkMan||!email||!phone||!type||!typeCode){
            	alert("请填写联系人信息!")
        		return;
            }
            var invoiceVal = $('input[name="invoice"]:checked').val()
            var obj = {};
            obj['payType']=1;
            if("1"==invoiceVal){
    	        obj['invoice']=invoiceVal;
    	        var invoiceType = $('#invoiceType option:selected').val();
    	        obj['invoiceType'] = invoiceType;
    	        obj['unit'] = $('#unit').val();
    	        obj['fee'] = $('#fee').val();
            }else{
    	        obj['invoice']=invoiceVal;
    	        var invoiceType = $('#invoiceType option:selected').val();
    	        obj['invoiceType'] = invoiceType;
    	        obj['unit'] = $('#unit').val();
    	        obj['fee'] = $('#fee').val();
            }
            //取票方式
            var isGet = document.getElementsByName("isGet")[0];
			if(isGet.checked){
				obj['isGet'] = '国外取票';
			}else{
				obj['isGet'] = '';
			}
            //联系人信息
            obj['linkMan'] = $('#linkMan').val();
            obj['email'] = $('#email').val();
            obj['phone'] = $('#phone').val();
            obj['type'] = $('#type').val();
            obj['typeCode'] = $('#typeCode').val();
            
        	obj['entityId'] = $('#entityId').val();
        	obj['orderTotal'] = $('.orderTatalPrice').text();
        	$.ajax({
                type: 'POST',
                url: "/h5/zhaohang/payOrder.controller ",
                data: JSON.stringify(obj),
                dataType: 'json',
                success: function (res) {
                	flag = false;
                    console.log(res.str);

                    cmblife.executeProtocol(res.str);
                }

            });
        });
    })
</script>
</body>
</html>