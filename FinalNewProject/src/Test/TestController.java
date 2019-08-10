package Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Data.ExcelWrite;
import ReportUtils.ReportUtil;
import TestBase.TestBaseClass;
import Utils.Resources;

public class TestController extends Resources{
	public static final Logger logger=LogManager.getLogger(TestController.class.getName());
	//public static Logger logger=null;
	public static String filename;
	public static String screenShot;
	public static String ConfigFile;
	
	//public static WebDriver driver;
	 
	
	
	
	
	public static  void initBrowser(String processing, String data) throws IOException, InterruptedException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		
		//logger.debug("Calling initialization Class from TestBase Package");
		System.out.println("First file path value from INitBrowser:"+processing);
		Initialize(processing, data);
		
		
		
	}
	
   


		

	
	

	
	public static void TestCaseController() throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException, InterruptedException, IOException{	//TestController Start here
		//logger=LogManager.getLogger(TestController.class.getName());
		// loop through the test cases
		//logger.debug(" loop through the TestCases");
		
		
		
		
		
		String BuildStatus="Pass";
		//String TCStatus="Pass";
		for(int TC=2;TC<=TestSuite.getRowCount("TestCases");TC++) {		// First for loop start here
			//logger.debug(" loop through the TestCases");
			String TCStatus="Pass";
			
			
			
			
			
			
			
			
			String failure_status= null;
		    TestCaseID = TestSuite.getCellData("TestCases", "TestCaseID", TC);
			//System.out.println("row:"+TC);
			//logger.debug("row:" +TC);
			//System.out.println("value:"+TestCaseID);
			//logger.debug("value:" +TestCaseID);
		    DesCription=TestSuite.getCellData("TestCases", "Description", TC);
			String RunMode = TestSuite.getCellData("TestCases", "RunMode", TC);
			//System.out.println("The Runmode value is "+RunMode);
			//logger.debug("The Runmode value is "+RunMode);
		
			if(RunMode.equals("Y")) {	//RunMode start here
				
				Intialization();
				String startTime = TestBaseClass.now("dd_MMM_YYYY_hh_mm_ss_SSS");
				
				//ReportUtil.startTesting("index", startTime, "Glams48QA", "1.0");
				
				//ReportUtil.startSuite("Smoke Suite");
				System.out.println("TestCase Started : "+TestCaseID);
				
				logger.debug("TestCase Started : "+TestCaseID);
				String TSStatus="Pass";
				/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\geethanjali.muddamse\\Desktop\\chromedriver.exe");
				dr=new ChromeDriver();
				
				dr.manage().window().maximize();
				dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
				
				
				int rows = TestSuiteData.getRowCount(TestCaseID);
				//System.out.println("The rows count are:"+rows);
				//logger.debug("The no of rows is "+rows);
				if(rows<2) { // Start of First if Block for TestSuite Rows Data
					rows=2;
				}	// End of First if Block for TestSuite Rows Data
				
				// loop through test data				
				for(int TD=2;TD<=rows;TD++ ) {	// 2nd for loop for TestSuiteData Starts Here
				
					// loop through the test steps
				    //System.out.println("TD"+TD);
					//System.out.println("TestSuite.getRowCount(TestCaseID)"  +TestSuite.getRowCount(TestCaseID));
                    for(int TS=2;TS<=TestSuite.getRowCount(TestCaseID);TS++) {	// 3rd For loop Starts here for TestSuiteRow Data
                    	
                    	//System.out.println("Before getcell data "+TS);
                    	//logger.debug("Before GetCellData "+TS);
                    	
                    	Keyword = TestSuite.getCellData(TestCaseID, "Keyword", TS);
                    	//System.out.println("After getcellData"+Keyword );
                    	//logger.debug("After GetCellData "+Keyword);
                    	
						Element = TestSuite.getCellData(TestCaseID, "Element", TS);
						//logger.debug("After getcellData WebElement"+Element);
						//System.out.println("After getcellData WebElement"+Element );
						
						ProceedOnFail = TestSuite.getCellData(TestCaseID, "ProceedonFail", TS);
						//logger.debug("After getcellData Proceed on Fail" +ProceedOnFail);
						failure_status = ProceedOnFail;
						//System.out.println("After getcellData Proceed on Fail"+ProceedOnFail );
						
						TestStepID = TestSuite.getCellData(TestCaseID, "TestStepID", TS);
						//logger.debug("After getcellData TestStepID "+TestStepID);
						//System.out.println("After getcellData TestStepID"+TestStepID );
						
						Description = TestSuite.getCellData(TestCaseID, "Description", TS);
						//logger.debug("After getcellData Description"+Description );
						//System.out.println("After getcellData Description"+Description );
						
						LocatorType=TestSuite.getCellData(TestCaseID, "LocatorType", TS);
						//System.out.println("After getCellData LocatorType"+LocatorType);
						//logger.debug("After getCellData LocatorType"+LocatorType);
						
						LocatorValue=TestSuite.getCellData(TestCaseID,"LocatorValue", TS);
						//System.out.println("After getCellData LocatorValue"+LocatorValue);
						//logger.debug("After getCellData LocatorValue"+LocatorValue);
						
						TestDataField = TestSuite.getCellData(TestCaseID, "TestDataField", TS);
						//System.out.println("After getcellData TestDataField"+TestDataField );
						//logger.debug("After getcellData TestDataField"+TestDataField);
						
						TestData = TestSuiteData.getCellData(TestCaseID, TestDataField, TD);
						//System.out.println("After getcellData TestData"+TestData);
						//logger.debug("After getcellData TestData"+TestData);
						
						Method method=Keywords.class.getMethod(Keyword);
					
						TSStatus=(String)method.invoke(method);
						//ReportUtil.addKeyword(,Description, Keyword, TSStatus, null);
						ReportUtil.addKeyword(TestStepID, Description, Keyword, TSStatus, null);
						
						if(Keyword.equals("Identify_PartNumber"))
						{	//Start of First if Block for Identify PartNumber starts here
							ExcelWrite.ExcelWriteData(TestCaseID, TSStatus);
						}	//End of First if Block for Identify PartNumber Ends here
						
						//System.out.println(TSStatus);
						System.out.println("TestCase:"+TestCaseID+ "TestStepID :"+TestStepID+"TSSTatus :"+TSStatus);
						logger.debug("TestCase:"+TestCaseID+ "TestStepID :"+TestStepID+"TSSTatus :"+TSStatus);

						//System.out.println("TCStatus is :"+TCStatus);
					/*	
						if(TSStatus.contains("Failed")) {	// Start of If block for Failed Cases and Take Screenshot
							// take the screenshot
							System.out.println("Screenshot method is called");
							 filename = TestCaseID+TestStepID+Keyword;
						     screenShot = TestBaseClass.getScreenShot(filename);
							System.out.println("Screenshot is :"+screenShot);
							System.out.println("TCStatus Value is :"+TCStatus);
							System.out.println("TSStatus value is :"+TSStatus);
							TCStatus = TSStatus;
							
							logger.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID + "Keyword : "+Keyword +"\n"+"Screenshot_Path: "+screenShot);
							//ReportUtil.addKeyword(Description, Keyword, TSStatus, screenShot);
							ReportUtil.addKeywordForFailedCases(TestStepID, Description, Keyword, TSStatus, screenShot);
							Thread.sleep(6000);
							//log.error( "TestCase: "  +TestCaseID+  "TestStep: " +TestStepID + "Keyword : "+Keyword);
						}	// Emd of If Block for Failed Cases and Take Screenshot
						*/
						if(ProceedOnFail.equals("N")&& TSStatus.contains("Failed")){		//Start of  if block of Proceed on Fail and Test Status failed
							// take the screenshot
							System.out.println("Screenshot method is called");
							 filename = TestCaseID+TestStepID+Keyword;
						     screenShot = TestBaseClass.getScreenShot(filename);
							System.out.println("Screenshot is :"+screenShot);
							
							System.out.println("TSStatus value is :"+TSStatus);
							TSStatus="Failed";
							TCStatus = TSStatus;
							System.out.println("TCStatus Value is :"+TCStatus);
							logger.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID + "Keyword : "+Keyword +"\n"+"Screenshot_Path: "+screenShot);
							//ReportUtil.addKeyword(Description, Keyword, TSStatus, screenShot);
							ReportUtil.addKeywordForFailedCases(TestStepID, Description, Keyword, TSStatus, screenShot);
							Thread.sleep(6000);
							//log.error( "TestCase: "  +TestCaseID+  "TestStep: " +TestStepID + "Keyword : "+Keyword);
							//ReportUtil.addTestCase(TestCaseID, Description, startTime, TestBaseClass.now("dd-MMM-YYYY_hh_mm_ss_aaa"), TCStatus);
							Keywords.driver.quit();
							
							break;
							
							
							
							
							
						}	// End of if block of Proceed on Fail and Test Status failed
					
						
						
						else if(ProceedOnFail.equals("Y")){	// Start of elseif Block of ProceedonFail is yes
								continue;
							}// End of else if Block

						/*	else { //Start of Else Block
								System.out.println("TCStatus :"+TestCaseID + "Result: "+TCStatus);
								logger.debug("TCStatus :"+TestCaseID + "Result: "+TCStatus);
								//ReportUtil.addKeyword(Description, Keyword, TSStatus, null);
								

							}// End of Else Block
							*/
						
                    } // End of TestSteps Block for loop 3
                    System.out.println("TestCase Ended: "+TestCaseID);
					System.out.println("TCStatus :"+TestCaseID + "Result: "+TCStatus); 
					if(TCStatus.equals("Failed"))
					{
						BuildStatus="Failed";
						//System.out.println("Build Status :"+BuildStatus);
						File f=new File("C:\\FunctionalTestAutomation\\BuildStatusFile\\ErrorFile.txt");
						if(f.createNewFile()){
							System.out.println("File Created Successfully");
							FileWriter writer = new FileWriter(f);
							writer.write("Build Failed");
							writer.close();
							
							
						}else{
							System.out.println("File already exists");
						}
					}
                   
                    logger.debug("TestCase Ended: "+TestCaseID);
                  // ReportUtil.addTestCase(TestCaseID,Description, startTime, TestBaseClass.now("dd-MMM-YYYY_hh_mm_ss_aaa"), TCStatus);
                  ReportUtil.addTestCase(TestCaseID, DesCription, startTime, TestBaseClass.now("dd-MMM-YYYY_hh_mm_ss_aaa"), TCStatus);
                   Thread.sleep(10000);
                   if(!TSStatus.contains("Failed")){	// Start of TestCase Level
                	   //ReportUtil.addTestCase(TestCaseID, startTime, TestBaseClass.now("dd-MMM-YYYY_hh_mm_ss_aaa"), TCStatus);
                       Thread.sleep(10000);
                       Logout();
                	 
                    } // End of TestCase Level 
                  
                   // System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@ProcessdOnFail@@@@@@@@@@"+failure_status);
    				if(null!=failure_status && failure_status.equals("N")){	// End of TestCase Level
    					break;
                   
				} // End of If Case Block
				
				
				
			}	// End of 2nd for loop. Which is TestSuiteData
				
				}
		} // End of RunMode Loop
		System.out.println("Build Status :"+BuildStatus);
		ReportUtil.endSuite();
		ReportUtil.updateEndTime(TestBaseClass.now("dd-MMM-YYYY hh:mm:ss aaa"));	
		}	// End of First for loop method
		
		
		
		
	// End of TestController Method
					
				
	public static void main (String[] args)  throws IOException, InterruptedException { // Start of Main method
		
		//Property file reading one-by-one
		//loop-int cnt=0 and cnt=cnt+1
		//String coomment="value";String suppoerting="value";String job="Value";
		//if(cnt==3){
		//initBrowser(coomment, suppoerting, job);
		//cnt=0;
		//}
		
		/*BufferedReader Reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Config File Path :");
		ConfigFile=Reader.readLine();
		System.out.println("The Entered ConfigFile Path is :"+ConfigFile);*/
		//logger=LogManager.getLogger(TestController.class.getName());
		// f=new File("C:\\FunctionalTestAutomationFramework\\FinalNewProject\\ConfigFile.txt");
		
		f=new File("C:\\FunctionalTestAutomation\\Config\\ConfigFileforExcelFiles.txt");
		 System.out.println("The ReadSuiteFiles path from a base config File is :"+f);
		 fis=new FileInputStream(f);
		 pro.load(fis);
		 
		
		
		 Enumeration keys = pro.keys();
		 int count=0;
		  String processing = null;
		  String data = null;
		 while (keys.hasMoreElements()) {	// Start of While loop
		     String key = (String)keys.nextElement();
		     String value = (String)pro.get(key);
		     count++;
		     //System.out.println(key + ": " + value);
		     System.out.println("The list of keys:"+key);
		   
		     if(count==1){  //Start of If loop
		    	 processing= value;
		    	 System.out.println("The Processing value is :"+processing);
		     } //End of If Loop
		     
		     else if(count==2){ 	//Start of Else loop
		    	 data = value;
		    	 System.out.println("The data value is :"+data);
		    	 try{		//Start of Try Block
		    	 initBrowser(processing,data);
		    	 TestCaseController();
		    	 //Logout();
		    	 
		    	 count=0;
		    	 }		//End of Try Block
		    	 
		    	 catch(Exception e){	//Start of Catch Block
		    		 e.printStackTrace();
		    	 }	//End of Catch Block
		    	 
		     }	//End of ElseIf Block
		    	 
		     }//End of While Block
		  
			 
			
	
	}	//End of main method Block
	
	
	} //End of the Class





	
	

		
						
		




