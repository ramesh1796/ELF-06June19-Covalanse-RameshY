package com.covalanse.java.bean;

public class MyArrayClass {
	private Object[] myArray;
	private int index;

	public MyArrayClass() {
        this(10);
		//myArray = new Object[10];
	}

	public MyArrayClass(int size) {
		if (size <= 0) {
			throw new ArrayIndexOutOfBoundsException("Size should be Greater than zero");
		}
		myArray = new Object[size];
		index = 0;
	}

	public void add(Object val) {
		if (index < myArray.length) {
			myArray[index] = val;
			index++;
		} else {
			Object[] newArray = new Object[20];
			System.arraycopy(myArray, 0, newArray, 0, myArray.length);
			myArray[index-1] = val;
			index++;
			myArray = newArray;
		}

	}

	public Object get(int position) {
		return myArray[position];
	}

	public void remove(int position) {
		if (position > myArray.length) {
			throw new ArrayIndexOutOfBoundsException("Size should not be more than 10");
		}
		System.arraycopy(myArray, (position + 1), myArray, (position), (myArray.length - 1 - position));

	}
	public int getSize() {
		return index - 1;
	}
}
