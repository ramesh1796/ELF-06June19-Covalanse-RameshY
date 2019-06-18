package com.covalanse.java.encapsulation;

public class TestE {
public static void main(String[] args) {
	Person a=new Person();
	
	a.setAge(30);
	a.setName("robin");
	DB1 d=new DB1();
	d.recive(a);
	DB2 g= new DB2();
	g.recive(a);

}
}
