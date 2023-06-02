package SHOAD_testCases;

import org.testng.annotations.Test;

import SHOAD_pageFunctions.applicationPageFunc;
import SHOAD_pageFunctions.dashboardPageFunc;
import SHOAD_pageFunctions.loginPageFunc;
import SHOAD_pageFunctions.page;
import SHOAD_pageFunctions.subscriptionPageFunc;
import Utils.CoreTestIntegration;

public class subscriptionTestCaseImplementation extends CoreTestIntegration{

	@Test
	public void verifyFirstCard() {
		
		page.pageToShoad();
   		loginPageFunc.loginWithCorrectData();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   		dashboardPageFunc.navigateToSubscriptionOption();
   		subscriptionPageFunc.verifyCardDetails();
   		subscriptionPageFunc.verifyCardIDDetails();
	}
	
	@Test
	public void verifyCardOrder() {
		
		page.pageToShoad();
   		loginPageFunc.loginWithCorrectData();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   		dashboardPageFunc.navigateToSubscriptionOption();
   		dashboardPageFunc.CardOrder();
	}
}
