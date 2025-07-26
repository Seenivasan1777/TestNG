package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crossBrowser {
	@Parameters("browser")
	@Test
	private void tc1(String browsername) {
     
       WebDriver driver;
       if (browsername.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
       else if (browsername.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
       else {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	
       driver.get("https://www.amazon.in/");
       WebElement signin = driver.findElement(By.xpath("(//span[text()='Account & Lists'])[1]"));
	  signin.click();
       
       WebElement name = driver.findElement(By.id("ap_email"));
      name.sendKeys("srisiva.886@gmail.com");
      
      WebElement nxt = driver.findElement(By.xpath("//input[@type='submit']"));
	nxt.click();
	
	WebElement pwd = driver.findElement(By.name("password"));
    pwd.sendKeys("123456");
	}}
