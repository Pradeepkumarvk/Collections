package testcase1;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Listners.Listners;
import Listners.RetryListner;


import testbase.Testbase;
@Listeners(Listners.class)	
public class Tc001_Loginwithrecords extends Testbase {
	Logger log=Logger.getLogger(Tc001_Loginwithrecords.class.getName());
	@BeforeTest()
	public void initialize() throws IOException  
	{
		try {
			init();
			log("back from init");
			//getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		//	getScreenshotFailure();
		}
		
	}
	
	@DataProvider(name="mydata")
	public  String[][] getdatafromsheet() throws IOException
	{
		String data[][]=getdata("Mytest.xlsx","Sheet2");
		return data;
	}
	@Test(dataProvider="mydata", groups={"Exceldatatesting"})
	
	public void testing(String usernmae, String pass,String mode) throws IOException
	{
	log("Entered1");
	String Env=System.getProperty("environment");
	String Durl=System.getProperty("urlid");
	log ("ENvronment from jenkins"+Env);
	log("Url from jenkins"+Durl);
	if (mode.equalsIgnoreCase("N"))
		
		throw new SkipException("Mode is N");
	
	
	else 
	{
	log(usernmae);	
	log(pass);
	
	//Assert.assertEquals("3.0", usernmae);
	}
	
	}
	@AfterTest()
	public void closeBrowser()
	{
		closeall();
		log("Browser closed");
	}
}
