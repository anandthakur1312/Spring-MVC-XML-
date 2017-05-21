<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>${headerMsg}</h1>
	<hr>
	<p>Name : ${user1.userName}</p>
	<p>Hobby: ${user1.userHobby}</p>
	<p>DOB : ${user1.userDOB}</p>
	<p>Ph#: ${user1.userPhNo}</p>
	<p>Skills : ${user1.userSkills}</p>
	<p>Address</p>
	<p>Country : ${user1.userAddress.country}</p>
	<p>City: ${user1.userAddress.city}</p>
	<p>Street : ${user1.userAddress.street}</p>
	<p>Pincode: ${user1.userAddress.pincode}</p>
	


</body>
</html>