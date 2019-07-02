package com.covalense.jdbc.common;

import lombok.extern.java.Log;

@Log
public class ClassB implements Connection {
@Override
public void  printMessage() {
	log.info("BBBB");
}
}
