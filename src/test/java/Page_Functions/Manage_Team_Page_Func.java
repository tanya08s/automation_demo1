package Page_Functions;

import Utils.CoreActions;
import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Object_Repository.Manage_Brokerage_Page;
import Object_Repository.Manage_Team_Page;
import Object_Repository.Team_Page;

public class Manage_Team_Page_Func extends CoreActions {
	
	protected WebDriver driver8;
	protected static String teamMemberView;
	protected static String teamLeadView;
    public Manage_Team_Page_Func(WebDriver driver)
    {
        super(driver);
        this.driver8=driver;
    }
    
    public static void verifyTLManageTeamsPageUrl() {
    	
    	waitForManageTeamsPageUrl();
    	String manageTeamPageUrl=driver.getCurrentUrl();
    	System.out.print(manageTeamPageUrl);
    	Assert.assertTrue(manageTeamPageUrl.contains("https://teams.tst.brightmls.com/manageTeam"));
    	sleep(2);
    	
    }
    
    public static void verifyTopSection() {
    	
    	sleep(4);
    	waitForVisibility(Manage_Team_Page.pageHeading);
    	String c1 = currentelement(Manage_Team_Page.pageHeading);
    	Assert.assertEquals(prop.getProperty("pageheading"), c1);
    	
    	String c2 = currentelement(Manage_Team_Page.pageDescription);
    	Assert.assertEquals(prop.getProperty("pagedescription"), c2);
    	
    }
    public static void verifyMidSection() {
    	
    	String c1 = currentelement(Manage_Team_Page.teamName);
    	Assert.assertEquals(prop.getProperty("teamname"), c1);
    	
    	String c2 = currentelement(Manage_Team_Page.teamText);
    	Assert.assertEquals(prop.getProperty("teamtext"), c2);
    	
    	verifyAvailable(Manage_Team_Page.syndicateCheckbox);
    	
    	String c3 = currentelement(Manage_Team_Page.syndicateText);
    	Assert.assertEquals(prop.getProperty("syndicatetext"), c3);
    	
    	verifyAvailable(Manage_Team_Page.syndicateImg);
    	
    	String c4 = currentelement(Manage_Team_Page.searchPlaceholder);
    	Assert.assertEquals(prop.getProperty("searchplaceholder"), c4);
    	
    	verifyAvailable(Manage_Team_Page.searchDropdownButton);
    	
    	String c5 = currentelement(Manage_Team_Page.tableHeading1);
    	Assert.assertEquals(prop.getProperty("tableHeading1"), c5);
    	
    	String c6 = currentelement(Manage_Team_Page.tableHeading2);
    	Assert.assertEquals(prop.getProperty("tableHeading2"), c6);
    	
    	String c7 = currentelement(Manage_Team_Page.tableHeading3);
    	Assert.assertEquals(prop.getProperty("tableHeading3"), c7);
    	
    	String c8 = currentelement(Manage_Team_Page.tableHeading4);
    	Assert.assertEquals(prop.getProperty("tableHeading4"), c8);
    	
    	String c9 = currentelement(Manage_Team_Page.tableHeading5);
    	Assert.assertEquals(prop.getProperty("tableHeading5"), c9);
    	
    	String c10 = currentelement(Manage_Team_Page.tableHeading6);
    	Assert.assertEquals(prop.getProperty("tableHeading6"), c10);
    	
    	String c11 = currentelement(Manage_Team_Page.tableHeading7);
    	Assert.assertEquals(prop.getProperty("tableHeading7"), c11);
    	
    	String c12 = currentelement(Manage_Team_Page.tableBody1);
    	Assert.assertEquals(prop.getProperty("tableBody1"), c12);
    	
    	String c13 = currentelement(Manage_Team_Page.tableBody2);
    	Assert.assertEquals(prop.getProperty("tableBody2"), c13);
    	
    	String c14 = currentelement(Manage_Team_Page.tableBody3);
    	Assert.assertEquals(prop.getProperty("tableBody3"), c14);
    	
    	String c15 = currentelement(Manage_Team_Page.tableBody4);
    	Assert.assertEquals(prop.getProperty("tableBody4"), c15);
    	
    	String c16 = currentelement(Manage_Team_Page.tableBody5);
    	Assert.assertEquals(prop.getProperty("tableBody5"), c16);
    	
    	verifyAvailable(Manage_Team_Page.tableBodyCheckbox);
    	
    	String c17 = currentelement(Manage_Team_Page.tableBody6);
    	Assert.assertEquals(prop.getProperty("tableBody6"), c17);
    	
    	verifyAvailable(Manage_Team_Page.tableBody7);

    }
    public static void addTeamMember() {
    	
    	verifyTLManageTeamsPageUrl();
    	sleep(6);
    	waitForVisibility(Manage_Team_Page.searchBox);
    	scroll();
    	enter_value(Manage_Team_Page.searchBox,prop.getProperty("teamMemberId"));
    	sleep(4);
//    	WebElement e1 = currentEle(Manage_Team_Page.searchBox);
    	sendKey(Manage_Team_Page.searchBox,Keys.ARROW_DOWN);
//    	String member = getAttribute(Manage_Team_Page.searchBox,"value");
    	sendKey(Manage_Team_Page.searchBox,Keys.ENTER);
//    	System.out.println(member);
    	sendKey(Manage_Team_Page.searchBox,Keys.RETURN);
    	waitForVisibility(Manage_Team_Page.inviteToTeamButton);
    	click(Manage_Team_Page.inviteToTeamButton);
    	sleep(2);    	
    }
    
    public static void resendTMInvite() {
    	
    	verifyTLManageTeamsPageUrl();
    	sleep(6);
    	scroll();
    	waitForVisibility(Manage_Team_Page.resendInvite);
    	click(Manage_Team_Page.resendInvite);
    	waitForVisibility(Manage_Team_Page.resendPopUp);
    	click(Manage_Team_Page.resendPopUp);
    }
    
    public static void cancelTMInvite() {
    	
    	verifyTLManageTeamsPageUrl();
    	sleep(6);
    	scroll();
    	waitForVisibility(Manage_Team_Page.cancelInvite);
    	click(Manage_Team_Page.cancelInvite);
    	waitForVisibility(Manage_Team_Page.cancelPopUp);
    	click(Manage_Team_Page.cancelPopUp);
    }
    
    public static void verifyResendAlert(){
   	 
    	waitForVisibility(Manage_Team_Page.resendVerifyALERT);
    	String c = currentelement(Manage_Team_Page.resendVerifyALERT);
    	String alertHeading= prop.getProperty("resendVerifyALERT");
    	Assert.assertTrue(c+" is shown",c.contains(alertHeading));
 	  	
 	  	String c1 = currentelement(Manage_Team_Page.resendVerifyALERTDescription);
 	  	String alertDes= prop.getProperty("resendVerifyALERTDescription");
 	  	Assert.assertTrue(c1+" is shown",c1.contains(alertDes));
 	  	
 	  	verifyAvailable(Manage_Team_Page.resendAlertIcon);
 	  	verifyAvailable(Manage_Team_Page.resendAlertClose);
 	  	click(Manage_Team_Page.resendAlertClose);
 	  	boolean check= verifyElementAbsent(Manage_Team_Page.resendAlertDiv);
 	  	Assert.assertTrue(check);
 	  	 	  	
     }

    public static String setView(By element1) {
    	
    	verifyTLManageTeamsPageUrl();
    	sleep(6);
    	waitForVisibility(element1);
    	String viewVal= currentelement(element1);
    	System.out.println(viewVal);
    	String viewVal2;
    	if(viewVal.equals(prop.getProperty("teamview"))) {
    		click(element1);
        	click(Manage_Team_Page.individualDropdown);
        	viewVal2= currentelement(element1);
        	return viewVal2;
    	}
    	else {
    		click(element1);
        	click(Manage_Team_Page.teamDropdown);
        	viewVal2= currentelement(element1);
        	return viewVal2;
    	}	
    }
   
    public static void setViewTM() {
    	
    	teamMemberView=setView(Manage_Team_Page.setProductivityViewTM1);	
    	sleep(2);
    }
    public static void setViewTL() {
    	
    	teamLeadView=setView(Manage_Team_Page.setProductivityViewTL);
    	sleep(2);
 
    }
    
    public static void verifyViewDetailsPresence() {
    	
    	scroll();
		waitForVisibility(Manage_Team_Page.productivityDiv);
		verifyAvailable(Manage_Team_Page.productivityDiv);
		waitForVisibility(Manage_Team_Page.viewDetails);
		sleep(3);
 		elementclick(Manage_Team_Page.viewDetails);
		teamsProductivityUrl();
    	
    }
    
    public static void verifyViewDetailsAbsence() {
    	
    	waitForVisibility(Manage_Team_Page.productivityDiv);
		verifyAvailable(Manage_Team_Page.productivityDiv);
		Assert.assertTrue(verifyElementAbsent(Manage_Team_Page.viewDetails));
    }
    
    public static void verifyProductivityViewTL() {
    	
    	sleep(4);
    	if(teamLeadView.equals(prop.getProperty("teamview"))) {
    		verifyViewDetailsPresence();
    		System.out.println(teamLeadView);
    	}
    	else {
    		click(Manage_Team_Page.homeIcon);
    		verifyViewDetailsAbsence();
    		System.out.println(teamLeadView);
    	}
    	   	
    }
    public static void verifyProductivityViewTM() {
    	
    	if(teamMemberView.equals(prop.getProperty("teamview"))) {
    		verifyViewDetailsPresence();
    		System.out.println(teamMemberView);
    	}
    	else {
    		verifyViewDetailsAbsence();
    		System.out.println(teamMemberView);
    	}
    	
    }
   
    
}
