<%--
  User: Jayce
  Date: 2020/5/14
  Time: 12:47
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>挂号功能界面</title>
    <link rel="stylesheet" href="./css/iconfont.css" type="text/css">
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
        span{
            color: red;
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
            width: 80px;
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
        select{
            width: 100px;
            height: 30px;
        }
    </style>
</head>
<body>
<div class="content">
    <form action="">
        <span >*</span> 发票号：<input name="fapiaohao" value="123456" type="text"> <input type="submit" value="&#59564 挂号" class="btn iconfont"> <input type="submit" value="&#59577 清空" class="btn iconfont">
        <div style="font-size: 20px;margin-top: 20px;margin-bottom: 20px">挂号信息</div>


        <div class="item">
            <span>*</span>病历号：<br>
            <input name="binglihao" value="600626" type="text">
        </div>
        <div class="item">
            <span>*</span>姓名：<br>
            <input name="realName" placeholder="请输入姓名" type="text">
        </div>
        <div class="item">
            <span>*</span>性别：<br>
            <select name="gender" >
                <option value="男">男</option>
                <option value="女">女</option>
            </select>

        </div>
        <div class="item1">
            <span>*</span>年龄：<br>
            <input name="age" type="text" placeholder="请输入年龄">
            <select name="">
                <option value="岁">岁</option>
                <option value="月">月</option>
                <option value="天">天</option>
            </select>
        </div>

        <div class="item">
            出生日期：<br>
            <input name="birthday" placeholder="请输入出生日期" type="text">
        </div>
        <div class="item1">
            家庭住址：<br>
            <input name="adrr" placeholder="请输入家庭地址" type="text" style="width: 390px">

        </div>
        <div class="item1">
            身份证号：<br>
            <input name="shenfenzheng" type="text"style="width: 275px" placeholder="请输入身份证号">
        </div>
        <div class="item">
            <span>*</span>结算类别：<br>
            <select name="">
                <option value="自费">自费</option>
                <option value="医保">医保</option>
                <option value="社保">社保</option>
            </select>
        </div>
        <div class="item">
            <span>*</span>看诊日期：<br>
            <input type="text" placeholder="请输入看诊日期">
        </div>
        <div class="item">
            <span>*</span>午别：<br>
            <select name="" >
                <option value="上午">上午</option>
                <option value="下午">下午</option>
            </select>
        </div>
        <div class="item1">
            <span>*</span>挂号科室：<br>
            <select name="" id="">
                <option value="内科">内科</option>
                <option value="外科">外科</option>
                <option value="骨科">骨科</option>
            </select>
        </div>
        <div class="item">
            <span>*</span>号别：<br>
            <select name="" >
                <option value="免费">免费</option>
                <option value="专家">专家</option>
            </select>
        </div>

        <div class="item">
            <span>*</span>看诊医生：<br>
            <select name="" >
                <option value="王医生">王医生</option>
                <option value="赵医生">赵医生</option>
                <option value="李医生">李医生</option>
                <option value="张医生">张医生</option>
            </select>

        </div>
        <div class="item">
            初始号额：<br>
            <input type="text" placeholder="初试号额">

        </div>
        <div class="item1">
            已用号额：<br>
            <input type="text" placeholder="已用号额">
        </div>
        <div class="item">
            病历本：
            <input type="checkbox" name="isBook" style="height: auto;margin-top: 25px">

        </div>
        <div class="item">
            <span>*</span>应收金额：<br>
            <input type="text" placeholder="应收金额">

        </div>
        <div class="item">
            <span>*</span>收费方式：<br>
            <select name="" >
                <option value="现金">现金</option>
                <option value="医保卡">医保卡</option>
                <option value="微信">微信</option>
            </select>
        </div>



    </form>
</div>
</body>
</html>
