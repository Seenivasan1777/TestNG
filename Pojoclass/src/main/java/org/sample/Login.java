package org.sample;

public class Login extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		launchbrowser();
		launchurl("https://www.flipkart.com/");
		windowmaximize();
		 
	
		LoginPojo l=new LoginPojo();
	
		passText("Srinivasan",l.getName());
		passText("123456", l.getPwd());
		 
		driver.navigate().refresh();
		passText("Selenium",l.getName());
		passText("inmakes",l.getPwd());
		
		l.getButton().click();
	}
	
}
