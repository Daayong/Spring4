<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:import url="../temp/boot_head.jsp"></c:import>
<title>Insert title here</title>
</head>
<body>
<c:import url="../temp/boot_nav.jsp"></c:import>

	<h1>Join page</h1>
	
	
<form style="width:300px; height:100%; margin: 0 auto; ">
  
  <div class="mb-3">
    <label for="text" class="form-label">ID</label>
    <input type="text" class="form-control put" id="iden">
  <!--   <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div> -->
  </div>
  
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input type="password" class="form-control put" id="pw1">
  </div>

  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password 확인</label>
    <input type="password" class="form-control put" id="pw2" placeholder="password를 한번더 입력하세요">
  	<div id="warnPw" style="color:red;"></div>
  </div>
  
  <div class="mb-3">
    <label for="text" class="form-label">Name</label>
    <input type="text" class="form-control put" id="name">
  <!--   <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div> -->
  </div>
  
  <div class="mb-3">
    <label for="text" class="form-label">Phone</label>
    <input type="text" class="form-control put" id="phone" placeholder="01012345678">
  <!--   <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div> -->
  </div>
  
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email</label>
    <input type="email" class="form-control put" id="email" aria-describedby="emailHelp" placeholder="email@email.com">
  <!--   <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div> -->
  </div>
  
  
  <button id="btn" type="submit" class="btn btn-primary">Submit</button>
</form>
	

</body>
</html>