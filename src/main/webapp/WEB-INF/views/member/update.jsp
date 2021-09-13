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

	<h1>update page</h1>
	
	
<form id="frm" action="update" method="post" style="width:300px; height:100%; margin: 0 auto; ">
  
  <div class="mb-3">
    <label for="text" class="form-label">ID</label>
    <input readonly="readonly" class="form-control put" id="iden" value="${member.id}" name="id" >
   </div>
  
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input type="password" class="form-control put pw" name="pw" value="${member.pw}" id="pw1">
  </div>

  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password 확인</label>
    <input type="password" class="form-control put pw" id="pw2"  placeholder="password를 한번더 입력하세요">
  	<div id="warnPw" style="color:red;"></div>
  </div>
  
  <div class="mb-3">
    <label for="text" class="form-label">Name</label>
    <input readonly="readonly" class="form-control put" id="name" value="${member.name}" name="name">
  </div>
  
  <div class="mb-3">
    <label for="text" class="form-label">Phone</label>
    <input type="tel" class="form-control put" id="phone" value="${member.phone}" name="phone" placeholder="${member.phone}">
  </div>
  
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email</label>
    <input type="email" class="form-control put" name="email" value="${member.email}" id="email" aria-describedby="emailHelp" placeholder="email@email.com">
  </div>
 
 <div class="mb-3 my-4">
	    <label class="form-label"></label>
	  <button id="btn" type="submit" class="btn btn-primary">Update</button>
 
 </form>
	

<!-- <script type="text/javascript" src="../resources/js/join.js"></script>
 -->
</body>
</html>