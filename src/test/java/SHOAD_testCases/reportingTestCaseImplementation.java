package SHOAD_testCases;

import org.testng.annotations.Test;

import SHOAD_pageFunctions.dashboardPageFunc;
import SHOAD_pageFunctions.loginPageFunc;
import SHOAD_pageFunctions.page;
import SHOAD_pageFunctions.reportingPageFunc;
import Utils.CoreTestIntegration;

public class reportingTestCaseImplementation extends CoreTestIntegration{
	
	@Test
	public static void verifyReportingDropdown() {
		page.pageToShoad();
   		loginPageFunc.loginWithCorrectData();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   		dashboardPageFunc.navigateToReportingOption();
   		reportingPageFunc.verifyReportingType();
	}
	
	@Test
	public static void verifyRegistrationRequestFields() {
		page.pageToShoad();
   		loginPageFunc.loginWithCorrectData();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   		dashboardPageFunc.navigateToReportingOption();
   		reportingPageFunc.verifyRegistrationRequestFields();
   		reportingPageFunc.verifyStatusType();
   		reportingPageFunc.registrationRequestData();
	}
	
	@Test
	public static void checkSearchFunctionality() {
		page.pageToShoad();
   		loginPageFunc.loginWithCorrectData();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   		dashboardPageFunc.navigateToReportingOption();
   		reportingPageFunc.checkSearchFunctionality();
   
	}
}
