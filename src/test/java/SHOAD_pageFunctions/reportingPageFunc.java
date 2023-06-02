package SHOAD_pageFunctions;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import SHOAD_objectRepository.organizationPage;
import SHOAD_objectRepository.reportingPage;
import Utils.CoreActions;
import Utils.JsonManager;
import junit.framework.Assert;

public class reportingPageFunc extends CoreActions{
	
    protected WebDriver driver7;
	protected static JSONObject obj;
	private static Logger logger= Logger.getLogger(reportingPageFunc.class);
    public reportingPageFunc(WebDriver driver)
    {
        super(driver);
        this.driver7=driver;
    }
    
    public static void verifyReportingType() {
    	
    	click(reportingPage.reportType);
    	List<String> elements = new ArrayList<String>();
    	obj=JsonManager.fetch("jsonFilePath","reportingDropdownOptions");
    	elements.add(obj.get("field1").toString());
    	elements.add(obj.get("field2").toString());
    	elements.add(obj.get("field3").toString());
    	elements.add(obj.get("field4").toString());
    	elements.add(obj.get("field5").toString());
    	int count= getElementCount(reportingPage.reportTypeValues);
    	List<String> elementsUI= new ArrayList<String>();
    	List<WebElement> list =currentelements(reportingPage.reportTypeValues);
    	for(int i=0;i<count;i++) {
    		String option=list.get(i).getText();
    		elementsUI.add(option);
    	}
    	if(elements.equals(elementsUI)) {
    		logger.info("report types are matching");
    	}
    	else {
    		logger.info("report types are not matching");
    	}
    			
    }
    
   public static void verifyStatusType() {
        
	    sleep(2);
	    sleep(2);
   	    click(reportingPage.status);
    	List<String> elements = new ArrayList<String>();
    	obj=JsonManager.fetch("jsonFilePath","statusDropdownOptions");
    	elements.add(obj.get("option1").toString());
    	elements.add(obj.get("option2").toString());
    	elements.add(obj.get("option3").toString());
    	int count= getElementCount(reportingPage.statusListValues);
    	List<String> elementsUI= new ArrayList<String>();
    	List<WebElement> list =currentelements(reportingPage.statusListValues);
    	for(int i=0;i<count;i++) {
    		String option=list.get(i).getText();
    		elementsUI.add(option);
    	}
    	if(elements.equals(elementsUI)) {
    		logger.info("status types are matching");
    	}
    	else {
    		logger.info("status types are not matching");
    	}
    	click(reportingPage.statusRequested);
    			
    }
    
    public static void verifyRegistrationRequestFields() {
    	
    	click(reportingPage.reportType);
    	waitForVisibility(reportingPage.registrationRequestOption);
    	click(reportingPage.registrationRequestOption);
    	obj=JsonManager.fetch("jsonFilePath","registrationRequestPlaceholders");
    	Assert.assertTrue(currentelement(reportingPage.reportTypePlaceholder).equals(obj.get("Placeholder1").toString()));
    	Assert.assertTrue(currentelement(reportingPage.appIDPlaceholder).equals(obj.get("Placeholder2").toString()));
    	Assert.assertTrue(currentelement(reportingPage.statusPlaceholder).equals(obj.get("Placeholder3").toString()));
    	Assert.assertTrue(currentelement(reportingPage.registrationReqIDPlaceholder).equals(obj.get("Placeholder4").toString()));
    	Assert.assertTrue(currentelement(reportingPage.registrationIDPlaceholder).equals(obj.get("Placeholder5").toString()));
    	Assert.assertTrue(currentelement(reportingPage.mlsIDPlaceholder).equals(obj.get("Placeholder6").toString()));
    	Assert.assertTrue(currentelement(reportingPage.startDatePlaceholder).equals(obj.get("Placeholder7").toString()));
    	Assert.assertTrue(currentelement(reportingPage.endDatePlaceholder).equals(obj.get("Placeholder8").toString()));
    	Assert.assertFalse(checkIfClickable(reportingPage.clearBtn));
    	Assert.assertFalse(checkIfClickable(reportingPage.searchBtn));
    	logger.info("all placeholders verified");
    	logger.info("search and clear buttons are disabled when all fields are empty");
    }
    
    public static void registrationRequestData() {
    	
    	obj=JsonManager.fetch("jsonFilePath","registrationRequestTestData");
    	
    	enter_value(reportingPage.appId,obj.get("appId").toString());
    	enter_value(reportingPage.registrationRequestId,obj.get("requestRegistrationId").toString());
    	enter_value(reportingPage.registrationId,obj.get("registrationId").toString());
    	enter_value(reportingPage.mlsId,obj.get("mlsId").toString());
    	enter_value(reportingPage.startDate,obj.get("startDate").toString());
    	enter_value(reportingPage.endDate,obj.get("endDate").toString());
    	Assert.assertTrue(checkIfClickable(reportingPage.clearBtn));
    	Assert.assertTrue(checkIfClickable(reportingPage.searchBtn));
    	logger.info("search and clear buttons are enabled after entering data");
 	 }
    
    
    public static void checkTableHeaders() {
    	obj=JsonManager.fetch("jsonFilePath","registrationRequestFieldHeaders");
    	System.out.println(currentelement(reportingPage.JSONheader));
    	System.out.println(obj.get("header1").toString());
    	Assert.assertTrue(currentelement(reportingPage.JSONheader).equals(obj.get("header1").toString()));
		Assert.assertTrue(currentelement(reportingPage.inspectheader).equals(obj.get("header2").toString()));
		Assert.assertTrue(currentelement(reportingPage.registrationReqIDheader).equals(obj.get("header3").toString()));
		Assert.assertTrue(currentelement(reportingPage.statusheader).equals(obj.get("header4").toString()));
		Assert.assertTrue(currentelement(reportingPage.registrationIDheader).equals(obj.get("header5").toString()));
		Assert.assertTrue(currentelement(reportingPage.appIDheader).equals(obj.get("header6").toString()));
		Assert.assertTrue(currentelement(reportingPage.mlsIDheader).equals(obj.get("header7").toString()));
		Assert.assertTrue(currentelement(reportingPage.listingIDheader).equals(obj.get("header8").toString()));
		Assert.assertTrue(currentelement(reportingPage.listingAgentheader).equals(obj.get("header9").toString()));
		Assert.assertTrue(currentelement(reportingPage.listingAgentMLSIDheader).equals(obj.get("header10").toString()));
		Assert.assertTrue(currentelement(reportingPage.address1header).equals(obj.get("header11").toString()));
		Assert.assertTrue(currentelement(reportingPage.createdheader).equals(obj.get("header12").toString()));
		System.out.println("hello");
    }
    public static void checkSearchFunctionality() {
    	
    	sleep(2);sleep(2);
    	click(reportingPage.reportType);
    	sleep(2);
    	waitForVisibility(reportingPage.registrationRequestOption);
    	click(reportingPage.registrationRequestOption);
    	sleep(2);
    	click(reportingPage.status);
    	int count= getElementCount(reportingPage.statusListValues);
    	List<WebElement> list =currentelements(reportingPage.statusListValues);
    	for(int i=1;i<=count;i++) {
    		sleep(2);
    		System.out.println(i);
//    		waitForVisibility(reportingPage.statusListValues);
//    		System.out.println(list.get(i).getText());
    		click(reportingPage.StatusListValues(i));
//    		currentelements(reportingPage.statusListValues).
    		click(reportingPage.searchBtn);
    		waitForVisibility(reportingPage.JSONheader);
    		checkTableHeaders();
    		click(reportingPage.status);
    		System.out.println(count);
    	}
    	
    }
    
    
    
}
