package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass{
	
	public Login() {
		PageFactory.initElements(driver, this);
	}


 
	@FindBy(name="identifier")
	private WebElement name;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement nxt;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwd;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement login;

	public WebElement getName() {
		return name;
	}

	public WebElement getNxt() {
		return nxt;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	

}
