<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Detail</title>
</head>
<body>
<form action="bookDetail" method="post">
<table>
<tr><td>date</td>
<td><input type="date" name="date"></td></tr>
<tr><td>Book Taker</td>
<td><input type="text" name="bTaker"></td></tr>
<tr><td>Book Taker PhoneNumber</td>
<td><input type="number" name="bTPnumber"></td></tr>
<tr><td>Book Giver Name</td>
<td><input type="text" name="bGName"></td></tr>
<tr><td> Book Giver PhoneNumber</td>
<td><input type="number" name="bGpNumber"></td></tr>
<tr><td>Amount</td>
<td><input type="number" name="amount"></td></tr>
<tr><td>Cash</td>
<td><input type="text" name="cash"></td></tr>
<tr><td>Balance</td>
<td><input type="text" name="balance"></td></tr>
<tr><td>Note</td>
<td><input type="text" name="note"></td></tr>
<tr><td><input type="submit" value="Submit" ></td></tr>
</table>
</form>
</body>
</html>