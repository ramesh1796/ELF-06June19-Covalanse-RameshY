package com.covalanse.java.assignmentthree;

import java.util.logging.Logger;

public class ProductImp {
	final static Logger log=Logger.getLogger("Product Table");
	public static void main(String[] args) {
		Product pd1= new Product();
		pd1.setPid(111);
		pd1.setName("SonarLint");
		pd1.setCost(3000.9);
		
		Product pd2= new Product();
		pd2.setPid(222);
		pd2.setName("Arrow");
		pd2.setCost(2389.9);
		Product pd3= new Product();
		pd3.setPid(333);
		pd3.setName("Feli.com");
		pd3.setCost(5668.09);
		
		Product std4= new Product();
		std4.setPid(444);
		std4.setName("fbb.com");
		std4.setCost(6677.8);
		
		Product[] pd=new Product[4];
		pd[0]=pd1;
		pd[1]=pd2;
		pd[2]=pd3;
		for(int i=0;i<pd.length;i++) {
		 log.info("Roll no is "+ pd[i].getPid());
		 log.info("Name is "+ pd[i].getName());
		 log.info("Email is "+ pd[i].getCost());
		 log.info("********************");
		}
	}

}
