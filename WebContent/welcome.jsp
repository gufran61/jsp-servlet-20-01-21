
<%@page import="com.controller.Fetch"%>
<%@page import="java.util.List"%>
<%@page import="com.bean.RegisterBean"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%-- <%@page contentType="text/html" pageEncoding="UTF-8"%> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta  charset="ISO-8859-1">
<title>welcome</title>
</head>
<body>
	<a href="bookDetail.jsp"><button>BookDetail</button></a>
	<a href="interview.jsp"><button>Interview</button></a>
	<a href="payment.jsp"><button>Payment</button></a>
	<a href="logout"><button>LogOut</button></a>
	<a href="Fetch"><button>Fetch</button></a>

	<h1>Displaying Register List</h1>
	<table border="1" width="500" align="left">
		<tr bgcolor="00FF7F">
			<th><b>username</b></th>
			<th><b>password</b></th>
			<th><b>phoneNumber</b></th>
		</tr>

		 
		 
        <c:forEach items="${set}" var="rb">
            <tr>
               
                <td>${rb.username}</td>
                <td>${rb.password}</td>
                <td>${rb.phoneNumber}</td>
            </tr>
        </c:forEach>
    
	</table>
</body>
</html>