package com.covalense.designpatterns.builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.covalense.designpatterns.builder.MyImmutableClass;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {
public static void main(String[] args) throws ParseException {
	MyImmutableClass immutableClass= new MyImmutableClass("ABC", 16, 98778847455L);
	log.info("name "+immutableClass.getName());
	log.info("Age "+immutableClass.getAge());
	log.info("Phone "+immutableClass.getPhone());
	
	immutableClass= new MyImmutableClass("XYZ", 36, 8778847455L);
	log.info("name "+immutableClass.getName());
	log.info("Age "+immutableClass.getAge());
	log.info("Phone "+immutableClass.getPhone());
	SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
	Date date = format.parse("2009-30-03");
	EmployeeData data = new EmployeeData(12, "Mikesh", 34, "male", 6757, 9906886696L,
			date, 55658455555L,"aghsh@gmail.com", "DO", date, 7686, 956);
	log.info(""+data.toString());
	
	EmployeeData2 data2 = new EmployeeData2
			                  .EmployeeData2Builder()
			                  .id(123)
			                  .name("Somesh")
			                  .age(23)
			                  .gender("male")
			                  .salary(6887.0)
			                  .phone(80876656576L)
			                  .joiningDate(date)
			                  .accountNumber(7588568668L)
			                  .email("agagh@gmail.com")
			                  .desigtnation("SE")
			                  .dob(date)
			                  .departmentId(123)
			                  .managerId(456)
			                  .build();
	log.info(""+data2.toString());
}


}//end class
