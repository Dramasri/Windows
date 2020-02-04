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

public class Windows {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
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
		
		Thread.sleep(3000);
		
	driver.findElement(By.xpath("(//img[@class='product-image '])[1]")).click();
		
		Thread.sleep(4000);
		
		// to handle windows //
		
		// to find the id for parent window //
		
		String parent = driver.getWindowHandle();
		
		// to find the id for all windows //
		
		Set<String> allw = driver.getWindowHandles();
		
		// to compare parent window and current window //
		
		// use for loop//
		
		for(String x:allw) {
			
			if(!parent.equals(allw)) {
				
				driver.switchTo().window(x);
			}
		}
		
		driver.findElement(By.id("buy-button-id")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
