package SHOAD_pageFunctions;

import Utils.CoreActions;
import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.log4j.Logger;

import SHOAD_objectRepository.loginPage;

public class loginPageFunc extends CoreActions {
	
	protected WebDriver driver1;
	private static Logger logger= Logger.getLogger(loginPageFunc.class);
    public loginPageFunc(WebDriver driver)
    {
        super(driver);
        this.driver1=driver;
    }
    
    public static void sendUsername(String text)
    {
    	waitForVisibility(loginPage.userId);
    	clear_data(loginPage.userId);
        enter_value(loginPage.userId,text);
    }
    
    public static void sendPassword(String text)
    {
        clear_data(loginPage.password);
        enter_value(loginPage.password,text);
    }
    
    public static void ClickSignIn()
    {
        click(loginPage.signinBtn);
        sleep(3); 
    }
    
    public static void loginWithIncorrectPassword() {
		 
		sendUsername(prop.getProperty("SHOADUsername"));
		sendPassword(prop.getProperty("SHOADIncorrectPassword")); 
	}
    
    public static void loginWithIncorrectUserId() {
		
		sendUsername(prop.getProperty("SHOADIncorrectUsername"));
		sendPassword(prop.getProperty("SHOADPassword")); 
	}
    
    public static void loginWithIncorrectData() {
		 
		sendUsername(prop.getProperty("SHOADIncorrectUsername"));
		sendPassword(prop.getProperty("SHOADIncorrectPassword")); 
	}
    
    public static void loginWithBlankUserId() {
		
    	clearWebField(loginPage.userId);
		sendPassword(prop.getProperty("SHOADPassword")); 
	}
    
    public static void loginWithBlankPassword() {
    	
    	clearWebField(loginPage.password);
		sendUsername(prop.getProperty("SHOADUsername"));
	}
    
    
    
    public static void loginWithUnauthorizedUser() {
		  
		sendUsername(prop.getProperty("username"));
		sendPassword(prop.getProperty("password")); 
	}
    
   public static void waitForDashboardUrl() {
    	
    	String changed_url = "organization";
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains(changed_url));
    } 
   
    public static void waitForLoginUrl() {
   	
   	   String changed_url = "login";
       WebDriverWait wait = new WebDriverWait(driver, 30);
       wait.until(ExpectedConditions.urlContains(changed_url));
    }  

    public static void loginWithCorrectData() {
    	
	    sendUsername(prop.getProperty("SHOADUsername"));
		sendPassword(prop.getProperty("SHOADPassword"));
	}
    
   public static void loginWithSupportUser() {
    	
	    sendUsername(prop.getProperty("SHOADSupportUser"));
		sendPassword(prop.getProperty("SHOADPassword"));
	}
    
    public static void logout() {
		
    	click(loginPage.logout);
        sleep(3); 
	}
    
    
    public static void verifyAuthenticationError() {
    	 
    	waitForVisibility(loginPage.alertDiv);
    	
    	boolean check=verifyAvailableAndVisible(loginPage.alertDivErrorIcon);
    	Assert.assertTrue(check);
    	
    	String c = currentelement(loginPage.alertDivHeading);
    	Assert.assertTrue(c+" is shown",c.contains(prop.getProperty("alertDivHeading")));
    	
    	String c1 = currentelement(loginPage.alertDivDescription);
    	Assert.assertTrue(c1+" is shown",c1.contains(prop.getProperty("alertDivDescription")));
    	
    	logger.info("Incorrect or missing data error verified successfully");

    }
    
    public static void verifyUnauthorizedUserError() {
   	 
    	waitForVisibility(loginPage.alertDiv);
    	
    	boolean check=verifyAvailableAndVisible(loginPage.alertDivErrorIcon);
    	Assert.assertTrue(check);
    	
    	String c = currentelement(loginPage.alertDivHeading);
    	Assert.assertTrue(c+" is shown",c.contains(prop.getProperty("unauthorizedAlertDivHeading")));
    	
    	String c1 = currentelement(loginPage.alertDivDescription);
    	Assert.assertTrue(c1+" is shown",c1.contains(prop.getProperty("unauthorizedAlertDivDescription")));
    	
    	logger.info("unauthorized user error verified successfully");

    }
    
    public static void verifyBlankDataError() {
      	 
    	waitForVisibility(loginPage.alertDiv);
    	
    	boolean check=verifyAvailableAndVisible(loginPage.alertDivErrorIcon);
    	Assert.assertTrue(check);
    	
    	String c = currentelement(loginPage.alertDivHeading);
    	Assert.assertTrue(c+" is shown",c.contains(prop.getProperty("alertDivHeading")));
    	
    	String c1 = currentelement(loginPage.alertDivDescription);
    	Assert.assertTrue(c1+" is shown",c1.contains(prop.getProperty("apiErrorAlertDivDescription")));
    	
    	logger.info("unauthorized user error verified successfully");

    }
    
    public static void verifyLogoutMessage() {
      	 
    	waitForVisibility(loginPage.alertDiv);
    	
    	boolean check=verifyAvailableAndVisible(loginPage.alertDivSuccessIcon);
    	Assert.assertTrue(check);
    	
    	String c = currentelement(loginPage.alertDivHeading);
    	Assert.assertTrue(c+" is shown",c.contains(prop.getProperty("logoutAlertDivHeading")));
    	
    	String c1 = currentelement(loginPage.alertDivDescription);
    	Assert.assertTrue(c1+" is shown",c1.contains(prop.getProperty("logoutAlertDivDescription")));
    	
    	logger.info("user logged out successfully");

    }
  
}
