<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
     <c:set var="prc" value="${pageContext.request.contextPath }"></c:set>
    <link rel="stylesheet" href="${prc }/assets/css/public.css"/>
    <link rel="stylesheet" href="${prc }/assets/css/style.css"/>
    <link rel="stylesheet" href="${prc }/assets/css/font-awesome.css"/>
    <link href="${prc }/assets/css/swiper.min.css" rel="stylesheet" />
    <script src="${prc }/assets/js/jquery-3.2.1.min.js"></script>
    <script src="${prc }/assets/js/swiper.min.js"></script>
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
            <img src="${prc }/assets/images/my.png " alt=""/>
        </div>
    </header>
    <div class="subject-title">2018俄罗斯世界杯</div>
    <div class="subject-title">
        <select name="gameStage" id="se0" class="subSe">
            <option  value ="0" >所有赛段</option>
            <c:forEach  items="${gameStage }"  var ="gameStage">
            <option value="${gameStage.scheduleId }">${gameStage.scheName }</option>
        	</c:forEach>
        </select>
        <select name="city" id="se1" class="subSe">
        	<option  value="0" >所有城市</option>
        	<c:forEach  items="${cityList }"  var ="c">
            <option value="${c.id }">${c.region_name }</option>
        	</c:forEach>
        </select>
        <select name="rank" id="se2" class="subSe">
            <option  value="0">所有等级</option>
           <c:forEach items="${rankList }"  var ="rankList">
           	 <option value="${rankList.rank }">${rankList.rank }</option>
           </c:forEach>
        </select>
    </div>
    
    <div class="matchList"  id="matchList">
        <ul>
        	<c:forEach  items="${matcheList }"  var ="m">
        	<c:set var="string1" value="${m.matchTxt }"/>
			<c:set var="string2" value="${fn:substring(string1, 0, 55)}" />
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
                    
                    <div class="matchTxt" style="float: right"><font size="1px">${string2 }....</font></div>
                </div>
                </a>
            </li>
           </c:forEach>
        </ul>
    </div>
    
     <div class="matchList2"  >
        <ul id="matchList2">
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
					                    
					                    <div class="matchTxt" style="float: right"><font size="1px">${string2 }....</font></div>
					                </div>
					                </a>
					            			</li>	
        </ul>
    </div>
	<script type="text/javascript">
    	$(function(){
    		$("#se0").change(function(){
    			//alert("aaa");
    			var url="${prc}/selectByGameStage";
    			var gameStage=$("#se0").val();
    			alert(gameStage);
    			var tbody1=""
    			$.post(
    				url,
    				{"gameStage":gameStage},
    				function(data){
    					alert(data);
    					$("#matchList").empty();
    					$(".matchList2").show();
    					$("#matchList2").empty();
    					for(var i=0;i<data.length;i++){
    							//var img=$(".matchImgWrap").css("src","123");
    							var tbody ="";
    							tbody+='<li><a href="detail.html"><div class="matchImg">';
    							tbody+=" <div class='matchImgWrap'><img src='"+data[i].matchImg+"'  alt=''/> </div></div>";
    							tbody+=' <div class="matchText"> <div class="matchTitle">'+data[i].matchTitle+'</div>';
    							tbody+=' <div class="matchTime">'+data[i].matchTime+'</div>';
    							tbody+=' <div class="matchAddress">'+data[i].matchAddress+'</div>';
    							tbody+='  <div class="matchPrice"><span>酒店+机票</span><em>'+data[i].matchPrice+'元起</em></div>';
    							tbody+='<div class="match-txt">票价包含一张当日球票+一晚当晚三星级酒店,酋长 ...  </div> </div> </a></li>';
    							tbody+="<br/>"
    								$("#matchList2").append(tbody);
    					}
    				}
    			); 
    		});    		
    	});
    </script>



</div>
<div class="orderBtns">
    <span class="orderTatalPrice">¥45，0000</span>
    <span class="orderTatalBtns"><a href="order.html">提交订单</a></span>
</div>
</body>
</html>