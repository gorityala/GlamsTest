package ReportUtils;

import TestBase.TestBaseClass;

public class ReportUtilTest {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String startTime = TestBaseClass.now("dd-MMMM-yyyy hh.mm.ss aaa");
		
		ReportUtil.startTesting("index", startTime, "Glams48qa", "1.0");
		
		ReportUtil.startSuite("Smoke Suite");
	/*	
		ReportUtil.addKeyword("Navigate to page", "Navigate", "Pass", null);
		ReportUtil.addKeyword("Navigate to page", "Navigate", "Pass", null);
		ReportUtil.addKeyword("Navigate to page", "Navigate", "Pass", null);
		ReportUtil.addKeyword("Navigate to page", "Navigate", "Fail", null);
		ReportUtil.addKeyword("Navigate to page", "Navigate", "Pass", null);
		ReportUtil.addKeyword("Navigate to page", "Navigate", "Pass", null);
        Thread.sleep(60000);
		ReportUtil.addTestCase("TopNavigation", startTime, TestBaseClass.now("dd.MMMM.yyyy hh.mm.ss aaa"), "Pass");

		// For Second Scenarios
		ReportUtil.addKeyword("LoginTo Page", "Navigate", "Pass", null);
		ReportUtil.addKeyword("LoginTo Page", "Navigate", "Pass", null);

		ReportUtil.addKeyword("LoginTo Page", "Navigate", "Pass", null);
		ReportUtil.addKeyword("LoginTo Page", "Navigate", "Pass", null);
		
		ReportUtil.addTestCase("Login", startTime, TestBaseClass.now("dd.MMMM.yyyy hh.mm.ss aaa"), "Pass");

		
		ReportUtil.endSuite();
		ReportUtil.updateEndTime(TestBaseClass.now("dd.MMMM.yyyy hh.mm.ss aaa"));*/

	}

		

	}


