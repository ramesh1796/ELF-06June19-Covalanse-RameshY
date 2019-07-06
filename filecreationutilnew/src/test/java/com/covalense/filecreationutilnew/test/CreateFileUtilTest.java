package com.covalense.filecreationutilnew.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.covalense.filecreationutilnew.util.CreateFileUtil;

public class CreateFileUtilTest {
	private CreateFileUtil util=new CreateFileUtil();
    @Test
	public  void createFileTest() {
         boolean expected=true;
         boolean actual = util.createFile("MyText.txt", "This is test File");
         assertEquals(expected, actual);
	}

}
