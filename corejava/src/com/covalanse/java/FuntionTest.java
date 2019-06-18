package com.covalanse.java;

public class FuntionTest {
 public static int theju(int a, int b) {
	    int c=a+b;
		
		 return c;
 }
 public static int Multi(int a,int b) {
	 int d=a*b;
	 return d;
 }
  public static int Factorial(int a){
	 int f=1;
	 for(int i=1;i<=a;i++) {
		 f=f*i;
		 
	 }
	 return f;
 }
  
  static int fact(int x) {
	  if(x==0) {
		  return 1;
	  }
	  return x*fact(x-1);
  }
  
  public static double bmi(int h, int w) {
	  double k=w/h*h;
	  return k;
  }
	public static void main(String[] args) {
	
		//int i=theju(10,20);
		//int i=Multi(30,50);
		//int i=Factorial(5);
	
		//int i=fact(6);
		//System.out.println(i);
		int w=90, h=6;
     double res=bmi(h,w);
     if(res>25)
     System.out.println("Over weight");
     else if(res>18.5)
         System.out.println("Normal weight");
     else if(18.5>res)
         System.out.println("under weight");
}
}
