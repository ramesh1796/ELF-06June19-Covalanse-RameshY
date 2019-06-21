package co.covalanse.java.arrays;

import java.util.Arrays;

public class SortingArray {
	public static void main(String[] args) {
		int[] b= {5,2,1,4,3};
		double[] d= {5.6,2.1,1.3,4.2,3.9};
//		for(int i=0;i<b.length;i++) {
//			for(int j=i+1;j<b.length;j++) {
//				if(b[i]>b[j]) {
//					int temp=b[i];
//					b[i]=b[j];
//					b[j]=temp;
//
//				}
//
//			}
//			
//
//		}
		 Arrays.sort(d);
		for(int k=0;k<d.length;k++) {
			System.out.print(d[k]+" ");
		}

	}

}
