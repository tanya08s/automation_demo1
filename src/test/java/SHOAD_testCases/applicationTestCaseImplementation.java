package SHOAD_testCases;

import org.testng.annotations.Test;

import SHOAD_pageFunctions.applicationPageFunc;
import SHOAD_pageFunctions.dashboardPageFunc;
import SHOAD_pageFunctions.loginPageFunc;
import SHOAD_pageFunctions.page;
import Utils.CoreTestIntegration;

public class applicationTestCaseImplementation extends CoreTestIntegration{

	@Test
	public void verifyFirstCard() {
		
		page.pageToShoad();
   		loginPageFunc.loginWithCorrectData();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   		dashboardPageFunc.navigateToAppOption();
   		applicationPageFunc.verifyCardDetails();
   		applicationPageFunc.verifyCardIDDetails();
	}
	
	@Test
	public void verifyEditFunctionality() {
		
		page.pageToShoad();
   		loginPageFunc.loginWithCorrectData();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   		dashboardPageFunc.navigateToAppOption();
   		applicationPageFunc.verifyContent();
   		applicationPageFunc.verifyEditFunctionality();
   		applicationPageFunc.verifyToggleFeature();
   		applicationPageFunc.verifyToggleErrorCase();
	}
	
	@Test
	public void verifyCardOrder() {
		
		page.pageToShoad();
   		loginPageFunc.loginWithCorrectData();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   		dashboardPageFunc.navigateToAppOption();
   		dashboardPageFunc.CardOrder();
	}
}
