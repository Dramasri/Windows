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

public class FlipKart {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
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
	  
	  
       driver.findElement(By.xpath("//div[text()='Whirlpool 7.2 kg Semi Automatic Top Load Red, White']")).click();	
       
       
       // to handle the windows //
       
         Set<String> allw = driver.getWindowHandles();
         
         // to convert into list //
         
         List<String> li = new ArrayList<String> ();
         
         li.addAll(allw);
         
         // to get 1st window //
         
         String l = li.get(1);
         
         driver.switchTo().window(l);
         
         driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
         
         Thread.sleep(6000);
         
         driver.findElement(By.xpath("//div[text()='Remove']")).click();
         
         driver.findElement(By.xpath("(//div[text()='Remove'])[1]")).click();
       
       
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
		
	}

}
