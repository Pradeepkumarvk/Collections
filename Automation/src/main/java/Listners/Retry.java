package Listners;

import org.apache.log4j.Logger;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Retry implements IRetryAnalyzer {
private static final Logger log =Logger.getLogger(Retry.class.getName());
	private int maxcount=3;
	private int retrycount=0;
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(retrycount<maxcount)
		{
			log("Retrying test"+result.getName());
			log("Status of test"+getResultStatusName(result.getStatus())+"Retrycount"+retrycount+1);
			return true;
		}
		return false;
	}
public String getResultStatusName(int status) {
	String resultName = null;
	if (status == 1)
		resultName = "SUCCESS";
	if (status == 2)
		resultName = "FAILURE";
	if (status == 3)
		resultName = "SKIP";
	return resultName;
}
public void log(String msg)
{
	log.info(msg);
	Reporter.log(msg);
}
			
	

}
