<%@ page session="false" %>>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet" href="./login.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

</head>
<body class="body">
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark ">
		<h1>
			<span style="color: Blue; margin-left: 10px;">Employee Login
				Page</span>
		</h1>
	</nav>
	<div class="row mt-4">
		<div class="col-md-4 offset-4 ">
			<form action="./authentication" role="form"
				style="background-color: rgb(64, 186, 207)" method="post">
				
				
				<legend style="text-align: center; font-size: 80px">Login</legend>
				<div class="form-group">
					<label for="">Email</label> <input type="text" class="form-control"
						name="id" id="email">
				</div>
				<div class="form-group ">
					<label for="">Password</label> <input type="password"
						class="form-control" name="password" id="password"> <label
						onclick="showPassword()" for=""
						class="icon glyphicon glyphicon-eye-open"></label>
				</div>
				<div>
					<button type="submit" class="btn btn-primary" name="myButton"
						id="myButton">Login</button>
				</div>
				<div class="links">
					<a href="empinfo">Create Account</a> <a href="#"
						class="float-right">Forget Password</a>
				</div>
                  <%=request.getAttribute("msg") %>
			</form>
			<%--  <%= request.getParameter("msg") %> --%>
		</div>
	</div>

	<script src="login.js"></script>
</body>
</html>