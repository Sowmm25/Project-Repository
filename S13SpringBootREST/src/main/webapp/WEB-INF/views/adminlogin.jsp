<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
	<head>
		<title>Please Log In</title>
	</head>
	<body>
		<h1>Please Log In</h1>
	
		<form action="/adminlogin" method="post">
			<pre>
			Username<input type="text" name="username" />
		
		
			Password <input type="password" name="password" />
			
			<input type="submit" value="Log in" />
			</pre>
		</form>
	</body>
</html>