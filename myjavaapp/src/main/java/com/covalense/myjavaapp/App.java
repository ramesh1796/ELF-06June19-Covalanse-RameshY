package com.covalense.myjavaapp;

import com.covalense.filecreationutilnew.bean.EmployeInfoBean;
import com.covalense.filecreationutilnew.util.CreateFileUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      CreateFileUtil fileUtil = new CreateFileUtil();
      fileUtil.createFile("MyFile2.txt", "Hello");
      EmployeInfoBean bean = new EmployeInfoBean();
      bean.toString();
    }
}
