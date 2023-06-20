package SHOAD_pageFunctions;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SHOAD_objectRepository.dashboardPage;
import SHOAD_objectRepository.organizationPage;
import SHOAD_objectRepository.reportingPage;
import Utils.CoreActions;
import Utils.JsonManager;
import junit.framework.Assert;

public class reportingPageFunc extends CoreActions{
	
    protected WebDriver driver7;
	protected static JSONObject obj;
	private static Logger logger= Logger.getLogger(reportingPageFunc.class);
	protected static int Currentdate; 
	protected static String id="";
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
    	int count= getElementCount(reportingPage.ListValues);
    	List<String> elementsUI= new ArrayList<String>();
    	List<WebElement> list =currentelements(reportingPage.ListValues);
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
    	Assert.assertTrue(verifyTextNull(reportingPage.startDateTimeInput));
		Assert.assertTrue(verifyTextNull(reportingPage.endDateTimeInput));
//    	enter_value(reportingPage.startDate,obj.get("startDate").toString());
//    	enter_value(reportingPage.endDate,obj.get("endDate").toString());
    	verifyStartDateCalenderFunctionality();
    	verifyEndDateCalenderFunctionality();
    	checkCurrentDateTime(reportingPage.startDate,reportingPage.endDate);
    	Assert.assertTrue(checkIfClickable(reportingPage.clearBtn));
    	Assert.assertTrue(checkIfClickable(reportingPage.searchBtn));
    	logger.info("search and clear buttons are enabled after entering data");
 	 }
    
    public static void verifyViewJSON() {
    	
        Assert.assertTrue(verifyAvailableAndVisible(reportingPage.viewJSON));
    	elementclick(reportingPage.viewJSON);
    	Assert.assertTrue(verifyAvailableAndVisible(dashboardPage.ViewJSONCopy));
    	elementclick(dashboardPage.ViewJSONClose);
    	Assert.assertTrue(verifyElementAbsent(dashboardPage.ViewJSONDiv));
    }
    
    public static void checkTableHeaders() {
    	
    	obj=JsonManager.fetch("jsonFilePath","registrationRequestFieldHeaders");
    	verifyResultStatusValue();
    	verifyViewJSON();
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
		Assert.assertTrue(checkIfClickable(reportingPage.exportCSVBtn));
		click(reportingPage.exportCSVBtn);
		logger.info("table headers and export CSV button verified successfully");
    }
    
    public static void verifyResultStatusValue() {
    	
    	List<WebElement> list;
    	for(int i=0;i<5;i++) {
    		sleep(2);
    		list=currentelements(reportingPage.statusValue);
    		Assert.assertTrue(list.get(i).getText().equals(currentelement(reportingPage.status)));
    	}
    	logger.info("status value for results verified successfully");
    }
    
    public static void navigatingToRegistrationRequest() {
    	
    	sleep(2);sleep(2);
    	click(reportingPage.reportType);
    	sleep(2);
    	waitForVisibility(reportingPage.registrationRequestOption);
    	click(reportingPage.registrationRequestOption);
    	sleep(2);
    }
    
  public static void navigatingToRegistrations() {
    	
    	sleep(2);sleep(2);
    	click(reportingPage.reportType);
    	sleep(2);
    	waitForVisibility(reportingPage.registrationsOption);
    	click(reportingPage.registrationsOption);
    	sleep(2);
    }
    
    public static void checkSearchFunctionality() {
    	
    	navigatingToRegistrationRequest();
    	click(reportingPage.status);
    	int count= getElementCount(reportingPage.ListValues);
    	List<WebElement> list;
    	for(int i=0;i<count;i++) {
    		sleep(2);
    		list=currentelements(reportingPage.ListValues);
    		webelementclick(list.get(i));
    		click(reportingPage.searchBtn);
    		waitForVisibility(reportingPage.JSONheader);
    		checkTableHeaders();
    		click(reportingPage.status);	
    	}
    	logger.info("search functionality verified successfully");
    }
    
    public static int getTotalRecordCount() {
    	
    	String records = currentelement(reportingPage.recordCount);
    	String[] record = records.split("\\s+");
    	String recordCount=record[2].toString();
        System.out.println(recordCount);
        int count=Integer.parseInt(recordCount);  
        return count;
    }
    
    public static String checkRowsPerPage() {
    	
    	String RowsPerPage= (currentelement(reportingPage.recordCount));
    	String[] record = RowsPerPage.split("\\s+");
    	String recordCount=record[0].toString();
    	System.out.println(recordCount);
    	String[] lastRecord = recordCount.split("–");
    	String lastRecordValue=lastRecord[1].toString();
    	System.out.println(lastRecordValue);
    	return lastRecordValue;
    	
    }
     
    public static void checkPaginationFunctionality() {
    	
    	int totalCount=getTotalRecordCount();
    	String totalCountValue=Integer.toString(totalCount);
    	int count=0;
    	while(count<totalCount) {
    		scrollTillLast();
    		List<WebElement> list=currentelements(reportingPage.rows);
    		int listSize=list.size();
    		count+=listSize;
    		System.out.println(count);
    		waitForVisibility(reportingPage.nextPageBtn);
    		String lastRecordValue=checkRowsPerPage();
    		if(lastRecordValue.equals(totalCountValue)) {
    			Assert.assertFalse(checkIfClickable(reportingPage.nextPageBtn));
    		}
    		else{
    			
    			Assert.assertTrue(checkIfClickable(reportingPage.nextPageBtn));
    			elementclick(reportingPage.nextPageBtn);
    		}
    	
    	}
    	
    }
    
    public static void navigateToRegistrationRequestResults() {
    	
    	navigatingToRegistrationRequest();
    	click(reportingPage.status);
    	click(reportingPage.statusRequested);
    	click(reportingPage.searchBtn);     
        sleep(2);
        scrollTillLast();
        sleep(3);
    	Assert.assertTrue(currentelement(reportingPage.rowsPerPageValue).equals("25"));
   	    click(reportingPage.rowsPerPageValue);
    	int count= getElementCount(reportingPage.ListValues);
    	System.out.println(count);
    	List<WebElement> list;
    	for(int i=0;i<count;i++) {
    		sleep(2);
    		list=currentelements(reportingPage.ListValues);
    		webelementclick(list.get(i));
    		checkPaginationFunctionality();
    		sleep(3);
    		click(reportingPage.rowsPerPageValue);
    	}
    	
    }
    
    public static void verifyErrorData() {
    	
    	obj=JsonManager.fetch("jsonFilePath","noResultFoundError");
    	waitForVisibility(reportingPage.errorHeading);
    	Assert.assertTrue(currentelement(reportingPage.errorHeading).contains(obj.get("errorHeading").toString()));
    	Assert.assertTrue(currentelement(reportingPage.errorHeading).contains(obj.get("errorHeading").toString()));
    	Assert.assertTrue(verifyElementAbsent(reportingPage.exportCSVBtn));
    	logger.info("no result found error data verified successfully");
    }
    public static void verifyNoResultFoundError() {
    	
    	obj=JsonManager.fetch("jsonFilePath","registrationRequestData");
    	String RegistrationRequestID= obj.get("RegistrationRequestID").toString();
    	String RegistrationRequestIDData=RegistrationRequestID.substring(0, RegistrationRequestID.length()-1)+generateRandomNumber(1);
    	navigatingToRegistrationRequest();
    	enter_value(reportingPage.registrationRequestId,RegistrationRequestIDData);
    	click(reportingPage.searchBtn);     
        sleep(2);
        verifyErrorData();
    }
    
   public static void verifyIncorrectDataResult() {
    	
    	obj=JsonManager.fetch("jsonFilePath","registrationRequestData");
    	String RegistrationRequestID= obj.get("RegistrationRequestID").toString();
    	String RegistrationRequestIDData=RegistrationRequestID.substring(0, RegistrationRequestID.length()-5);
    	navigatingToRegistrationRequest();
    	enter_value(reportingPage.registrationRequestId,RegistrationRequestIDData);
    	click(reportingPage.searchBtn);     
        sleep(2);
        Assert.assertTrue(verifyElementAbsent(reportingPage.exportCSVBtn));
        Assert.assertTrue(verifyElementAbsent(reportingPage.resultDiv));
    	logger.info("incorrect data result verified successfully");
    }
    
   public static void checkYears(String option) {
	   
	   
	   click(reportingPage.yearDropdown);
	   sleep(2);
	   List <WebElement> yearList=currentelements(reportingPage.yearList);
	   System.out.println(yearList.size());
	   sleep(2);sleep(2);
	   for(int i=0;i<yearList.size();i++) {
		   if(i<=123 && (option == "startDate" || option == "endDate")) {
			   if(i==123) {
				   Assert.assertEquals(yearList.get(i).getAttribute("tabindex"),"0");
  
			   }
			   else {
				   Assert.assertFalse(checkIfButtonDisabled(yearList.get(i)));
				   Assert.assertEquals(yearList.get(i).getAttribute("tabindex"),"-1");
				   
			   }	   
		   }
		   else if(i> 123 && option=="startDate") {
			   Assert.assertEquals(yearList.get(i).getAttribute("tabindex"),"-1");
			   Assert.assertTrue(checkIfButtonDisabled(yearList.get(i)));
		   }
	   }
	   logger.info("calender year option verified successfully");
   }
   
   public static int verifyCurrentMonthYear(By e) {
	   
	   click(e);
   	   waitForVisibility(reportingPage.currentMonthYear);
	   LocalDate currentdate = LocalDate.now();
	   Currentdate = currentdate.getDayOfMonth();
	   Month currentMonth = currentdate.getMonth();
	   int currentYear = currentdate.getYear();
	   String month=currentMonth.toString().substring(0, 1) + currentMonth.toString().substring(1).toLowerCase(); 
	   Assert.assertEquals(currentelement(reportingPage.currentMonthYear),month+" "+currentYear);
	   logger.info("calender current month and year verified successfully");
	   return currentYear;
	   
	   
   }
   
   public static void checkWeekDays() {
	   
	   sleep(2);
	   List<String> elements = new ArrayList<String>();
       obj=JsonManager.fetch("jsonFilePath","weekdays");
       elements.add(obj.get("w1").toString());
       elements.add(obj.get("w2").toString());
       elements.add(obj.get("w3").toString());
       elements.add(obj.get("w4").toString());
       elements.add(obj.get("w5").toString());
       elements.add(obj.get("w6").toString());
       elements.add(obj.get("w7").toString());
       List<String> elementsUI= new ArrayList<String>();
	   List <WebElement> weekdayslist=currentelements(reportingPage.weekDaysList);
	   for(int i=0;i<weekdayslist.size();i++) {
		   String days=weekdayslist.get(i).getText();
		   elementsUI.add(days);
	   }
	   if(elements.equals(elementsUI)) {
   		logger.info("week days are matching");
   	  }
   	  else {
   		logger.info("week days are not matching");
      }
	   
   }
     
   public static void checkCurrentMonthData(String option) {
	   
	    int UIDate = Integer.parseInt(currentelement(reportingPage.currentdate));
		Assert.assertEquals(UIDate,Currentdate);
		if(option=="start") {
			Assert.assertTrue(checkIfClickable(reportingPage.prevMonthBtn));
		}
//		if(option=="end") {
//			Assert.assertTrue(checkIfButtonDisabled(reportingPage.prevMonthBtn));
//		}
		Assert.assertTrue(checkIfButtonDisabled(reportingPage.nextMonthBtn));
		
		logger.info("previous view and next view buttons verified");
   }
   
    public static void verifyStartDateCalenderFunctionality() {
    	
    		Assert.assertTrue(verifyAvailableAndVisible(reportingPage.startDateTimeIcon));
    		Assert.assertTrue(verifyAvailableAndVisible(reportingPage.endDateTimeIcon));
    		logger.info("Both dateTime fields are empty by default and calender icons are present");
    		verifyCurrentMonthYear(reportingPage.startDateTimeIcon);
    		checkYears("startDate");
    		click(reportingPage.yearDropdownup);
    		checkWeekDays();
    		checkCurrentMonthData("start");
    		verifyTimeFunctionalityStartDate();
    }
    
    
    
    public static void verifyEndDateCalenderFunctionality() {
    	
		verifyCurrentMonthYear(reportingPage.endDateTimeIcon);
		sleep(2);
		click(reportingPage.yearDropdown);
		sleep(2);
		Assert.assertEquals(getAttribute(reportingPage.yearList,"tabindex"),"0");
		click(reportingPage.yearDropdownup);
		checkWeekDays();
		checkCurrentMonthData("end");
		verifyTimeFunctionalityEndDate();
		
    }
    
    public static void verifyTimeFunctionalityStartDate() {
    	
    	click(reportingPage.prevMonthBtn);click(reportingPage.prevMonthBtn);click(reportingPage.prevMonthBtn);click(reportingPage.prevMonthBtn);
    	waitForVisibility(reportingPage.selectedDate);
    	click(reportingPage.selectedDate);
    	Assert.assertTrue(verifyElementPresence(reportingPage.calendericon));
    	Assert.assertTrue(verifyElementPresence(reportingPage.timeicon));
    	click(reportingPage.timeIcon);
    	Assert.assertTrue(checkIfButtonDisabled(reportingPage.prevTimeView));
    	Assert.assertTrue(checkIfClickable(reportingPage.nextTimeView));
    	WebElement element =driver.findElement(By.xpath("//div[@aria-label='Select hours. Selected time is 12:00 AM']//span[3]"));
   	    Actions actions = new Actions(driver);
   	    actions.moveToElement(element).click().perform();
		WebElement element1 =driver.findElement(By.xpath("//div[@aria-label='Select minutes. Selected time is 3:00 AM']//span[3]"));
		actions.moveToElement(element1).click().perform();
    	Assert.assertTrue(checkIfButtonDisabled(reportingPage.nextTimeView));
		Assert.assertTrue(checkIfClickable(reportingPage.prevTimeView));
		logger.info("selecting date and time for start date and start date options verified");
    }
    
   public static void checkHoursInEndDateTime() {
	   
	   List <WebElement> hoursList=currentelements(reportingPage.hoursMinsList);
	   	for(int i=0;i<hoursList.size();i++) {
	   		int endHours=Integer.parseInt(hoursList.get(i).getText());  
	   		int selectedStartHours=3;  
	   		if(endHours>=12 && endHours<selectedStartHours) {
	   			Assert.assertEquals(hoursList.get(i).getAttribute("aria-disabled"), "true");
	   		}
	   	}
   }
    
   public static void checkMinsInEndDateTime() {
	   
	   List <WebElement> minsList=currentelements(reportingPage.hoursMinsList);
	   	for(int i=0;i<minsList.size();i++) {
	   		int endMins=Integer.parseInt(minsList.get(i).getText());  
	   		int selectedStartMins=Integer.parseInt(currentelement(reportingPage.selectedMins));  
	   		if(endMins>=00 && endMins<selectedStartMins) {
	   			Assert.assertEquals(minsList.get(i).getAttribute("aria-disabled"), "true");
	   		}
	   	}
   }
   
   
  public static void verifyTimeFunctionalityEndDate() {
    	
	sleep(2);
    click(reportingPage.selectedEndDate);
    Assert.assertTrue(verifyElementPresence(reportingPage.calendericon));
	Assert.assertTrue(verifyElementPresence(reportingPage.timeicon)); 
//   checkHoursInEndDateTime(); only for same date
    waitForVisibility(reportingPage.selectedHour);
  	WebElement element =driver.findElement(By.xpath("//div[@aria-label='Select hours. Selected time is 12:00 AM']//span[3]"));
   	Actions actions = new Actions(driver);
   	actions.moveToElement(element).click().perform();
//   	checkMinsInEndDateTime(); 
   	waitForVisibility(reportingPage.selectedMins);
   	WebElement element1 =driver.findElement(By.xpath("//div[@aria-label='Select minutes. Selected time is 3:00 AM']//span[9]"));
   	actions.moveToElement(element1).click().perform();
	logger.info("selecting date and time for end date and end date options verified");
    }
  
   public static void checkCurrentDateTime(By e1, By e2) {
	   
	   obj=JsonManager.fetch("jsonFilePath","calender");
	   Assert.assertEquals(getAttribute(e1,"value"),obj.get("startDateTime").toString());
	   Assert.assertEquals(getAttribute(e2,"value"),obj.get("endDateTime").toString());
	   logger.info("current date time shown is same as selected one");
   }
   
   public static void verifyRegistrationsFields() {
   	
   	obj=JsonManager.fetch("jsonFilePath","registrationPlaceholders");
   	Assert.assertTrue(currentelement(reportingPage.reportTypePlaceholder).equals(obj.get("Placeholder1").toString()));
   	Assert.assertTrue(currentelement(reportingPage.registrationsAppid).equals(obj.get("Placeholder2").toString()));
   	Assert.assertTrue(currentelement(reportingPage.registrationIDPlaceholder).equals(obj.get("Placeholder3").toString()));
   	Assert.assertTrue(currentelement(reportingPage.registrationsMLSid).equals(obj.get("Placeholder4").toString()));
   	Assert.assertTrue(currentelement(reportingPage.registrationsStartDate).equals(obj.get("Placeholder5").toString()));
   	Assert.assertTrue(currentelement(reportingPage.registrationsEndDate).equals(obj.get("Placeholder6").toString()));

   	Assert.assertFalse(checkIfClickable(reportingPage.clearBtn));
   	Assert.assertFalse(checkIfClickable(reportingPage.searchBtn));
   	logger.info("all placeholders verified");
   	logger.info("search and clear buttons are disabled when all fields are empty");
   }
   
   public static void verifyRegistrationsSearchClearButtons() {
	   
	   enter_value(reportingPage.registrationsappidInput,"Test");
	   Assert.assertTrue(checkIfClickable(reportingPage.clearBtn));
	   Assert.assertTrue(checkIfClickable(reportingPage.searchBtn));
	   clearWebField(reportingPage.registrationsappidInput);
	   Assert.assertFalse(checkIfClickable(reportingPage.clearBtn));
	   Assert.assertFalse(checkIfClickable(reportingPage.searchBtn));
	   logger.info("search and clear buttons are disabled when field is blank");
   }
   
   public static void verifyRegistrationsSearchFunctionality() {
	   
	   
	obj=JsonManager.fetch("jsonFilePath","registrationTestData");
   	enter_value(reportingPage.registrationsappidInput,obj.get("appId").toString());
   	enter_value(reportingPage.registrationId,obj.get("registrationId").toString());
   	enter_value(reportingPage.registrationsmlsidInput,obj.get("mlsId").toString());
   	Assert.assertTrue(verifyTextNull(reportingPage.registrationsstartdateInput));
	Assert.assertTrue(verifyTextNull(reportingPage.registrationsenddateInput));
   	verifyStartDateCalenderFunctionality();
   	verifyEndDateCalenderFunctionality();
   	checkCurrentDateTime(reportingPage.registrationsstartdateInput,reportingPage.registrationsenddateInput);
   	Assert.assertTrue(checkIfClickable(reportingPage.clearBtn));
   	Assert.assertTrue(checkIfClickable(reportingPage.searchBtn));
   	click(reportingPage.searchBtn);
   	logger.info("search and clear buttons are enabled after entering data");
   	waitForVisibility(reportingPage.JSONheader);
   	obj=JsonManager.fetch("jsonFilePath","registrationTestData");
    Assert.assertTrue(currentelement(reportingPage.registrationIDvalue).equals(obj.get("registrationId").toString()));
    Assert.assertTrue(currentelement(reportingPage.applicationIDvalue).equals(obj.get("appId").toString()));
    Assert.assertTrue(currentelement(reportingPage.mlsIDvalue).equals(obj.get("mlsId").toString()));
   	
   }
   
   public static void verifyViewJSONField() {
   	
  	Assert.assertTrue(verifyAvailableAndVisible(dashboardPage.ViewJSONCopy));
   	elementclick(dashboardPage.ViewJSONClose);
   	Assert.assertTrue(verifyElementAbsent(dashboardPage.ViewJSONDiv));
   }
  
    public static void checkRegistrationsTableHeaders() {
   	 
    	
    	waitForVisibility(reportingPage.JSONheader);
   	    obj=JsonManager.fetch("jsonFilePath","registrationsFieldHeaders");
   	    Assert.assertTrue(currentelement(reportingPage.JSONheader).equals(obj.get("header1").toString()));
		Assert.assertTrue(currentelement(reportingPage.inspectheader).equals(obj.get("header2").toString()));
		Assert.assertTrue(currentelement(reportingPage.registrationIDheader).equals(obj.get("header3").toString()));
		Assert.assertTrue(currentelement(reportingPage.appIDheader).equals(obj.get("header4").toString()));
		Assert.assertTrue(currentelement(reportingPage.mlsIDheader).equals(obj.get("header5").toString()));
		Assert.assertTrue(currentelement(reportingPage.listingIDheader).equals(obj.get("header6").toString()));
		Assert.assertTrue(currentelement(reportingPage.listingAgentheader).equals(obj.get("header7").toString()));
		Assert.assertTrue(currentelement(reportingPage.listingAgentMLSIDheader).equals(obj.get("header8").toString()));
		Assert.assertTrue(currentelement(reportingPage.address1header).equals(obj.get("header9").toString()));
		Assert.assertTrue(currentelement(reportingPage.createdheader).equals(obj.get("header10").toString()));
		Assert.assertTrue(checkIfClickable(reportingPage.exportCSVBtn));
		click(reportingPage.exportCSVBtn);
		logger.info("table headers and export CSV button verified successfully");
   }
    
    public static void waitForInspectURL() {
    	
    	 String url= driver.getCurrentUrl(); 
    	 WebDriverWait wait = new WebDriverWait(driver, 20);
         wait.until(ExpectedConditions.urlContains("inspect"));
         Assert.assertTrue(url.contains("inspect"));
         Assert.assertTrue(url.contains("registrations"));
         wait.until(ExpectedConditions.urlContains(id));
         Assert.assertTrue(url.contains(id));
    }
  
   
    
   public static void checkViewJSON() {
	  
	   driver.switchTo().defaultContent();
	   waitForVisibility(reportingPage.JSONheader);
   	   List <WebElement> viewJson=currentelements(reportingPage.viewjsonList);
   	   System.out.println(viewJson.size());
   	  // webelementclick(viewJson.get(1));
   	   int i=0;
   	   while(i<3) {
   		  sleep(4);
   		  
 //  		  waitForVisibility(viewJson.get(index));
//   		  WebElement element=viewJson.get(index);
//   		  waitTillClickable(viewJson.get(index));
//   		  element.click();
   		  driver.switchTo().activeElement();
   		  System.out.println(viewJson.get(i).getText());
   		  viewJson.get(i).click();
   		  verifyViewJSONField();
   		  String id=currentelement(reportingPage.ID2);
   		  System.out.println(id);
   		  
   		  i++;
   		  
   	   }
   }
   
    public static void checkInspect() {
    
    	waitForVisibility(reportingPage.ID1);
    	List <WebElement> inspect=currentelements(reportingPage.inspectList);
    	String[] registrationID= new String[3];
  	    registrationID[0]=currentelement(reportingPage.ID1);
  	    registrationID[1]=currentelement(reportingPage.ID2);
  	    registrationID[2]=currentelement(reportingPage.ID3);
    	for(int i=0;i<3;i++) {
    		waitForVisibility(reportingPage.inspectIcon);
    		inspect.get(i).click();
    		List<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
        	driver.switchTo().window(browserTabs .get(1));
        	waitForInspectURL();
        	waitForVisibility(reportingPage.registationinputID);
        	Assert.assertEquals(getAttribute(reportingPage.registationinputID,"value"),registrationID[i]);
        	driver.close();
        	driver.switchTo().window(browserTabs.get(0));
    		
    	}
    }
    
    public static void registrationsSearch() {
    	
    	click(reportingPage.startDateTimeIcon);
    	waitForVisibility(reportingPage.selectedDateNew);
    	click(reportingPage.selectedDateNew);
    	WebElement element =driver.findElement(By.xpath("//div[@aria-label='Select hours. Selected time is 12:00 AM']//span[3]"));
   	    Actions actions = new Actions(driver);
   	    actions.moveToElement(element).click().perform();
		WebElement element1 =driver.findElement(By.xpath("//div[@aria-label='Select minutes. Selected time is 3:00 AM']//span[3]"));
		actions.moveToElement(element1).click().perform();
		click(reportingPage.searchBtn);
		
    }
    
}
