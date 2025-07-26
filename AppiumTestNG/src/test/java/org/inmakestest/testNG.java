package org.inmakestest;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.appium.java_client.android.AndroidDriver;

public class testNG {
	public static 	AndroidDriver driver;
	ExtentReports extent;
	ExtentHtmlReporter html;
	ExtentTest test;
	@BeforeClass
	private void Launch() throws MalformedURLException {
		
	
	 html=new ExtentHtmlReporter("calcreport.html");
	 extent=new ExtentReports();
	extent.attachReporter(html);
	 test=extent.createTest("Android","Calculator");
	
	
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability("platformName","Android");
	cap.setCapability("platformVersion","13");
	cap.setCapability("deviceName","realme GT");
	cap.setCapability("udid","699af132");
	cap.setCapability("appPackage","com.coloros.calculator");
	cap.setCapability("appActivity","com.android.calculator2.Calculator");
	
	URL url=new URL("http://0.0.0.0:4723/wd/hub");
	 driver =new AndroidDriver(url,cap);
	 }
	@AfterClass
	private void close() {
	extent.flush();
	driver.quit();
    }
	@Test
	private void tc1() {
	
		test.log(Status.INFO,"appium clicking a digit in caluculator");
		WebElement two = driver.findElement(By.id("com.coloros.calculator:id/digit_2"));
    two.click();
    WebElement seven = driver.findElement(By.id("com.coloros.calculator:id/digit_7"));
    seven.click();
	}
	@Test
	private void tc2() throws InterruptedException {
		
		test.log(Status.INFO,"appium clicking multiplication function");
		WebElement multiple = driver.findElement(By.id("com.coloros.calculator:id/op_mul"));
	    multiple.click();
	  Thread.sleep(2000);
     }
	@Test
	private void tc3() {
		
		test.log(Status.INFO,"appium clicking the second digit in caluculator");
		WebElement three = driver.findElement(By.id("com.coloros.calculator:id/digit_3"));
	    three.click();
	    WebElement zero= driver.findElement(By.id("com.coloros.calculator:id/digit_0"));
	    zero.click();
	}
	@Test
	private void tc4() throws IOException {
		
		test.log(Status.INFO,"appium clicking equals");
		WebElement equals = driver.findElement(By.id("com.coloros.calculator:id/eq"));
	    equals.click();
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File img = ts.getScreenshotAs(OutputType.FILE);
//		File ss=new File("C:\\Users\\ADMIN\\eclipse-workspace\\AppiumTestNG\\screenshot\\ss.png");
//		FileUtils.copyFile(img, ss);
		}
	@BeforeMethod
	private void Starttime() {
	Date d=new Date();
	System.out.println("Testcase Starting Time... " +d);
	}
	@AfterMethod
	private void endtime() {
	Date d=new Date();
	System.out.println("Testcase End Time... " +d);
	}
	
	}
