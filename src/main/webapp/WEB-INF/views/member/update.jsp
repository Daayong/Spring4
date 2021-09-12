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
	
	
<form id="frm" action="join" method="post" style="width:300px; height:100%; margin: 0 auto; ">
  
  <div class="mb-3">
    <label for="text" class="form-label">ID</label>
    <input readonly="readonly" class="form-control put" id="iden" name="id" placeholder="${member.id}">
   </div>
  
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input type="password" class="form-control put pw" name="pw" id="pw1">
  </div>

  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password 확인</label>
    <input type="password" class="form-control put pw" id="pw2" placeholder="password를 한번더 입력하세요">
  	<div id="warnPw" style="color:red;"></div>
  </div>
  
  <div class="mb-3">
    <label for="text" class="form-label">Name</label>
    <input type="text" class="form-control put" id="name" name="name" placeholder="${member.name}">
  </div>
  
  <div class="mb-3">
    <label for="text" class="form-label">Phone</label>
    <input type="tel" class="form-control put" id="phone" name="phone" placeholder="01012345678">
  </div>
  
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email</label>
    <input type="email" class="form-control put" name="email" id="email" aria-describedby="emailHelp" placeholder="email@email.com">
  </div>
  
  
<a href="login" class="btn btn-primary btn-lg" tabindex="-1" role="button" aria-disabled="true">UPDATE</a>
</form>
	

<!-- <script type="text/javascript" src="../resources/js/join.js"></script>
 -->
</body>
</html>