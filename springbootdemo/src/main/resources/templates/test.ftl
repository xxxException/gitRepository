<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
你好，<#if username??>${username}</#if>
<form action="/logout">
    <input type="submit" name="提交">
</form>
</body>
</html>