<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	업로드 완료(업로드 파일 목록)
	<br />
	<ul>
		<c:forEach var="r" items="${reportCommand.reports}">
			<c:if test="${!r.isEmpty()}">
				<li>
				<a href="image.do?fname=${r.originalFilename}"> 
				<img src="image.do?fname=thumb\\th_${r.originalFilename}">
				</a> 
				<a href="file.do?fname=${r.originalFilename}">
				${r.originalFilename}</a>

				</li>
			</c:if>
		</c:forEach>
	</ul>
</body>
</html>