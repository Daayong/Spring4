<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../temp/boot_head.jsp"></c:import>
</head>
<body>

<h1> Login Page</h1>


<form id="frm" action="login" method="post" style="width:300px; height:100%; margin: 0 auto; ">
  
  <div class="mb-3">
    <label for="text" class="form-label">ID</label>
    <input type="text" class="form-control put" name="id" id="id">
  </div>
  
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">PW</label>
    <input type="password" class="form-control put" name="pw" id="pw1">
  </div>

	<button type="submit" id="log">Login</button>
	<a href="join" class="btn btn-primary btn-sm" tabindex="-1" role="button" aria-disabled="true">JOIN</a>
  

</form>
	

</body>
</html>