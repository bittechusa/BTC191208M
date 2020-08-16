package com.bit.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import db.ReadExcell;

public class SmokeTest extends NewTest{
	 @Test(dataProviderClass=ReadExcell.class,dataProvider = "login")
	  public void f(Integer n, String s) {
		 Reporter.log("hi");
		 System.out.println(n+" "+s);
	  }
}
