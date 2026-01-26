<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>BMI</h1>
<form action="BMI" method="POST">
    <label>Nhập chiều cao của bạn (m):</label>
    <input type="text" name="height" placeholder="Vd: 1.70">
    
    <label>Nhập số cân nặng của bạn (kg):</label>
    <input type="text" name="weight" placeholder="Vd: 73">
    
    <button type="submit">Gửi dữ liệu</button>
</form>
<% if(request.getAttribute("result") != null) { %> 
		<p>Chỉ số BMI: ${result}</p>
		<p>Kết quả: ${status}</p>
	<% } %> 

</body>
</html>