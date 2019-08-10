package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import Data.ExcelRead;
import ReportUtils.ReportUtil;
import TestBase.TestBaseClass;



public class Resources extends TestBaseClass {
	
	public static WebDriver driver;
	public static WebElement element;
	public static EventFiringWebDriver dr;
	public static Properties Repository = new Properties();
	
	
	public static ExcelRead TestSuite;
	public static ExcelRead TestSuiteData;
	
	public static String TestCaseID;
	public static String DesCription;
	public static String TestStepID;
	public static String Description;
	public static String Keyword;
	public static String Element;
	public static String ProceedOnFail;
	public static String TestDataField;
	public static String TestData;
	public static String TSID;
	
	public static String LocatorType;
	public static String LocatorValue;
	
	public static File f;
	public static FileInputStream FI;
	public static String startTime = TestBaseClass.now("dd_MMM_YYYY_hh_mm_ss_SSS");
	
	public static void Initialize(String processing,String data) throws IOException, InterruptedException{
		
		TestSuite=new ExcelRead(processing);
		System.out.println("First file path value is:"+processing);
		TestSuiteData=new ExcelRead(data);
		System.out.println("Second file path value is :"+data);
		System.out.println(System.getProperty("user.dir"));
		TestBaseClass.loadPropertiesFile();
		String startTime = TestBaseClass.now("dd_MMM_YYYY_hh_mm_ss_SSS");
		
		ReportUtil.startTesting("index", startTime, "Glams48QA", "1.0");
		//ReportUtil.StartLoggingErrors("Failed Report", startTime, "Glams48qa", "1.0");
		
		ReportUtil.startSuite("Smoke Suite");
		//ReportUtil.StartSuiteForErrorLogs("Smoke Suite Error Logs");
		
		ReportUtil.StartDetailedReport("SmokeSuite Detailed Report");
		
		
		
		
		
		
		
		//Intialization();
	
	

     /*System.out.println("Data");
	
	public static void Initialize(String testSite, String testSuiteData) throws IOException, InterruptedException {
		
		/*TestSuiteData=new ExcelRead("C:\\FunctionalTestAutomationFramework\\FinalNewProject\\src\\Data\\TestSuiteData.xlsx");
		TestSuite=new ExcelRead("C:\\FunctionalTestAutomationFramework\\FinalNewProject\\src\\Data\\TestSuite.xlsx");*/
		//TestSuiteData=new ExcelRead(testSuiteData);
		//TestSuite=new ExcelRead(testSite);
		System.out.println(System.getProperty("user.dir"));
		//Intialization();
		}
		
}
