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

	<h1>My page</h1>
	
	
<form id="frm" action="myPage" method="get" style="width:300px; height:100%; margin: 0 auto; ">
  
  <div class="mb-3">
    <label for="text" class="form-label">ID</label>
    <input readonly="readonly" class="form-control put pw" id="id" name="id" placeholder="${member.id}">
  </div>
  
  <div class="mb-3">
    <label for="text" class="form-label">Name</label>
    <input readonly="readonly" class="form-control put" id="name" name="name" placeholder="${member.name}">
  </div>
  
  <div class="mb-3">
    <label for="text" class="form-label">Phone</label>
    <input readonly="readonly" class="form-control put" id="phone" name="phone" placeholder="${member.phone}">
  </div>
  
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email</label>
    <input readonly="readonly" class="form-control put" id="email" name="email" aria-describedby="emailHelp" placeholder="${member.email}">
  </div>
  
  <div>
  	<img src="../resources/upload/member/${files.fileName}"> 
  
  </div>
  
  
  
  
  <a href="./update?id=${dto.id}" class="btn btn-primary btn-lg" tabindex="-1" role="button" aria-disabled="true">UPDATE</a>
  <a href="#" id="del" class="btn btn-danger btn-lg" tabindex="-1" role="button" aria-disabled="true">DELETE</a>
  
</form>
	

<script type="text/javascript">

/* const del = document.getElementById("del");
 */
 const del=document.querySelector("#del");
del.addEventListener('click',function(){
	let result=window.confirm('Really Delete?');
	
	if(result){
		location.href="./delete";
	}
	
});
</script>

</body>
</html>