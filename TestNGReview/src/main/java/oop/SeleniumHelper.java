package oop;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SeleniumHelper {
	ChromeDriver driver;
	public void commonSeleniumMethod() {
		driver.close();
		WebElement element=driver.findElement(By.id(""));
		element.clear();
		element.click();
		element.getAttribute("id");
		element.getCssValue("");
		element.getScreenshotAs(OutputType.FILE);
		element.getTagName();
		element.getText();
		element.isDisplayed();
		element.isEnabled();
		element.isSelected();
		element.sendKeys("");
		element.submit();
		
		List<WebElement> elements=driver.findElements(By.id(""));
		elements.size();
		driver.get("url");
		driver.getCurrentUrl();
		Keyboard key=driver.getKeyboard();
		driver.getPageSource();
		driver.getScreenshotAs((OutputType.FILE));
		driver.getTitle();
		driver.getWindowHandle();
		Set<String>  wins=driver.getWindowHandles();
		TargetLocator locator=driver.switchTo();
		locator.defaultContent();
		locator.frame(0);
		locator.frame("name");
		locator.frame(element);
		locator.parentFrame();
		locator.window("name");
		
		Alert alert=locator.alert();
		alert.accept();
		alert.dismiss();
		alert.getText();
		alert.sendKeys("");
		
		driver.quit();
		Navigation navigate=driver.navigate();
		navigate.back();
		navigate.forward();
		navigate.refresh();
		navigate.to("go to url");
		
		Options option=driver.manage();
		option.addCookie(new Cookie("name", "value"));
		option.deleteAllCookies();
		option.deleteCookie(new Cookie("",""));
		Set<Cookie>  cookies=option.getCookies();
		
		Timeouts time=option.timeouts();
		time.implicitlyWait(20, TimeUnit.SECONDS);
		time.pageLoadTimeout(10, TimeUnit.SECONDS);
		time.setScriptTimeout(10, TimeUnit.MINUTES);
		
		Actions action=new Actions(driver);
		action.click();
		action.clickAndHold();
		action.contextClick();
		action.doubleClick();
		action.dragAndDrop(element, element);
		action.dragAndDropBy(element, 200, 100);
		action.keyDown(Keys.ARROW_DOWN);
		action.keyDown(element, "");
		action.keyUp(element, Keys.ARROW_UP);
		action.moveToElement(element).perform();
		action.sendKeys(Keys.chord(Keys.ARROW_DOWN,Keys.ARROW_RIGHT,Keys.ENTER));
		action.pause(10);
		action.release();
		
		Select s=new Select(element);
		s.getAllSelectedOptions();
		s.getFirstSelectedOption();
		s.getOptions().size();
		s.selectByIndex(2);
		s.selectByValue("");
		s.selectByVisibleText("");
		
		
	}

	public String[] getAllText(List<WebElement>  elements) {
		String s[]=new String[elements.size()];
		for(int i=0;i<=elements.size();i++)
		{
		String text=elements.get(i).getText();
		s[i]=text;
		}
		return s;
	}
	public void handleMultipleWindow(WebElement ele) {
		String pwin=driver.getWindowHandle();
		Actions ac=new Actions(driver);
		ac.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER);
		Set<String>  cwin=driver.getWindowHandles();
		for(String win:cwin)
		{
			if(!win.equals(pwin))
			{
				driver.switchTo().window(win);
			}
		}
		
		
	}
	
	public void handleCookie(String cookieName) {
		Set<Cookie> cookies=driver.manage().getCookies();
		for(Cookie x:cookies) {
			x.getName().equals(cookieName);
			{
				//driver.manage().deleteCookie(x);
				x.getValue();
			}
		}
	}
	
	public void screenshot() throws IOException {
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File(""));
	}
	
	public void handleJavascript() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("document.getElementById(\"email\").value=\"jdghkfghdfng\"");
		js.executeScript("Arguments[0].value='dgfjd'", driver.findElement(By.id("")));
		js.executeScript("Arguments[0].click()", driver.findElement(By.id("login")));
	}
	
	
	
	
	
}
