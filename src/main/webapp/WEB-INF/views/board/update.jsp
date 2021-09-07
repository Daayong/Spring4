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
<c:import url="../temp/boot_nav.jsp"></c:import>

<h1>${board}Update Page</h1>

<div class="container-fluid">
	
		<form class="col-md-2 mx-auto" action="./update" method="post" >
		  <input type="hidden" readonly="readonly" value="${dto.num}" name="num">
		  <input type="hidden" readonly="readonly" value="${dto.writer}" name="writer">
		  <div class="mb-3">
		    <label for="title" class="form-label">TITLE</label>
		    <input type="text" class="form-control" name="title" value="${dto.title}" id="title" placeholder="Enter Title">
		  </div>
		  
		  <div class="mb-3">
		    <label for="contents" class="form-label">CONTENTS</label>
		    <textarea name="contents" id="contents" value="${dto.contents}" placeholder="Enter Contents"></textarea>
		  </div>
		 <input type="hidden" readonly="readonly" name="regDate" value="${dto.regDate}">
		 <input type="hidden" readonly="readonly" name="hits" value="${dto.hits}">
		 		 
		  <button type="submit" class="btn btn-primary">UPDATE</button>
		</form>
	
</div>



</body>
</html>