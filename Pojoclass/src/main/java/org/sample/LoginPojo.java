package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='Login']")
	private WebElement login;
 
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement name;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwd;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement button;
	
	public WebElement getLogin() {
		return login;
	}
	public WebElement getName() {
		return name;
	}
	public WebElement getPwd() {
		return pwd;
	}
	public WebElement getButton() {
		return button;
	}
	
	
	
	
	
	
}
