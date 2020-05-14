<%--
  User: Jayce
  Date: 2020/5/14
  Time: 12:50
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>退号</title>
    <link rel="stylesheet" href="./static/css/iconfont.css" type="text/css">
    <style>

        *{
            padding: 0;
            margin: 0;
        }
        body{
            width: 1200px;
            height: 492px;
            /*background-color: #1299FF;*/
        }
        .content{
            padding: 10px;
        }
        .btn{
            background-color: #409EFF;
            height: 30px;
            width: 80px;
            color: #fff;
        }
        input{
            border-radius: 2px;
            height: 24px;
            padding-left: 10px;
            border: solid 1px #aaa;
        }

        .item{
            width: 200px;
            height: 60px;
            /*border: solid 1px black;*/
            float: left;
            margin-right: 20px;
        }
        .item1{
            width: 420px;
            height: 60px;
            /*border: solid 1px black;*/
            float: left;
            margin-right: 20px;

        }
        li{
            color: #787878;
            float: left;
            list-style-type: none;
            margin-left: 40px;
            margin-bottom: 10px;
        }

    </style>
</head>
<body>

<div class="content">

    <div style="font-size: 20px;margin-top: 20px;margin-bottom: 20px">患者信息查询</div>

    <span>*</span>病历号：
    <input type="text">
    <input class="btn iconfont" type="button"value=" &#58904 搜索">

    <div style="font-size: 20px;margin-top: 20px;margin-bottom: 20px">患者信息确认</div>

    <div class="item">
        <span>*</span>姓名：<br>
        <input name="realName" placeholder="姓名" type="text">
    </div>
    <div class="item1">
        家庭住址：<br>
        <input name="adrr" placeholder="家庭地址" type="text" style="width: 390px">

    </div>
    <div class="item1">
        身份证号：<br>
        <input name="shenfenzheng" type="text"style="width: 275px" placeholder="身份证号">
    </div>
    <div style="clear: left"></div>
    <div style="font-size: 20px;margin-top: 20px;margin-bottom: 20px">患者挂号信息</div>

    <ul>
        <li>病历号</li>
        <li>姓名</li>
        <li>身份证号</li>
        <li>挂号日期</li>
        <li>挂号午别</li>
        <li>看诊科室</li>
        <li>看诊状态</li>
        <li>操作</li>
    </ul>
    <br>
    <div style="clear: left"></div>
    <hr>
    <div style="text-align: center;line-height: 100px">暂无数据</div>
</div>
</body>
</html>
