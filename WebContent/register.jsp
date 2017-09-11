<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Register</title>
	<style type="text/css">
		.content{
			width:680px;
			height:auto;
			margin: 10px auto;
		}
	</style>
</head>
<body>
	<div class="content">
	<form action="register" method="post">
			<table border="1" cellpadding="3">
				<caption> <h1>Register</h1> </caption>
				<tr>
					<td>姓名</td>
					<td>密码</td>
					<td>性别</td>
					<td style="width:100px"></td>
				</tr>
				<tr>
					<td>
						<input type="text" name="newone.name" size="21" />
					</td>
					
					<td>
						<input type="password" name="newone.passwords" size="21"/>
					</td>
					
					<td>
						<input type="text"/>
					</td>
					
					<td>
							<input type="submit" value="提交"/>
							<input type="reset" value="取消"/>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>