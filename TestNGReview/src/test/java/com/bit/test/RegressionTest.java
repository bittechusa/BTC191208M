package com.bit.test;

import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RegressionTest extends NewTest{
	Logger log=Logger.getLogger(RegressionTest.class);
@Test
public void test1() {
	if(3>6) {
		log.info("passed");
		Reporter.log("log");
		
	}else
	log.error("failed");
}
@Test
public void logunvalidation() {
	if(7<4)
	{
		log.debug("is continue");
	}else
		log.fatal("login credantial error");
}
}
