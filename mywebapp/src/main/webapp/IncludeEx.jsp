<html>
<head>
<title>Include Action</title>
</head>
<body>
<br>
11111111111
<br>
<jsp:include page="index.html"></jsp:include>

<br>
222222222
<br>
<jsp:include page="currentDate"></jsp:include>

<br>
333333333333
<br>
<jsp:include page="currentDate?fname=kamal"></jsp:include>

<br>
444444444444444
<br>
<jsp:include page="MyFirstJSP.jsp"></jsp:include>

<br>
555555555
<br>
<jsp:include page="currentDate">
<jsp:param value="fname" name="Munna"/>
<jsp:param value="lname" name="Bhaiyaa"/>
</jsp:include>
</body>
</html>