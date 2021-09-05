<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../temp/boot_head"></c:import>
</head>
<body>
<c:import url="../temp/boot_nav"></c:import>
	<h1>Insert Page</h1>


<div class="container-fluid">
	<form class="col-md-3 mx-auto" action="./insert" method="post" >
	  <div class="mb-3">
	    <label for="exampleInputEmail1" class="form-label">NUM</label>
	    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
	    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
	  </div>
	  
	  <div class="mb-3">
	    <label for="exampleInputPassword1" class="form-label">Password</label>
	    <input type="password" class="form-control" id="exampleInputPassword1">
	  </div>
	  
	  <div class="mb-3 form-check">
	    <input type="checkbox" class="form-check-input" id="exampleCheck1">
	    <label class="form-check-label" for="exampleCheck1">Check me out</label>
	  </div>
	 
	  <button type="submit" class="btn btn-primary">Submit</button>
	</form>
</div>






</body>
</html>