package com.covalanse.java.arrays;

import java.util.Arrays;

import lombok.extern.java.Log;
@Log
public class SortingArray {
	public static void main(String[] args) {
	
		double[] d= {5.6,2.1,1.3,4.2,3.9};

		 Arrays.sort(d);
		for(int k=0;k<d.length;k++) {
			log.info(d[k]+" ");
		}

	}

}
