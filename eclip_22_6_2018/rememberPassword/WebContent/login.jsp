<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>remember password</title>
</head>
<body>

<fieldset>
		<legend>login</legend>
		${error}
		<form action="AccountController" method="post">

			<table cellpadding="2" cellspacing="2">
				<tr>
					<td>username</td>
					<td><input type="text" name="username" /></td>
				</tr>

				<tr>
					<td>password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				
				<tr>
					<td>&nbsp;</td>
					<td><input type="checkbox" name="remember" />remember</td>
				</tr>
				
				<tr>
					<td>&nbsp;</td>
					<td><input type="submit" value="submit" /></td>
				</tr>
			</table>

		</form>
	</fieldset>
</body>
</html>