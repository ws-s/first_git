<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Student" method="post">
		<tr>
			<td>名字</td>
			<td>性别</td>
			<td>地址</td>
		</tr>
			<c:forEach items="${st }" var="stu">
				<tr>
					<td>${stu.sname }</td>
					<td>${stu.sex }</td>
					<td>${stu.address }</td>
				</tr>
			</c:forEach>
             
	
	</form>
</body>
</html>