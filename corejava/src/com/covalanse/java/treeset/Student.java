package com.covalanse.java.treeset;

public class Student implements Comparable<Student> {
	int id;
	String name;
	double percentage;
	@Override
	public int compareTo(Student o) {
		if(this.name.compareTo(o.name)<0)
		  { 
		 return -1;
		 } 
		  else if(this.name.compareTo(o.name)>0) { 
		  return 1; 
		  }
		   else { 
		   return 0; 
		   } 
	}

	/*
	 * Logic to sort student wrt percentage
	 * 
	 * @Override 
	 * public int compareTo(Student o) { 
	 * if(this.percentage<o.percentage)
	 * { 
	 * return -1;
	 * } 
	 * else if(this.percentage>o.percentage) { 
	 * return 1; 
	 * }
	 *  else { 
	 *  return 0; 
	 *  } 
	 *  }
	 */
	/*Sort wrt to id
	 * @Override public int compareTo(Student o) { if(this.id<o.id) { return -1; }
	 * else if(this.id>o.id) { return 1; } else { return 0; }
	 * 
	 * }
	 */
}
