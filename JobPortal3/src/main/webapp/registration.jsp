<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="register.htm" method="post">
		<div align="center" style="margin-left:400px;margin-top:200px; width:50%">
			<div align="left">
			<p>${message}</p>
				First Name:<input type="text" name="uName">
				Last Name:<input type="text" name="lName"> <br><br>
				Email:<input type="email" name="eMail" style="align:left;"><br><br>
				Password:<input type="password" name="nPass">
				Conform Password:<input type="password" name="cPass"><br><br>
				<input type="submit" value="Register">
				
			</div>
		</div>


	</form>


</body>
</html>