<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body  bgcolor="pink">
<form action="/${pageContext.request.contextPath }/customer/list" method="post">
<table border="1" width="200" height="80" bordercolor="pink">
<tr>
<td>loginname</td><td></td>
<td><input type="text" name="name" id="loginname"></td>
</tr>
<tr>
<td>password:</td>
<td>
<input type="password" id="passowrd" name="password">
<td/><tr/>
<tr><td><input type="submit" value="提交"><td></tr>
</table>

</form>

</body>
</html>