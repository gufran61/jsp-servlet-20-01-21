<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Interview</title>
</head>
<body>
<form action="interview" method="post">
<table>
<tr><td>Interview given by</td>
<td><input type="text" name="igb"></td></tr>
<tr><td>Hr Name</td>
<td><input type="text" name="hrName"></td></tr>
<tr><td>Hr company Name</td>
<td><input type="text" name="hrCName"></td></tr>
<tr><td>Hr PhoneNumber</td>
<td><input type="number" name="hrPnumber"></td></tr>
<tr><td>client Name</td>
<td><input type="text" name="cName"></td></tr>
<tr><td>Interview Result</td>
<td><input type="text" name="iResult"></td></tr>
<tr><td>Note</td>
<td><input type="text" name="note"></td></tr>
<tr><td><input type="submit" value="Submit" ></td></tr>
</table>
</form>
</body>
</html>