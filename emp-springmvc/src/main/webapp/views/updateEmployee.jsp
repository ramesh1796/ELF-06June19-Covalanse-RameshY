<%@page import="com.covalense.emp.beans.EmployeeExperienceInfoBean"%>
<%@page import="com.covalense.emp.beans.EmployeeEducationalInfoBean"%>
<%@page import="java.util.List"%>
<%@page import="com.covalense.emp.beans.EmployeeAddressInfoBean"%>
<%@page import="com.covalense.emp.beans.EmployeeOtherInfoBean"%>
<%@page import="com.covalense.emp.beans.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Employee Information</title>
<link rel="stylesheet" href="">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>

<%
EmployeeInfoBean infoBean = (EmployeeInfoBean)session.getAttribute("infoBean");
%>

<body>
${registraionFailed}
	<form class="col-md-10 offset-1"
		style="background-color: rgb(236, 236, 114)"
		action="./updateEmployee" method="post">
		<h3 style="text-align: center; padding: 20px;">Employee
			Information</h3>
		<hr>
		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputEmail4">ID</label> <input type="text" name="id"
					class="form-control" value="<%=infoBean.getId()%>">
					
			</div>
			<div class="form-group col-md-6">
				<label for="inputPassword4">Account Number</label> <input
					type="text" name="accountNo" class="form-control"
					value="<%=infoBean.getAccountNumber()%>">
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
					value="<%=infoBean.getEmail()%>">
			</div>

		</div>

		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputEmail4">Age</label><br> <input type="text"
					name="age" class="form-control" value="<%=infoBean.getAge()%>">

			</div>

			<div class="form-group col-md-6">

				<label for="inputPassword4">Designation</label> <input type="text"
					name="designation" class="form-control"
					value="<%=infoBean.getDesignation()%>">
			</div>



		</div>
		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputEmail4">Gender</label><br> <select name="gender"
					style="width: 640.75px; height: 39.99px;">
					<%if(infoBean.getGender().equals("male")){ %>
					<option value="Male" selected="selected">Male</option>
					<option value="Female">Female</option>
					<%}else{ %>
					<option value="Female" selected="selected">Female</option>
					<option value="Male">Male</option>
                    <%} %>
				</select>
			</div>
			<div class="form-group col-md-6">
				<label for="inputPassword4">Date Of Birth</label> <input type="date"
					name="dob" class="form-control" value="<%=infoBean.getDob()%>">
			</div>

		</div>


		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputEmail4">Salary</label> <input type="text"
					name="salary" class="form-control"
					value="<%=infoBean.getSalary()%>">
			</div>
			<div class="form-group col-md-6">
				<label for="inputPassword4">Department ID</label> <input type="text"
					name="departmentId" class="form-control"
					value="<%=infoBean.getDepartmentInfoBean().getId()%>">


			</div>
		</div>
		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputEmail4">Phone Number</label> <input value="<%=infoBean.getPhone()%>"  type="text"
					name="phone" class="form-control" >
					
			</div>
			<div class="form-group col-md-6">
				<label for="inputPassword4">Manager ID</label> <input type="text"
					name="mgrId" class="form-control"
					value="<%=infoBean.getManagerId()%>" >


			</div>
		</div>

		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputPassword4">Password</label> <input type="password"
					name="password" class="form-control" value="<%=infoBean.getPassword()%>" >
			</div>

			<div class="form-group col-md-6">
				<label for="inputPassword4">Confirm Password</label> <input
					type="password" class="form-control"
					value="<%=infoBean.getPassword()%>" >
			</div>
		</div>

		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputPassword4">Date Of Joining</label> <input
					type="date" name="joiningDate" class="form-control"
					value="<%=infoBean.getJoiningDate()%>">
			</div>

		</div>



		</div>

		<h3 style="text-align: center; padding: 20px;">Employee Other
			Information</h3>
		<hr>
		<div class="form-row">
                <div class="form-group col-md-4">
                        <label for="inputPassword4">Father Name</label> <input type="text"
                           name="employeeOtherInfoBean.fatherNm"	class="form-control" value="<%=infoBean.getEmployeeOtherInfoBean().getFatherNm()%>">
        
        
                    </div>
			<div class="form-group col-md-4">
				<label for="inputPassword4">Emergency Contact Name</label> <input
					name="employeeOtherInfoBean.ecnNm"type="text" class="form-control"
					value="<%=infoBean.getEmployeeOtherInfoBean().getEmergencyContactName()%>">
			</div>
			<div class="form-group col-md-4">
				<label for="inputAddress">Mother Name</label> <input type="text"
				   name="employeeOtherInfoBean.motherNm"	class="form-control" id="inputAddress"
					value="<%=infoBean.getEmployeeOtherInfoBean().getMotherNm()%>">
			</div>
		</div>

		<div class="form-row">
			<div class="form-group col-md-4">
				<label for="inputEmail4">Pan Number</label> <input type="text"
				   name="employeeOtherInfoBean.pancard"	class="form-control" placeholder="Please Enter Pan Number">
			</div>
			<div class="form-group col-md-4">
				<label for="inputPassword4">Emergency Contact Number</label> <input
				name="employeeOtherInfoBean.ecnNo"	type="text" class="form-control"
					value="<%=infoBean.getEmployeeOtherInfoBean().getEmergencyContactNumber()%>">
			</div>
			<div class="form-group col-md-4">
				<label for="inputAddress">Spouse Name</label> <input type="text"
					name="employeeOtherInfoBean.spouse"class="form-control" id="inputAddress"
					value="<%=infoBean.getEmployeeOtherInfoBean().getSpouseNm()%>">
			</div>
		</div>

		<div class="form-row">
			<div class="form-group col-md-4">
				<label for="inputEmail4">Marital Status</label><br> <select name="employeeOtherInfoBean.mstatus"
					style="width: 408.75px; height: 37.99px;">
					<%if(infoBean.getEmployeeOtherInfoBean().isMarried()==true){ %>
					<option value="true" selected="selected">Yes</option>
					<option value="false">No</option>
					<%}else{ %>
					<option value="true">Yes</option>
					<option value="false"selected="selected">No</option>
					<%} %>
				</select>

			</div>

			<div class="form-group col-md-4">

				<label for="inputPassword4">Nationality</label> <select
					style="width: 408.75px; height: 37.99px;" name="employeeOtherInfoBean.nationality">
						
						<%if(infoBean.getEmployeeOtherInfoBean().getNationality().equals("Indian")){ %>
					<option value="Indian" selected="selected">Indian</option>
					<option value="Other">Other</option>
					<%}else{ %>
					<option value="Indian">Indian</option>
					<option value="Other"selected="selected">Other</option>
					<%} %>
					
				</select>
			</div>

			<div class="form-group col-md-4">
				<label for="inputAddress">Passport Number</label> <input type="text"
					name="employeeOtherInfoBean.passportNo"class="form-control" id="inputAddress"
					value="<%=infoBean.getEmployeeOtherInfoBean().getPassport()%>">
			</div>

		</div>
		<div class="form-row">
			<div class="form-group col-md-4">
				<label for="inputEmail4">Blood Group</label> <select
					style="width: 408.75px; height: 37.99px;"  name="employeeOtherInfoBean.bloodgroup">
					
						<%if(infoBean.getEmployeeOtherInfoBean().getBloodGrp().equals("A+")){ %>
					<option value="A+" selected="selected">Indian</option>
					<option value="B+">B+</option>
					<option value="O+">O+</option>
					<option value="AB+">AB+</option>
					<option value="A-">A-</option>
					<option value="B-">B-</option>
					<option value="O-">O-</option>
					<option value="AB-">AB-</option>
					
					<%}else if(infoBean.getEmployeeOtherInfoBean().getBloodGrp().equals("B+")){ %>
					<option value="A+">A+</option>
					<option value="B+" selected="selected">B+</option>
					<option value="O+">O+</option>
					<option value="AB+">AB+</option>
					<option value="A-">A-</option>
					<option value="B-">B-</option>
					<option value="O-">O-</option>
					<option value="AB-">AB-</option>
					<%}else if(infoBean.getEmployeeOtherInfoBean().getBloodGrp().equals("O+")){ %>
					<option value="A+">A+</option>
					<option value="B+">B+</option>
					<option value="O+"selected="selected">O+</option>
					<option value="AB+">AB+</option>
					<option value="A-">A-</option>
					<option value="B-">B-</option>
					<option value="O-">O-</option>
					<option value="AB-">AB-</option>
					<%}else if(infoBean.getEmployeeOtherInfoBean().getBloodGrp().equals("AB+")){ %>
					<option value="A+">A+</option>
					<option value="B+">B+</option>
					<option value="O+">O+</option>
					<option value="AB+"selected="selected">AB+</option>
					<option value="A-">A-</option>
					<option value="B-">B-</option>
					<option value="O-">O-</option>
					<option value="AB-">AB-</option>
					<%}else if(infoBean.getEmployeeOtherInfoBean().getBloodGrp().equals("A-")){ %>
					<option value="A+">A+</option>
					<option value="B+">B+</option>
					<option value="O+">O+</option>
					<option value="AB+">AB+</option>
					<option value="A-"selected="selected">A-</option>
					<option value="B-">B-</option>
					<option value="O-">O-</option>
					<option value="AB-">AB-</option>
					<%}else if(infoBean.getEmployeeOtherInfoBean().getBloodGrp().equals("B-")){ %>
					<option value="A+">A+</option>
					<option value="B+">B+</option>
					<option value="O+">O+</option>
					<option value="AB+">AB+</option>
					<option value="A-">A-</option>
					<option value="B-"selected="selected">B-</option>
					<option value="O-">O-</option>
					<option value="AB-">AB-</option>
					<%}else if(infoBean.getEmployeeOtherInfoBean().getBloodGrp().equals("O-")){ %>
					<option value="A+">A+</option>
					<option value="B+">B+</option>
					<option value="O+">O+</option>
					<option value="AB+">AB+</option>
					<option value="A-">A-</option>
					<option value="B-">B-</option>
					<option value="O-"selected="selected">O-</option>
					<option value="AB-">AB-</option>
					<%}else if(infoBean.getEmployeeOtherInfoBean().getBloodGrp().equals("AB-")){ %>
					<option value="A+">A+</option>
					<option value="B+">B+</option>
					<option value="O+">O+</option>
					<option value="AB+">AB+</option>
					<option value="A-">A-</option>
					<option value="B-">B-</option>
					<option value="O-">O-</option>
					<option value="AB-"selected="selected">AB-</option>
					
					
					<%} %>
					
					
				</select>
			</div>
			<div class="form-group col-md-4">
				<label for="inputPassword4">Religion</label> <select
					style="width: 408.75px; height: 37.99px;"name="employeeOtherInfoBean.religion">
					<%if(infoBean.getEmployeeOtherInfoBean().getReligion().equals("Hinduism")){ %>
					<option value="Hinduism"selected="selected">Hinduism</option>
					<option value="Islam">Islam</option>
					<option value="Sikhism">Sikhism</option>
					<option value="Buddhism">Buddhism</option>
					<option value="Jainism">Jainism</option>
					<option value="Other religions ">Other religions</option>
					<%}else if(infoBean.getEmployeeOtherInfoBean().getReligion().equals("Islam")){ %>
					<option value="Hinduism">Hinduism</option>
					<option value="Islam"selected="selected">Islam</option>
					<option value="Sikhism">Sikhism</option>
					<option value="Buddhism">Buddhism</option>
					<option value="Jainism">Jainism</option>
					<option value="Other religions ">Other religions</option>
					<%}else if(infoBean.getEmployeeOtherInfoBean().getReligion().equals("Sikhism")){ %>
					<option value="Hinduism"selected="selected">Hinduism</option>
					<option value="Islam">Islam</option>
					<option value="Sikhism"selected="selected">Sikhism</option>
					<option value="Buddhism">Buddhism</option>
					<option value="Jainism">Jainism</option>
					<option value="Other religions ">Other religions</option>
					<%}else if(infoBean.getEmployeeOtherInfoBean().getReligion().equals("Buddhism")){ %>
					<option value="Hinduism">Hinduism</option>
					<option value="Islam">Islam</option>
					<option value="Sikhism">Sikhism</option>
					<option value="Buddhism"selected="selected">Buddhism</option>
					<option value="Jainism">Jainism</option>
					<option value="Other religions ">Other religions</option>
					<%}else if(infoBean.getEmployeeOtherInfoBean().getReligion().equals("Jainism")){ %>
					<option value="Hinduism">Hinduism</option>
					<option value="Islam">Islam</option>
					<option value="Sikhism">Sikhism</option>
					<option value="Buddhism">Buddhism</option>
					<option value="Jainism"selected="selected">Jainism</option>
					<option value="Other religions ">Other religions</option>
					<%}else if(infoBean.getEmployeeOtherInfoBean().getReligion().equals("Other religions")){ %>
					<option value="Hinduism">Hinduism</option>
					<option value="Islam">Islam</option>
					<option value="Sikhism">Sikhism</option>
					<option value="Buddhism">Buddhism</option>
					<option value="Jainism">Jainism</option>
					<option value="Other religions"selected="selected">Other religions</option>
					<%} %>
				</select>
			</div>
			<div class="form-group col-md-4">
				<label for="inputAddress">Aadhar Number</label> <input type="text"
				   name="employeeOtherInfoBean.aadhar"	class="form-control" id="inputAddress"
					value="<%=infoBean.getEmployeeOtherInfoBean().getAdhaar()%>">
			</div>
		</div>


		<div class="form-row">
			<div class="form-group col-md-4">
				<label for="inputEmail4">Physically Challenged?</label> <select
					style="width: 408.75px; height: 37.99px;" name="employeeOtherInfoBean.phstatus">
					
					<%if(infoBean.getEmployeeOtherInfoBean().isChallenged()==true){ %>
					<option value="YES" selected="selected">YES</option>
					<option value="NO">NO</option>
					<%}else{ %>
					<option value="YES">YES</option>
					<option value="NO" selected="selected">NO</option>
					<%} %>
					
					
				</select>
			</div>
			
			
        </div>
      
      <%
      List<EmployeeAddressInfoBean>  addressInfoBeans = infoBean.getAddressInfoBeans();
      int i=0;
      for(EmployeeAddressInfoBean addressInfoBean: addressInfoBeans){
      %>  
        <h3 style="text-align: center;padding: 20px;">Employee Address Information</h3>
            <hr>   
       
            <div class="form-row">
                  
                    <div class="form-group col-md-4">
                      <label for="inputEmail4">Address type</label>
                      <select style=" width: 425px;height: 39.99px;" name="addressInfoBeans[<%=i%>].addressPKBean.addressType"  >
                      
                      <%if(addressInfoBean.getAddressPKBean().getAddressType().equals("Permanent")){ %>
					<option value="Permanent" selected="selected">Permanent</option>
					<option value="Temporary">Temporary</option>
					<%}else{ %>
					<option value="Permanent">Permanent</option>
					<option value="Temporary" selected="selected">Temporary</option>
					<%} %>
                       </select>
                     </div>
                     <div  class="form-group col-md-4">
                            <label for="inputEmail4">Address1</label><br>
                            <input type="text" name="addressInfoBeans[<%=i%>].addressPKBean.address1"  class="form-control"  value="<%=addressInfoBean.getAddress1()%>">
                       
                        </div>
                     <div class="form-group col-md-4">
                            <label for="inputEmail4">Address2</label><br>
                            <input type="text" name="addressInfoBeans[<%=i%>].addressPKBean.address2" class="form-control"  value="<%=addressInfoBean.getAddress2()%>">
                          </div>
                    
                  
                  </div>
          
                  <div class="form-row">
                        <div class="form-group col-md-4">
                                <label for="inputEmail4">Landmark</label>
                                <input type="text" name="addressInfoBeans[<%=i%>].addressPKBean.landmark" class="form-control"  value="<%=addressInfoBean.getLandmark()%>">
                              </div>
                    <div class="form-group col-md-4">
                            <label for="inputPassword4">City</label>
                            <input type="text" name="addressInfoBeans[<%=i%>].addressPKBean.city"  class="form-control"  value="<%=addressInfoBean.getCity()%>">
                          </div>
                          <div class="form-group col-md-4">
                                <label for="inputPassword4">State</label>
                                <input type="text" name="addressInfoBeans[<%=i%>].addressPKBean.state"  class="form-control"  value="<%=addressInfoBean.getState()%>">
                      
                       
                     
                      </div>
                    
                          <div class="form-row">
                            </div>
                            <div class="form-group col-md-4">
                              
                              <label for="inputPassword4">Country</label>
                          
                              <input type="text" name="addressInfoBeans[<%=i%>].addressPKBean.country"  class="form-control"  value="<%=addressInfoBean.getCountry()%>">
                            </div>
    
                                <div class="form-group col-md-4">
                                        <label for="Pincode">Pincode</label>
                                        <input type="text" name="addressInfoBeans[<%=i%>].addressPKBean.pincode" class="form-control"
                                          value="<%=addressInfoBean.getPincode()%>">
                                       </div>
                               
                          </div>
<%
i++;
}
%>
                         <!--  <h3 style="text-align: center;padding: 20px;">Employeem Address Information</h3>
            <hr>   
       
            <div class="form-row">
                  
                    <div class="form-group col-md-4">
                      <label for="inputEmail4">Address type</label>
                      <select style=" width: 425px;height: 39.99px;" name="addressInfoBeans[1].addressPKBean.addressType"  >
                        <option value=""  disabled="disabled" selected="selected">Select-one</option>
                      <option value="Permanent">Permanent</option>
                        <option value="Female">Tempory</option>
                       </select>
                     </div>
                     <div  class="form-group col-md-4">
                            <label for="inputEmail4">Address1</label><br>
                            <input type="text" name="addressInfoBeans[1].addressPKBeanaddress1"  class="form-control"  placeholder=" Enter Address1">
                       
                        </div>
                     <div class="form-group col-md-4">
                            <label for="inputEmail4">Address2</label><br>
                            <input type="text" name="addressInfoBeans[1].addressPKBeanaddress2" class="form-control"  placeholder=" Enter Address2">
                          </div>
                    
                  
                  </div>
          
                  <div class="form-row">
                        <div class="form-group col-md-4">
                                <label for="inputEmail4">Landmark</label>
                                <input type="text" name="addressInfoBeans[1].addressPKBeanlandmark" class="form-control"  placeholder="Please Enter Landmark">
                              </div>
                    <div class="form-group col-md-4">
                            <label for="inputPassword4">City</label>
                            <input type="text" name="addressInfoBeans[1].addressPKBeancity"  class="form-control"  placeholder="Please Enter City ">
                          </div>
                          <div class="form-group col-md-4">
                                <label for="inputPassword4">State</label>
                                <input type="text" name="addressInfoBeans[1].addressPKBeanstate"  class="form-control"  placeholder=" Enter State ">
                      
                       
                     
                      </div>
                    
                          <div class="form-row">
                            </div>
                            <div class="form-group col-md-4">
                              
                              <label for="inputPassword4">Country</label>
                          
                              <input type="text" name="addressInfoBeans[1].addressPKBeancountry"  class="form-control"  placeholder="Enter Country">
                            </div>
    
                                <div class="form-group col-md-4">
                                        <label for="Pincode">Pincode</label>
                                        <input type="text" name="addressInfoBeans[1].addressPKBeanpincode" class="form-control"  placeholder="enter  Pincode">
                                       </div>
                               
                          </div> -->


    <%
      List<EmployeeEducationalInfoBean>  educationalInfoBeans = infoBean.getEmployeeEducationalInfoBeans();
      int j=0;
      for(EmployeeEducationalInfoBean educationalInfoBean: educationalInfoBeans){
      %>  
                          <h3  style="text-align: center ;padding: 20px;">Educational Details</h3>
                          <hr>
                        
                         <br>
                         <div class="input-group flex-nowrap">
                           <div class="input-group-prepend">
                             <span class="input-group-text" id="addon-wrapping">Education Type</span>
                           </div>
                           <input type="text" name="employeeEducationalInfoBeans[<%=j%>].educationalInfoPKBean.educationalType" class="form-control" value="<%=educationalInfoBean.getEducationalInfoPKBean().getEducationalType()%>" aria-label="Username" aria-describedby="addon-wrapping">
                         </div>
                         <br>
                         <div class="input-group flex-nowrap">
                           <div class="input-group-prepend">
                             <span class="input-group-text" id="addon-wrapping">Degree Type</span>
                           </div>
                           <input type="text" name="employeeEducationalInfoBeans[<%=j%>].educationalInfoPKBean.degreeType" class="form-control" value="<%=educationalInfoBean.getDegreeType()%>" aria-label="Username" aria-describedby="addon-wrapping">
                         </div>
                         <br>
                         <div class="input-group flex-nowrap">
                             <div class="input-group-prepend">
                               <span class="input-group-text" id="addon-wrapping">Branch</span>
                             </div>
                             <input type="text" name="employeeEducationalInfoBeans[<%=j%>].educationalInfoPKBean.branch" class="form-control" value="<%=educationalInfoBean.getBranch()%>" aria-label="Username" aria-describedby="addon-wrapping">
                           </div>
                           <br>
                           <div class="input-group flex-nowrap">
                             <div class="input-group-prepend">
                               <span class="input-group-text" id="addon-wrapping">Collage Name</span>
                             </div>
                             <input type="text" name="employeeEducationalInfoBeans[<%=j%>].educationalInfoPKBean.collegeName" class="form-control" value="<%=educationalInfoBean.getCollegeName()%>" aria-label="Username" aria-describedby="addon-wrapping">
                           </div>
                           <br>
                           <div class="input-group flex-nowrap">
                             <div class="input-group-prepend">
                               <span class="input-group-text" id="addon-wrapping">University</span>
                             </div>
                             <input type="text" name="employeeEducationalInfoBeans[<%=j%>].educationalInfoPKBean.university" class="form-control" value="<%=educationalInfoBean.getUniversity()%>"aria-label="Username" aria-describedby="addon-wrapping">
                           </div>
                           <br>
                         <div class="input-group flex-nowrap">
                           <div class="input-group-prepend">
                             <span class="input-group-text" id="addon-wrapping">Year Of Passing</span>
                           </div>
                           <input type="date" name="employeeEducationalInfoBeans[<%=j%>].educationalInfoPKBean.yop" class="form-control" value="<%=educationalInfoBean.getYop()%>" aria-label="Username" aria-describedby="addon-wrapping">
                         </div>
                         <br>
                     
                         <div class="input-group flex-nowrap">
                             <div class="input-group-prepend">
                               <span class="input-group-text" id="addon-wrapping">Percentage</span>
                             </div>
                             <input type="text" name="employeeEducationalInfoBeans[<%=j%>].educationalInfoPKBean.percentage" class="form-control" value="<%=educationalInfoBean.getPercentage()%>" aria-label="Username" aria-describedby="addon-wrapping">
                           </div>
                           <br>
                           <div class="input-group flex-nowrap">
                             <div class="input-group-prepend">
                               <span class="input-group-text" id="addon-wrapping">Location</span>
                             </div>
                             <input type="text" name="employeeEducationalInfoBeans[<%=j%>].educationalInfoPKBean.location" class="form-control" value="<%=educationalInfoBean.getLocation()%>" aria-label="Username" aria-describedby="addon-wrapping">
                           </div>
                           
                           <%
j++;
}
%>

       <!--                     <h3  style="text-align: center ;padding: 20px;">Educational Details</h3>
                           <hr>
                         
                          <br>
                          <div class="input-group flex-nowrap">
                            <div class="input-group-prepend">
                              <span class="input-group-text" id="addon-wrapping">Education Type</span>
                            </div>
                            <input type="text" name="employeeEducationalInfoBeans[1].educationalInfoPKBean.educationalType" class="form-control" placeholder="Enter Education Type" aria-label="Username" aria-describedby="addon-wrapping">
                          </div>
                          <br>
                          <div class="input-group flex-nowrap">
                            <div class="input-group-prepend">
                              <span class="input-group-text" id="addon-wrapping">Degree Type</span>
                            </div>
                            <input type="text" name="employeeEducationalInfoBeans[1].educationalInfoPKBean.degreeType" class="form-control" placeholder="Enter Degree Type" aria-label="Username" aria-describedby="addon-wrapping">
                          </div>
                          <br>
                          <div class="input-group flex-nowrap">
                              <div class="input-group-prepend">
                                <span class="input-group-text" id="addon-wrapping">Branch</span>
                              </div>
                              <input type="text" name="employeeEducationalInfoBeans[1].educationalInfoPKBean.branch" class="form-control" placeholder="Enter Branch" aria-label="Username" aria-describedby="addon-wrapping">
                            </div>
                            <br>
                            <div class="input-group flex-nowrap">
                              <div class="input-group-prepend">
                                <span class="input-group-text" id="addon-wrapping">Collage Name</span>
                              </div>
                              <input type="text" name="employeeEducationalInfoBeans[1].educationalInfoPKBean.collegeName" class="form-control" placeholder="Enter Collage Name" aria-label="Username" aria-describedby="addon-wrapping">
                            </div>
                            <br>
                            <div class="input-group flex-nowrap">
                              <div class="input-group-prepend">
                                <span class="input-group-text" id="addon-wrapping">University</span>
                              </div>
                              <input type="text" name="employeeEducationalInfoBeans[1].educationalInfoPKBean.university" class="form-control" placeholder="Enter University" aria-label="Username" aria-describedby="addon-wrapping">
                            </div>
                            <br>
                          <div class="input-group flex-nowrap">
                            <div class="input-group-prepend">
                              <span class="input-group-text" id="addon-wrapping">Year Of Passing</span>
                            </div>
                            <input type="date" name="employeeEducationalInfoBeans[1].educationalInfoPKBean.yop" class="form-control" placeholder="dd-mm-yyyy " aria-label="Username" aria-describedby="addon-wrapping">
                          </div>
                          <br>
                      
                          <div class="input-group flex-nowrap">
                              <div class="input-group-prepend">
                                <span class="input-group-text" id="addon-wrapping">Percentage</span>
                              </div>
                              <input type="text" name="employeeEducationalInfoBeans[1].educationalInfoPKBean.percentage" class="form-control" placeholder="Enter Percentage" aria-label="Username" aria-describedby="addon-wrapping">
                            </div>
                            <br>
                            <div class="input-group flex-nowrap">
                              <div class="input-group-prepend">
                                <span class="input-group-text" id="addon-wrapping">Location</span>
                              </div>
                              <input type="text" name="employeeEducationalInfoBeans[1].educationalInfoPKBean.location" class="form-control" placeholder="Enter Location" aria-label="Username" aria-describedby="addon-wrapping">
                            </div>
 -->
 
   <%
      List<EmployeeExperienceInfoBean>  experienceInfoBeans = infoBean.getExperienceInfoBeans();
      int p=0;
      for(EmployeeExperienceInfoBean experienceInfoBean: experienceInfoBeans){
      %>  
 
                            <h3  style="text-align: center ;padding: 20px;">Employee Experience Details</h3>
     <hr>
    
    <div class="input-group flex-nowrap">
      <div class="input-group-prepend">
        <span class="input-group-text" id="addon-wrapping">Company Name</span>
      </div>
      <input type="text" name="experienceInfoBeans[<%=p%>].experienceInfoPKBean.companyName" class="form-control"  value="<%=experienceInfoBean.getExperienceInfoPKBean().getCompanyName()%>" aria-label="Username" aria-describedby="addon-wrapping">
    </div>
    <br>
    <div class="input-group flex-nowrap">
      <div class="input-group-prepend">
        <span class="input-group-text" id="addon-wrapping">Designation</span>
      </div>
      <input type="text" name="experienceInfoBeans[<%=p%>].experienceInfoPKBean.designation" class="form-control" value="<%=experienceInfoBean.getDesignation()%>" aria-label="Username" aria-describedby="addon-wrapping">
    </div>
    <br>
    <div class="input-group flex-nowrap">
      <div class="input-group-prepend">
        <span class="input-group-text" id="addon-wrapping">Joining Date</span>
      </div>
      <input type="date" name="experienceInfoBeans[<%=p%>].experienceInfoPKBean.joiningDate" class="form-control" value="<%=experienceInfoBean.getJoiningDate()%>" aria-label="Username" aria-describedby="addon-wrapping">
    </div>

    <br>
    <div class="input-group flex-nowrap">
        <div class="input-group-prepend">
          <span class="input-group-text" id="addon-wrapping">leaving Date</span>
        </div>
        <input type="date" name="experienceInfoBeans[<%=p%>].experienceInfoPKBean.leavingDate" class="form-control" value="<%=experienceInfoBean.getLeavingDate()%>"aria-label="Username" aria-describedby="addon-wrapping">
      </div>

  <%
p++;
}
%>
     <!--  <h3  style="text-align: center ;padding: 20px;">Employee Experience Details</h3>
     <hr>
    
    <div class="input-group flex-nowrap">
      <div class="input-group-prepend">
        <span class="input-group-text" id="addon-wrapping">Company Name</span>
      </div>
      <input type="text" name="experienceInfoBeans[1].experienceInfoPKBean.companyName" class="form-control" placeholder="Enter Company Name" aria-label="Username" aria-describedby="addon-wrapping">
    </div>
    <br>
    <div class="input-group flex-nowrap">
      <div class="input-group-prepend">
        <span class="input-group-text" id="addon-wrapping">Designation</span>
      </div>
      <input type="text" name="experienceInfoBeans[1].experienceInfoPKBean.designation" class="form-control" placeholder="Enter Designation" aria-label="Username" aria-describedby="addon-wrapping">
    </div>
    <br>
    <div class="input-group flex-nowrap">
      <div class="input-group-prepend">
        <span class="input-group-text" id="addon-wrapping">Joining Date</span>
      </div>
      <input type="date" name="experienceInfoBeans[1].experienceInfoPKBean.joiningDate" class="form-control" placeholder="dd-mm-yyyy" aria-label="Username" aria-describedby="addon-wrapping">
    </div>
   
    <br>
    <div class="input-group flex-nowrap">
        <div class="input-group-prepend">
          <span class="input-group-text" id="addon-wrapping">leaving Date</span>
        </div>
        <input type="date" name="experienceInfoBeans[1].experienceInfoPKBean.leavingDate" class="form-control" placeholder="dd-mm-yyyy" aria-label="Username" aria-describedby="addon-wrapping">
      </div> -->

      <div
      style="text-align: center; padding: 0px 102px 20px; margin: 20px;"
      class="btn-group" role="group">
      <button style="width: 500px; height: 40px;" type="reset"
          class="btn btn-outline-secondary">Reset</button>
      <button style="width: 500px; height: 40px;" type="submit"
          class=" btn btn-outline-primary">Submit</button>

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