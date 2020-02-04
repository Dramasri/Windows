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

public class FlipMulti {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
System.setProperty("webdriver.chrome.driver", "D:\\java and eclipse 32 bit\\java_workspace\\Selenium\\Driver\\chromedriver.exe");
		
		// to create an object//
		
		WebDriver driver = new ChromeDriver();
		
		// to launch//
		
	  driver.get("https://www.flipkart.com/");
	  
	  // to find the web element for search //
	  
	  Thread.sleep(5000);
	  
	  WebElement srch = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
	  
	  srch.sendKeys("washing machine");
	  
	  // to press enter //
	  
	  Robot r = new Robot();
	  
	  r.keyPress(KeyEvent.VK_ENTER);
	  
	  r.keyRelease(KeyEvent.VK_ENTER);
	  
	 // to find the  locator //
	  
	  Thread.sleep(6000);
	  
	  // to find the common locator //
	  
	  List<WebElement> allmac = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
	  
	  Thread.sleep(8000);
	  
	  allmac.get(3).click();
	  
	  allmac.get(5).click();
	  
	  // to handle windows //
	  
	  Set<String> allw = driver.getWindowHandles();
	  
	  // to convert into list //
	  
	  List<String> li = new ArrayList<String>();
	  
	  // to get all set into list //
	  
	  li.addAll(allw);
	  
	  String fst = li.get(2);
	  
	  // to click inside that window //
	  
	  Thread.sleep(4000);
	  
	  
	 driver.switchTo().window(fst);
	 
	 // to click buy now //
	 
	 driver.findElement(By.xpath("//button[text()='BUY NOW']")).click();
	 
	 Thread.sleep(4000);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
		
	}

}
