<%@page import="java.util.Date"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My First Jsp</title>
</head>
<body>
  <h1 >Current Data & Time is :
  <%
   String currentDataTime= new Date().toString();
  %>>
 <span style="color:red"> <%=currentDataTime %>></span>
 <br>
 
  </h1>
</body>
</html>