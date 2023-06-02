package SHOAD_pageFunctions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SHOAD_objectRepository.applicationPage;
import SHOAD_objectRepository.loginPage;
import SHOAD_objectRepository.mlsPage;
import SHOAD_objectRepository.organizationPage;
import Utils.CoreActions;
import junit.framework.Assert;

public class applicationPageFunc extends CoreActions{
	
    protected WebDriver driver5;
    protected static String certificationValue;
    protected static String statusValue;
	
	private static Logger logger= Logger.getLogger(applicationPageFunc.class);
    public applicationPageFunc(WebDriver driver)
    {
        super(driver);
        this.driver5=driver;
    }
    
    public static void verifyCardDetails() {
    	dashboardPageFunc.verifyCardContent(prop.getProperty("AppfirstCardHeading"),prop.getProperty("AppfirstCardName"),prop.getProperty("AppfirstCardEmail"),prop.getProperty("AppfirstCardPhone"));
    }
    
    public static void verifyCardIDDetails() {
    	
    	Assert.assertTrue(verifyStringNotNull(currentelement(applicationPage.status)));
    	Assert.assertTrue(verifyStringNotNull(currentelement(applicationPage.certification)));
    	Assert.assertTrue(verifyStringNotNull(currentelement(applicationPage.orgID)));
    	Assert.assertTrue(verifyStringNotNull(currentelement(applicationPage.appID)));
    }
    
    public static void checkPageHeading() {
    	
    	String heading = currentelement(applicationPage.heading);
    	Assert.assertTrue(heading+" is shown",heading.contains(prop.getProperty("apppageHeading")));
    }
 
    
    public static void certificationToggle(String s) {
    	
    	if(s.equals("Registered")) {
    		elementclick(applicationPage.certificationInput);
        	waitForVisibility(applicationPage.popupDiv);
        	click(applicationPage.popupYes);
        	loadingWait2();
        	Assert.assertTrue(currentelement(applicationPage.certificationValue).contains(prop.getProperty("certificationValue2")));
        	logger.info("certification changed from registered to certified");
    	}
    	else{
    		elementclick(applicationPage.certificationInput);
        	waitForVisibility(applicationPage.popupDiv);
        	click(applicationPage.popupYes);
        	loadingWait2();
        	Assert.assertTrue(currentelement(applicationPage.certificationValue).contains(prop.getProperty("certificationValue1")));
        	logger.info("certification changed from certified to registered");
    	}
    	
    	
    }
    
    public static void statusToggle(String s) {
    	
    	if(s.equals("Inactive")) {
    		elementclick(applicationPage.statusInput);
        	waitForVisibility(applicationPage.popupDiv);
        	click(applicationPage.popupYes);
        	loadingWait2();
        	Assert.assertTrue(currentelement(applicationPage.statusValue).contains(prop.getProperty("statusValue2")));
        	logger.info("status changed from inactive to active");
    	}
    	else {
    		elementclick(applicationPage.statusInput);
        	waitForVisibility(applicationPage.popupDiv);
        	click(applicationPage.popupYes);
        	loadingWait2();
        	Assert.assertTrue(currentelement(applicationPage.statusValue).contains(prop.getProperty("statusValue1")));
        	logger.info("status changed from active to inactive");
    	}
    	
    	
    }
    
    public static void verifyToggleFeature() {
    	
    	certificationToggle(certificationValue);
    	elementclick(applicationPage.back);
    	sleep(2);
    	waitForVisibility(applicationPage.certification);
    	Assert.assertTrue(currentelement(applicationPage.certification).contains(prop.getProperty("certificationValue2")));
    	elementclick(applicationPage.editApp);
    	statusValue=currentelement(applicationPage.statusValue);
    	statusToggle(statusValue);
    	elementclick(applicationPage.back);
    	sleep(2);
    	waitForVisibility(applicationPage.status);
    	Assert.assertTrue(currentelement(applicationPage.status).contains(prop.getProperty("statusValue2")));
    	elementclick(applicationPage.editApp);
    	statusValue=currentelement(applicationPage.statusValue);
    	statusToggle(statusValue);
    	elementclick(applicationPage.back);
    	System.out.println(currentelement(applicationPage.status));
    	sleep(3);
    	waitForVisibility(applicationPage.status);
    	Assert.assertTrue(currentelement(applicationPage.status).contains(prop.getProperty("statusValue3")));
    	elementclick(applicationPage.editApp);
    	certificationValue=currentelement(applicationPage.certificationValue);
    	certificationToggle(certificationValue);
    	elementclick(applicationPage.back);
    	sleep(2);
    	waitForVisibility(applicationPage.certification);
    	Assert.assertTrue(currentelement(applicationPage.certification).contains(prop.getProperty("certificationValue1")));
    	
    	logger.info("toggle feature verified");
    }
    
    public static void verifyToggleErrorCase() {
    	
    	elementclick(applicationPage.editApp);
    	elementclick(applicationPage.statusInput);
    	waitForVisibility(applicationPage.popupDiv);
    	click(applicationPage.popupYes);
    	loadingWait2();
    	Assert.assertTrue(currentelement(applicationPage.statusValue).contains(prop.getProperty("statusValue1")));

        waitForVisibility(loginPage.alertDiv);
    	
    	boolean check=verifyAvailableAndVisible(loginPage.alertDivErrorIcon);
    	Assert.assertTrue(check);
    	
    	Assert.assertTrue(currentelement(organizationPage.alertHeading).contains(prop.getProperty("toggleErrorHeading")));
    	Assert.assertTrue(currentelement(loginPage.alertDivDescription).contains(prop.getProperty("toggleErrorSubHeading")));
    	boolean checkCloseIcon=verifyAvailableAndVisible(organizationPage.closeIcon);
    	Assert.assertTrue(checkCloseIcon);
    	
    	logger.info("error message verified");
    	organizationPageFunc.AlertCloseBtn();
    	elementclick(applicationPage.back);
    	sleep(3);
    	waitForVisibility(applicationPage.status);
    	Assert.assertTrue(currentelement(applicationPage.status).contains(prop.getProperty("statusValue1")));
    	elementclick(applicationPage.editApp);
    	Assert.assertTrue(verifyElementAbsent(loginPage.alertDiv));
    }
    
    public static void verifyEditFunctionality() {
    	
    	Assert.assertTrue(currentelement(applicationPage.editCertification).contains(prop.getProperty("editCertification")));
    	Assert.assertTrue(currentelement(applicationPage.editStatus).contains(prop.getProperty("editStatus")));
    	certificationValue=currentelement(applicationPage.certificationValue);
    	Assert.assertTrue(currentelement(applicationPage.certificationValue).contains(prop.getProperty("certificationValue1")));
    	statusValue=currentelement(applicationPage.statusValue);
    	Assert.assertTrue(currentelement(applicationPage.statusValue).contains(prop.getProperty("statusValue1")));
    	System.out.println(certificationValue);
  
    }
    
    public static void verifyContent() {
    	
    	sleep(3);
    	elementclick(applicationPage.editApp);
    	dashboardPageFunc.waitAndCheckUrl("edit");
    	checkPageHeading();
    	Assert.assertTrue(getAttribute(applicationPage.appName,"value").contains(prop.getProperty("AppfirstCardHeading")));
    	Assert.assertTrue(getAttribute(applicationPage.contactEmail,"value").contains(prop.getProperty("AppfirstCardEmail")));
    	Assert.assertTrue(getAttribute(applicationPage.phone,"value").contains(prop.getProperty("AppfirstCardPhone")));
    	Assert.assertTrue(getAttribute(applicationPage.firstName,"value").contains(prop.getProperty("AppfirstName")));
    	Assert.assertTrue(getAttribute(applicationPage.lastName,"value").contains(prop.getProperty("ApplastName")));
    	Assert.assertTrue(getAttribute(applicationPage.OrgId,"value").contains(prop.getProperty("OrgId")));
    	Assert.assertTrue(getAttribute(applicationPage.AppId,"value").contains(prop.getProperty("AppId")));
    	logger.info("content verified");
    }
    

}
