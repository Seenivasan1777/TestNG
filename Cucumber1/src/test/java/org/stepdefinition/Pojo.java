package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends BaseClass{
	public Pojo() {
	PageFactory.initElements(driver, this);	
	}

	@FindBy(xpath = "(//li[@class='lte-nav-profile '])[2]")
	private WebElement account;
	
	@FindBy(id = "phone")
	private WebElement phone;
	
	@FindBy(name = "password")
	private WebElement pass;
	
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private WebElement login;
	
	@FindBy(id =  "name")
	private WebElement name;
	
	@FindBy(name =  "email")
	private WebElement email;
	
	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement num;
	
	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement password;
	
	@FindBy(xpath = "(//input[@type='password'])[3]")
	private WebElement confirmpass;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement register;
	
	@FindBy(xpath = "(//span[text()='Home'])[1]")
	private WebElement home;
	
	@FindBy(id = "lte-top-search-ico")
	private WebElement search;
	
	public WebElement getSearch() {
		return search;
	}
public WebElement getHome() {
		return home;
	}

public WebElement getAccount() {
		return account;
	}
public WebElement getPhone() {
		return phone;
	}
public WebElement getPass() {
		return pass;
	}
public WebElement getLogin() {
		return login;
	}
public WebElement getName() {
		return name;
	}
public WebElement getEmail() {
		return email;
	}
public WebElement getNum() {
		return num;
	}
public WebElement getPassword() {
		return password;
	}
public WebElement getConfirmpass() {
		return confirmpass;
	}
public WebElement getRegister() {
		return register;
	}
	
	
	
	
	
	
	
}
