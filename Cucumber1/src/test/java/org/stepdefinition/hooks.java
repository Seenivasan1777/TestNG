package org.stepdefinition;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks extends BaseClass{
	
	
	@Before
	private void precond() {
	launchbrowser();
     windowmaximize();
	}
	

}
