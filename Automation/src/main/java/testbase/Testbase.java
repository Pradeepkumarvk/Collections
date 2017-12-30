package testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.apache.commons.io.FileUtils;



import ExcelReader.ExcelReader;







public class Testbase {
	WebDriver driver;
Logger log=Logger.getLogger(Testbase.class.getName());
	Properties OR=new Properties();
	Calendar cal=Calendar.getInstance();
	SimpleDateFormat formater=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
	String sir=formater.format(cal.getTime());
	ExcelReader excelobj;

	public void init() throws IOException
	{
	File file=new File (System.getProperty("user.dir")+"\\src\\main\\java\\config\\DataProperty.properties");
	String log4jpath="Log4j.properties";
	PropertyConfigurator.configure(log4jpath);
	FileInputStream fs=new FileInputStream(file);
	
    OR.load(fs);
    log("Initialization completed-----------Now Trigerring Browser");
    openBrowser(OR.getProperty("Browser"));
    geturl(OR.getProperty("URL"));
  
    
    
	}
	
	public void openBrowser(String browserName)
	{
		log("Browser launching");
		if (browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
	}
	
	public void geturl(String url)
	{
		log("URL opening");
		driver.get(url);
	//	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
public void closeall()
{
	driver.close();
}
public void getScreenshot() throws IOException
{
	
	File scr= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	log("Took Screenshot");
	File destFile=new File (System.getProperty("user.dir")+"\\src\\main\\java\\Screenshots\\sucess"+sir+".png");
	//log(cal.getTime());
	FileUtils.copyFile(scr,destFile);	
	log("Screenshot saved");
}

public void getScreenshotFailure() throws IOException
{
	File scr= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destFile=new File (System.getProperty("user.dir")+"\\src\\main\\java\\Screenshots\\failure"+sir+".png");
	FileUtils.copyFile(scr,destFile);	
}

public String[][] getdata(String excel, String sheet) throws IOException
{
	String path=System.getProperty("user.dir")+"//src//main//java//data//"+excel;
excelobj=new ExcelReader(path);	
log("path of file found and set");
String [][] dataexcel=excelobj.getdatafromexcel(excel,sheet);
	return dataexcel;
}

public void log(String message)
{
	log.info(message);
	Reporter.log(message);
}
}
