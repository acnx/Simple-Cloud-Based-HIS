<%--
  User: Jayce
  Date: 2020/5/14
  Time: 12:47
  注册页
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>挂号功能界面</title>
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
        select{
            width: 100px;
            height: 30px;
        }
    </style>
</head>
<body>
<script>
    function resetForm() {
        document.getElementById("regiForm").reset();
    }
    function ghcg() {
        window.alert("挂号成功");

    }
</script>
<h2 style="padding-left: 10px;padding-top: 20px">现场挂号</h2>

<div class="content">
    ${mess}
    <form id="regiForm" action="putData" method="post">
        <span >*</span> 发票号：<input name="fapiaohao" placeholder="123456" type="text">
        <input type="submit" onclick="ghcg()"  value="&#59564 挂号" class="btn iconfont">
        <input type="button" value="&#59577 清空" onclick="resetForm()" class="btn iconfont">
        <div style="font-size: 20px;margin-top: 20px;margin-bottom: 20px">挂号信息</div>
        <div class="item">
            <span>*</span>病历号：<br>
            <input name="caseNumber" placeholder="600626" type="text">
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
            <select name="ageType">
                <option value="1">岁</option>
                <option value="2">月</option>
                <option value="3">天</option>
            </select>
        </div>

        <div class="item">
            出生日期：<br>
            <input name="birthDate" placeholder="请输入出生日期" type="text">
        </div>
        <div class="item1">
            家庭住址：<br>
            <input name="homeAddress" placeholder="请输入家庭地址" type="text" style="width: 390px">
        </div>
        <div class="item1">
            身份证号：<br>
            <input name="idnumber" type="text"style="width: 275px" placeholder="请输入身份证号">
        </div>
        <div class="item">
            <span>*</span>结算类别：<br>
            <select name="settleId">
                <option value="1">自费</option>
                <option value="2">医保</option>
                <option value="3">社保</option>
            </select>
        </div>
        <div class="item">
            <span>*</span>看诊日期：<br>
            <input name="visitDate" type="text" placeholder="请输入看诊日期">
        </div>
        <div class="item">
            <span>*</span>午别：<br>
            <select name="noon" >
                <option value="上午">上午</option>
                <option value="下午">下午</option>
            </select>
        </div>
        <div class="item1">
            <span>*</span>挂号科室：<br>
            <select name="deptId" id="">
                <option value="1">内科</option>
                <option value="2">外科</option>
                <option value="3">骨科</option>
            </select>
        </div>
        <div class="item">
            <span>*</span>号别：<br>
            <select name="registerLeid" >
                <option value="1">免费号</option>
                <option value="1">专家号</option>
            </select>
        </div>

        <div class="item">
            <span>*</span>看诊医生：<br>
            <select name="userId" >
                <option value="1">王医生</option>
                <option value="2">赵医生</option>
                <option value="3">李医生</option>
                <option value="4">张医生</option>
            </select>
        </div>
        <%--初始号额和已用号额以后再说--%>
        <div class="item">
            初始号额：<br>
            <input type="text" placeholder="87650000">
        </div>
        <div class="item1">
            已用号额：<br>
            <input type="text" placeholder="87650021">
        </div>
        <div class="item">
            病历本：
            <input type="checkbox" name="isBook" value="1" style="height: auto;margin-top: 25px">
        </div>
        <div class="item">
            <span>*</span>应收金额：<br>
            <input name="money" type="text" placeholder="应收金额">
        </div>
        <div class="item">
            <span>*</span>收费方式：<br>
            <select name="moneyType" >
                <option value="1">现金</option>
                <option value="2">医保卡</option>
                <option value="3">微信</option>
            </select>
        </div>
    </form>
</div>
</body>
</html>
