package SHOAD_pageFunctions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SHOAD_objectRepository.loginPage;
import SHOAD_objectRepository.mlsPage;
import SHOAD_objectRepository.organizationPage;
import Utils.CoreActions;
import junit.framework.Assert;

public class mlsPageFunc  extends CoreActions{
	
	protected WebDriver driver4;
	private static Logger logger= Logger.getLogger(mlsPageFunc.class);
	
	protected static String MLSKeys;
	protected static String MLSName;
	protected static String MLSId;
	protected static String MLSAccessKey;
	protected static String updatedMLSName;
	
	public mlsPageFunc(WebDriver driver){
	        super(driver);
	        this.driver4=driver;
    }
	
   
    public static void waitForCreateMLSUrl() {
    	
   	    String changed_url = "create";
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains(changed_url));
   }
    
    public static void checkPageHeading() {
    	
    	String heading = currentelement(mlsPage.mlsHeading);
    	Assert.assertTrue(heading+" is shown",heading.contains(prop.getProperty("mlspageHeading")));
    }
    
    public static void createMLS() {
    	
    	dashboardPageFunc.navigateToMLSOption();
    	dashboardPageFunc.waitAndCheckUrl("mls");
    	checkPageHeading();
    	click(mlsPage.addMLSBtn);
    	waitForCreateMLSUrl();
    	checkPageHeading();
    	waitForVisibility(mlsPage.mlsName);
    	String random= generateRandom(2);
        MLSName=prop.getProperty("mlsName")+random;
    	enter_value(mlsPage.mlsName,MLSName);
    	enter_value(mlsPage.mlsEmail,prop.getProperty("mlsEmail"));
    	enter_value(mlsPage.firstName,prop.getProperty("mlsfirstName"));
    	enter_value(mlsPage.lastName,prop.getProperty("mlslastName"));
    	enter_value(mlsPage.phone,prop.getProperty("mlsphone"));
    	enter_value(mlsPage.webhookURL,prop.getProperty("webhookURL"));
    	enter_value(mlsPage.webhookHeaderName,prop.getProperty("webhookHeaderName"));
    	enter_value(mlsPage.webhookHeaderValue,prop.getProperty("webhookHeaderValue"));
    	
    	elementclick(mlsPage.addMLs);
    	
    }
    
      public static void getMLSIdAndAccessKey() {
    	
    	MLSKeys=currentelement(mlsPage.MLSKeys);
    	String[] arrayOfKeys = MLSKeys.split("\\|", 2);
    	String a=arrayOfKeys[0];
    	String b=arrayOfKeys[1];
    	String[] arrayOfIdValues=a.split(":");
    	String[] arrayOfKeyValues=b.split(":");
    	String a1=arrayOfIdValues[1];
        String b1=arrayOfKeyValues[1];
        MLSId=a1.trim();
        MLSAccessKey=b1.trim();
        System.out.println("mls id: "+MLSId);
        System.out.println("access key: "+MLSAccessKey);
    }

    public static void MLSSuccessMsg() {
    	
        waitForVisibility(loginPage.alertDiv);
    	
    	boolean check=verifyAvailableAndVisible(loginPage.alertDivSuccessIcon);
    	Assert.assertTrue(check);
    	
    	Assert.assertTrue(currentelement(organizationPage.alertHeading).contains(prop.getProperty("mlsSuccessAlertHeading")));
    	Assert.assertTrue(currentelement(organizationPage.alertSubHeading).contains(MLSName+" "+prop.getProperty("mlsSuccessAlertSubHeading")));
    	
    	
    	getMLSIdAndAccessKey();
        Assert.assertTrue(currentelement(mlsPage.viewMLS).contains("View MLS"));
    	

    	boolean checkCloseIcon=verifyAvailableAndVisible(organizationPage.closeIcon);
    	Assert.assertTrue(checkCloseIcon);
    	
    	sleep(2);
    	click(mlsPage.viewMLS);
    	sleep(2);
    	String locator = "//div[@class='MuiCardHeader-root css-faujvq']//div//h5[contains(text(),'%s')]"; 
    	sleep(4);
    	String val=MLSName;
    	System.out.println(MLSName);
    	waitForVisibility(By.xpath(String.format(locator,val)));
    	boolean check1=verifyElementPresence(By.xpath(String.format(locator,val)));
    	Assert.assertTrue(check1);
    	
    	logger.info("success message for MLS verified");
    	
    }
    
    public static void editMLS() {
    	
    	dashboardPageFunc.navigateToMLSOption();
    	dashboardPageFunc.waitAndCheckUrl("mls");
    	checkPageHeading();
    	String locator = "//div[@class='MuiCardHeader-root css-faujvq']//div//h5[contains(text(),'%s')][1]/../../..//div[3]//button[1]";
    	String val=prop.getProperty("editMLSName");
    	waitForVisibility(By.xpath(String.format(locator,val)));
    	elementclick(By.xpath(String.format(locator,val)));
    	dashboardPageFunc.waitAndCheckUrl("edit");
    	checkPageHeading();
    	String randomChar=generateRandom(1);
        updatedMLSName=getAttribute(mlsPage.mlsName,"value")+" "+randomChar;
    	enter_value(mlsPage.mlsName," "+randomChar);
    	enter_value(mlsPage.mlsEmail,generateRandom(1));
    	enter_value(mlsPage.firstName," "+generateRandom(1));
    	enter_value(mlsPage.lastName," "+generateRandom(1));
    	elementclick(organizationPage.updateBtn);
    	dashboardPageFunc.waitAndCheckUrl("mls");
    	
    }
    
    public static void verifyMLSEditSuccessMsg() {
    	
    	waitForVisibility(loginPage.alertDiv);
     	
     	boolean check=verifyAvailableAndVisible(loginPage.alertDivSuccessIcon);
     	Assert.assertTrue(check);
     	
     	Assert.assertTrue(currentelement(organizationPage.alertHeading).contains(prop.getProperty("editMLSHeading")));
     	Assert.assertTrue(currentelement(loginPage.alertDivDescription).contains(updatedMLSName));
     	
     	boolean checkCloseIcon=verifyAvailableAndVisible(organizationPage.closeIcon);
     	Assert.assertTrue(checkCloseIcon);
     	
     	logger.info("edit mls success message verified");
     	organizationPageFunc.AlertCloseBtn();
    }
    
    
   public static void verifyCreateMLSErrorMessage() {
     	
	   organizationPageFunc.verifyErrorMessage(prop.getProperty("supportUserCreateMLSErrorSubHeading"));
    }
   
   public static void verifyEditMLSErrorMessage() {
    	
	   organizationPageFunc.verifyErrorMessage(prop.getProperty("supportUserEditMLSErrorSubHeading"));
    }
   
   public static void verifyMLSCardContent() {
	   
	   dashboardPageFunc.verifyCardContent(prop.getProperty("MLSfirstCardHeading"),prop.getProperty("MLSfirstCardName"),prop.getProperty("MLSfirstCardEmail"),prop.getProperty("MLSfirstCardPhone"));
	   dashboardPageFunc.verifyCardDetails();
   
   }

    

}
