package db;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ExceptionHandling {

	@Test
	public void test1() throws MalformedURLException {
		ChromeOptions op=new ChromeOptions();
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.ANY);
		op.merge(cap);
		WebDriver dr=new RemoteWebDriver(new URL("http://192.168.86.31:4444/wd/hub"), op);
		dr.get("http://www.facebook.com");
	}
	@Test
	public void test2() throws MalformedURLException {
		ChromeOptions op=new ChromeOptions();
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.ANY);
		op.merge(cap);
		WebDriver dr=new RemoteWebDriver(new URL("http://192.168.86.31:4444/wd/hub"), op);
		dr.get("http://www.google.com");
	}
	
}
