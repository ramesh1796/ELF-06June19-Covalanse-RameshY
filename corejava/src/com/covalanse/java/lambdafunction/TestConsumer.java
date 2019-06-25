package com.covalanse.java.lambdafunction;

import java.util.function.Consumer;

import lombok.extern.java.Log;
@Log
public class TestConsumer {
public static void main(String[] args) {
ConsumerExample s1=new ConsumerExample("Rohit", 66, 55, 11);
Consumer<ConsumerExample> c=s->{
	double avg=(s.m1+s.m2+s.m3)/3.0;
	log.info(""+s.name+" average is "+avg);
};
c.accept(s1);
}
}
