package com.covalanse.java.assignment.three;

public class ReverseString {
	public static void main(String[] args) {
		String s = "AbcLcghkfjksuijsdfkudfjkidfjkkdgjldvj";
		StringBuilder result = new StringBuilder("");
		char[] ch = s.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			result = result.append(ch[i]);
		}
		System.out.println(result);
	}

}
