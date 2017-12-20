<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="/assets/css/public.css"/>
    <link rel="stylesheet" href="/assets/css/style.css"/>
    <link rel="stylesheet" href="/assets/css/font-awesome.css"/>
    <script src="/assets/js/jquery-3.2.1.min.js"></script>
    <link rel="stylesheet" href="/assets/css/n-date.css"/>
    <script src="/assets/js/n-date.js"></script>
    <script src="/assets/js/iscroll.js"></script>
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
    <div class="order-top">
        <div class="order-top-txt">
            <div class="order-name">2016-2017英格兰足球超级联赛</div>
            <div class="order-item"><span>场次：</span>曼彻斯特联 vs 曼彻斯特城</div>
            <div class="order-item"><span>举办地址：</span>曼彻斯特 老特拉福德球场</div>
            <div class="order-item"><span>开赛时间：</span>2017-12-21 00:00:00</div>
        </div>
        <div class="order-tips">
            即时确认<br />
            卖家承诺此商品拍下付款后即可按期顺利出行，无需等待确认
        </div>
    </div>
    <div class="orderPrice">
        <span>票价</span>
        <span class="orderPriceColor">¥<em>3819.00</em></span>
    </div>
    <div class="orderProduct">
        <div class="orderProductItem">
            <span><img src="/assets/images/order01.png"></span>
            官方纪念品
            <div class="checkbox">
                <input type="checkbox">
                <label></label>
            </div>
        </div>
        <div class="orderAccessory none souvenir">
            <div class="souvenirLeft">
                <img src="/assets/images/lion.png" alt=""/>
            </div>
            <div class="souvenirRight">
                <div class="soucenirName"><span>2018世界杯官方吉祥物</span></div>
                <div class="soucenirTxt">
                    <span>25CM</span>
                    <span><em>¥</em>45.00</span>
                    <div class="soucenirNum">
                        <em class="soPlus soBtns"><i class="fa fa-plus"></i></em>
                        <em class="soNum">1</em>
                        <em class="soMinus soBtns"><i class="fa fa-minus"></i></em>
                    </div>
                </div>
            </div>
        </div>
        <div class="orderProductItem">
            <span><img src="/assets/images/order02.png"></span>
            订机票
            <div class="checkbox">
                <input type="checkbox">
                <label></label>
            </div>
        </div>
        <div class="orderAccessory none airticket">
            <div class="air-ticket">
                <div class="ticketTitle">去程</div>
                <div class="ticketList">
                    <ul>
                        <li>
                            <span>出发城市</span>
                            <input type="text" value="" id="depart" placeholder="选择" class="ord-from">
                        </li>
                        <li>
                            <span>抵达城市</span>
                            <input type="text" value="" id="arrive" placeholder="选择" class="ord-from">
                        </li>
                        <li>
                            <span>航程选择</span>
                            <input type="text" value="" id="flight" placeholder="选择" class="ord-from">
                        </li>
                        <li><span>出发日期</span>2018-07-08</li>
                        <li>
                            <span>数量</span>
                            <div class="soucenirNum ticketNum">
                                <em class="soPlus soBtns"><i class="fa fa-plus"></i></em>
                                <em class="soNum">1</em>
                                <em class="soMinus soBtns"><i class="fa fa-minus"></i></em>
                            </div>
                        </li>
                    </ul>
                </div>
                <div class="gap"><img src="/assets/images/gap2.png" alt=""/></div>
                <div class="ticketTitle">返程</div>
                <div class="ticketList">
                    <ul>
                        <li><span>返程出发城市</span><em style="color:#cca152">曼彻斯特</em></li>
                        <li><span>返程抵达城市</span><em style="color:#cca152">北京</em></li>
                        <li><span>航程选择</span>往返 7月17日 18:45</li>
                        <li><span>返程出发日期</span>2018-07-17</li>
                        <li><span>数量</span><font color="#65f23f">1</font></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="orderProductItem">
            <span><img src="/assets/images/order03.png"></span>
            订酒店
            <div class="checkbox">
                <input type="checkbox">
                <label></label>
            </div>
        </div>
        <div class="orderAccessory none hotel">
            <div class="noHotel">
                <!--<img src="/assets/images/hotel.png" alt=""/>-->
                <div class="hotelSelectd">
                    <ul>
                        <li>
                            <span>选择酒店</span>
                            <input type="text" placeholder="莫斯科世界贸易皇冠假日酒店" class="hotelForm">
                        </li>
                        <li>
                            <em>选择房间</em>
                        </li>
                    </ul>
                    <div class="room">
                        <p>
                            <em>
                                <input type="radio" id="room0" name="room0" value="1"  class="regular-radio big-radio">
                                <label for="room0"></label>
                                Superior room BB￥8808.00/天, 单次必须预定3天
                            </em>
                        </p>
                        <div class="hotelFill none">
                            <div class="hotelDate">
                                <em><input type="text" placeholder="入住日期" class="hotelDateInput"></em>
                                <em><input type="text" placeholder="退房日期" class="hotelDateInput"></em>
                            </div>
                            <div class="hotelDate">
                                <em>
                                    <span class="fill-plus"><i class="fa fa-plus"></i></span>
                                    <input type="text" placeholder="0" class="hotelDateInput">
                                    <span class="fill-minus"><i class="fa fa-minus"></i></span>
                                </em>
                                <em>
                                    <span class="fill-plus"><i class="fa fa-plus"></i></span>
                                    <input type="text" placeholder="0" class="hotelDateInput">
                                    <span class="fill-minus"><i class="fa fa-minus"></i></span>
                                </em>
                            </div>
                        </div>
                        <p>
                            <em>
                                <input type="radio" id="room1" name="room1" value="2"  class="regular-radio big-radio">
                                <label for="room1"></label>
                                Terrace room BB￥10888.00/天, 单次必须预定3天
                            </em>
                        </p>
                        <div class="hotelFill none">
                            <div class="hotelDate">
                                <em><input type="text" placeholder="入住日期" class="hotelDateInput"></em>
                                <em><input type="text" placeholder="退房日期" class="hotelDateInput"></em>
                            </div>
                            <div class="hotelDate">
                                <em>
                                    <span class="fill-plus"><i class="fa fa-plus"></i></span>
                                    <input type="text" placeholder="0" class="hotelDateInput">
                                    <span class="fill-minus"><i class="fa fa-minus"></i></span>
                                </em>
                                <em>
                                    <span class="fill-plus"><i class="fa fa-plus"></i></span>
                                    <input type="text" placeholder="0" class="hotelDateInput">
                                    <span class="fill-minus"><i class="fa fa-minus"></i></span>
                                </em>
                            </div>
                        </div>
                        <p>
                            <em>
                                <input type="radio" id="room2" name="room2" value="3"  class="regular-radio big-radio">
                                <label for="room2"></label>
                                Junior suite BB￥12818.00/天, 单次必须预定3天
                            </em>
                        </p>
                        <div class="hotelFill none">
                            <div class="hotelDate">
                                <em><input type="text" placeholder="入住日期" class="hotelDateInput"></em>
                                <em><input type="text" placeholder="退房日期" class="hotelDateInput"></em>
                            </div>
                            <div class="hotelDate">
                                <em>
                                    <span class="fill-plus"><i class="fa fa-plus"></i></span>
                                    <input type="text" placeholder="0" class="hotelDateInput">
                                    <span class="fill-minus"><i class="fa fa-minus"></i></span>
                                </em>
                                <em>
                                    <span class="fill-plus"><i class="fa fa-plus"></i></span>
                                    <input type="text" placeholder="0" class="hotelDateInput">
                                    <span class="fill-minus"><i class="fa fa-minus"></i></span>
                                </em>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="orderBtns">
    <span class="orderTatalPrice">¥45，0000</span>
    <span class="orderTatalBtns"><a href="order-pay.html">提交订单</a></span>
</div>
<div id="datePlugin"></div>
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

        // 酒店选择展示
        $("input[type=radio]").click(function() {
            if ($(this).is(':checked')) {
                $(this).parents('p').next().removeClass('none');
            }
            else {
                $(this).parents('p').next().addClass('none');
            }
        });

            // depart
        $("#depart").zydate({
            theme: "diydata",
            diydata: ["北京"]
        }, function (d) {
            $("#depart").val(d);
        });

        // arrive
        $("#arrive").zydate({
            theme: "diydata",
            diydata: ['曼彻斯特']
        }, function (d) {
            $("#arrive").val(d);
        });


    })
</script>
</body>
</html>