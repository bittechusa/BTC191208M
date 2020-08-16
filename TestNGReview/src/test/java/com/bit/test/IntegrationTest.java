package com.bit.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IntegrationTest {
WebDriver dr;
	@Test
	public void test2() {
		dr=new ChromeDriver();
		dr.get("http://www.facebook.com");
		dr.manage().deleteAllCookies();
	}
}
