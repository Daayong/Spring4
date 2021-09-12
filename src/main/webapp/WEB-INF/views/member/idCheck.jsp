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
	<h1>ID Check Page</h1>
	
	<div>
		${param.id}는
		<c:if test="${empty dto}">
			사용 가능한 ID입니다
		</c:if>
		<c:if test="${not empty dto}">
			사용 불가능한 ID입니다
		</c:if>
		
	</div>
	
<form id="frm" action="idCheck" method="get" class="col-6">
  
  <div class="mb-3">
    <label for="text" class="form-label">ID</label>
    <input type="text" class="form-control put" value="${param.id}" name="id" id="id">
    <button id="idCheck" type="submit">ID 중복확인</button>
    <c:if test="${empty dto}">
		 <button type="button" id="useId">ID 사용</button>
	</c:if>
  </div>
  </form>
  
  <script type="text/javascript">
  	const useId = document.getElementById("useId");
  	useId.addEventListener('click',function(){
  		let id=window.document.getElementById('id').value;
  		opener.document.getElementById('iden').value=id;
  		close();
  	});
  </script>

</body>
</html>