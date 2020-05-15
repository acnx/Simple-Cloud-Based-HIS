<%--
  User: Jayce
  Date: 2020/5/14
  Time: 12:49
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>收费</title>
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
        input{
            border-radius: 2px;
            height: 24px;
            padding-left: 10px;
            border: solid 1px #aaa;
        }

        .btn{
            background-color: #409EFF;
            height: 30px;
            width: 90px;
            color: #fff;
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

        table{

            border-collapse: collapse;
            width: 1100px;
        }
        th{
            padding: 5px 10px;
            color: #909399;
        }
        td{
            border: solid 1px #ccc;
            padding: 5px 10px;
            text-align: center;

        }

        a{
            text-decoration: none;color: black
        }


    </style>
</head>
<body>

<div class="content">
    <form action="">
    <div style="font-size: 20px;margin-top: 20px;margin-bottom: 20px">患者信息查询</div>

    <span>*</span>病历号：
    <input type="text">
    <input class="btn iconfont" type="submit"value=" &#58904 搜索 ">

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
    <div style="font-size: 20px;margin-top: 20px;margin-bottom: 20px">患者消费信息</div>
    <table>
        <thead>
        <tr>
            <th>病历号</th>
            <th>姓名</th>
            <th>项目名称</th>
            <th>单价</th>
            <th>数量</th>
            <th>开立时间</th>
            <th>看诊状态</th>
            <th>操作</th>

        </tr>
        </thead>

        <tbody>
        <tr>
            <td>${reg.caseNumber}</td>
            <td>${reg.realName}</td>
            <td>${reg.idnumber}</td>
            <td>${reg.visitDate}</td>
            <td>${reg.homeAddress}</td>
            <td>${reg.noon}</td>
            <td>${reg.visitState}</td>
            <td><a href="/tui?caseNumber=${reg.caseNumber}">缴费</a></td>
        </tr>
        </tbody>
    </table>



    <%--<ul>--%>
        <%--<li>病历号</li>--%>
        <%--<li>姓名</li>--%>
        <%--<li>项目名称</li>--%>
        <%--<li>单价</li>--%>
        <%--<li>数量</li>--%>
        <%--<li>开立时间</li>--%>
        <%--<li>状态</li>--%>
    <%--</ul>--%>
    <%--<br>--%>
    <%--<div style="clear: left"></div>--%>
    <%--<hr>--%>
    <%--<div style="text-align: center;line-height: 100px">暂无数据</div>--%>
</form>
</div>
</body>
</html>
