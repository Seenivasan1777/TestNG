package org.junit.testing;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


public class Runnerclass {
	//WAY 2
	
@Test
public void tc() {
	Result rc = JUnitCore.runClasses(A.class,B.class,junit.class);
     
    System.out.println("Total Testcases Runtime ..." +rc.getRunTime());
    System.out.println("Total Test run count..." +rc.getRunCount());
    System.out.println("Failure Count..." +rc.getFailureCount());
    System.out.println("ignore count... "+rc.getIgnoreCount());
    	
	List<Failure> fails = rc.getFailures();
   for (Failure failure : fails) {
	System.out.println(failure);
}
}
}
