<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	
	<title>Home</title>
	<script type="text/javascript">
		alert('Hello world');
	</script>
	
	<c:import url="./temp/boot_head.jsp"></c:import>
</head>
<body>

	<c:import url="./temp/boot_nav.jsp"></c:import>

	<h1>Hello world</h1>

	<script type="text/javascript">
		console.log('body script');
	</script>


</body>
</html>