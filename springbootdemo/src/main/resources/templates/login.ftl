<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>

<form action="/validate" method="post">
    账号<input type="text" name="userName"/><br/>
    密码<input type="password" name="password"/><br/>
    <input type="submit" value="登录"/>
<span style="color: red">
<#if errorMsg??>${errorMsg}</#if>
</span>
</form>
</body>
</html>