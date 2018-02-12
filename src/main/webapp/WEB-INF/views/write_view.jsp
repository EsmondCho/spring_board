<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Board</title>
</head>
<body>
<P> This is write_view.jsp </P>

<form method="POST" action="/write">
	<p>writer: <input type="text" name="writer"></p>
	<p>title: <input type="text" name="title"></p>
	<p>content: <input type="textarea" name="content"></p>
	<input type="submit">
</form>

</body>
</html>
