<%--
  User: Jayce
  Date: 2020/5/16
  Time: 8:14
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>云HIS系统登录</title>
    <style>
        *{
            padding: 0px;
            margin: 0px;
        }
        #header{height: 70px;color: white;background-color: #1299FF;font-size: 30px;padding-left: 20px;line-height: 70px;font-weight: bold;}
        #content{
            margin-top: 80px;
            margin-left: 250px;
            width: 800px;
            height: 300px;

            border: solid 1px #ccc;
        }
        .left{

            float: left;


        }
        .left img{
            width: 350px;
            height: 250px;
            padding: 20px;
        }
        .right{
            float: left;
            padding: 70px 20px;
            width: 350px;
            height: 250px;

        }
        .right input{
            margin: 2px 3px;
            width: 200px;
            height: 30px;
            padding-left: 3px;
        }
        .item{
            width: 300px;
            height: 50px;


        }

    </style>
</head>
<body>
<%----%>
<script language="JavaScript">
    function Check() {
        if(login.username.value()==""){
            alert("请输入用户名");
            login.username.focus();
            return false;
        }
        if(login.password.value()==""){
            alert("请输入密码");
            login.password.focus();
            return false;
        }

    }

</script>
<div id="header">东软云HIS系统</div>
<div id="content">
    <div class="left">
        <img  src="/static/img/loginl.jpg" alt="">
        
    </div>
    <div class="right">
        <form name="login" action="login"method="post" onsubmit="return Check()">
            <div class="item">
                用户名：<input  type="text" name="username"> <br>
            </div>
            <div class="item">
                密 &nbsp;  码：<input  type="password" name="password"> <br>
            </div >
            <div class="item2">

                <label>
                    <input type="radio" name="userType" value="2" style="width: 20px;display: inline; height: 15px;margin-top: 5px">挂号员

                </label>
                <label>
                    <input type="radio" name="userType" value="3" style="width: 20px;display: inline;height: 15px;margin-top: 5px">医生

                </label>
                <label>
                    <input type="radio" name="userType" value="1" style="width: 20px;display: inline;height: 15px;margin-top: 5px">管理员

                </label>

            </div>
            <input type="submit" value="登录" style="margin-top: 15px; width: 262px">
        </form>
    </div>

</div>
${mess}
<div id="footer"></div>

</body>
</html>
