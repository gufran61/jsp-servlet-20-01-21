<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment</title>
</head>
<body>
<form action="payment" method="post">
<table>
<tr><td>date</td>
<td><input type="date" name="date"></td></tr>
<tr><td>amount</td>
<td><input type="number" name="amount"></td></tr>
<tr><td>Reciever Name</td>
<td><input type="text" name="rName"></td></tr>
<tr><td>Reciever PhoneNumber</td>
<td><input type="number" name="rPnumber"></td></tr>
<tr><td>Giver Name</td>
<td><input type="text" name="gName"></td></tr>
<tr><td>Giver PhoneNumber</td>
<td><input type="number" name="GPnumber"></td></tr>
<tr><td>Note</td>
<td><input type="text" name="note"></td></tr>
<tr><td><input type="submit" value="Submit" ></td></tr>
</table>
</form>
</body>
</html>