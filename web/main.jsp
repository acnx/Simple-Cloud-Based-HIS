<%@ page import="java.util.List" %><%--
  User: Jayce
  Date: 2020/5/14
  Time: 11:58
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>东软云HIS系统</title>
  <link rel="stylesheet" href="./static/css/iconfont.css" type="text/css">
  <style>
    *{margin: 0;padding: 0;}
    #header{height: 70px;color: white;background-color: #1299FF;font-size: 30px;padding-left: 20px;line-height: 70px;font-weight: bold;}

    #content{
      background-color: #fffffe;
      height: 492px;
      width: 1800px;
    }
    .left{
      /*background-color: #ccc;*/
      width: 180px;
      height: 492px;
      float: left;


    }
    dl{
      /*background-color: #ECEDED;*/

    }

    dt{
      background-color: #c7c8c8;
      width: 180px;
      height: 50px;
      line-height: 50px;
      list-style-type: none;
      border: solid 1px #ccc;
      text-align: center;
      font-weight: bold;
      font-size: 20px;

    }
    dd{
      background-color: #e7e8e8;
      width: 110px;
      height: 35px;
      line-height: 35px;
      list-style-type: none;
      border: solid 1px #ccc;
      padding-left: 70px;
      display: none;



    }
    .right{
      width: 1200px;
      /*background-color: aquamarine;*/
      float: left;
      height: 492px;
      border: solid 1px #ccc;

    }
    #footer{
      width: 1400px;
      margin-top: 20px;
      text-align: center;
    }





  </style>

</head>
<body>

<div id="header">东软云HIS系统</div>
<div id="content">

  <div class="left">
    <dl>
      <dt>挂号收费</dt>
      <dd>-
        <a href="/register"></a>现场挂号
      </dd>
      <dd>-
        <a href="./th.jsp"></a>
        退号</dd>
      <dd>-
        <a href="./sf.jsp"></a>
        收费</dd>
      <dd>-
        <a href="tf.jsp"></a>
        退费</dd>
      <dd>-发票补打</dd>
      <dd>-发票重打</dd>
      <dd>-患者费用查询</dd>
      <dd>-*日结</dd>
      <dd>-*日结查询</dd>
    </dl>
    <dl>
      <dt>门诊医生</dt>
      <dd>门诊医生</dd>
      <dd>医技处置</dd>
      <dd>药房管理</dd>
      <dd>财务管理</dd>
      <dd>系统管理</dd>
    </dl>
    <dl>
      <dt>医技处置</dt>
      <dd>门诊医生</dd>
      <dd>医技处置</dd>
      <dd>药房管理</dd>
      <dd>财务管理</dd>
      <dd>系统管理</dd>
    </dl>
    <dl>
      <dt>药房管理</dt>
      <dd>门诊医生</dd>
      <dd>医技处置</dd>
      <dd>药房管理</dd>
      <dd>财务管理</dd>
      <dd>系统管理</dd>
    </dl>
    <dl>
      <dt>财务管理</dt>
      <dd>门诊医生</dd>
      <dd>医技处置</dd>
      <dd>药房管理</dd>
      <dd>财务管理</dd>
      <dd>系统管理</dd>
    </dl>
    <dl>
      <dt>系统管理</dt>
      <dd>门诊医生</dd>
      <dd>医技处置</dd>
      <dd>药房管理</dd>
      <dd>财务管理</dd>
      <dd>系统管理</dd>
    </dl>



  </div>
  <div class="right">
    <!--<iframe src="" width="1200px" height="492px"></iframe>-->
    <iframe frameborder='0' scrolling='auto' style='width:100%;height:100%' src=""></iframe>
  </div>

</div>
<div id="footer">
  版权所有 翻版必究 Copyright2020 段晶晶同学
</div>
<script src="./static/js/jquery-3.5.1.min.js"></script>
<script>
    $(function () {
        $("dt").click(function () {
            $(this).siblings().toggle().parent().siblings().children("dd").hide()
            // console.log($this.siblings().parent().siblings().children("dd"))
            // $(this).siblings().show()
        })
        $("dd").click(function () {
            var addr = $(this).children("a").attr("href")
            $("iframe").attr("src",addr)
            console.log($("dd").children("a").attr("href"))
        })

    })
</script>


</body>


</html>
