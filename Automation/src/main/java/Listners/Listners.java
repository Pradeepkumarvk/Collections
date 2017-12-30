package Listners;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listners  implements ITestListener {

	Logger log=Logger.getLogger(Listners.class.getName());
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("Test started from listner");
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("Test case passed and status is" +result.getStatus());
		Reporter.log("Test case passed and status is" +result.getStatus());
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("Skipped Test"+result.getStatus());
		log.info("Skipped test log");
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
