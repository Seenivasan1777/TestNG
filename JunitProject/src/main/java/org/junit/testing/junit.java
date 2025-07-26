package org.junit.testing;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.sample.BaseClass;
import org.sample.Login;

import java.util.Date;
public class junit extends Login {
	
	
	
	@Test
	public void tc1() {
		System.out.println("Test case 1..GMAIL");
		launchurl(	"https://accounts.google.com/");
		Login l=new Login();
		
		String pagetitle = pagetitle();
		String url = CurrentUrl();
		passText("srisiva.886@gmail.com",l.getName());
 
		Assert.assertEquals("check Your URL",url,url.contains("google"));
		l.getNxt().click();
		passText("123456",l.getPwd());
		l.getLogin().click();
	}
  
	@Test
	public void tc3() {
		System.out.println("Testcase 3..INMAKES");
		launchurl("https://inmakes.com/");
	}

	@Before
	public void startdate() {
       Date d =new Date();
       
		System.out.println(d);

	}

	@After
	public void enddate() {
		Date d =new Date();
		System.out.println(d);
	}

	@BeforeClass
	public static void launchthebrowser()
	{
    launchbrowser();
	windowmaximize();
	}
    
	@Test
	public void tc4() {
		System.out.println("Test case 4...YOUTUBE");
		launchurl("https://www.youtube.com/");
	}
   
	@Test
	public void tc2() {
		System.out.println("Test case 2...FB ");
		launchurl("https://en-gb.facebook.com/");
	}

//AfterClass
//ublic static void closebrowser() {
//loseEntireBrowser();
	}
	
	
	
	

