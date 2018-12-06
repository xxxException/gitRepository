<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
当前登录用户: <@shiro.principal property="userName" /><!--这里userName是 在realm中的重写登录方法中，作为principal设置进info的user的属性-->
时间：<#if dateTime??>${dateTime?string("yyyy-MM-dd HH:mm:ss")}</#if>
<form action="/passport/logout">
    <input type="submit" value="注销">
</form>

<form action="/loadPermissions">
    <input type="submit" value="加载权限">
</form>


<form action="/hello">
    <input type="submit" value="index">
</form>

<form action="/question/add">
    title<input type="text" name="title">
    content<input type="text" name="content">
    <input type="submit" value="提问">
</form>
<@shiro.notAuthenticated></@shiro.notAuthenticated>
</body>
</html>