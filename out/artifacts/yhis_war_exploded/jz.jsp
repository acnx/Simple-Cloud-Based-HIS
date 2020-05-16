<%--
  User: Jayce
  Date: 2020/5/14
  Time: 12:49
  医生接诊
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>接诊</title>
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
            height: 25px;
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
        }
        th{
            color: #909399;
            padding-bottom: 10px;
        }
        td{
            text-align: center;
            padding-left: 10px;
        }
        a{
            text-decoration: none;color: black
        }
    </style>
</head>
<body>
<script>

    function zxcg() {
        window.alert("医嘱已提交");

    }
</script>
<div class="content">
    <h2 style="padding-left: 10px;">接诊</h2>
    <form action="getinfo" method="post">
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
            身份证号：<br>
            <input name="homeAddress" value="${reg.homeAddress}" placeholder="身份证号" type="text" style="width: 390px">

        </div>
        <div class="item1">
            看诊状态：<br>
            <input name="visitState" value="${reg.visitState}" type="text"style="width: 275px" placeholder="看诊状态">
        </div>
        <div style="clear: left"></div>
    </form>
    <form action="yizhu" method="post">
        <div style="font-size: 20px;margin-top: 20px;margin-bottom: 20px">患者消费信息</div>
        <table>
            <thead>
            <tr>
                <th>病历号</th>
                <th>项目名称</th>
                <th>单价</th>
                <th>数量</th>
                <th>备注</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>
                    <input name="caseNumber" value="${reg.caseNumber}" type="text">
                </td>
                <td>
                    <input name="item" type="text">
                </td>
                <td>
                    <input name="price" type="text">
                </td>
                <td>
                    <input name="amount" type="text">
                </td>
                <td>
                    <input name="note" type="text">
                </td>
                <td>
                    <input onclick="zxcg()" type="submit" value="执行">
                </td>
            </tr>
            </tbody>
        </table>
    </form>
</div>
</body>
</html>
