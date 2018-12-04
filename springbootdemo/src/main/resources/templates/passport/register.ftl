<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>

<form action="/" method="post">
    账号<input type="text" name="userName"/><br/>
    密码<input type="password" name="password"/><br/>
    验证码<input type="text" name="identifyingCode"/><img src="data:image/png;base64,${identifyingImg}">
    <input type="text" value=${identifyingCode} hidden>
    <input type="submit" value="登录"/>
    <span style="color: red">
<#if errorMsg??>${errorMsg}</#if>
    </span>
</form>
</body>
</html>