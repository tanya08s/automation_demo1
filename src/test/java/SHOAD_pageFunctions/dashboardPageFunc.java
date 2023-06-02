package SHOAD_pageFunctions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SHOAD_objectRepository.dashboardPage;
import SHOAD_objectRepository.loginPage;
import Utils.CoreActions;
import junit.framework.Assert;

public class dashboardPageFunc extends CoreActions {
	
	protected WebDriver driver3;
	
	private static Logger logger= Logger.getLogger(dashboardPageFunc.class);
    public dashboardPageFunc(WebDriver driver)
    {
        super(driver);
        this.driver3=driver;
    }
    
    public static void waitAndCheckUrl(String  changed_url) {
    	
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains(changed_url));
    	String currentUrl= driver.getCurrentUrl();
    	Assert.assertTrue(currentUrl+" is shown",currentUrl.contains(changed_url));
    } 
    
   
    public static void verifyNavIcons() {
    	
        waitForVisibility(dashboardPage.nameIcon);
    	
    	Assert.assertTrue(verifyAvailableAndVisible(dashboardPage.nameIcon));
    	Assert.assertTrue(verifyAvailableAndVisible(dashboardPage.dashboardIcon));
    	Assert.assertTrue(verifyAvailableAndVisible(dashboardPage.managementIcon));
    	Assert.assertTrue(verifyAvailableAndVisible(dashboardPage.dataIcon));
    	Assert.assertTrue(verifyAvailableAndVisible(dashboardPage.logoutIcon));
  
    	logger.info("navigation pane icons verified successfully");

    }
    
    public static void verifyNavData() {
    	
    	Assert.assertTrue(currentelement(dashboardPage.userName).contains(prop.getProperty("userName")));
    	Assert.assertTrue(currentelement(dashboardPage.dashboardText).contains(prop.getProperty("dashboardText")));
    	Assert.assertTrue(currentelement(dashboardPage.managementText).contains(prop.getProperty("managementText")));
    	Assert.assertTrue(currentelement(dashboardPage.organizationText).contains(prop.getProperty("organizationText")));
    	Assert.assertTrue(currentelement(dashboardPage.mlsText).contains(prop.getProperty("mlsText")));
    	Assert.assertTrue(currentelement(dashboardPage.applicationText).contains(prop.getProperty("applicationText")));
    	Assert.assertTrue(currentelement(dashboardPage.subscriptionText).contains(prop.getProperty("subscriptionText")));
    	Assert.assertTrue(currentelement(dashboardPage.dataText).contains(prop.getProperty("dataText")));
    	Assert.assertTrue(currentelement(dashboardPage.reportingText).contains(prop.getProperty("reportingText")));
    	Assert.assertTrue(currentelement(dashboardPage.inspectText).contains(prop.getProperty("inspectText")));
    	Assert.assertTrue(currentelement(dashboardPage.logoutText).contains(prop.getProperty("logoutText")));
    	
    	logger.info("navigation pane data verified successfully");
    	
    }
    
    public static void verifyNavLinks() {
    	
    	click(dashboardPage.dashboardText);
    	waitAndCheckUrl("organization");
    	click(dashboardPage.managementDropup);click(dashboardPage.managementDropdown);
    	sleep(2);
    	click(dashboardPage.organizationText);
    	waitAndCheckUrl("organization");
    	click(dashboardPage.mlsText);
    	waitAndCheckUrl("mls");
    	click(dashboardPage.applicationText);
    	waitAndCheckUrl("application");
    	click(dashboardPage.subscriptionText);
    	waitAndCheckUrl("subscription");
    	click(dashboardPage.dataDropup);click(dashboardPage.dataDropdown);
    	sleep(2);
    	click(dashboardPage.reportingText);
    	waitAndCheckUrl("reporting");
    	click(dashboardPage.inspectText);
    	waitAndCheckUrl("inspect");
    	click(dashboardPage.logoutText);
    	waitAndCheckUrl("login");
    	
    	logger.info("navigation pane links and url verified successfully");
  
    }
    
    public static void navigateToMLSOption() {
    	
    	click(dashboardPage.mlsText);
    }
    
    public static void navigateToAppOption() {
    	
    	click(dashboardPage.applicationText);
    }
    
   public static void navigateToSubscriptionOption() {
    	
    	click(dashboardPage.subscriptionText);
    }
   
   public static void navigateToReportingOption() {
   	
   	click(dashboardPage.reportingText);
   }
    
    public static void CardOrder(){
    	
    	sleep(5);
    	List<WebElement> elements  = driver.findElements(dashboardPage.cardTitle);
    	System.out.println(elements.size());
    	List<String> cardTitle = new ArrayList<String>();
    	List<String> cardTitleCopy = new ArrayList<String>();
 
    	for (WebElement element : elements ) {
    		cardTitle.add(element.getText().toString());
        }
    	
       cardTitleCopy.addAll(cardTitle);
       cardTitleCopy.sort(String::compareToIgnoreCase);
       Assert.assertEquals(cardTitle, cardTitleCopy);
       logger.info("card order verified");

    }
    
    public static void verifyCardContent(String title, String name, String email, String phone) {
    	
    	sleep(6);
    	
    	Assert.assertTrue(verifyAvailableAndVisible(dashboardPage.firstCardNameIcon));
    	Assert.assertTrue(verifyAvailableAndVisible(dashboardPage.firstCardEmailIcon));
    	Assert.assertTrue(verifyAvailableAndVisible(dashboardPage.firstCardPhoneIcon));
    	
    	String a =currentelement(dashboardPage.firstCardTitle);
    	System.out.print(a);
    	Assert.assertTrue(currentelement(dashboardPage.firstCardTitle).contains(title));
    	Assert.assertTrue(currentelement(dashboardPage.firstCardName).contains(name));
    	Assert.assertTrue(currentelement(dashboardPage.firstCardEmail).contains(email));
    	Assert.assertTrue(currentelement(dashboardPage.firstCardPhone).contains(phone));
    	
    	Assert.assertTrue(verifyAvailableAndVisible(dashboardPage.firstCardEditIcon));
    	Assert.assertTrue(verifyAvailableAndVisible(dashboardPage.firstCardViewJSONIcon));
    	
    	elementclick(dashboardPage.firstCardViewJSONBtn);
    	Assert.assertTrue(verifyAvailableAndVisible(dashboardPage.ViewJSONCopy));
    	elementclick(dashboardPage.ViewJSONClose);
    	
    	Assert.assertTrue(verifyElementAbsent(dashboardPage.ViewJSONDiv));
    	
    }
    
    public static void verifyCardDetails() {
    	
    	Assert.assertTrue(verifyStringNotNull(currentelement(dashboardPage.firstCardId)));
    	Assert.assertTrue(verifyAvailableAndVisible(dashboardPage.firstCardCopyBtn));
    	click(dashboardPage.firstCardCopyBtn);
    	waitForVisibility(loginPage.alertDiv);
     	
    }
    
    
   
    
   
    
    
    
    
}
