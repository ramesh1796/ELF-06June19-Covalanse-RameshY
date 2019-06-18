package com.covalanse.java.examples;
class BMI{
	double w, h,res;
	double calculateBMI() {
		 res=w/(h*h);
		return res;
	}
	void result() {
		if(res>24.9)
			System.out.println("over weight");
	else if(res<18.5)
			System.out.println("under weight");
		else if(res>18.5)
			System.out.println(" Normal weight");
	}
}
public class bmiProb {
	public static void main(String[] args) {
		
	
	BMI b=new BMI();
	b.w=90.0;
	b.h=160.8;
	b.calculateBMI();
	b.result();
	}
}
