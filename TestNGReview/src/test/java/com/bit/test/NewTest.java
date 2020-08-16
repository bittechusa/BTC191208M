package com.bit.test;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
 
	Logger log=Logger.getLogger(NewTest.class);
	WebDriver dr;
  @BeforeMethod
  public void beforeMethod() {
	String br=System.getProperty("b");
	String rm=System.getProperty("r");
	if(br.equals("chrome"))
	{
		if(rm.equals("local"))
		{
			dr=new ChromeDriver();
		}else if(rm.equals("remote"))
		{
			ChromeOptions op=new ChromeOptions();
			DesiredCapabilities cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
			op.merge(cap);
			dr=new RemoteWebDriver(new URL("http://192.168.86.31:4444/wd/hub"), op);
		}
	}else if(br.equals("firefox"))
	{
		if(rm.equals("local"))
		{
			dr=new ChromeDriver();
		}else if(rm.equals("remote"))
		{
			ChromeOptions op=new ChromeOptions();
			DesiredCapabilities cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
			op.merge(cap);
			dr=new RemoteWebDriver(new URL("http://192.168.86.31:4444/wd/hub"), op);
		}
	}
	  log.info("opened browser");
  }

  @AfterMethod(alwaysRun=true)
  public void afterMethod(ITestResult r) {
	  log.info("closed browser");
	  switch(r.getStatus())
	  {
	  case ITestResult.SUCCESS:
	  {
		  System.out.println(r.getTestName()+" is succed");
	  }case ITestResult.FAILURE:
	  {
		  screenshot();
		  System.out.println(r.getTestName()+" is failed");
	  }case ITestResult.SKIP:
	  {
		  System.out.println(r.getTestName()+" is skiped");
	  }
	  }
  }

  public void public void screenshot() throws IOException {
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File(""));
	}() throws IOException {
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File(""));
	}
  
  @BeforeClass
  public void beforeClass() {
	  log.info("opened browser here if not open in before method");
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	  log.info("reporting file is loaded");
  }

  @AfterTest
  public void afterTest() {
	  
  }

  @BeforeSuite
  public void beforeSuite() {
	  DOMConfigurator.configure("config.xml");
	  PropertyConfigurator.configure("");
	  log.info("config file loaded");
	  Reporter.log("loded log4j file");
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("executed aftersuite");
  }

}
