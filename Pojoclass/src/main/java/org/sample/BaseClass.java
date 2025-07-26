package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static 	WebDriver driver;

	public static void launchbrowser() 
	{
		WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 }
		public static void windowmaximize()
		{
		driver.manage().window().maximize();

		}	
		public static void launchurl(String url)
		{
		driver.get(url);

		}
		public static void pagetitle()
		{
		String title = driver.getTitle();
		System.out.println(title);
		}
		public static void CurrentUrl()
		{
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
		}

		public static void closeEntireBrowser()
		{
			driver.quit();
	    }
		public static void passText(String txt,WebElement ele)  
		{
	    	ele.sendKeys(txt);
		}
		public static void clickBtn(WebElement ele) 
		{
		ele.click();

		}
		 public static void screenshot(String imgname) throws IOException
		 {
			TakesScreenshot ts=(TakesScreenshot)  driver;
			File img=ts.getScreenshotAs(OutputType.FILE);
		    File f=new File("locatin+ imgname.png");
		    FileUtils.copyFile(img, f);
		    
		 }
		public static Actions a;
		public static void DragDrop(WebElement drag,WebElement drop)
		{
			a=new Actions(driver);
		    a.dragAndDrop(drag, drop).perform();
		}	
		public static void movecurser(WebElement target)
		{
			a.moveToElement(target).perform();
		}	
		public static Alert al;
		public static void alert()
		{
		al=	driver.switchTo().alert();
		al.dismiss();
		}
		public static JavascriptExecutor js;
		public static void scrolltop(WebElement scrolltop)
		{
			js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", scrolltop);
		}
		public static void click(WebElement click)
		{
			js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", click);
		}
		
		
		
		public static void scroll(WebElement scrl)
		{
			js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(false)",scrl);
		}
		    
		public static void ExcelRead(String sheetname,int cellnum,int rownum) throws IOException
		{
			File f=new File("C:\\Users\\ADMIN\\eclipse-workspace\\BaseClass\\Excel\\new.xslx");
			FileInputStream fi=new FileInputStream(f);
			 Workbook wb=new XSSFWorkbook(fi);
			 Sheet mysheet = wb.getSheet("datas");
			Row r = mysheet.getRow(rownum);
			Cell c = r.getCell(cellnum);
			int cellType = c.getCellType();
			String value=" ";
			if (cellType==1) 
			{
				String Value2= c.getStringCellValue();
				
			}
			else if (DateUtil.isCellDateFormatted(c))
			{
				Date dd = c.getDateCellValue();
				SimpleDateFormat s=new SimpleDateFormat("value");
				String value1 = s.format(dd);
				
				}
			else {
				double d = c.getNumericCellValue();
				long l=(long) d;
				String valueOf = String.valueOf(l);
			}	
					
		}
		public static void createNewExcelFile(String writedata,int rowno,int cellno) throws IOException
		{
		File f=new File("C:\\Users\\ADMIN\\eclipse-workspace\\BaseClass\\Excel\\new.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet mysheet=w.createSheet("data");
		Row newrow=mysheet.createRow(rowno);
		Cell newcell=newrow.createCell(cellno);
		newcell.setCellValue(writedata);
		FileOutputStream fos=new FileOutputStream(f);
		w.write(fos);
		}
		public static void createRow(String writedata,int cnum,int rnum) throws IOException
		{
			File f=new File("C:\\Users\\ADMIN\\eclipse-workspace\\BaseClass\\Excel\\new.xlsx");
			FileInputStream fi=new FileInputStream(f);
			Workbook w=new XSSFWorkbook(fi);
			Sheet mysheet=w.getSheet("data");
			Row newrow=mysheet.createRow(rnum);
			Cell newcell=newrow.createCell(cnum);
			newcell.setCellValue(writedata);
			FileOutputStream fos=new FileOutputStream(f);
			w.write(fos);
	    }
		public static void createCell(String writedata,int cnum,int rnum) throws IOException
		{
			File f=new File("C:\\Users\\ADMIN\\eclipse-workspace\\BaseClass\\Excel\\new.xlsx");
			FileInputStream fi=new FileInputStream(f);
			Workbook w=new XSSFWorkbook(fi);
			Sheet mysheet=w.getSheet("data");
			Row newrow=mysheet.getRow(rnum);
			Cell newcell=newrow.createCell(cnum);
			newcell.setCellValue(writedata);
			FileOutputStream fos=new FileOutputStream(f);
			w.write(fos);
	    }
		public static void updateCell(String newdata,String existdata ,int cnum,int rnum) throws IOException
		{
			File f=new File("C:\\Users\\ADMIN\\eclipse-workspace\\BaseClass\\Excel\\new.xlsx");
			FileInputStream fi=new FileInputStream(f);
			Workbook w=new XSSFWorkbook(fi);
			Sheet mysheet=w.getSheet("data");
			Row row=mysheet.getRow(rnum);
			Cell cell=row.getCell(cnum);
	        String str=cell.getStringCellValue();
	        if(str.equals(existdata))
	        {
	         cell.setCellValue(newdata);
	         }
			FileOutputStream fos=new FileOutputStream(f);
			w.write(fos);
	    }
		
		
		
	}
		
			
	
	
	

