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
            width: 1150px;
            height: 492px;
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
        .btn:hover{
            background-color: rgba(64, 158, 255, 0.4);
        }
        .item{
            width: 200px;
            height: 60px;
            float: left;
            margin-right: 20px;
        }
        .item1{
            width: 420px;
            height: 60px;
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
<script>

    function sfcg() {
        window.alert("收费成功");

    }
</script>
<div class="content">
    <h2 style="padding-left: 10px;padding-top: 20px">收费</h2>
    <form action="getfei" method="post">
    <div style="font-size: 20px;margin-top: 20px;margin-bottom: 20px">患者信息查询</div>

    <span>*</span>病历号：
    <input name="caseNumber" type="text">
    <input  class="btn iconfont" type="submit"value=" &#58904 搜索 ">
    <div style="font-size: 20px;margin-top: 20px;margin-bottom: 20px">患者信息确认</div>
        <div class="item">
            <span>*</span>姓名：<br>
            <input name="realName" value="${reg.realName}" placeholder="姓名" type="text">
        </div>
        <div class="item1">
            家庭住址：<br>
            <input name="homeAddress" value="${reg.homeAddress}" placeholder="家庭地址" type="text" style="width: 390px">
        </div>
        <div class="item1">
            身份证号：<br>
            <input name="idnumber" value="${reg.idnumber}" type="text"style="width: 275px" placeholder="身份证号">
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
            <td>${reg.item}</td>
            <td>${reg.price}</td>
            <td>${reg.amount}</td>
            <td>${reg.visitDate}</td>
            <td>${reg.visitState}</td>
            <td><a onclick="sfcg()" href="/shoufeila?caseNumber=${reg.caseNumber}">收费</a></td>
        </tr>
        </tbody>
    </table>
</form>
</div>
</body>
</html>
