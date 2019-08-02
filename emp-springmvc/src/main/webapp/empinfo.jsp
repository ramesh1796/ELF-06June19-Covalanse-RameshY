<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Document</title>
<link rel="stylesheet" href="">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>

<body>
	<form class="col-md-10 offset-1"
		style="background-color: rgb(236, 236, 114)"
		action="http://localhost/emp/createemployeeinfo" method="post">
		<h3 style="text-align: center; padding: 20px;">Employee
			Information</h3>
		<hr>
		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputEmail4">ID</label> <input type="text" name="id"
					class="form-control" placeholder="Please Enter ID">
			</div>
			<div class="form-group col-md-6">
				<label for="inputPassword4">Account Number</label> <input
					type="text" name="accountNo" class="form-control"
					placeholder="Please EnterAccount Numberr ">
			</div>

		</div>
		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputEmail4">Name</label> <input type="text" name="name"
					class="form-control" placeholder="Please Enter Name">
			</div>
			<div class="form-group col-md-6">
				<label for="inputPassword4">Email Id</label> <input type="email"
					name="email" class="form-control"
					placeholder="Please Enter Email Id ">
			</div>

		</div>

		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputEmail4">Age</label><br> <input type="text"
					name="age" class="form-control" placeholder="Please Enter Age">

			</div>

			<div class="form-group col-md-6">

				<label for="inputPassword4">Designation</label> <input type="text"
					name="designation" class="form-control"
					placeholder="Please EnterDesignation">
			</div>



		</div>
		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputEmail4">Gender</label><br> <select
					style="width: 640.75px; height: 39.99px;">
					<option name="gender" value="" disabled="disabled"
						selected="selected">Please select</option>
					<option value="Male">Male</option>
					<option value="Female">Female</option>

				</select>
			</div>
			<div class="form-group col-md-6">
				<label for="inputPassword4">Date Of Birth</label> <input type="date"
					name="dob" class="form-control" placeholder="dd-mm-yyyy">
			</div>

		</div>


		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputEmail4">Salary</label> <input type="text"
					name="salary" class="form-control"
					placeholder="Please EnterDesignation">
			</div>
			<div class="form-group col-md-6">
				<label for="inputPassword4">Department ID</label> <input type="text"
					name="departmentId" class="form-control"
					placeholder="Please Enter Department ID ">


			</div>
		</div>
		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputEmail4">Phone Number</label> <input type="text"
					name="phone" class="form-control"
					placeholder="Please Enter Phone Number">
			</div>
			<div class="form-group col-md-6">
				<label for="inputPassword4">Manager ID</label> <input type="text"
					name="managerId" class="form-control"
					placeholder="Please Enter Manager ID ">


			</div>
		</div>

		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputPassword4">Password</label> <input type="password"
					name="password" class="form-control" placeholder="Enter a password">
			</div>

			<div class="form-group col-md-6">
				<label for="inputPassword4">Confirm Password</label> <input
					type="password" class="form-control"
					placeholder="Re-enter your password">
			</div>
		</div>

		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputPassword4">Date Of Joining</label> <input
					type="date" name="joiningDate" class="form-control"
					placeholder="dd-mm-yyyy">
			</div>

		</div>



		</div>

		<h3 style="text-align: center; padding: 20px;">Employee Other
			Information</h3>
		<hr>
		<div class="form-row">
			<div class="form-group col-md-4">
				<label for="inputEmail4">ID</label> <input type="text"
				   name="otherInfo.eid"	class="form-control" placeholder="Please Enter ID">
			</div>
			<div class="form-group col-md-4">
				<label for="inputPassword4">Emergency Contact Name</label> <input
					name="otherInfo.ecnNm"type="text" class="form-control"
					placeholder="Please Enter Emergency Contact Number ">
			</div>
			<div class="form-group col-md-4">
				<label for="inputAddress">Mother Name</label> <input type="text"
				   name="otherInfo.motherNm"	class="form-control" id="inputAddress"
					placeholder="Please Enter Mother Name">
			</div>
		</div>

		<div class="form-row">
			<div class="form-group col-md-4">
				<label for="inputEmail4">Pan Number</label> <input type="text"
				   name="otherInfo.pancard"	class="form-control" placeholder="Please Enter Pan Number">
			</div>
			<div class="form-group col-md-4">
				<label for="inputPassword4">Emergency Contact Number</label> <input
				name="otherInfo.ecnNo"	type="text" class="form-control"
					placeholder="Please Enter Emergency Contact Number ">
			</div>
			<div class="form-group col-md-4">
				<label for="inputAddress">Spouse Name</label> <input type="text"
					name="otherInfo.spouse"class="form-control" id="inputAddress"
					placeholder="Please Enter Spouse Name">
			</div>
		</div>

		<div class="form-row">
			<div class="form-group col-md-4">
				<label for="inputEmail4">Married Status</label><br> <select
					style="width: 408.75px; height: 37.99px;">
					<option name="otherInfo.mstatus" value="" disabled="disabled"
						selected="selected">Please select</option>
					<option value="Married">Married</option>
					<option value="Single">Single</option>
				</select>

			</div>

			<div class="form-group col-md-4">

				<label for="inputPassword4">Nationality</label> <select
					style="width: 408.75px; height: 37.99px;">
					<option value="" name="otherInfo.nationality"disabled="disabled" selected="selected">Please
						select</option>
					<option value="Indian">Indian</option>
					<option value="Other">Other</option>
				</select>
			</div>

			<div class="form-group col-md-4">
				<label for="inputAddress">Passport Number</label> <input type="text"
					name="otherInfo.passportNo"class="form-control" id="inputAddress"
					placeholder="please enter Passport Number">
			</div>

		</div>
		<div class="form-row">
			<div class="form-group col-md-4">
				<label for="inputEmail4">Blood Group</label> <select
					style="width: 408.75px; height: 37.99px;">
					<option value="" name="otherInfo.bloodgroup" disabled="disabled" selected="selected">Please
						select</option>
					<option value="A+">A+</option>
					<option value="B+">B+</option>
					<option value="O+">O+</option>
					<option value="AB+">AB+</option>
					<option value="A-">A-</option>
					<option value="B-">B-</option>
					<option value="O-">O-</option>
					<option value="AB-">AB-</option>
				</select>
			</div>
			<div class="form-group col-md-4">
				<label for="inputPassword4">Religion</label> <select
					style="width: 408.75px; height: 37.99px;">
					<option value="" name="otherInfo.religion" disabled="disabled" selected="selected">Please
						select</option>
					<option value="Hinduism">Hinduism</option>
					<option value="Islam">Islam</option>
					<option value="Sikhism">Sikhism</option>
					<option value="Buddhism">Buddhism</option>
					<option value="Jainism">Jainism</option>
					<option value="Other religions ">Other religions</option>

					</option>

				</select>
			</div>
			<div class="form-group col-md-4">
				<label for="inputAddress">Aadhar Number</label> <input type="text"
				   name="otherInfo.aadhar"	class="form-control" id="inputAddress"
					placeholder="Please Enter  Aadhar Number">
			</div>
		</div>


		<div class="form-row">
			<div class="form-group col-md-4">
				<label for="inputEmail4">Physically Challenged?</label> <select
					style="width: 408.75px; height: 37.99px;">
					<option value="" name="otherInfo.phstatus" disabled="disabled" selected="selected">Please
						select</option>
					<option value="YES">YES</option>
					<option value="NO">NO</option>
				</select>
			</div>
			<div class="form-group col-md-4">
				<label for="inputPassword4">Father Name</label> <input type="text"
				   name="otherInfo.fatherNm"	class="form-control" placeholder="Please Enter Father Name ">


			</div>
			<div
				style="text-align: center; padding: 0px 102px 20px; margin: 20px;"
				class="btn-group" role="group">
				<button style="width: 500px; height: 40px;" type="reset"
					class="btn btn-outline-secondary">Reset</button>
				<button style="width: 500px; height: 40px;" type="submit"
					class=" btn btn-outline-primary">Submit</button>

			</div>
		</div>

	</form>



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

</body>

</html>