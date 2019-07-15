<!-- Html comment -->
<%--Jsp comment --%>

<!--  Forward a request in these ways  -->
<!-- 1 -->
<jsp:forward page="index.html">
<!-- 2 -->
<jsp:forward page="currentDate">
<!-- 3 -->
<jsp:forward page="currentDate?fname=123&lname=kj">

<!-- 4 -->
<jsp:forward page="currentDate">
<jsp:param name="fname" value="kumar">
<jsp:param name="lname" value="kk">
</jsp:forward>

<!-- 5 -->
<jsp:forward page="index.jsp">

