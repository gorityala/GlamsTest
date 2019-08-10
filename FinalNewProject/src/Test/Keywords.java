package Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.logging.Logger;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.TestBaseClass;
import Utils.Resources;
import Test.TestController;



public class Keywords extends Resources {

	public static WebDriver driver=TestBaseClass.driver;
	public static String Error=null;
	public static String ScreenShot_Path=TestController.screenShot;

	
	public static String Navigate() throws InterruptedException{
		try{
			
			driver.get(LocatorValue);
			Thread.sleep(10000);
			log.debug("Calling Navigate Keyword from Keywords Class");
		//Thread.sleep(6000);
		
		}
		catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to navigate :"+Element);
		}
			return "Pass";
	
		}
	
	public static String TextBox_Click(){
		
		try {
			getWebElement(Element).click();
		}  catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
		
	}
	public static String WaitFor() throws InterruptedException{
		try{
		Thread.sleep(5000);
		log.debug("Calling WaitFor Keyword which waits for 5sec ");
		}
		catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
	}
	
	public static String ButtonWithInputTag(){
		try {
			getWebElement(Element).click();
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String ClearInputText(){
		try {
			
			
			getWebElement(Element).clear();
			log.debug("Calling ClearInputText method which clears the value in the Textbox");
			//Thread.sleep(3000);
			
		} 
		catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String PageRefresh() throws InterruptedException{
		try{
		String CurrentURL=driver.getCurrentUrl();
		WebDriverWait wait=new WebDriverWait(driver,90);
		wait.until(ExpectedConditions.urlContains(CurrentURL));
		driver.get(CurrentURL);
		log.debug("Calling Pagerefresh keyword which calls currentUrl");
		Thread.sleep(8000);
		}
		
		catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
	}
	public static String ClickAndHold() throws InterruptedException, Exception{
		
		try{
		WebElement Element=null;
		Element=driver.findElement(By.linkText(LocatorValue));
		WebDriverWait wait=new WebDriverWait(driver,300);
		wait.until(ExpectedConditions.visibilityOf(Element));
		Actions action=new Actions(driver);
		action.clickAndHold(Element).build().perform();
		log.debug("Calling ClickAndHold Keyword, Which click the element and hold for a while");
		Thread.sleep(4000);
		
		}
		
		catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		
		return "Pass";
		
	}
	
	
	
	public static String TextBox(){
		try {
			
			
			getWebElement(Element).sendKeys(TestData);
			log.debug("Calling TextBox Keyword and Providing the TestData values in the TextBoxes");
			Thread.sleep(3000);
			
	
			
			
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
	}
	
	public static String RequiredByDate_Field(){
		
		
		try {
			WebElement RequiredByDate=driver.findElement(By.xpath("(//input[@name='Required By Date'])[1]"));
			DateFormat df=new SimpleDateFormat("dd-MMM-YYYY");
			Date dateobj=new Date();
			String CurrentDate=df.format(dateobj);
			//System.out.println("The Current Date Value is :"+CurrentDate);
			//Thread.sleep(2000);
			
			RequiredByDate.sendKeys(CurrentDate);
			Thread.sleep(2000);
			
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			}
		return "Pass";
		
		
	}
	
	public static String TextArea(){
		try {
						
			
			getWebElement(Element).sendKeys(TestData);
			
			log.debug("Calling TextArea and providing values of TestData into respective field");
			Thread.sleep(4000);
			
			} 
		catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String RadioButton(){
		try {
			
			
			
			getWebElement(Element).click();
			log.debug("Calling RadioButton Keyword and selecting the respective button");
			Thread.sleep(2000);
			
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		}
	
	public static String CheckBox(){
		try {
			
			getWebElement(Element).click();
			log.debug("Calling CheckBox Keyword ");
			Thread.sleep(2000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
	}
	public static String Dropdown(){
		try {
			WebElement DropdownElement=null;
			DropdownElement= getWebElement(Element);
			Select Object=new Select(DropdownElement);
			Object.selectByVisibleText(TestData);
			log.debug("Dropdown keyword is Called and based on TestData value Dropdown value will be selected");
			//Thread.sleep(5000);
			
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
	}
	
	public static String Handling_WindowAlert_Yes() throws Exception{
		
		try {
			
			getWebElement(Element).click();
			log.debug("Calling Handling_WindowAlert_Yes Keyword");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
	}
	
	public static String Handling_WindowAlert_No() throws InterruptedException{
		
		try {
			
			getWebElement(Element).click();
			log.debug("Calling Handling_WindowAlert_No Keyword ");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String Handling_WindowAlert_Cancel(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking Handling_WindowAlert_Cancel element");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
		
	}
	
	public static String Handling_WindowAlert_Ok(){
		try {
			WebDriverWait wait=new WebDriverWait(driver,90);
			wait.until(ExpectedConditions.elementToBeClickable(getWebElement(Element)));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();",getWebElement(Element));
			//explicitWait();
			//getWebElement(Element).click();
			log.debug("Calling Handling_WindowAlrt_Ok and Clicking the Window alert message");
			//Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String CustomControlActionButtons_Update(){
		try {
			
			getWebElement(Element).click();
			log.debug("Calling CustomControl_Update Keyword and Clicking on Update Button");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String CustomControlActionButtons_Cancel(){
		try {
			
			getWebElement(Element).click();
			log.debug("Calling CustomControlActionButtons_Cancel Keyword and Clicking Cancel action button of Customcontrol");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String CustomControlActionButtons_Submit(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on Submit action button of custom controls");
			log.info("Calling CustomControlActionButtons_Submit Keyword ");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String ClickAndSelectSingleSelectDropdown() throws Exception{
		try{
			
		
		getWebElement(Element,0).click();
		Thread.sleep(3000);
		getWebElement(Element,1).click();
		Thread.sleep(3000);
		}
		catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
	}
	
	public static String ClickAndSelectMultiselectDropdown() throws Exception{
		try{
		//WaitUntillExpectedCondition(0);
		getWebElement(Element,0).click();
		log.debug("Clicking on MultiselectDropdown");
		Thread.sleep(3000);
		//WaitUntillExpectedCondition(1);
		getWebElement(Element,1).click();
		log.debug("Selecting the value from MultiSelectDropdown");
		Thread.sleep(3000);
		
		}
		catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String ClickAndSelectMultiSelectWithAttributes() throws Exception{
		try{
			//explicitWait(0);
		//WaitUntillExpectedCondition(0);
		getWebElement(Element,0).click();
		log.debug("Clicking MultiSelectDropdown With Attributes");
		Thread.sleep(3000);
		//explicitWait(1);
		//WaitUntillExpectedCondition(1);
		getWebElement(Element,1).click();
		Thread.sleep(3000);
		
		log.debug("Selecting the value from MultiselectDropdown");
		//Thread.sleep(5000);
		}
		catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String non_Kendo_ActionButtons(){
		try {
			WebElement nonKendoActionButton=driver.findElement(By.linkText(LocatorValue));
			nonKendoActionButton.click();
			Thread.sleep(4000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
		}
	public static String KendoGrids_ActionButtons(){
		try {
			getWebElement(Element).click();
			Thread.sleep(4000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
	}
	public static String KendoGrids_GroupButtons(){
		try {
			getWebElement(Element).click();
			Thread.sleep(4000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
	}
	public static String Link(){
		
		// Link Values are SubMenus 
		//Ex: GlamsComponent, GlamsKeylineTracker, Glams AdminAuidt
		try {
			
			
			
			getWebElement(Element).click();
			log.debug("Clicking on the link");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
	}
	
	
	public static String Tab(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on the Tab");
			//Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String Button(){
		try {
			WebElement Button=getWebElement(Element);
			boolean Status=Button.isEnabled();
			System.out.println("Element is Enabled or not:"+Status);
			if(Status==true){
				//Actions action=new Actions(driver);
				JavascriptExecutor js=(JavascriptExecutor)driver;
				Thread.sleep(2000);
				js.executeScript("arguments[0].click();", Button);
				Thread.sleep(5000);
				//action.doubleClick(Button).build().perform();
				
			//getWebElement(Element).click();
			/*Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", getWebElement(Element));
			Thread.sleep(8000);*/
			}
			
			
			//explicitWait();
			//getWebElement(Element).click();
			log.debug("Clicking on the Button");
			//Thread.sleep(5000);
			
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
	}
	
	public static String MyTasks_GridFilter(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on MyTasksGrid_ GridFilter icon/field");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String GroupTasks_GridFilter(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on GroupTasks_GridFilter element");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String TrackerRepository_GridFilter(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on Tracker or Repository GroupFilter Element");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String MyTasksGridFilter_DefaultButton(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on MyTasksGridFilter_DefaultButton Element");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String MyTasksGridFilter_ApplyButton(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on MyTasksGridFilter_ApplyButton ");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String MyTasksGridFilter_ClearButton(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on MyTasksGridFilter_ClearButton");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String MyTasksGridFilter_SaveButton(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on MyTasksGridFilter_SaveButton");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String GroupTasksGridFilter_DefaultButton(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on GroupTasksGridFilter_DefaultButton");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String GroupTasksGridFilter_ApplyButton(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on GroupTasksGridFilter_ApplyButton");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String GroupTasksGridFilter_ClearButton(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on GroupTasksGridFilter_ClearButton");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String GroupTasksGridFilter_SaveButton(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on GroupTasksGridFilter_SaveButton ");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String TrackerRepositoryGridFilter_DefaultButton(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on TrackerRepositoryGridFilter_DefaultButton");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String TrackerRepositoryGridFilter_ApplyButton(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on TrackerRepositoryGridFilter_ApplyButton");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String TrackerRepositoryGridFilter_ClearButton(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on TrackerRepositoryGridFilter_ClearButton");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String TrackerRepositoryGridFilter_SaveButton(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on TrackerRepositoryGridFilter_SaveButton");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String GroupTask_GroupFilter(){
		try {
			
			
			getWebElement(Element,0).click();
			log.debug("Clicking on GroupTask_GroupFilter ");
			Thread.sleep(4000);
			
			getWebElement(Element,1).click();
			log.debug("Clicking on Value from GroupTask Filter Dropdown");
			Thread.sleep(4000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String ReAssign_MyTaskGrid(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on ReAssign_MyTaskGrid link");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
	}
	public static String ReAssign_GroupTasksGrid(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on ReAssign_GroupTasksGrid");
			Thread.sleep(5000);	
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String ExportToExcel_MyTasksGrid(){
		try {
			
			
			log.debug("Calling ExportToExcel_MyTasksGrid function and exporting data");
			//Thread.sleep(5000);
		}catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
	}
	
	public static String AssignToMe_GroupTaskGrid(){
	      try {
	    	 
			getWebElement(Element).click();
			log.debug("Calling AssignToMe_GroupTaskGrid function");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
	      return "Pass";
		}
	
	public static String ExportToExcel_GroupTasksGrid(){
		try {
			
			getWebElement(Element).click();
			log.debug("Calling ExportToExcel_GroupTasksGrid function ");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String Verify_CreatePreviewFile(){
		try{
		WebElement Preview_img=driver.findElement(By.xpath("//img[@name='preview_img']"));
		boolean Status=Preview_img.isDisplayed();
		System.out.println(Status);
		if(Status==true){
			System.out.println("Preview is Displayed for the Uploaded File ");
			
		}else{
			System.out.println("Preview is not Displayed for the Uploaded File");
		}
		}
		catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		
		return "Pass";
		}
	public static String Edit_MyTasksGrid(){
		try {
			
			getWebElement(Element).click();
			log.debug("Calling Edit_MyTasksGrid function ");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		
		return "Pass";
		
	}
	public static String Edit_GroupTasksGrid(){
		try {
			
			getWebElement(Element).click();
			log.debug("Calling Edit_GroupTasksGrid Function");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
	}
	public static String DownloadFiles_MyTasksGrid(){
		try {
			
			getWebElement(Element).click();
			log.debug("Calling DownloadFiles_MyTasksGrid function");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String DownloadFiles_GroupTasksGrid(){
		try {
			
			getWebElement(Element).click();
			log.debug("Calling DownloadFiles_GroupTasksGrid function");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String ExportToExcel_TrackerRepositoryAuditGrids(){
		try {
			//explicitWait();
			WebElement ExporttoExcel=driver.findElement(By.xpath("(//a[@name='ExportToExcel'])[1]"));
			ExporttoExcel.click();
			log.debug("Calling ExportToExcel_TrackerRepositoryAuditGrids function");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
	}
	
	public static String DownloadFiles_TrackerRepositoryGrids(){
		try {
			
			getWebElement(Element).click();
			log.debug("Calling DownloadFiles_TrackerRepositoryGrids function");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String DisplayArchievedJobs(){
		try {
			
			getWebElement(Element).click();
			log.debug("Calling DisplayArchievedJobs function from Repository Grids");
			Thread.sleep(5000);
		}catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String DisplayCancelledJobs(){
		try {
			
			getWebElement(Element).click();
			log.debug("Calling DisplayCancelledJobs function from Repository Grids");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String DownloadCustomControl_Upload(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking Supporting Doc Customcontrol Upload Button");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String DownloadCustomControl_Sendmail(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking Supporting Doc Customcontrol Sendmail Button");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String DownloadCustomControl_Download(){
		try {
			
			getWebElement(Element).click();
			log.debug("Cicking supporting doc Customcontrol download button");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String DownloadCustomControl_MakeInactive(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on Supporting Doc customcontrol makeinactive button");
			Thread.sleep(6000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String DownloadCustomControl_Edit(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on Supporting Doc Customcontrol edit button");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
	}
	public static String DownloadCC_Category(){
		try {
			
			getWebElement(Element,0).click();
			log.debug("Clicking on Category Dropdown in EditSupportingDocs Window");
			Thread.sleep(6000);
			
			getWebElement(Element,1).click();
			log.debug("Selecting the Value from Category Dropdown");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";		
	}
	
	public static String CommentsCC_NewTopic_Types(){
		try {
			WebElement CommentsCC_NewTopic_TypesDropdown=null;
			CommentsCC_NewTopic_TypesDropdown=driver.findElement(By.xpath("(//select[@name='Types'])[2]"));
			Select Dropdownelement=new Select(CommentsCC_NewTopic_TypesDropdown);
			
			Dropdownelement.selectByVisibleText(TestData);
			Thread.sleep(6000);
			log.debug("Selecting Value for Types Dropdown in Comments CustomControl NewTopic Window");
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
	}
	public static String CommentsCC_NewTopic_SubCategory(){
		try {
		WebElement CommentsCC_NewTopic_SubCategoryDropdown=null;
		CommentsCC_NewTopic_SubCategoryDropdown=driver.findElement(By.xpath("(//select[@name='Subcategory'])[2]"));
		Select SubCategoryDropdown=new Select(CommentsCC_NewTopic_SubCategoryDropdown);
		SubCategoryDropdown.selectByVisibleText(TestData);
		log.debug("Selecting Value for SubCategory Dropdown in Comments CustomControl NewTopic Window");
		Thread.sleep(6000);
		}
		catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		
		return "Pass";
	}
	
	
        public static String CommentsCustomControl_NewTopic_FileUpload() throws IOException{
		
		try {
			WebElement FileUploadLink=driver.findElement(By.xpath("(//span[@title='Attach File'])[2]"));
			Actions FileAction=new Actions(driver);
			WebDriverWait wait=new WebDriverWait(driver,60);
			wait.until(ExpectedConditions.visibilityOf(FileUploadLink));
			FileAction.click(FileUploadLink).build().perform();
			//Thread.sleep(5000);
			Runtime.getRuntime().exec("C:\\Automation Backup\\AutoIT_Files\\NewArtWorkUpload.exe");
			log.debug("Calling AutoIT file Function to Upload Comments File");
			
			
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
	}
	
	public static String CommentsCC_Grid_TypesFilter() throws InterruptedException{
		try{
		WebElement CommentsCC_Grid_TypesFilter=driver.findElement(By.xpath("(//select[@name='Types'])[2]"));
		Select AllTypes_Filter=new Select(CommentsCC_Grid_TypesFilter);
		AllTypes_Filter.selectByVisibleText(TestData);
		log.debug("Selecting dropdown value of AllTypes filter in Comments Grid");
		Thread.sleep(5000);
		}
		catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		}
	
	public static String CommentsCC_Grid_SubCategoryFilter() throws InterruptedException{
		try{
		WebElement CommentsCC_Grid_SubCategoryFilter=driver.findElement(By.xpath("(//select[@name='Subcategory'])[1]"));
		Select SubCategory_Filter=new Select(CommentsCC_Grid_SubCategoryFilter);
		SubCategory_Filter.selectByVisibleText(TestData);
		Thread.sleep(5000);
		log.debug("Selecting dropdown value of SubCategory filter in Comments Grid");
		}catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		}
	
	public static String CommentsCC_Reply_CommentsTextAndFileUpload() throws IOException, InterruptedException{
		try{
		WebElement CommentsText_Reply=driver.findElement(By.name("replyText"));
		CommentsText_Reply.sendKeys(TestData);
		Thread.sleep(3000);
		WebElement CommentsFile_Reply=driver.findElement(By.xpath("(//a[@title='Attach File'])[1]"));
		CommentsFile_Reply.click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\FunctionalTestAutomation\\SupportingFiles\\AutoITexeFile\\NewArtWorkUpload.exe");
		log.debug("Calling AutoIT file Function to Upload Comments File");
		}
		catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - File not found  :"+Element);
			
	
		}
		return "Pass";
		
		}
	
		public static String SelectGridRow(){
		try {
			WebElement KendoGrid_SelectRow=driver.findElement(By.xpath("((//div[@class='k-grid-content k-auto-scrollable'])[2]/table/tbody/tr)[1]"));
			KendoGrid_SelectRow.click();
			Thread.sleep(3000);
			log.debug("Selecting the Grid row");
			//Thread.sleep(2000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String WindowHeader_Refresh(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on the Refresh button in WindowHeader");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String WindowHeader_Close(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking Close button in WindowHeader");
			Thread.sleep(3000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String MyTasks_StateFilter_OverDue(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on MyTasks_StateFilter_OverDue StateFilter Button");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String MyTasks_StateFilter_LessthanHrs(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on MyTasks_StateFilter_LessthanHrs Button");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String MyTasks_StateFilter_OnTime(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on MyTasks_StateFilter_OnTime Button");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String MyTasks_StateFilter_Hold(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on MyTasks_StateFilter_Hold Button");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String GroupTasks_StateFilter_OverDue(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on GroupTasks_StateFilter_OverDue Button");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String GroupTasks_StateFilter_LessthanHrs(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on GroupTasks_StateFilter_LessthanHrs Button");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String GroupTasks_StateFilter_OnTime(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on GroupTasks_StateFilter_OnTime Button");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String GroupTasks_StateFilter_Hold(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on GroupTasks_StateFilter_Hold Button");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String Tracker_StateFilter_OverDue(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on Tracker_StateFilter_OverDue Button");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String Tracker_StateFilter_LessthanHrs(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on Tracker_StateFilter_LessthanHrs Button");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String Tracker_StateFilter_OnTime(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on Tracker_StateFilter_OnTime Button");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String Tracker_StateFilter_Hold(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on Tracker_StateFilter_Hold Button");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String Repository_StateFilter_Active(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on Repository_StateFilter_Active Button");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String Repository_StateFilter_Locked(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on Repository_StateFilter_Locked Button");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String WaitforGridLod(){
		try{
			Thread.sleep(15000);
			
			log.debug("Waiting for Grid to load");
			}
			catch(Exception t){
				//t.printStackTrace();
				 Error=t.getMessage();
				 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
				 return("Failed - Unable to find the Element :"+Element);
				
		
			}
			return "Pass";
		}
		
	public static String  WaitForPageLoad() throws InterruptedException{
		try{
		Thread.sleep(12000);
		
		log.debug("Waiting for Pageload or Element to load");
		}
		catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	
	public static String PdfUpload() throws IOException, InterruptedException{
		//Thread.sleep(5000);
		try{
		
		//Thread.sleep(6000);
		
		WebElement UploadFile=driver.findElement(By.xpath("//input[@title='Upload Files']/ancestor::div[1]"));
		WebDriverWait wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(UploadFile));
		log.debug("Clicking on UploadFile Button");
		UploadFile.click();
		Runtime.getRuntime().exec("C:\\Automation Backup\\AutoIT_Files\\PdfUploadChrome.exe");
		log.debug("Uploading a supporting file in FileUpload control");
		}
		catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - File not found Exception :"+Element);
			
	
		}
		return "Pass";
	
		
	}
	
	
	
	public static String UploadPdf() throws IOException{
		
		try {
			WebElement Browse=driver.findElement(By.xpath("(//*[.='Browse'])[1]"));
			Actions action=new Actions(driver);
			action.click(Browse).build().perform();
			log.debug("Clicking on Browse button");
			Thread.sleep(5000);
			
			Runtime.getRuntime().exec("C:\\FunctionalTestAutomation\\SupportingFiles\\AutoITexeFile\\NewArtWorkUpload.exe");
			log.debug("Calling AutoIT file Function to Upload Supporting/Artwork File");
			
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
		
	}
	
	public static String UploadLargeFile(){
		try {
			WebElement Browse=driver.findElement(By.xpath("(//*[.='Browse'])[2]"));
			Actions action=new Actions(driver);
			action.click(Browse).build().perform();
			log.debug("Clicking on Browse button");
			Thread.sleep(5000);
			
			Runtime.getRuntime().exec("C:\\FunctionalTestAutomation\\SupportingFiles\\AutoITexeFile\\NewArtWorkUpload.exe");
			log.debug("Calling AutoIT file Function to Upload Supporting/Artwork File");
			
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
	}
	
	public static String WindowHandle_LargeFileUpload(){
		try {
			
			WebElement LargeFile=driver.findElement(By.linkText("Large FileUpload"));
			LargeFile.click();
			Thread.sleep(5000);
			String MainWindow=driver.getWindowHandle();
			Set<String>allWindowHandles=driver.getWindowHandles();
			for( String Handle:allWindowHandles){
				System.out.println("All windows available are :"+Handle);
				driver.switchTo().window(Handle);
				Thread.sleep(7000);
				WebElement Browse=driver.findElement(By.xpath("(//*[.='Browse'])[1]"));
				Actions action=new Actions(driver);
				action.click(Browse).build().perform();
				log.debug("Clicking on Browse button");
				Thread.sleep(5000);
				
				Runtime.getRuntime().exec("C:\\FunctionalTestAutomation\\SupportingFiles\\AutoITexeFile\\NewArtWorkUpload.exe");
				log.debug("Calling AutoIT file Function to Upload Supporting/Artwork File");
				Thread.sleep(10000);
				driver.switchTo().window(MainWindow);
			}
			
			
			
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
	}
	
	public static String WindowHeaderClose_Child(){
		try{
			/*String ParentWindow=driver.getWindowHandle();
			System.out.println("The Parent Window name is :"+ParentWindow);
			Set<String>allWindows=driver.getWindowHandles();
			String LastWindow="";
			for(String Handle:allWindows){
				driver.switchTo().window(Handle);
				System.out.println("All window Handles are :"+Handle);
				LastWindow=Handle;
				driver.switchTo().window(LastWindow).close();*/
			WebElement Close=driver.findElement(By.xpath("(//button[@name='close'])[2]"));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", Close);
			
			
		}
		catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
		
	}
	
	
	public static String Description_Duplicate_JobTaskMap(){
		try {
			WebElement Description=driver.findElement(By.xpath("(//textarea[@name='reason'])[3]"));
			Description.sendKeys(TestData);
			Thread.sleep(5000);
			
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			 
	
		}
		return "Pass";
		
		
	}
	
	public static String Description_ByPass_JobTaskMap(){
		try {
			WebElement Description=driver.findElement(By.xpath("(//textarea[@name='reason'])[2]"));
			Description.sendKeys(TestData);
			Thread.sleep(5000);
			
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			 
	
		}
		return "Pass";
		
	}
	public static String UploadINDD(){
		try {
			WebElement Browse=driver.findElement(By.xpath("//*[.='Browse']"));
			Actions action=new Actions(driver);
			action.click(Browse).build().perform();
			log.debug("Clicking on Browse button");
			Thread.sleep(5000);
			
			Runtime.getRuntime().exec("C:\\FunctionalTestAutomation\\SupportingFiles\\AutoITexeFile\\INDDPreview.exe");
			log.debug("Calling AutoIT file Function to Upload Supporting/Artwork File");
			
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
	}
	public static String UploadAI(){
		try {
			WebElement Browse=driver.findElement(By.xpath("//*[.='Browse']"));
			Actions action=new Actions(driver);
			action.click(Browse).build().perform();
			log.debug("Clicking on Browse button");
			Thread.sleep(5000);
			
			Runtime.getRuntime().exec("C:\\FunctionalTestAutomation\\SupportingFiles\\AutoITexeFile\\AIPreview.exe");
			log.debug("Calling AutoIT file Function to Upload Supporting/Artwork File");
			
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
	}
	
	public static String UploadEPS(){
		try {
			WebElement Browse=driver.findElement(By.xpath("//*[.='Browse']"));
			Actions action=new Actions(driver);
			action.click(Browse).build().perform();
			log.debug("Clicking on Browse button");
			Thread.sleep(5000);
			
			Runtime.getRuntime().exec("C:\\FunctionalTestAutomation\\SupportingFiles\\AutoITexeFile\\EPSPreview.exe");
			log.debug("Calling AutoIT file Function to Upload Supporting/Artwork File");
			
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String UploadGIF(){
		try {
			WebElement Browse=driver.findElement(By.xpath("//*[.='Browse']"));
			Actions action=new Actions(driver);
			action.click(Browse).build().perform();
			log.debug("Clicking on Browse button");
			Thread.sleep(5000);
			
			Runtime.getRuntime().exec("C:\\FunctionalTestAutomation\\SupportingFiles\\AutoITexeFile\\GIFPreview.exe");
			log.debug("Calling AutoIT file Function to Upload Supporting/Artwork File");
			
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String UploadPSD(){
		try {
			WebElement Browse=driver.findElement(By.xpath("//*[.='Browse']"));
			Actions action=new Actions(driver);
			action.click(Browse).build().perform();
			log.debug("Clicking on Browse button");
			Thread.sleep(5000);
			
			Runtime.getRuntime().exec("C:\\FunctionalTestAutomation\\SupportingFiles\\AutoITexeFile\\PSDPreview.exe");
			log.debug("Calling AutoIT file Function to Upload Supporting/Artwork File");
			
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String UploadTIF(){
		try {
			WebElement Browse=driver.findElement(By.xpath("//*[.='Browse']"));
			Actions action=new Actions(driver);
			action.click(Browse).build().perform();
			log.debug("Clicking on Browse button");
			Thread.sleep(5000);
			
			Runtime.getRuntime().exec("C:\\FunctionalTestAutomation\\SupportingFiles\\AutoITexeFile\\TIFPreview.exe");
			log.debug("Calling AutoIT file Function to Upload Supporting/Artwork File");
			
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String UsersIFrame(){
		System.out.println("Frame is Called");
		try{
			//WebElement element=dr.findElement(By.xpath("//form[@action='/User/Edit/0']"));
			driver.switchTo().frame(0);
			log.debug("Switching to Frame");
			Thread.sleep(3500);
		}catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
	}
	public static String ClickPage() throws InterruptedException{
		try{
		WebElement Element=driver.findElement(By.xpath("//main[@class='content-area inframe']"));
		Element.click();
		log.debug("Clicking on the Page");
		Thread.sleep(3000);
		}catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		
		return "Pass";
		
		
	}
	
	public static String RadioButton_NoAccess(){
		try {
			getWebElement(Element).click();
			Thread.sleep(3000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		
		return "Pass";
	}
	
	public static String RadioButton_ReadOnly(){
		try {
			getWebElement(Element).click();
			Thread.sleep(3000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		
		return "Pass";
	}
	
	public static String RadioButton_FullAccess(){
		try {
			getWebElement(Element).click();
			Thread.sleep(3000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		
		return "Pass";
	}
	public static String ClickOnParentWindow() throws InterruptedException{
		WebElement ParentWindowDOM=driver.findElement(By.xpath("//div[@class='modal ng-scope in']"));
		WebDriverWait wait =new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(ParentWindowDOM));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",ParentWindowDOM );
		Thread.sleep(3000);
		return "Pass";
		
	}
	public static String ClearInputText_TrackerRepositoryGrid(){
		try {
			
			getWebElement(Element).clear();
			log.debug("Clearing the text in Tracker/Repository Grid search box");
			Thread.sleep(5000);
		}catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
	}
	public static String ClearInputText_MyTaskGrid(){
		try {
			
			getWebElement(Element).clear();
			log.debug("Clear the text value in MyTaskGridSearch Box");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String ClearInputText_GroupTaskGrid(){
		try {
			
			getWebElement(Element).clear();
			log.debug("Clear the input text value in the GroupTasks Grid search Box");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String ClearInputText_AdminModulePageGrids(){
		try {
			
			getWebElement(Element).clear();
			log.debug("Calling ClearInputText_AdminModulePageGrids function");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String ClearInputText_ConfigurationModulePagesGrids(){
		try {
			
			getWebElement(Element).clear();
			log.debug("Calling ClearInputText_ConfigurationModulePagesGrids function");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
	}
	public static String PageScrollDownByElement() throws Exception{
		try{
		WebElement element= getWebElement(Element,0);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		log.debug("Calling PageScrollDownByElement function");
		Thread.sleep(4000);
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		}catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
	}
	
	public static String MyTasks_ClickPartNumber(){
		try {
			
			getWebElement(Element,0).sendKeys(TestData);
			Thread.sleep(4000);
			log.debug("Entering the TestData value in MyTasks SearchBox");
			
			
			getWebElement(Element,1).click();
			log.debug("Clicking on Search Button in MyTasks Grid ");
			Thread.sleep(5000);
			
			WebElement PartNumber=getWebElement(Element,2);
			boolean status=PartNumber.isEnabled();
			System.out.println("PartNumber is Enabled :"+status);
			if(status==true){
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();",PartNumber );
			}
			Thread.sleep(5000);
			
			log.debug("Clicking on the PartNumber");
			//Thread.sleep(4000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			log.error("The error is due to : " +e);
		}
		return "Pass";
		
	}
	
	public static String Routing_BtnSubmit(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on Routing Customcontrol submit button");
			//Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		}
	public static String Routing_BtnCancel(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on Routing Customcontrol cancel button");
			//Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String Routing_BtnSave(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on Routing Customcontrol Save Button");
			//Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	
	public static String GroupTaskSearch_SelectRow(){
		try {
			//explicitWait(0);
			getWebElement(Element,0).sendKeys(TestData);
			log.debug("Enter searchdata in GroupTask Search Box");
			Thread.sleep(3000);
			//explicitWait(1);
			getWebElement(Element,1).click();
			log.debug("Clicking on Search Button of GroupTaskSearch");
			Thread.sleep(3000);
			//explicitWait(2);
			getWebElement(Element,2).click();
			log.debug("Selecting the GridRow of GroupTask Grid");
			Thread.sleep(5000);
			
			
		}catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
		
	}
	
	public static String GridSearchTrackerRepository_ClickPartNumber(){
		
		try {
			
			getWebElement(Element,0).sendKeys(TestData);
			log.debug("Enter SearchData in Tracker/Repository Grid");
			Thread.sleep(2000);
			
			getWebElement(Element,1).click();
			log.debug("Clicking on SearchButton of Tracker and Repository Grids");
			Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", getWebElement(Element,2));
			//getWebElement(Element,2).click();
			log.debug("Clicking on PartNumber in Tracker or Repository Grids");
			Thread.sleep(3000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
		
	}
	
	
	
	public static String GridSearch_CC_TrackerView(){
		
		try {
			
			getWebElement(Element,0).sendKeys(TestData);
			log.debug("Entering SearchData in Customcontrol gridsearch box in Trackerview");
			Thread.sleep(2000);
			
			getWebElement(Element,1).click();
			log.debug("Clicking SearchButton of Customcontrol in TrackerView");
			Thread.sleep(3000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		
		return "Pass";
	}
	
	
	public static String ManageData_AddManageData() throws InterruptedException{
		try{
		WebElement AddManageData=driver.findElement(By.linkText("Add Managed Data"));
		AddManageData.click();
		log.debug("Clicking on AddManageData Button in ManageData Window");
		Thread.sleep(5000);
		}catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String ManageData_BulkUpload() throws InterruptedException{
		try{
		WebElement BulkUpload=driver.findElement(By.xpath("//a[@id='BulkUploadBtn']"));
		BulkUpload.click();
		Thread.sleep(3000);
		WebElement ChooseFile=driver.findElement(By.xpath("//input[@name='files']"));
		ChooseFile.click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\FunctionalTestAutomation\\SupportingFiles\\AutoITexeFile\\UploadManageData.exe");
		Thread.sleep(5000);
		
		
		log.debug("Clicking on ManageData_BulkUpload link");
		Thread.sleep(5000);
		}catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String ManageData_DownloadTemplate() throws InterruptedException{
		try{
		WebElement DownloadTemplate=driver.findElement(By.xpath("//*[.='Download Template']"));
		DownloadTemplate.click();
		log.debug("Clicking on DownloadTemplate link in ManageData Window");
		Thread.sleep(5000);
		}catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	
	public static String AddNew_User(){
		try{
		WebElement Addnew=driver.findElement(By.linkText("Create User"));
		Addnew.click();
		log.debug("Clicking on Addnew link in Create User Window.");
		}
		catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	
	
	public static  String Identify_PartNumber(){
		try{
		String PartNumber="";
			WebElement PartNumberObj=driver.findElement(By.xpath("//*[.='PartNumber']"));
			
			boolean ElementStatus=PartNumberObj.isDisplayed();
			System.out.println("Element is Displayed :"+ElementStatus);
			if(ElementStatus==true){
			WebElement PartNumberValue=driver.findElement(By.xpath("//*[.='PartNumber']/following-sibling::span[1]"));
			String UniquePartNumber=PartNumberValue.getText();
			PartNumber=UniquePartNumber;
		
			}
			return PartNumber;
		}catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			}
	}	
	
	public static String EditUser_Tabs(){
		
		try {
			WebElement Tab=driver.findElement(By.linkText(LocatorValue));
			Tab.click();
			Thread.sleep(4000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	public static String UserUpload() throws InterruptedException{
		
		try{
		WebElement UserUpload=driver.findElement(By.linkText("Upload Users"));
		UserUpload.click();
		log.debug("Clicking on BulkUser Upload link in Users Grid Window");
		Thread.sleep(4000);
		WebElement Browse=driver.findElement(By.xpath(".//*[@id='files_1']"));
		Browse.click();
		log.debug("Clicking on Browse Link in UserUpload Window");
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\FunctionalTestAutomation\\SupportingFiles\\AutoITexeFile\\UploadUser.exe");
		Thread.sleep(5000);
		WebElement Upload=driver.findElement(By.xpath("//input[@name='btnUploadMaster']"));
		Upload.click();
		log.debug("Clicking on Upload Button");
		Thread.sleep(4000);
		
		WebElement Ok=driver.findElement(By.xpath("//input[@name='Ok']"));
		Ok.click();
		log.debug("Clicking on Ok Button in a Popup Window");
		Thread.sleep(4000);
		}
		catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		
		return "Pass";
		
	}
	
	public static String LinkItem_RowButton(){
		try {
			WebDriverWait wait=new WebDriverWait(driver,90);
			wait.until(ExpectedConditions.elementToBeClickable(getWebElement(Element)));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", getWebElement(Element));
			//getWebElement(Element).click();
			log.debug("Clicking on LinkItem Row Button");
			//Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		
		return "Pass";
	}
	
	public static String LinkItem_FormButton(){
		try {
			
			
			getWebElement(Element).click();
			log.debug("Clicking on LinkItem_ from Button");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		
		
		return "Pass";
	}
	
	public static String LinkItem_GroupButton(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on LinkItem_GroupButton");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		return "Pass";
	}
	
	public static String ExecuteBulkRequest_Button(){
		try {
			
			getWebElement(Element).click();
			log.debug("Clicking on ExecuteBulkRequest Button");
			Thread.sleep(5000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		
		return "Pass";
	}
	
	
	
	
	public static String Addnew_Configuration() throws InterruptedException{
		try{
		WebElement Element=null;
		WebElement Addnew=driver.findElement(By.xpath("//*[.='Add New']"));
		Addnew.click();
		Thread.sleep(4000);
		}catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
		}
		return "Pass";
		
		
	}
	
	
	
	public static String MasterData_Cancel(){
		/*
		 * Cancel Button in Create MasterData, Edit MasterData, Delete MasterData 
	
		 */
		try{
		WebElement Cancel=driver.findElement(By.linkText("Cancel"));
		Cancel.click();
		Thread.sleep(4000);
		}catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
		}
		return "Pass";
		
	}
	
	
	
	
	
	public static String SearchBox_ConfigurationPages(){
		
		try {
			WebElement SearchBox_ConfigurationPages=driver.findElement(By.xpath("//input[@class='form-control filter']"));
			SearchBox_ConfigurationPages.sendKeys(TestData);
			Thread.sleep(3000);
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
		}
		return "Pass";
		
	}
	public static String Verify_SearchResults_InAuditGrids(){
		
		
		try {
			
			WebElement SearchBox_Audit=driver.findElement(By.xpath("//input[@name='grid_search_input']"));
			WebElement SearchButton_Audit=driver.findElement(By.xpath("//button[@name='grid_search_button']"));
			//Thread.sleep(3000);
			//WebDriverWait wait=new WebDriverWait(driver,90);
			//wait.until(ExpectedConditions.visibilityOf(SearchBox_Audit)).sendKeys(TestData);
			SearchBox_Audit.sendKeys(TestData);
			Thread.sleep(1000);
			//WebDriverWait wait1=new WebDriverWait(driver,90);
			//wait1.until(ExpectedConditions.visibilityOf(SearchButton_Audit));
			//JavascriptExecutor js=(JavascriptExecutor)driver;
			//js.executeScript("arguments[0].click();",SearchButton_Audit);
			SearchButton_Audit.click();
			Thread.sleep(2000);
			
		} catch(Exception t){
			//t.printStackTrace();
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
	
		}
		
		
		
		return ("Pass");
		
		
	}
	
	public static String WaitUntill(){
		try{
			
				WebElement PartNumberObj=driver.findElement(By.xpath("//*[.='PartNumber']"));
				
				boolean ElementStatus=PartNumberObj.isDisplayed();
				System.out.println("Element is Displayed :"+ElementStatus);
				if(ElementStatus==true){
				WebElement PartNumberValue=driver.findElement(By.xpath("//*[.='PartNumber']/following-sibling::span[1]"));
				WebDriverWait wait=new WebDriverWait(driver,60);
				wait.until(ExpectedConditions.visibilityOf(PartNumberValue));
				//String UniquePartNumber=PartNumberValue.getText();
				//PartNumber=UniquePartNumber;
			
				}
				
		}catch(Exception t){
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
		}
		return "Pass";
	}
	
	public static String DownloadFile(){
		try{
		WebElement Downloadfile=driver.findElement(By.xpath("//a[.='Download File']"));
		Downloadfile.click();
		}
		catch(Exception t){
			 Error=t.getMessage();
			 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
			 return("Failed - Unable to find the Element :"+Element);
			
		}
		return "Pass";
		
		
	}
	
	public static String Menu(){
		try{
			
			WebElement Menu= driver.findElement(By.linkText(LocatorValue));
			Menu.click();
			}
			catch(Exception t){
				 Error=t.getMessage();
				 log.error( "TestCase: "  +TestCaseID+   "TestStep: " +TestStepID +  "Keyword : "+Keyword +"\n"+"Error :" +Error);
				 return("Failed - Unable to find the Element :"+Element);
				
			}
			return "Pass";
	}
	/*
	public static String explicitWait() throws Exception {
		
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.visibilityOf(getWebElement(Element)));
		
		return "Pass";
	}
	
	public static String explicitWait(int index) throws Exception {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(getWebElement(Element,index)));
		return "Pass";
	}
	
	public static String WaitUntillExpectedCondition() throws Exception{
		WebDriverWait wait=new WebDriverWait(driver,90);
		wait.until(ExpectedConditions.elementToBeClickable(getWebElement(Element)));
		return "Pass";
	}
	
	public static String WaitUntillExpectedCondition(int index) throws Exception{
		WebDriverWait wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.elementToBeClickable(getWebElement(Element,index)));
		//wait.until(ExpectedConditions.j)
		return "Pass";
	}
	
	
	*/
	
	

	
	
	public static WebElement getLocator(String LocatorType, String LocatorValue) throws Exception{
		if (LocatorType.toLowerCase().equals("xpath"))
		{
			//System.out.println("Keyword value in xpath:" +Keyword);
			if(Keyword.toLowerCase().trim().equals("dropdownvalue"))
			{
				//System.out.println("xpath Generation for DropdownValue is called");
				log.debug("xpath Generation for DropdownValue is called");
				return driver.findElement(By.xpath(XpathGenerationMethod.GetXpathForDropdownValue(Keyword, TestData)));
				
				
			}
			else if(Keyword.toLowerCase().trim().equals("routing_btnsubmit")){
				//System.out.println("xpath Generation for Routing_BtnSubmit is called");
				log.debug("xpath Generation for Routing_BtnSubmit is called");
				return driver.findElement(By.xpath(XpathGenerationMethod.GetXpathForRouting_Buttons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("downloadcustomcontrol_upload")){
				//System.out.println("xpath Generation for DownloadCustomControl_Upload is Called");
				log.debug("xpath Generation for DownloadCustomControl_Upload is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.GetXpathForDownloadCustomControl_Buttons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("downloadcustomcontrol_sendmail")){
				//System.out.println("xpath Generation for DownloadCustomControl_Sendmail is Called");
				log.debug("xpath Generation for DownloadCustomControl_Sendmail is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.GetXpathForDownloadCustomControl_Buttons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("downloadcustomcontrol_download")){
				//System.out.println("xpath Generation for DownloadCustomControl_Download is called");
				log.debug("xpath Generation for DownloadCustomControl_Download is called");
				return driver.findElement(By.xpath(XpathGenerationMethod.GetXpathForDownloadCustomControl_Buttons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("downloadcustomcontrol_makeinactive")){
				//System.out.println("xpath Generation for DownloadCustomControl_MakeInactive is Called");
				log.debug("xpath Generation for DownloadCustomControl_MakeInactive is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.GetXpathForDownloadCustomControl_Buttons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("downloadcustomcontrol_edit")){
				//System.out.println("xpath Generation for DownloadCustomControl_Edit is called");
				log.debug("xpath Generation for DownloadCustomControl_Edit is called");
				return driver.findElement(By.xpath(XpathGenerationMethod.GetXpathForDownloadCustomControl_Buttons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("assigntome_grouptaskgrid")){
				//System.out.println("xpath Generation for AssignToMe_GroupTaskGrid is Called");
				log.debug("xpath Generation for AssignToMe_GroupTaskGrid is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.GetXpathForGroupTaskGridFunctions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("downloadfiles_grouptasksgrid")){
				//System.out.println("xpath Generation for DownloadFiles_GroupTasksGrid is Called");
				log.debug("xpath Generation for DownloadFiles_GroupTasksGrid is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.GetXpathForGroupTaskGridFunctions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("downloadfiles_mytasksgrid")){
				//System.out.println("xpath Generation for DownloadFiles_MyTasksGrid is called");
				log.debug("xpath Generation for DownloadFiles_MyTasksGrid is called");
				return driver.findElement(By.xpath(XpathGenerationMethod.GetXpathForMyTaskGridFunctions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("edit_grouptasksgrid")){
				//System.out.println("xpath Generation for Edit_GroupTasksGrid is called");
				log.debug("xpath Generation for Edit_GroupTasksGrid is called");
				return driver.findElement(By.xpath(XpathGenerationMethod.GetXpathForGroupTaskGridFunctions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("edit_mytasksgrid")){
				//System.out.println("xpath Generation for Edit_MyTasksGrid is Called");
				log.debug("xpath Generation for Edit_MyTasksGrid is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.GetXpathForMyTaskGridFunctions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("exporttoexcel_grouptasksgrid")){
				//System.out.println("xpath Generation for ExportToExcel_GroupTasksGrid is Called");
				log.debug("xpath Generation for ExportToExcel_GroupTasksGrid is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.GetXpathForGroupTaskGridFunctions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("exporttoexcel_mytasksgrid")){
				//System.out.println("xpath Generation for ExportToExcel_MyTasksGrid is called");
				log.debug("xpath Generation for ExportToExcel_MyTasksGrid is called");
				return driver.findElement(By.xpath(XpathGenerationMethod.GetXpathForMyTaskGridFunctions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("reassign_grouptasksgrid")){
				//System.out.println("xpath Generation for ReAssign_GroupTasksGrid is Called");
				log.debug("xpath Generation for ReAssign_GroupTasksGrid is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.GetXpathForGroupTaskGridFunctions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("reassign_mytaskgrid")){
				//System.out.println("xpath Generation for ReAssign_MyTaskGrid is Called");
				log.debug("xpath Generation for ReAssign_MyTaskGrid is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.GetXpathForMyTaskGridFunctions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("routing_btnsave")){
				//System.out.println("xpath Generation for Routing_BtnSave is called");
				log.debug("xpath Generation for Routing_BtnSave is called");
				return driver.findElement(By.xpath(XpathGenerationMethod.GetXpathForRouting_Buttons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("routing_btncancel")){
				//System.out.println("xpath Generation for Routing_BtnCancel is called");
				log.debug("xpath Generation for Routing_BtnCancel is called");
				return driver.findElement(By.xpath(XpathGenerationMethod.GetXpathForRouting_Buttons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("jobtaskmap_edit")){
				//System.out.println("xpath Generation for jobtaskmap_edit is Called");
				log.debug("xpath Generation for jobtaskmap_edit is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.JobTaskMap_Buttons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("jobtaskmap_delete")){
				//System.out.println("xpath Generation for jobtaskmap_delete is Called");
				log.debug("xpath Generation for jobtaskmap_delete is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.JobTaskMap_Buttons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("jobtaskmap_ganttchart")){
				//System.out.println("xpath Generation for jobtaskmap_ganttchart is Called");
				log.debug("xpath Generation for jobtaskmap_ganttchart is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.JobTaskMap_Buttons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("jobtaskmap_description")){
				//System.out.println("xpath Generation for jobtaskmap_description is Called");
				log.debug("xpath Generation for jobtaskmap_description is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.JobTaskMap_Buttons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("customcontrolactionbuttons_update")){
				//System.out.println("xpath Generation for customcontrolactionbuttons_update is Called");
				log.debug("xpath Generation for customcontrolactionbuttons_update is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.GetXpathFor_CCActionButtons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("customcontrolactionbuttons_cancel")){
				//System.out.println("xpath Generation for customcontrolactionbuttons_cancel is Called");
				log.debug("xpath Generation for customcontrolactionbuttons_cancel is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.GetXpathFor_CCActionButtons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("customcontrolactionbuttons_submit")){
				//System.out.println("xpath Generation for customcontrolactionbuttons_submit is Called");
				log.debug("xpath Generation for customcontrolactionbuttons_submit is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.GetXpathFor_CCActionButtons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("handling_windowalert_yes")){
				//System.out.println("xpath Generation for handling_windowalert_yes is Called");
				log.debug("xpath Generation for handling_windowalert_yes is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.Handling_AlertButtons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("handling_windowalert_no")){
				//System.out.println("xpath Generation for handling_windowalert_no is Called");
				log.debug("xpath Generation for handling_windowalert_no is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.Handling_AlertButtons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("handling_windowalert_cancel")){
				//System.out.println("xpath Generation for handling_windowalert_cancel is Called");
				log.debug("xpath Generation for handling_windowalert_cancel is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.Handling_AlertButtons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("handling_windowalert_ok")){
				//System.out.println("xpth Generation for handling_windowalert_ok is Called");
				log.debug("xpth Generation for handling_windowalert_ok is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.Handling_AlertButtons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("windowheader_refresh")){
				//System.out.println("xpath Generation for windowheader_refresh is Called");
				log.debug("xpath Generation for windowheader_refresh is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.WindowHeader_Icons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("windowheader_close")){
				//System.out.println("xpath Generation for windowheader_close is Called");
				log.debug("xpath Generation for windowheader_close is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.WindowHeader_Icons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("repository_statefilter_active")){
				//System.out.println("xpath Generation for repository_statefilter_active is Called");
				log.debug("xpath Generation for repository_statefilter_active is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.StateFilter_RepositoryFunctions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("repository_statefilter_locked")){
				//System.out.println("xpath Generation for repository_statefilter_locked is Called");
				log.debug("xpath Generation for repository_statefilter_locked is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.StateFilter_RepositoryFunctions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("tracker_statefilter_overdue")){
				//System.out.println("xpath Generation for tracker_statefilter_overdue is Called");
				log.debug("xpath Generation for tracker_statefilter_overdue is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.StateFilter_TrackerFunctions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("tracker_statefilter_lessthanhrs")){
				//System.out.println("xpath Generation for tracker_statefilter_lessthanhrs is Called");
				log.debug("xpath Generation for tracker_statefilter_lessthanhrs is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.StateFilter_TrackerFunctions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("tracker_statefilter_ontime")){
				//System.out.println("xpath Generation for tracker_statefilter_ontime is Called");
				log.debug("xpath Generation for tracker_statefilter_ontime is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.StateFilter_TrackerFunctions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("tracker_statefilter_hold")){
				//System.out.println("xpath Generation for tracker_statefilter_hold is Called");
				log.debug("xpath Generation for tracker_statefilter_hold is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.StateFilter_TrackerFunctions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("grouptasks_statefilter_overdue")){
				//System.out.println("xpath Generation for grouptasks_statefilter_overdue is Called");
				log.debug("xpath Generation for grouptasks_statefilter_overdue is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.StateFilter_GroupTaskFunctions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("grouptasks_statefilter_lessthanhrs")){
				//System.out.println("xpath Generation for grouptasks_statefilter_lessthanhrs is Called");
				log.debug("xpath Generation for grouptasks_statefilter_lessthanhrs is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.StateFilter_GroupTaskFunctions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("grouptasks_statefilter_ontime")){
				//System.out.println("xpath Generation for grouptasks_statefilter_ontime is Called");
				log.debug("xpath Generation for grouptasks_statefilter_ontime is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.StateFilter_GroupTaskFunctions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("grouptasks_statefilter_hold")){
				//System.out.println("xpath Generation for grouptasks_statefilter_hold is Called");
				log.debug("xpath Generation for grouptasks_statefilter_hold is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.StateFilter_GroupTaskFunctions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("mytasks_statefilter_overdue")){
				//System.out.println("xpath Generation for mytasks_statefilter_overdue is Called");
				log.debug("xpath Generation for mytasks_statefilter_overdue is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.StateFilter_MyTasksFunctions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("mytasks_statefilter_lessthanhrs")){
				//System.out.println("xpath Generation for mytasks_statefilter_lessthanhrs is Called");
				log.debug("xpath Generation for mytasks_statefilter_lessthanhrs is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.StateFilter_MyTasksFunctions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("mytasks_statefilter_ontime")){
				//System.out.println("xpath Generation for mytasks_statefilter_ontime is Called");
				log.debug("xpath Generation for mytasks_statefilter_ontime is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.StateFilter_MyTasksFunctions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("mytasks_statefilter_hold")){
				//System.out.println("xpath Generation for mytasks_statefilter_hold is Called");
				log.debug("xpath Generation for mytasks_statefilter_hold is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.StateFilter_MyTasksFunctions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("mytasks_gridfilter")){
				//System.out.println("xpath Generation for mytasks_gridfilter is Called");
				log.debug("xpath Generation for mytasks_gridfilter is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.MyTasks_GridFilter_ActionButtons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("mytasksgridfilter_defaultbutton")){
				//System.out.println("xpath Generation for mytasksgridfilter_defaultbutton is Called");
				log.debug("xpath Generation for mytasksgridfilter_defaultbutton is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.MyTasks_GridFilter_ActionButtons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("mytasksgridfilter_applybutton")){
				//System.out.println("xpath Generation for mytasksgridfilter_applybutton is Called");
				log.debug("xpath Generation for mytasksgridfilter_applybutton is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.MyTasks_GridFilter_ActionButtons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("mytasksgridfilter_clearbutton")){
				//System.out.println("xpath Generation for mytasksgridfilter_clearbutton is Called");
				log.debug("xpath Generation for mytasksgridfilter_clearbutton is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.MyTasks_GridFilter_ActionButtons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("mytasksgridfilter_savebutton")){
				//System.out.println("xpath Generation for mytasksgridfilter_savebutton is Called");
				log.debug("xpath Generation for mytasksgridfilter_savebutton is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.MyTasks_GridFilter_ActionButtons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("grouptasks_gridfilter")){
				//System.out.println("xpath Generation for grouptasks_gridfilter is Called");
				log.debug("xpath Generation for grouptasks_gridfilter is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.GroupTasks_GridFilter_ActionButtons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("grouptasksgridfilter_defaultbutton")){
				//System.out.println("xpath Generation for grouptasksgridfilter_defaultbutton is Called");
				log.debug("xpath Generation for grouptasksgridfilter_defaultbutton is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.GroupTasks_GridFilter_ActionButtons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("grouptasksgridfilter_applybutton")){
				//System.out.println("xpath Generation for grouptasksgridfilter_applybutton is Called");
				log.debug("xpath Generation for grouptasksgridfilter_applybutton is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.GroupTasks_GridFilter_ActionButtons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("grouptasksgridfilter_clearbutton")){
				//System.out.println("xpath Generation for grouptasksgridfilter_clearbutton is Called");
				log.debug("xpath Generation for grouptasksgridfilter_clearbutton is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.GroupTasks_GridFilter_ActionButtons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("grouptasksgridfilter_savebutton")){
				//System.out.println("xpath Generation for grouptasksgridfilter_savebutton is Called");
				log.debug("xpath Generation for grouptasksgridfilter_savebutton is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.GroupTasks_GridFilter_ActionButtons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("trackerrepository_gridfilter")){
				//System.out.println("xpath Generation for trackerrepository_gridfilter is Called");
				log.debug("xpath Generation for trackerrepository_gridfilter is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.TrackerRepository_GridFilter_ActionButtons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("trackerrepositorygridfilter_defaultbutton")){
				//System.out.println("xpath Generation for trackerrepositorygridfilter_defaultbutton is Called");
				log.debug("xpath Generation for trackerrepositorygridfilter_defaultbutton is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.TrackerRepository_GridFilter_ActionButtons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("trackerrepositorygridfilter_applybutton")){
				//System.out.println("xpath Generation for trackerrepositorygridfilter_applybutton is Called");
				log.debug("xpath Generation for trackerrepositorygridfilter_applybutton is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.TrackerRepository_GridFilter_ActionButtons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("trackerrepositorygridfilter_clearbutton")){
				//System.out.println("xpath Generation for trackerrepositorygridfilter_clearbutton is Called");
				log.debug("xpath Generation for trackerrepositorygridfilter_clearbutton is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.TrackerRepository_GridFilter_ActionButtons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("trackerrepositorygridfilter_savebutton")){
				//System.out.println("xpath Generation for trackerrepositorygridfilter_savebutton is Called");
				log.debug("xpath Generation for trackerrepositorygridfilter_savebutton is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.TrackerRepository_GridFilter_ActionButtons(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("roleprofileactivate")){
				//System.out.println("xpath Generation for roleprofileactivate is Called");
				log.debug("xpath Generation for roleprofileactivate is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.RoleProfile_Functions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("roleprofiledeactivate")){
				//System.out.println("xpath Generation for roleprofiledeactivate is Called");
				log.debug("xpath Generation for roleprofiledeactivate is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.RoleProfile_Functions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("roleprofile_edituser_closebutton")){
				//System.out.println("xpath Generation for roleprofile_edituser_closebutton is Called");
				log.debug("xpath Generation for roleprofile_edituser_closebutton is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.RoleProfile_Functions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("roleprofile_edituser_deleteuser")){
				//System.out.println("xpath Generation for roleprofile_edituser_deleteuser is Called");
				log.debug("xpath Generation for roleprofile_edituser_deleteuser is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.RoleProfile_Functions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("roleprofile_edituser_adduserstorp")){
				//System.out.println("xpath Generation for roleprofile_edituser_adduserstorp is Called");
				log.debug("xpath Generation for roleprofile_edituser_adduserstorp is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.RoleProfile_Functions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("roleprofile_editwindow_selectall_link")){
				//System.out.println("xpath Generation for roleprofile_editwindow_selectall_link is Called");
				log.debug("xpath Generation for roleprofile_editwindow_selectall_link is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.RoleProfile_Functions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("roleprofile_editwindow_submit")){
				//System.out.println("xpath Generation for roleprofile_editwindow_submit is Called");
				log.debug("xpath Generation for roleprofile_editwindow_submit is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.RoleProfile_Functions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("roleprofile_editwindow_cancel")){
				//System.out.println("xpath Generation for roleprofile_editwindow_cancel is Called");
				log.debug("xpath Generation for roleprofile_editwindow_cancel is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.RoleProfile_Functions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("roleprofile_edituser")){
				//System.out.println("xpath Generation for roleprofile_edituser is Called");
				log.debug("xpath Generation for roleprofile_edituser is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.RoleProfile_Functions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("roleprofile_edit")){
				//System.out.println("xpath Generation for roleprofile_edit is Called");
				log.debug("xpath Generation for roleprofile_edit is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.RoleProfile_Functions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("roleprofile_addnew")){
				//System.out.println("xpath Generation for roleprofile_addnew is Called");
				log.debug("xpath Generation for roleprofile_addnew is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.RoleProfile_Functions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("roleprofile_exporttoexcel")){
				//System.out.println("xpath Generation for roleprofile_addnew is Called");
				log.debug("xpath Generation for roleprofile_addnew is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.RoleProfile_Functions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("edit_managedata")){
				//System.out.println("xpath Generation for edit_managedata is Called");
				log.debug("xpath Generation for edit_managedata is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.ManageData_Functions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("editattributes_managedata")){
				//System.out.println("xpath Generation for editattributes_managedata is Called");
				log.debug("xpath Generation for editattributes_managedata is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.ManageData_Functions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("editmanagedata_cancel")){
				//System.out.println("xpath Generation for editmanagedata_cancel is Called");
				log.debug("xpath Generation for editmanagedata_cancel is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.ManageData_Functions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("editmanagedata_update")){
				//System.out.println("xpath Generation for editmanagedata_update is Called");
				log.debug("xpath Generation for editmanagedata_update is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.ManageData_Functions(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("clearinputtext_trackerrepositorygrid")){
				//System.out.println("xpath Generation for clearinputtext_trackerrepositorygrid is Called");
				log.debug("xpath Generation for clearinputtext_trackerrepositorygrid is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.ClearTextKeywords(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("clearinputtext_mytaskgrid")){
				//System.out.println("xpath Generation Method for clearinputtext_mytaskgrid is Called");
				log.debug("xpath Generation Method for clearinputtext_mytaskgrid is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.ClearTextKeywords(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("clearinputtext_grouptaskgrid")){
				//System.out.println("xpath Generation for clearinputtext_grouptaskgrid is Called");
				log.debug("xpath Generation for clearinputtext_grouptaskgrid is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.ClearTextKeywords(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("clearinputtext_adminmodulepagegrids")){
				//System.out.println("xpath Generation for clearinputtext_adminmodulepagegrids is Called");
				log.debug("xpath Generation for clearinputtext_adminmodulepagegrids is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.ClearTextKeywords(Keyword)));
			}
			else if(Keyword.toLowerCase().trim().equals("clearinputtext_configurationmodulepagesgrids")){
				//System.out.println("xpath Generation for clearinputtext_configurationmodulepagesgrids is Called");
				log.debug("xpath Generation for clearinputtext_configurationmodulepagesgrids is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.ClearTextKeywords(Keyword)));
			}
			
			else if(Keyword.toLowerCase().trim().equals("dropdownvalueattributes")){
				//System.out.println("xpath Generation for DropdownValue Attributes is called");
				log.debug("xpath Generation for DropdownValue Attributes is called");
				return driver.findElement(By.xpath(XpathGenerationMethod.GetXpathForManageDataAttributes(Keyword)));
			}else
			{
				//System.out.println("Xpath Expression for other Elements is called");
				log.debug("Xpath Expression for other Elements is called");
				return driver.findElement(By.xpath(XpathGenerationMethod.GetXpathForElements(Keyword, LocatorValue)));
				
			}
		}
		else
			throw new Exception("Unknown locator type '" + LocatorType + "'");
		
		
		
	}
	
	
	public static WebElement getLocator(String LocatorType, String LocatorValue,int index) throws Exception
	{
		if(LocatorType.toLowerCase().trim().equals("xpath")){
			
		    // System.out.println("Keyword value in xpath: "+Keyword);
		     log.debug("Keyword value in xpath: "+Keyword);
			if(Keyword.toLowerCase().trim().equals("clickandselectsingleselectdropdown"))
			{
				//System.out.println("xpath Generation for ClickAndSelectSingleSelectDropdown is called");
				log.debug("xpath Generation for ClickAndSelectSingleSelectDropdown is called");
				return driver.findElement(By.xpath(XpathGenerationMethod.ClickAndSelectSingleSelectDropdown(Keyword, LocatorValue, TestData, index)));
				}
			else if(Keyword.toLowerCase().trim().equals("clickandselectmultiselectdropdown")){
					//System.out.println("xpath Generation for Clickandselectmultiselectdropdown is called");
					log.debug("xpath Generation for Clickandselectmultiselectdropdown is called");
					return driver.findElement(By.xpath(XpathGenerationMethod.ClickAndSelectMultiselectDropdown(Keyword, LocatorValue, TestData, index)));
				}
			else if(Keyword.toLowerCase().trim().equals("clickandselectmultiselectwithattributes")){
					//System.out.println("xpath Generation for clickandselectmultiselectwithattributes is called");
					log.debug("xpath Generation for clickandselectmultiselectwithattributes is called");
					return driver.findElement(By.xpath(XpathGenerationMethod.ClickAndSelectMultiselectDropdownWithAttributes(Keyword, LocatorValue, TestData, index)));
					
				}
			else if(Keyword.toLowerCase().trim().equals("mytasks_clickpartnumber")){
					//System.out.println("xpath Generation for mytaskgridsearch_clickpartnumber is called");
					log.debug("xpath Generation for mytaskgridsearch_clickpartnumber is called");
					return driver.findElement(By.xpath(XpathGenerationMethod.MyTaskSearch(Keyword, LocatorValue, TestData, index)));
				}
			else if(Keyword.toLowerCase().trim().equals("grouptasksearch_selectrow")){
					//System.out.println("xpath Generation for GroupTaskSearch_SelectRow is called");
					log.debug("xpath Generation for GroupTaskSearch_SelectRow is called");
					return driver.findElement(By.xpath(XpathGenerationMethod.GroupTaskSearch(Keyword, LocatorValue, TestData, index)));
				}
			else if(Keyword.toLowerCase().trim().equals("downloadcc_category")){
					//System.out.println("xpath Generation for DownloadCC_Category is called");
					log.debug("xpath Generation for DownloadCC_Category is called");
					return driver.findElement(By.xpath(XpathGenerationMethod.DownloadCC_CategoryDropdown(Keyword, LocatorValue, TestData, index)));
				}
			else if(Keyword.toLowerCase().trim().equals("gridsearchtrackerrepository_clickpartnumber")){
					//System.out.println("xpath Generation for gridsearchtrackerrepository_clickpartnumber is called");
					log.debug("xpath Generation for gridsearchtrackerrepository_clickpartnumber is called");
					return driver.findElement(By.xpath(XpathGenerationMethod.GridSearchFor_TrackerRepository(Keyword, LocatorValue, TestData, index)));
				}
			else if(Keyword.toLowerCase().trim().equals("gridsearch_cc_trackerview")){
					//System.out.println("xpath Generation for GridSearch_CC_TrackerView is Called");
					log.debug("xpath Generation for GridSearch_CC_TrackerView is Called");
					return driver.findElement(By.xpath(XpathGenerationMethod.GridSearch_CC_TrackerView(Keyword, LocatorValue, TestData, index)));
				}
			else if(Keyword.toLowerCase().trim().equals("grouptask_groupfilter")){
				//System.out.println("xpath Generation for grouptask_groupfilter is Called");
				log.debug("xpath Generation for grouptask_groupfilter is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.GroupTasks_GroupFilter(Keyword, LocatorValue, TestData, index)));
			}
			else if(Keyword.toLowerCase().trim().equals("clickedituser")){
				//System.out.println("xpath Generation for clickedituser is Called");
				log.debug("xpath Generation for clickedituser is Called");
				return driver.findElement(By.xpath(XpathGenerationMethod.ClickEditUser(Keyword, LocatorValue, TestData, index)));
			}
		}
		return null;
	}
	


	
	
	
	public static WebElement getWebElement(String locator) throws Exception{
		//System.out.println("locator data:-"+locator+"is---"+LocatorType);
		return getLocator("xpath",LocatorValue);
		//LocatorDetails
		//return getLocator(LocatorDetails);
		


	}
	
	public static WebElement getWebElement(String locator,int index) throws Exception{
		//System.out.println("locator data:-"+locator+"is---"+LocatorType);
		return getLocator("xpath",LocatorValue,index);
		//LocatorDetails
		//return getLocator(LocatorDetails);
		


	}

}
