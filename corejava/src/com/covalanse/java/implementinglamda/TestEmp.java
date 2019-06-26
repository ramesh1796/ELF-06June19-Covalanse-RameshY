package com.covalanse.java.implementinglamda;

import java.util.Comparator;
import java.util.TreeSet;

import lombok.extern.java.Log;
@Log
public class TestEmp {
public static void main(String[] args) {
	Employee e1= new Employee(3, "Anit", 1903.0);
	Employee e2= new Employee(5, "Mitha", 9033.0);
	Employee e3= new Employee(9, "Dnitha", 9403.0);
	Employee e4= new Employee(6, "Anitha", 4903.0);
	Employee e5= new Employee(1, "Piitha", 7903.0);
	
	Comparator<Employee> c=(e,f)->{
		if(e.id>f.id) {
			return 1;
		}
		else if(e.id<f.id) {
			return -1;
			
		}
		else {
			return 0;
		}
	};
	Comparator<Employee> c2=(e,f)->{
		return e.name.compareTo(f.name);
	};
	
	EmployeeById byId=new EmployeeById();
	TreeSet<Employee> ts= new TreeSet<Employee>(c2);
	ts.add(e1);
	ts.add(e2);
	ts.add(e3);
	ts.add(e4);
	ts.add(e5);
	for( Employee e:ts) {
		log.info(""+e.id);
		log.info(""+e.name);
		log.info(""+e.salary);
		
	}
}
}
