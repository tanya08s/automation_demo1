package SHOAD_testCases;

import org.testng.annotations.Test;

import Utils.CoreTestIntegration;

import SHOAD_pageFunctions.loginPageFunc;
import SHOAD_pageFunctions.page;

public class loginTestCaseImplementation extends CoreTestIntegration{

	@Test
	public void loginWithEitherIncorrectData() {
		
		page.pageToShoad();
		loginPageFunc.loginWithIncorrectPassword();
		loginPageFunc.ClickSignIn();
		loginPageFunc.verifyAuthenticationError();
		loginPageFunc.loginWithIncorrectUserId();
		loginPageFunc.ClickSignIn();
		loginPageFunc.verifyAuthenticationError();
		
	}
	
	@Test
	public void loginWithBothIncorrectData() {
		
		page.pageToShoad();
		loginPageFunc.loginWithIncorrectData();
		loginPageFunc.ClickSignIn();
		loginPageFunc.verifyAuthenticationError();
		
	}
	
    @Test
    public void loginWithEitherBlankData() {
		
		page.pageToShoad();
		loginPageFunc.loginWithBlankUserId();
		loginPageFunc.ClickSignIn();
		loginPageFunc.verifyBlankDataError();
		loginPageFunc.loginWithBlankPassword();
		loginPageFunc.ClickSignIn();
		loginPageFunc.verifyBlankDataError();
		
	}
    
    @Test
	public void loginWithBothBlankData() {
		
		page.pageToShoad();
		loginPageFunc.ClickSignIn();
		loginPageFunc.verifyBlankDataError();
		
	}
    
    @Test
	public void loginWithUnauthorizedUser() {
		
		page.pageToShoad();
		loginPageFunc.loginWithUnauthorizedUser();
		loginPageFunc.ClickSignIn();
		loginPageFunc.verifyUnauthorizedUserError();
		
	}
    
    @Test
   	public void loginWithCorrectData() {
   		
   		page.pageToShoad();
   		loginPageFunc.loginWithCorrectData();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   	}
    
    @Test
   	public void VerifyLogoutMessage() {
   		
   		page.pageToShoad();
   		loginPageFunc.loginWithCorrectData();
   		loginPageFunc.ClickSignIn();
   		loginPageFunc.waitForDashboardUrl();
   		loginPageFunc.logout();
   		loginPageFunc.waitForLoginUrl();
   		loginPageFunc.verifyLogoutMessage();
   	}
	
}
