<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Hotel Search</h1>
	
	<form action="/result" method="POST">

		<label for="city"> City:</label>  <br> <br>
			
			<select id="city" name="city">
			  <option value="Detroit">Detroit</option>
			  <option value="Lansing">Lansing</option>
			  <option value="Ann Arbor">Ann Arbor</option>
			 
			</select> 
	
		<br> <br>
		<input type="submit" value="Search">
		
	</form>

</body>
</html>