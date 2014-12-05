<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script>
$(document).ready(function() {	
	$('img').click(function () {
		var fname = $(this).attr('id');
		fname = fname.substring(3);
		$('#target').attr('src', 'image.do?fname='+fname);
	});
});
</script>
</head>
<body>
<c:forEach var="image" items="${imageList}">
	<img id="${image}" src="image.do?fname=thumb/${image}"/> 
</c:forEach>
<br/>
<br/>
<img id="target" src="" width="500"/> 


</body>
</html>