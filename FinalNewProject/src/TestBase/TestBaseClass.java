package TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

import Data.ExcelRead;
import ReportUtils.ReportUtil;
import Test.Keywords;

public class TestBaseClass {
	public static Properties pro=new Properties();
	public static WebDriver driver=TestBaseClass.driver;
	
	//public static WebElement element;
	public static File f;
	public static FileInputStream fis;
	public static FileOutputStream fio;
	//public static String Screenshots=pro.getProperty("ScreenshotPath");
	
	/*public static ExcelRead TestSuite;
	public static ExcelRead TestSuiteData;
	
	public static String TestCaseID;
	public static String TestStepID;
	public static String Description;
	public static String Keyword;
	public static String Element;
	public static String ProceedOnFail;
	public static String TestDataField;
	public static String TestData;
	public static String TSID;
	
	public static String LocatorType;
	public static String LocatorValue;*/
	
    public static Logger log=LogManager.getLogger(TestBaseClass.class.getName());
	//public static Logger log=null;
    public static File  destFile=null;
    
    
    
    /*public static void initialize(String testSuite, String testSuiteData) throws IOException, InterruptedException{
    	TestSuite=new ExcelRead(testSuite);
    	TestSuiteData=new ExcelRead(testSuiteData);
    	System.out.println(System.getProperty("user.dir"));
    	Intialization();
    	
    	
    }*/
    
    
	


	
	
	
	
	
	public static void Intialization() throws IOException, InterruptedException{
		//log=LogManager.getLogger(TestBaseClass.class.getName());
		log.info("Calling LoadPropertiesFile and SelectBrowser Methods");
		
		//loadPropertiesFile();
		
		SelectBrowser(pro.getProperty("browser"));
		
		
		
		
	}
	
public static void Logout() throws InterruptedException{
		//Thread.sleep(10000);
		WebElement Logout=driver.findElement(By.xpath("(//form[@id='logoutForm'])[2]"));
		boolean Element_Status=Logout.isEnabled();
		System.out.println("Element Status is :"+Element_Status);
		if(Element_Status==true){
			//Thread.sleep(3000);
			Logout.click();
		}
		
		
		Thread.sleep(5000);
		driver.quit();
		Keywords.driver=null;
		
		Thread.sleep(10000);
		
	}



	
	public static WebDriver SelectBrowser(String browser) throws InterruptedException{
		if("firefox".equals(browser)){

			log.info("new internet explorer browser initiated");
			System.setProperty(pro.getProperty("firefoxdriverKey"), pro.getProperty("firefoxdriverValue"));
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\geethanjali.muddamse\\Downloads\\gecko\\geckodriver.exe");
			driver=new FirefoxDriver();
			log.debug("new internet explorer browser window opened");
			log.debug("Maximizing the browser window");
			driver.manage().window().maximize();
			log.info("browser window maximized");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			log.debug("Providing implicit wait of 20sec");
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			log.debug("Providing pageload timeout of 60sec");
			driver.get(pro.getProperty("url"));
			log.debug("Opening the Current url");
			WebElement Username=driver.findElement(By.name("UserName"));
			Username.sendKeys(pro.getProperty("username"));
			log.debug("Providing Username value");
			WebElement Password=driver.findElement(By.name("Password"));
			Password.sendKeys(pro.getProperty("password"));
			log.debug("Providing password value");
			//Thread.sleep(3000);
			log.debug("Waiting for 3sec");
			WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
			WebDriverWait wait=new WebDriverWait(driver,60);
			wait.until(ExpectedConditions.visibilityOf(login)).click();
			//login.click();
			log.debug("Clicking on login button");
			WebElement vpin1=driver.findElement(By.id("vpin1"));
			vpin1.sendKeys(pro.getProperty("VPIN"));
			WebElement vpin2=driver.findElement(By.id("vpin2"));
			vpin2.sendKeys(pro.getProperty("VPIN"));
			WebElement vpin3=driver.findElement(By.id("vpin3"));
			vpin3.sendKeys(pro.getProperty("VPIN"));
			//Thread.sleep(3000);
			WebElement Submit=driver.findElement(By.xpath("//input[@name='Submit']"));
			wait.until(ExpectedConditions.visibilityOf(Submit)).click();
			Thread.sleep(13000);
			Keywords.driver=driver;
			return driver;
			
		
			
			
		}else if("ie".equals(browser)){

			log.info("new internet explorer browser initiated");
			//System.setProperty("webdriver.ie.driver", "C:\\Users\\geethanjali.muddamse\\Downloads\\IEDriver\\IEDriverServer.exe");
			System.setProperty(pro.getProperty("iedriverKey"), pro.getProperty("iedriverValue"));
			driver=new InternetExplorerDriver();
			log.debug("new internet explorer browser window opened");
			log.debug("Maximizing the browser window");
			driver.manage().window().maximize();
			log.info("browser window maximized");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			log.debug("Providing implicit wait of 20sec");
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			log.debug("Providing pageload timeout of 60sec");
			driver.get(pro.getProperty("url"));
			log.debug("Opening the Current url");
			WebElement Username=driver.findElement(By.name("UserName"));
			Username.sendKeys(pro.getProperty("username"));
			log.debug("Providing Username value");
			WebElement Password=driver.findElement(By.name("Password"));
			Password.sendKeys(pro.getProperty("password"));
			log.debug("Providing password value");
			//Thread.sleep(3000);
			log.debug("Waiting for 3sec");
			WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
			WebDriverWait wait=new WebDriverWait(driver,60);
			wait.until(ExpectedConditions.visibilityOf(login)).click();
			//login.click();
			log.debug("Clicking on login button");
			WebElement vpin1=driver.findElement(By.id("vpin1"));
			vpin1.sendKeys(pro.getProperty("VPIN"));
			WebElement vpin2=driver.findElement(By.id("vpin2"));
			vpin2.sendKeys(pro.getProperty("VPIN"));
			WebElement vpin3=driver.findElement(By.id("vpin3"));
			vpin3.sendKeys(pro.getProperty("VPIN"));
			//Thread.sleep(3000);
			WebElement Submit=driver.findElement(By.xpath("//input[@name='Submit']"));
			wait.until(ExpectedConditions.visibilityOf(Submit)).click();
			//Thread.sleep(5000);
			Keywords.driver=driver;
			return driver;
			
		
			
			
		}else if("chrome".equals(browser)){

				System.setProperty(pro.getProperty("ChromedriverKey"), pro.getProperty("ChromedriverValue"));
				//System.setProperty("webdriver.chrome.driver", "C:\\FunctionalTestAutomationFramework\\FinalNewProject\\Drivers\\chromedriver.exe");
				log.debug("Providing system variables of chrome driver");
				driver=new ChromeDriver();
				log.debug("Initializing new chrome driver");
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				log.debug("maximizing the browser");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				log.debug("Providing the implicit wait of 60sec");
				driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
				log.debug("Providing pageload timeout of 100sec");
				driver.get(pro.getProperty("url"));
				log.debug("Opening the url in a browser" +pro.getProperty("url"));
				WebElement Username=driver.findElement(By.name("UserName"));
				Username.sendKeys(pro.getProperty("username"));
				log.debug("Providing the username");
				WebElement Password=driver.findElement(By.name("Password"));
				Password.sendKeys(pro.getProperty("password"));
				log.debug("Providing Password");
				Thread.sleep(3000);
				WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
				WebDriverWait wait=new WebDriverWait(driver,60);
				wait.until(ExpectedConditions.visibilityOf(login)).click();
				//login.click();
				log.debug("Clicking login button");
				Thread.sleep(4000);
				WebElement vpin1=driver.findElement(By.id("vpin1"));
				vpin1.sendKeys(pro.getProperty("VPIN"));
				WebElement vpin2=driver.findElement(By.id("vpin2"));
				vpin2.sendKeys(pro.getProperty("VPIN"));
				WebElement vpin3=driver.findElement(By.id("vpin3"));
				vpin3.sendKeys(pro.getProperty("VPIN"));
				//Thread.sleep(3000);
				WebElement Submit=driver.findElement(By.xpath("//input[@name='Submit']"));
				wait.until(ExpectedConditions.visibilityOf(Submit)).click();
				//Thread.sleep(5000);
				Keywords.driver=driver;
				return driver;
				
			}
		return driver;
	
	}
	
	
	
	
	
	
	//static String Screenshots="C:\\FunctionalTestAutomationFramework\\FinalNewProject\\src\\Screenshots";
		
		//static String Screenshots="C:/FunctionalTestAutomation/Screenshots";
     //public	static String Screenshots=pro.getProperty("ScrrenshotPath");
	 
	
//	public static String  ScreenshotFolderPath=pro.getProperty("ScreenshotPath");
	
	//static String Screenshots=ScreenshotFolderPath;
	
	
	
	public static String getScreenShot(String fileName){
		if(driver == null){
			System.out.println("screenshot NULL");
			return null;
		}
		if(fileName==""){
			fileName = "blank";
		}
		//Reporter.log("captureScreen method called");
		System.out.println("CaptureScreenshot method is Called");
		//File destFile = null;
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		File screFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{
			destFile = new File(pro.getProperty("ScreenshotPath")+"/"+fileName+"_"+formater.format(calendar.getTime())+".png");
			
			Files.copy(screFile.toPath(), destFile.toPath());
			//Reporter.log("<a href='"+destFile.getAbsolutePath()+"'><img src='"+destFile.getAbsolutePath()+"'height='100' width='100'/></a>");
		}
		catch(Exception e){
			System.out.println("screenshot catch");
			e.printStackTrace();
		}
		return destFile.toString();
	}
	
	
	
	
	public static void loadPropertiesFile() throws IOException{
		//log=LogManager.getLogger(TestBaseClass.class.getName());
		pro=new Properties();
		
		//f=new File("C:\\FunctionalTestAutomationFramework\\FinalNewProject\\src\\TestBase\\PropertiesFile");
		f=new File("C:\\FunctionalTestAutomation\\Config\\BasePropertiesFile.txt");
		//f=new File("E:\\CI-Jenkins\\GLAMS-Automation\\FunctionalTestAutomation\\Config\\BasePropertiesFile.txt");
		System.out.println("The Config File path is :"+f);
		fis=new FileInputStream(f);
		
		log.info("Loading properties of fileinputStream");
		pro.load(fis);
		System.out.println("The screenshots path from a baseconfig file is :"+pro.getProperty("ScreenshotPath"));
		
		

		
		
	
		
		
		
	}
	
	public static String now(String format) {
		Calendar cal = Calendar.getInstance();
		DateFormat fm = new SimpleDateFormat();
		//System.out.println("The dateformat from the config File :"+pro.getProperty("DateFormat"));
		Date obj=new Date();
		//System.out.println("The current Date Format is "+fm.format(cal.getTime()));
		//format=fm.format(cal.getTime());
		return format=fm.format(cal.getTime());
	}
	
	public static String RUN_DATE(String format){
		
		Calendar cal = Calendar.getInstance();
		DateFormat fm = new SimpleDateFormat();
		//System.out.println("The dateformat from the config File :"+pro.getProperty("DateFormat"));
		Date obj=new Date();
		//System.out.println("The current Date Format is "+fm.format(cal.getTime()));
		return fm.format(cal.getTime());
		
	}

}
