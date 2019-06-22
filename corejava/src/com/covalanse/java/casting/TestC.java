package com.covalanse.java.casting;

public class TestC {
	public static void main(String[] args) {
		Chips l=new Lays();
		Chips b=new Bingo();
		Lays p=(Lays)l;
		Bingo q= (Bingo)b;
		p.eat();
		q.open();
	}

}
