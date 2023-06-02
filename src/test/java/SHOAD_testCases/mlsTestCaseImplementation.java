package SHOAD_testCases;

import org.testng.annotations.Test;

import SHOAD_pageFunctions.dashboardPageFunc;
import SHOAD_pageFunctions.loginPageFunc;
import SHOAD_pageFunctions.mlsPageFunc;
import SHOAD_pageFunctions.organizationPageFunc;
import SHOAD_pageFunctions.page;
import Utils.CoreTestIntegration;

public class mlsTestCaseImplementation extends CoreTestIntegration{
	
	@Test
	public void createMLS() {
		
		page.pageToShoad();
   		loginPageFunc.loginWithCorrectData();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   		mlsPageFunc.createMLS();
   		mlsPageFunc.MLSSuccessMsg();
	}
	
	@Test
	public void editMLS() {
		
		page.pageToShoad();
   		loginPageFunc.loginWithCorrectData();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   		mlsPageFunc.editMLS();
   		mlsPageFunc.verifyMLSEditSuccessMsg();
	}
	
	@Test
	public void verifyCardOrder() {
		
		page.pageToShoad();
   		loginPageFunc.loginWithCorrectData();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   		dashboardPageFunc.navigateToMLSOption();
   		dashboardPageFunc.CardOrder();
	}
	
	@Test
    public void CreateMLSError() {
		
		page.pageToShoad();
   		loginPageFunc.loginWithSupportUser();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   		mlsPageFunc.createMLS();
   		mlsPageFunc.verifyCreateMLSErrorMessage();
	}
	
	@Test
    public void EditMLSError() {
		
		page.pageToShoad();
   		loginPageFunc.loginWithSupportUser();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   		mlsPageFunc.editMLS();
   		mlsPageFunc.verifyEditMLSErrorMessage();
	}
	
	@Test
	public void verifyCardContent() {
		
		page.pageToShoad();
   		loginPageFunc.loginWithCorrectData();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   		dashboardPageFunc.navigateToMLSOption();
   		mlsPageFunc.verifyMLSCardContent();
	}

}
