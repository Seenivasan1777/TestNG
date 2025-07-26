package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A extends BaseClass{
	@BeforeClass
	private void launchbrow() {
       	
     launchbrowser();
     windowmaximize();
     
	}
	@BeforeMethod
	private void startdate() {
	Date d=new Date();
	System.out.println("Starting date and time..." +d);

	}
	@AfterMethod
	private void enddate() {
	Date d=new Date();
	System.out.println("Ending date and time..." +d);

	}
    @DataProvider(name="Sample")
    private Object[][] data() {
		return new Object[][] {
			{"cheenutrent@gmail.com","123456"},
			{"srisiva.886@gmail.com","cheenu"},
			{"9789689684","selenium"},
			{"123456","yuvraj12"}
		};
		}


	@Test(enabled=false)
	public void fb(String n,String p) 
	{
		launchurl("https://en-gb.facebook.com/");	
		WebElement username = driver.findElement(By.name("email"));
        WebElement pass = driver.findElement(By.id("pass"));	
	    username.sendKeys(n);
	    pass.sendKeys(p);
	
	}
	@DataProvider(name="amazon")
	public Object[][] amazon() {
	return new Object[][] {
		{"jeans"},{"Tshirt"},{"baby skirt"},{"shoes"}
		
	};
}
	@Test(dataProvider="amazon")
	public void amaze(String a) throws AWTException 
	{
		launchurl("https://www.amazon.in/");
		windowmaximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys(a);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	
	
	@Test(enabled=false)
	public void tc13()
	{
		System.out.println("Test case 13... ");
		
	}

}
