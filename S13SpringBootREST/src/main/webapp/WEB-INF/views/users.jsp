<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="users" method="post">
		<pre>
		
		Name:<input type="text" name="firstname" />
		Description:<input type="text" name="lastname" />
		Price:<input type="text" name="mobno" />
		city:<input type="text" name="city" />
		state:<input type="text" name="state" />
	username:<input type="text" name="username" />
		Pass:<input type="text" name="password" />
		email:<input type="text" name="email" />
		 <input type="submit" value="submit" />
			</pre>
	</form>

	
	<p>${message }</p>

	<ul>
		<c:forEach items="${users}" var="user">
			<li>${user.id }| ${user.firstname } | ${user.lastname } | ${user.mobno }</li>
		</c:forEach>
	</ul>

</body>
</html>