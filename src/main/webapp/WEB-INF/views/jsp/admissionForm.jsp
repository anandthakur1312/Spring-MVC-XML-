<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>${headerMessage}</h1>

	<h3>STUDENT ADMISSION FORM FOR ENGINEERING COURSES</h3>
	<form:errors path="user1.*" />

	<form action="/spring3-mvc-maven-xml-hello-world/submitForm"
		method="post">

		<table>
			<tr>
				<td>Users Name :</td>
				<td><input type="text" name="userName" /></td>
			</tr>
			<tr>
				<td>Users Hobby :</td>
				<td><input type="text" name="userHobby" /></td>
			</tr>

			<tr>
				<td>Users Mobile :</td>
				<td><input type="text" name="userPhNo" /></td>
			</tr>
			<tr>
				<td>Users DOB :</td>
				<td><input type="text" name="userDOB" /></td>
			</tr>
			<tr>
				<td>Users Skills set :</td>
				<td><select name="userSkills" multiple>
						<option value="Java Core">Java Core</option>
						<option value="Spring Core">Spring Core</option>
						<option value="Spring MVC">Spring MVC</option>
				</select>
				<td>
			</tr>
		</table>
		<table>
		<tr>
				<td>Users Address :</td>
			</tr>
			<tr>
				<td>Country: <input type="text" name="userAddress.country" /></td>
				<td>City: <input type="text" name="userAddress.city" />
				</td>
				<td>Street: <input type="text" name="userAddress.street" />
				</td>
				<td>Pincode: <input type="text" name="userAddress.pincode" /></td>
			</tr>
		
		</table>
		<input type="submit" value="Submit" />

	</form>



</body>
</html>