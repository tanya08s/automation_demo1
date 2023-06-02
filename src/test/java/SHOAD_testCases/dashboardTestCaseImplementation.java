package SHOAD_testCases;

import org.testng.annotations.Test;

import SHOAD_pageFunctions.*;
import Utils.CoreTestIntegration;

public class dashboardTestCaseImplementation extends CoreTestIntegration{
	
	@Test
	public void verifyNavigationPane() {
		
		page.pageToShoad();
   		loginPageFunc.loginWithCorrectData();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   		dashboardPageFunc.verifyNavIcons();
   		dashboardPageFunc.verifyNavData();
   		dashboardPageFunc.verifyNavLinks();
   		
	}
	@Test
	public void verifyCardOrder() {
		
		page.pageToShoad();
   		loginPageFunc.loginWithCorrectData();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   		dashboardPageFunc.CardOrder();
	}
	
	
	
	
	
	
}
