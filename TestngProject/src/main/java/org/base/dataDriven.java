package org.base;

import java.io.IOException;

public class dataDriven extends BaseClass{

	public static void main(String[] args) throws IOException {
		
		createNewExcelFile("Selenium", 0, 0);
		createCell("Java", 1, 0);
		createCell("Data Driven", 2, 0);
		createCell("POM", 3, 0);
		
		createRow("Appium", 0, 1);
		createCell("Cucumber", 1, 1);
		createCell("Junit", 2, 1);
        createCell("TestNG", 3 , 1);	
		
		
		
		
	}
}
