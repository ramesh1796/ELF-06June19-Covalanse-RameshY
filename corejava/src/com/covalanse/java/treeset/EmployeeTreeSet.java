package com.covalanse.java.treeset;

import java.util.TreeSet;

public class EmployeeTreeSet {
	public static void main(String[] args) {
		EmployeeById ei = new EmployeeById();
		EmployeeBySalary es=new EmployeeBySalary();
		EmployeeByName en= new EmployeeByName();
		//TreeSet<Employee> p=new TreeSet<Employee>(ei);
		TreeSet<Employee> p=new TreeSet<Employee>(en);
		//TreeSet<Employee> p=new TreeSet<Employee>(es);
		Employee p1=new Employee();
		p1.name="Raj";
		p1.id=200;
		p1.salary=4.5;
		Employee p2=new Employee();
		p2.name="Hun";
		p2.id=200;
		p2.salary=488.0;
		Employee p3=new Employee();
		p3.name="Adi";
		p3.id=40;
		p3.salary=5555.2;
		Employee p4=new Employee();
		p4.name="Gini";
		p4.id=300;
		p4.salary=55555.0;
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		for(Employee d:p) {
			System.out.println("eName is "+d.name);
			System.out.println("Id is "+d.id);
			System.out.println("salary "+d.salary);
		}

	}
}
