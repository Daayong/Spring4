<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
	
	
	<title>Home</title>
	
	
	<script type="text/javascript">
		alert('Hello world');
	</script>
	<link href="./resources/css/home.css" rel="stylesheet">

</head>
<body>



	<h1 class="c1">Hello world</h1>
	
	<h1 id="d1">other</h1>
	
	<img class="c1" id="d3" alt="img1" src="./resources/images/sharpei.jpg">
	
	<div>
		<button onClick="fn1()">CLICK</button>
	</div>
	
	
	<div id="d2">
		<h3>In DIV</h3>
	</div>

	<script type="text/javascript" src="./resources/js/function_1.js" ></script>
	
		
	<script type="text/javascript">
		console.log('body script');
	</script>
	

</body>
</html>