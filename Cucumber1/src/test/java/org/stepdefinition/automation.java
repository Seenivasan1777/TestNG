package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class automation extends BaseClass {
	
	Pojo a;
	@Given("To launch the browser")
	public void to_launch_the_browser() {
	  launchbrowser();
	}

	@When("To launch URL of bisto bites Web application")
	public void to_launch_URL_of_bisto_bites_Web_application() {
	  launchurl("https://bistrobitesdc.com/");
	  windowmaximize();
	}

	@When("To click the account button")
	public void to_click_the_account_button() {
	  a=new Pojo();
		clickBtn(a.getAccount());
	}

	@When("To pass data to phone text field")
	public void to_pass_data_to_phone_text_field() {
		 a=new Pojo();
		 passText("9789689844",a.getPhone());
	}

	@When("To pass data to password text field")
	public void to_pass_data_to_password_text_field() {
		 a=new Pojo();
		 passText("cheenutrent",a.getPass());
	}

	@When("To click login button")
	public void to_click_login_button() {
		 a=new Pojo();
		 clickBtn(a.getLogin());
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		 
	//	 closeEntireBrowser();
	}


	@When("To click the Dosa dropdown")
	public void to_click_the_Dosa_dropdown() throws InterruptedException {
		a=new Pojo();
		Thread.sleep(3000);
		WebElement menu= driver.findElement(By.id("menu-item-623"));
		   menu.click();
		  
	WebElement dosa = driver.findElement(By.xpath("(//li[@class='cat-item cat-item-356'])[4]"));
	   dosa.click();
	}

	@When("To Click the Masal Dosa option")
	public void to_Click_the_Masal_Dosa_option() {
		 WebElement masaldosa = driver.findElement(By.xpath("//h2[text()='Masala Dosa']"));
		   masaldosa.click(); 
	}

	@When("To check available Time")
	public void to_check_available_Time() {
		 WebElement time = driver.findElement(By.xpath("(//span[text()='Available at 08:00 AM'])[1]"));
	    String text = time.getText();
	    System.out.println("The Masal dosa next available Time is ...." +text);
	}

	@When("To Pass different data  to confirm password text field")
	public void to_Pass_different_data_to_confirm_password_text_field() {
		 a=new Pojo();
		 clickBtn(a.getAccount());
		 passText("1234567",a.getName());
		 passText("srivas123@gmail.com", a.getEmail());
		passText("1342567896",a.getNum());
		passText("hello123",a.getPassword());
		 passText("Hello",a.getConfirmpass());
		
	}

	@When("To click the register button")
	public void to_click_the_register_button() {
		 a=new Pojo();
		 clickBtn(a.getRegister());
	}

	@When("To pass data coke to search text field")
	public void to_pass_data_coke_to_search_text_field() throws AWTException {
		 a=new Pojo();
		 clickBtn(a.getSearch());
		 WebElement coke = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	    coke.sendKeys("coke");
	   
	}

	@When("To click the search button")
	public void to_click_the_search_button() throws AWTException {
		
		 Robot r=new Robot();
		    r.keyPress(KeyEvent.VK_ENTER);
		    r.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("To print the price of the coke can")
	public void to_print_the_price_of_the_coke_can() {
		
		 WebElement cokeprice = driver.findElement(By.xpath("(//span[@class='woocommerce-Price-amount amount'])[1]"));
		 String text = cokeprice.getText();
		 System.out.println("The price of coke can is..." +text);
	}
	@When("To pass data spanish omelet to search text field")
	public void to_pass_data_spanish_omelet_to_search_text_field() throws AWTException {
		 a=new Pojo();
		 clickBtn(a.getSearch());
		 WebElement spanish = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		    spanish.sendKeys("spanish omelet");
		    Robot r=new Robot();
		    r.keyPress(KeyEvent.VK_ENTER);
		    r.keyRelease(KeyEvent.VK_ENTER);
		 
	}

	@When("To click the food item spanish omelet")
	public void to_click_the_food_item_spanish_omelet() {
	
		 WebElement omelet = driver.findElement(By.xpath("//h2[text()='Spanish omelet']"));
		 omelet.click();
	}

	@When("To click all the extra toppings and checks the price")
	public void to_click_all_the_extra_toppings_and_checks_the_price() {
		
		 WebElement topp1 = driver.findElement(By.xpath("//label[text()='avocado']"));
		 topp1.click();
		 WebElement topp2 = driver.findElement(By.xpath("//label[text()='extra meat']"));
		 topp2.click();
		 WebElement topp3 = driver.findElement(By.xpath("//label[text()='ham']"));
		 topp3.click();
		 WebElement pricenew=driver.findElement(By.id("priceshow"));
		 String txt = pricenew.getText();
		 System.out.println("The price of spanish omelet with toppings is... " +txt);
	}
	
	@When("To click the our story tag on the home page")
	public void to_click_the_our_story_tag_on_the_home_page() {
	
		 WebElement story = driver.findElement(By.id("menu-item-3557"));
        story.click();
       
	}

	@When("To Print the text from our story")
	public void to_Print_the_text_from_our_story() {
		
		 WebElement describe = driver.findElement(By.xpath("//div[@class='wpb_wrapper']"));
		   String txt2 = describe.getText();
		   System.out.println("Checkig for spelling corrections..." +txt2);
	}


	
	
	
	
	
	
	

}
