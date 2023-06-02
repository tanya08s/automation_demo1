package SHOAD_testCases;

import org.testng.annotations.Test;

import SHOAD_pageFunctions.loginPageFunc;
import SHOAD_pageFunctions.organizationPageFunc;
import SHOAD_pageFunctions.page;
import Utils.CoreTestIntegration;

public class organizationTestCaseImplementation extends CoreTestIntegration {
	
	@Test
	public void createOrganization() {
		
		page.pageToShoad();
   		loginPageFunc.loginWithCorrectData();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   		organizationPageFunc.createOrganizationAndVerifyURL();
   		organizationPageFunc.verifySuccessMessage();
	}
	
	@Test
	public void editOrganization() {
		
		page.pageToShoad();
   		loginPageFunc.loginWithCorrectData();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   		organizationPageFunc.editOrganization();
   		organizationPageFunc.verifyEditOrgSuccessMsg();
	}
	
	@Test
	public void CreateOrganizationError() {
		
		page.pageToShoad();
   		loginPageFunc.loginWithSupportUser();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   		organizationPageFunc.createOrganizationAndVerifyURL();
   		organizationPageFunc.createOrgError();
	}
	
	@Test
	public void EditOrganizationError() {
		
		page.pageToShoad();
   		loginPageFunc.loginWithSupportUser();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   		organizationPageFunc.editOrganization();
   		organizationPageFunc.editOrgError();
	}
	
	@Test
	public void verifyCardContent() {
		
		page.pageToShoad();
   		loginPageFunc.loginWithCorrectData();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   		organizationPageFunc.verifyOrgCardContent();
	}
}
