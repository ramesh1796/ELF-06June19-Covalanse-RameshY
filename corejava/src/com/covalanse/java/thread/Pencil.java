package com.covalanse.java.thread;

import java.util.concurrent.Callable;

public class Pencil implements Callable<Integer>{
 public Integer call() {
	return 120;
}
}
