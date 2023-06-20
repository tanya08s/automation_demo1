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
	
	@Test
	public static void checkPaginationFunctionality() {
		page.pageToShoad();
   		loginPageFunc.loginWithCorrectData();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   		dashboardPageFunc.navigateToReportingOption();
   		reportingPageFunc.navigateToRegistrationRequestResults();
	}
	
	@Test
	public static void checkNoResultFoundError() {
		page.pageToShoad();
   		loginPageFunc.loginWithCorrectData();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   		dashboardPageFunc.navigateToReportingOption();
   		reportingPageFunc.verifyNoResultFoundError();
	}
	
	@Test
	public static void checkIncorrectDataResult() {
		page.pageToShoad();
   		loginPageFunc.loginWithCorrectData();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   		dashboardPageFunc.navigateToReportingOption();
   		reportingPageFunc.verifyIncorrectDataResult();
	}
	
	@Test
	public static void checkCalenderFunctionality() {
		page.pageToShoad();
   		loginPageFunc.loginWithCorrectData();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   		dashboardPageFunc.navigateToReportingOption();
   		reportingPageFunc.navigatingToRegistrationRequest();
   		reportingPageFunc.verifyStartDateCalenderFunctionality();
   		reportingPageFunc.verifyEndDateCalenderFunctionality();
	}
	
	@Test
	public static void checkSearch() {
		
		page.pageToShoad();
   		loginPageFunc.loginWithCorrectData();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   		dashboardPageFunc.navigateToReportingOption();
   		reportingPageFunc.navigatingToRegistrationRequest();
   		reportingPageFunc.registrationRequestData();
	}
	
	@Test
	public static void checkRegistrationsSearch() {
		
		page.pageToShoad();
   		loginPageFunc.loginWithCorrectData();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   		dashboardPageFunc.navigateToReportingOption();
   		reportingPageFunc.navigatingToRegistrations();
   		reportingPageFunc.verifyRegistrationsFields();
   		reportingPageFunc.verifyRegistrationsSearchClearButtons();
   		reportingPageFunc.verifyRegistrationsSearchFunctionality();
   		reportingPageFunc.checkRegistrationsTableHeaders();
	}
	
	@Test
	public static void RegistrationsSearchInspect() {
		
		page.pageToShoad();
   		loginPageFunc.loginWithCorrectData();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   		dashboardPageFunc.navigateToReportingOption();
   		reportingPageFunc.navigatingToRegistrations();
   		reportingPageFunc.registrationsSearch();
   	//	reportingPageFunc.checkInspect();
   		reportingPageFunc.checkViewJSON();
   		//reportingPageFunc.checkRegistrationsTableHeaders();
   		
 
	}
}
