<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/30
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="queryTeachers" method="get">
    <input type="submit" value="点击获取新闻JSON数据"/>
</form>

<form action="ReadParams" method="post">
    用户名：<input type="text" name="userName"/><br/>
    密码：<input type="password" name="password"/><br/>
    性别：<input type="radio" name="sex" value="男"/>男
    <input type="radio" name="usex" value="女"/>女<br/>
    爱好：<input type="checkbox" name="hobby" value="蹦迪"/>蹦迪
    <input type="checkbox" name="hobby" value="攀岩"/>攀岩
    <input type="checkbox" name="hobby" value="蹦极"/>蹦极<br/>
    生日：<input type="text" name="birthday"/><br/>
    <input type="submit" value="注册"/>
</form>
<form action="addTeacher" method="post">
    用户名：<input type="text" name="name"/><br/>
    年龄：<input type="password" name="age"/><br/>
    电话：<input type="number" name="tel"/><br/>
    课程：<input type="text" name="project"/><br/>
    性别：<input type="radio" name="sex" value="男"/>男
    <input type="radio" name="sex" value="女"/>女<br/>
    <input type="submit" value="添加"/>
</form>
</body>
</html>
