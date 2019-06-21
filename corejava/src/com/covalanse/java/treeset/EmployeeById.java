package com.covalanse.java.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class EmployeeById implements Comparator<Employee>{
public int compare(Employee e1,Employee e2) {
	if(e1.id>e2.id) {
		return 1;
	}
	else if(e1.id<e2.id) {
		return -1;
	}
	else {
		return 0;
	}
}
}
