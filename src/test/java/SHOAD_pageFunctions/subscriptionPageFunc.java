package SHOAD_pageFunctions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import SHOAD_objectRepository.applicationPage;
import SHOAD_objectRepository.subscriptionPage;
import Utils.CoreActions;
import junit.framework.Assert;

public class subscriptionPageFunc extends CoreActions {
	
    protected WebDriver driver6;
	
	private static Logger logger= Logger.getLogger(subscriptionPageFunc.class);
    public subscriptionPageFunc(WebDriver driver)
    {
        super(driver);
        this.driver6=driver;
    }
    
    public static void verifyCardDetails() {
    	dashboardPageFunc.verifyCardContent(prop.getProperty("SubscriptionfirstCardHeading"),prop.getProperty("SubscriptionfirstCardName"),prop.getProperty("SubscriptionfirstCardEmail"),prop.getProperty("SubscriptionfirstCardPhone"));
    }
    
    public static void verifyCardIDDetails() {
    	
    	Assert.assertTrue(verifyStringNotNull(currentelement(applicationPage.status)));
    	Assert.assertTrue(verifyStringNotNull(currentelement(applicationPage.certification)));
    	Assert.assertTrue(verifyStringNotNull(currentelement(applicationPage.orgID)));
    	Assert.assertTrue(verifyStringNotNull(currentelement(applicationPage.appID)));
    	Assert.assertTrue(verifyStringNotNull(currentelement(subscriptionPage.subscriptionID)));
    }
	

}
