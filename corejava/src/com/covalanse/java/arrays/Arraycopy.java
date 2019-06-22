package com.covalanse.java.arrays;

public class Arraycopy {
	public static void main(String[] args) {
		int a[]= {9,5,2,4};
		int[] d=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			d[i]=a[i];
		}
		for(int j=0;j<d.length;j++) {
			System.out.print(d[j]+" ");
		}
	}

}
