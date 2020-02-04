package org.windows;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
System.setProperty("webdriver.chrome.driver", "D:\\java and eclipse 32 bit\\java_workspace\\Selenium\\Driver\\chromedriver.exe");
		
		// to create an object//
		
		WebDriver driver = new ChromeDriver();
		
		// to launch//
		
		driver.get("https://www.snapdeal.com/");
		
		// to find the element for search button //
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("inputValEnter")).sendKeys("iphone");
		
		// to enter the button //
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		// to find the web element for 1st window //
		
		Thread.sleep(8000);
		
		// to find the common locator //
		
		List<WebElement> allph = driver.findElements(By.xpath("//p[@class='product-title ']"));
		
		Thread.sleep(3000);
		
		// to get first phone alone //
		
		WebElement fstph = allph.get(0);
		
		fstph.click();
		
	
		WebElement thrdph = allph.get(1);
		
		thrdph.click();
		
		// to handle the windows //
		
		Set<String> allw = driver.getWindowHandles();
		
		// since list is a index based one ,so set is converted to list //
		
	List <String> li = new ArrayList<String>();
	
	// to add all set into list //
	
	li.addAll(allw);
	
	   String t = li.get(1);
	   
	   // to switch into that window //
	   
	   driver.switchTo().window(t);
	   
	   // to find the element for buy now //
	   
	   driver.findElement(By.id("buy-button-id")).click();
	   
	   
	
	
	
	
		
		
		
		
		
	}

}
