package co.covalanse.java.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class TestD {
	public static void main(String[] args) {
		Integer[] num= {5,2,1,4,3};
		int[] n= {5,2,1,4,3};
		String[] s= {"Sun", "moon", " zoo", "PHP"};
		double[] d= {2.3,5.3,6.1,6.3};
		for(int r:n) {
			System.out.println(r);
		}
		for(String g:s) {
			System.out.println(g);
		}
		for(double p:d) {
			System.out.println(p);
		}
		//Arrays.sort(num, Comparator.reverseOrder());	

	}

}
