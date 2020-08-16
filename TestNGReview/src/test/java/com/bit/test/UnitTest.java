package com.bit.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UnitTest {

	WebDriver dr;
	@Parameters({"browser","url"})
	@Test
	public void test1(String b,String u) {
		if(b.equals("chrome"))
		{
			
		dr=new ChromeDriver();
		dr.get(u);
		}else  if(b.equals("firefox"))
		{
		dr=new FirefoxDriver();
		dr.get(u);
		}
	}
	
}
