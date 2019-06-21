package co.covalanse.java.arrays;

import java.io.ObjectInputStream.GetField;

public class TestE {
	public static void main(String[] args) {                                                           
		Employee[] emp=new Employee[4];
		Employee e1=new Employee();
		e1.setName("pinki");
		e1.setAge(14);
		e1.setSalary(3000);
		
		Employee e2=new Employee();
		e2.setName("kinki");
		e2.setAge(16);
		e2.setSalary(4000);
		
		Employee e3=new Employee();
		e3.setName("rinki");
		e3.setAge(17);
		e3.setSalary(5000);
		
		Employee e4=new Employee();
		e4.setName("chinki");
		e4.setAge(18);
		e4.setSalary(9000);
		emp[0]=e1;
		emp[1]=e2;
		emp[2]=e3;
		emp[3]=e4;
		for(Employee s:emp) {
			System.out.println("Name is "+s.getName());
			System.out.println("Age is "+s.getAge());
			System.out.println("Salary is "+s.getSalary());
		}
	}
}
