<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Board</title>
</head>
<body>
	<c:forEach items="${list}" var="dto">
		<p>title: ${dto.title}</p>
		<p>writer: ${dto.writer}</p>
		<p>content: ${dto.content}</p>
		<hr>
	</c:forEach>
	
</body>
</html>
