<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<form action="report.do" method="post" enctype="multipart/form-data">
학번: <input type="text" name="studentNumber"> <br/>
레포트1: <input type="file" name="reports"><br/>
레포트2: <input type="file" name="reports"><br/>
레포트3: <input type="file" name="reports"><br/>
레포트4: <input type="file" name="reports"><br/>
레포트5: <input type="file" name="reports"><br/>
<input type="submit" value="업로드"/>

</form>
</body>
</html>