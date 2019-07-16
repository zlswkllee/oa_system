<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/28
  Time: 17:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>登录</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <script type="text/javascript" src="/js/bootstrap.min.js"></script>
    <script src="/js/jquery-3.4.1.js"></script>
    <script src="/js/jquery.validate.min.js"></script>
    <script src="/js/messages_zh.js"></script>

    <script>
        $(function(){
            $("#ff").validate({
                rules:{
                    username:"required",
                    password:"required"

                },
                messages:{
                    username:"必填字段",
                    password: "请输入密码"

                }
            })
        })
    </script>
</head>
<body>
<div class="container">
    <div class="panel panel-primary">
        <div class="panel-heading">
            <div class="panel-title">
                <p class="text-center">
                    登录
                </p>
            </div>
        </div>
    </div>
    <div class="panel-body">
        <form action="/login" method="post" id="ff" class="form-horizontal">
            <div class="form-group">
                <label class="col-sm-4 control-label" for="username">
                    用户名：
                </label>
                <div class="col-sm-4">
                    <input name="username" type="text" id="username" class="form-control">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-4 control-label" for="password">
                    密码：
                </label>
                <div class="col-sm-4">
                    <input name="password" type="text" id="password" class="form-control">
                </div>
            </div>
            <div class="form-group">
                <label class="radio-inline col-sm-5 control-label">
                    <input type="radio" name="statu" id="inlineRadio1" value="0"> 学生
                </label>
                <label class="radio-inline">
                    <input type="radio" name="statu" id="inlineRadio2" value="1"> 讲师
                </label>
                <label class="radio-inline">
                    <input type="radio" name="statu" id="inlineRadio3" value="2"> 班主任
                </label>

                <label class="radio-inline">
                    <input type="radio" name="statu" id="inlineRadio4" value="3"> 校长
                </label>
                <label class="radio-inline">
                    <input type="radio" name="statu" id="inlineRadio5" value="4"> 超级管理员
                </label>

            </div>
            <div class="form-group">
                <div class="col-sm-offset-4 col-sm-4">
                    <button type="submit" class="btn btn-default btn-primary form-control">登录</button>
                </div>
            </div>

        </form>
    </div>

</div>


</body>
</html>
