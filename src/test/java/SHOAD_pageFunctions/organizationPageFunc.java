package SHOAD_pageFunctions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SHOAD_objectRepository.dashboardPage;
import SHOAD_objectRepository.loginPage;
import SHOAD_objectRepository.organizationPage;
import Utils.CoreActions;
import junit.framework.Assert;

public class organizationPageFunc extends CoreActions {
	
	protected WebDriver driver2;
	protected static String OrganizationKeys;
	protected static String organizationId;
	protected static String accessKey;
	protected static String updatedOrgName;
	protected static String OrgName;
	private static Logger logger= Logger.getLogger(organizationPageFunc.class);
    public organizationPageFunc(WebDriver driver)
    {
        super(driver);
        this.driver2=driver;
    }
    
    public static void checkDefaultUrl() {
    	
    	String changed_url = "organization";
    	String currentUrl= driver.getCurrentUrl();
    	Assert.assertTrue(currentUrl+" is shown",currentUrl.contains(changed_url));
    }
    
    public static void checkPageHeading() {
    	
    	String heading = currentelement(organizationPage.organizationPageHeading);
    	Assert.assertTrue(heading+" is shown",heading.contains(prop.getProperty("pageHeading")));
    }
    
    public static void checkCreateOrganizationUrl() {
    	
    	String changed_url = "create";
    	String currentUrl= driver.getCurrentUrl();
    	Assert.assertTrue(currentUrl+" is shown",currentUrl.contains(changed_url));
    }
    
    public static void waitForOrganizationUrl() {
    	
    	 String changed_url = "create";
         WebDriverWait wait = new WebDriverWait(driver, 30);
         wait.until(ExpectedConditions.urlContains(changed_url));
    }
    
    public static void navigateToCreateOrganizationPage(){
    	
    	 waitForVisibility(organizationPage.addOrganizationBtn);
    	 click(organizationPage.addOrganizationBtn);
    	
    }
    public static void createOrganization() {
    	
    	waitForVisibility(organizationPage.organizationName);
    	String random= generateRandom(2);
    	OrgName=prop.getProperty("orgName")+random;
    	enter_value(organizationPage.organizationName,OrgName);
    	enter_value(organizationPage.organizationEmail,prop.getProperty("orgEmail"));
    	enter_value(organizationPage.firstName,prop.getProperty("firstName"));
    	enter_value(organizationPage.lastName,prop.getProperty("lastName"));
    	enter_value(organizationPage.phone,prop.getProperty("phone"));
    	
    	Assert.assertTrue(currentelement(organizationPage.cancel).contains("Cancel"));
    	Assert.assertTrue(currentelement(organizationPage.addBtnText).contains("Add"));
    	
    }
    
    public static void clickAdd() {
    	
    	elementclick(organizationPage.add);
    }
    
    public static void clickCancel() {
    	
    	elementclick(organizationPage.cancel);
    	
    }
    
   public static void checkViewOrganizationLink() {
    	
    	click(organizationPage.viewOrganization);
    	String locator = "//div[@class='MuiCardHeader-root css-faujvq']//div//h5[contains(text(),'%s')]";
    	String val=OrgName;
    	sleep(3);
    	boolean check=verifyElementPresence(By.xpath(String.format(locator,val)));
    	Assert.assertTrue(check);
    }

    public static void getOrganizationIdAndAccessKey() {
    	
    	OrganizationKeys=currentelement(organizationPage.organizationKeys);
    	String[] arrayOfKeys = OrganizationKeys.split("\\|", 2);
    	String a=arrayOfKeys[0];
    	String b=arrayOfKeys[1];
    	String[] arrayOfIdValues=a.split(":");
    	String[] arrayOfKeyValues=b.split(":");
    	String a1=arrayOfIdValues[1];
        String b1=arrayOfKeyValues[1];
        organizationId=a1.trim();
        accessKey=b1.trim();
        System.out.println(organizationId);
        System.out.println(accessKey);
    }
    
    
    public static void verifySuccessMessage() {
   	 
    	waitForVisibility(loginPage.alertDiv);
    	
    	boolean check=verifyAvailableAndVisible(loginPage.alertDivSuccessIcon);
    	Assert.assertTrue(check);
    	
    	Assert.assertTrue(currentelement(organizationPage.alertHeading).contains(prop.getProperty("successAlertHeading")));
    	Assert.assertTrue(currentelement(organizationPage.alertSubHeading).contains(prop.getProperty("successAlertSubHeading")));
    	Assert.assertTrue(currentelement(organizationPage.alertSubHeading).contains(prop.getProperty("orgName")));
    	
    	getOrganizationIdAndAccessKey();
    	
    	Assert.assertTrue(currentelement(organizationPage.organizationKeys).contains("Access Key"));
    	Assert.assertTrue(currentelement(organizationPage.organizationKeys).contains("Organization ID"));
    	
    	Assert.assertTrue(currentelement(organizationPage.viewOrganization).contains("View Organization"));
    	

    	boolean checkCloseIcon=verifyAvailableAndVisible(organizationPage.closeIcon);
    	Assert.assertTrue(checkCloseIcon);
    	
    	logger.info("success message data verified");
    	
    	checkViewOrganizationLink();

    }
    
    public static void alertCloseBtn() {
    	
    	click(organizationPage.closeAlert);
    	boolean check=verifyElementAbsent(loginPage.alertDiv);
    	Assert.assertTrue(check);
    }
    
    public static void createOrganizationAndVerifyURL() {
    	
    	checkDefaultUrl();
   		checkPageHeading();
   		navigateToCreateOrganizationPage();
   		waitForOrganizationUrl();
   		checkPageHeading();
   		createOrganization();
  		clickAdd();
    }
    
    public static void editOrganization() {
    	
    	checkPageHeading();
    	String locator = "(//div[@class='MuiCardHeader-content css-11qjisw']//h5[contains(text(),'%s')])[1]/../../..//div[3]//button[1]";
    	String val="QA 1Cr";
    	waitForVisibility(By.xpath(String.format(locator,val)));
    	elementclick(By.xpath(String.format(locator,val)));
    	dashboardPageFunc.waitAndCheckUrl("edit");
    	checkPageHeading();
    	String randomChar=generateRandom(1);
        updatedOrgName=getAttribute(organizationPage.organizationName,"value")+" "+randomChar;
    	enter_value(organizationPage.organizationName," "+randomChar);
    	enter_value(organizationPage.organizationEmail,generateRandom(1));
    	enter_value(organizationPage.firstName," "+generateRandom(1));
    	enter_value(organizationPage.lastName," "+generateRandom(1));
    	elementclick(organizationPage.updateBtn);
    	dashboardPageFunc.waitAndCheckUrl("organization");
    	
    	
    }
    
    public static void AlertCloseBtn() {
    	
    	elementclick(organizationPage.closeEditAlert);
    	Assert.assertTrue(verifyElementAbsent(loginPage.alertDiv));
        refresh();
        Assert.assertTrue(verifyElementAbsent(loginPage.alertDiv));

    } 

    public static void verifyEditOrgSuccessMsg() {
    	
        waitForVisibility(loginPage.alertDiv);
    	
    	boolean check=verifyAvailableAndVisible(loginPage.alertDivSuccessIcon);
    	Assert.assertTrue(check);
    	
    	Assert.assertTrue(currentelement(organizationPage.alertHeading).contains(prop.getProperty("editOrgHeading")));
    	Assert.assertTrue(currentelement(loginPage.alertDivDescription).contains(updatedOrgName));
    	
    	boolean checkCloseIcon=verifyAvailableAndVisible(organizationPage.closeIcon);
    	Assert.assertTrue(checkCloseIcon);
    	
    	logger.info("edit organization success message verified");
    	AlertCloseBtn();
    }
    
    public static void verifyErrorMessage(String errorDescription) {
    	
        waitForVisibility(loginPage.alertDiv);
    	
    	boolean check=verifyAvailableAndVisible(loginPage.alertDivErrorIcon);
    	Assert.assertTrue(check);
    	
    	Assert.assertTrue(currentelement(organizationPage.alertHeading).contains(prop.getProperty("supportUserOrgErrorHeading")));
    	Assert.assertTrue(currentelement(loginPage.alertDivDescription).contains(errorDescription));
    	boolean checkCloseIcon=verifyAvailableAndVisible(organizationPage.closeIcon);
    	Assert.assertTrue(checkCloseIcon);
    	
    	logger.info("error message verified");
    	AlertCloseBtn();
    }
    
    
    public static void createOrgError() {
    	
    	verifyErrorMessage(prop.getProperty("supportUserCreateOrgErrorSubHeading"));
    }
    
    public static void editOrgError() {
    	
    	verifyErrorMessage(prop.getProperty("supportUserEditOrgErrorSubHeading"));
    }
    
    public static void verifyOrgCardContent(){
    	
    	 dashboardPageFunc.verifyCardContent(prop.getProperty("firstCardHeading"),prop.getProperty("firstCardOrgName"),prop.getProperty("firstCardOrgEmail"),prop.getProperty("firstCardOrgPhone")); 
    	 dashboardPageFunc.verifyCardDetails();
    
    }
    
   
    
   
    
    
    
    
    
    
    
    
    
    
}
