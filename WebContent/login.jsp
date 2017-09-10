<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Libary Management</title>
</head>
<body>
	<s:form action="login" method="post" theme="simple">
		<table border="0" cellpadding="3" >
			<caption>用户登录</caption>
			<tr>
				<td>登录名</td>
				<td><s:textfield name="login.name" size="21" /></td>
			</tr>
			<tr>
				<td>人员号</td>
				<td><s:textfield name="login.id" size="21"/></td>
			</tr>
			<tr>
				<td>密&nbsp;&nbsp;码</td>
				<td>
					<input type="password" name="login.passwords" size="21" />
				</td>
			</tr>
			<tr>
				<td><s:submit value="登录" /></td>
				<td><s:reset value="取消" /></td>
			</tr>
		</table>
	</s:form>
</body>
</html>