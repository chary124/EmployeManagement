 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"
import="test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title> 
</head>
<body>
<%
AdminBean ab = (AdminBean)session.getAttribute("abean");
EmployeeBean eb = (EmployeeBean)request.getAttribute("ebean");out.println("Page belongs to Admin:"+ab.getfName()+"<br>");
%>
<form action="update" method="post">
<input type="hidden" name="eid" value=<%=eb.geteId() %>>
BasicSala:<input type="text" name="bsal" value=<%=eb.getbSal() %>><br>
HRA(1-100):<input type="text" name="hra" value=<%=eb.getHra() %>><br>
DA(1-100):<input type="text" name="da" value=<%=eb.getDa() %>><br><input type="submit" value="UpdateEmployee">
</form>
</body>
</html>