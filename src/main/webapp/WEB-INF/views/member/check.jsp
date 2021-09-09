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

	<h1>Check page</h1>

<div class="container-fluid">
	<div class="form-check">
	  <input class="form-check-input" type="checkbox" value="" id="all">
	  <label class="form-check-label" for="all">
	    CHECK ALL
	  </label>
	</div>
	
	<div class="form-check" >
	  <input class="form-check-input cn pill" type="checkbox" value="" id="flexCheckDefault">
	  <label class="form-check-label" for="flexCheckDefault">
	    약관 1 
	  </label>
	</div>
	
	<div class="form-check">
	  <input class="form-check-input cn pill" type="checkbox" value="" id="flexCheckDefault">
	  <label class="form-check-label" for="flexCheckDefault">
	    약관 2
	  </label>
	</div>
	
	<div class="form-check">
	  <input class="form-check-input cn pill" type="checkbox" value="" id="flexCheckDefault">
	  <label class="form-check-label" for="flexCheckDefault">
	    약관 3
	  </label>
	</div>
	
	<div class="form-check">
	  <input class="form-check-input cn" type="checkbox" value="" id="Marketing">
	  <label class="form-check-label" for="Marketing">
	  	약관 4(마케팅수신동의)
	  </label>
	</div>

</div>

<button id="btn">회원가입</button>


<script type="text/javascript" src="../resources/js/check.js"></script>

</body>
</html>