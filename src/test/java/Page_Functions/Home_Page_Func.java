package Page_Functions;


import Object_Repository.Home_Page;
import Object_Repository.Manage_Brokerage_Page;
import Object_Repository.Manage_Team_Page;
import Utils.CoreActions;
import junit.framework.Assert;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Page_Functions.SearchListings_Page_Func;

public class Home_Page_Func extends CoreActions {
	
	protected WebDriver driver2;
	public static boolean teamFormed;
    public Home_Page_Func(WebDriver driver)
    
    {
        super(driver);
        this.driver2=driver;
    }
    
    public static void closePopUp() {
    	
    	
    	sleep(3);
    	waitForDashboardUrl();
    	System.out.println("dashboard opened");	
    	sleep(8);
    	System.out.println("waiting for pop-up");
    	waitForVisibility(Home_Page.pop_up);
    	verifyAvailable(Home_Page.pop_up);
    	click(Home_Page.close_btn);
    	sleep(2);
    	sleep(2);
    	
    }
    public static void  teamsOption() {
    	
    	sleep(3);
    	waitForVisibility(Home_Page.products_option);
    	click(Home_Page.products_option);
    	waitForVisibility(Home_Page.teams_option);
    	click(Home_Page.teams_option);
    		
    }
    
    public static void selectManageTeamOption() {
    	
    	waitForVisibility(Home_Page.menu);
    	click(Home_Page.menu);
    	waitForVisibility(Home_Page.manage_team);
    	verifyAvailable(Home_Page.manage_team);
    	click(Home_Page.manage_team);
    	
    }
    public static void selectListingOption() {
    	
    	sleep(2);
    	sleep(2);
    	waitForVisibility(Home_Page.SearchOption);
    	enter_value(Home_Page.SearchOption,SearchListings_Page_Func.ListingId);
    	sendKey(Home_Page.SearchOption,Keys.ENTER);
    	waitForMatrixURL();
	
    }
    
    public static void openBrokerageTeamsOption() {
    	
    	waitForVisibility(Home_Page.menu);
    	click(Home_Page.menu);
    	sleep(2);
    	waitForVisibility(Home_Page.brokerage_teams_option);
    	click(Home_Page.brokerage_teams_option);
    	sleep(2);
    	sleep(2);
    	sleep(2);
    	sleep(3);
    	loadingWait();
    	waitForVisibility(Manage_Brokerage_Page.brokerPageHeading);
    	
    }
    public static void selectYearProdDiv() {
    	scroll();
    	waitForVisibility(Home_Page.prodDivDropdown);
    	elementclick(Home_Page.prodDivDropdown);
    	sendKey(Home_Page.prodDivDropdown,Keys.ARROW_DOWN);
    	String dropdownVal=getAttribute(Home_Page.prodDivDropdown,"class");
    	Assert.assertTrue(dropdownVal+" is shown",dropdownVal.contains("dropdown-selected-2022"));
    	System.out.println(dropdownVal);
    	elementclick(Manage_Team_Page.viewDetails);
		teamsProductivityUrl();
		loadingWait();
		
		
    }
    
    public static void checkNoOfRISNewsLinks() {
    	scroll();
    	for(int i=0;i<3;i++) {
    		verifyAvailableAndVisible(By.xpath("//a[@id='RISMedia_container_panel_0_RISNews"+i+"_NewsCard']"));	
    		System.out.println(i+"news card is visible.");
    	}
    }
    
    public static void checkNoOfRISEventsLinks() {
    	scroll();
    	for(int i=0;i<2;i++) {
    		verifyAvailableAndVisible(By.xpath("//a[@id='RISMedia_container_panel_0_RISEvents"+i+"_NewsCard']"));	
    		System.out.println(i+"event card is visible.");
    	}
    }
    
    
    public static void checkNoOfRISReportsLinks() {
    	
    	scroll();
    	for(int i=0;i<3;i++) {
    		verifyAvailableAndVisible(By.xpath("//a[@id='RISMedia_container_panel_0_RISReports"+i+"_NewsCard']"));	
    		System.out.println(i+"report card is visible.");
    	}
    	
    }
    
    public static void verifyRisNewsLinks() {
    	
    	elementclick(Home_Page.risNewsCard1);
    	checkOktaURL();
    	elementclick(Home_Page.risNewsCard2);
    	checkOktaURL();
    	elementclick(Home_Page.risNewsCard3);
    	checkOktaURL();
    	
    	String c = currentelement(Home_Page.risNewsButton);
    	Assert.assertTrue(c+" is shown",c.contains(prop.getProperty("risNewsButton")));
    	
    	elementclick(Home_Page.risNewsButton);
    	checkOktaURL();
    }
    
    public static void verifyRisEventsLinks() {
    	
    	elementclick(Home_Page.risEventCard1);
    	checkOktaURL();
    	elementclick(Home_Page.risEventCard2);
    	checkOktaURL();
    	
    	String c = currentelement(Home_Page.risEventButton);
    	Assert.assertTrue(c+" is shown",c.contains(prop.getProperty("risEventButton")));
    	
    	elementclick(Home_Page.risEventButton);
    	checkOktaURL();
    }
    
    public static void verifyRisReportsLinks() {
    	
    	elementclick(Home_Page.risReportCard1);
    	checkOktaURL();
    	elementclick(Home_Page.risReportCard2);
    	checkOktaURL();
    	elementclick(Home_Page.risReportCard3);
    	checkOktaURL();
    	
    	String c = currentelement(Home_Page.risReportButton);
    	Assert.assertTrue(c+" is shown",c.contains(prop.getProperty("risReportButton")));
  
    	elementclick(Home_Page.risReportButton);
    	checkOktaURL();
    }
    
    public static void verifyRISMediaContent() {
    	
    	waitForVisibility(Home_Page.risHeading);
    	String c = currentelement(Home_Page.risHeading);
    	Assert.assertTrue(c+" is shown",c.contains(prop.getProperty("risHeading")));
    	
    	String c1 = currentelement(Home_Page.risSubHeading1);
    	Assert.assertEquals(prop.getProperty("risSubHeading1"), c1);
    
    	String c2 = currentelement(Home_Page.risSubHeading2);
    	Assert.assertEquals(prop.getProperty("risSubHeading2"), c2);
    	
    	String c3 = currentelement(Home_Page.risSubHeading3);
    	Assert.assertEquals(prop.getProperty("risSubHeading3"), c3);
    	
    	Assert.assertTrue(verifyAvailableAndVisible(Home_Page.risImg));
    	Assert.assertTrue(verifyTextNotNull(Home_Page.risImgText));
    	Assert.assertTrue(verifyTextNotNull(Home_Page.risImgSubText));
    	
    	checkNoOfRISNewsLinks();
    	verifyRisNewsLinks();
    	
    	elementclick(Home_Page.risSubHeading2);
    	checkNoOfRISEventsLinks();
    	verifyRisEventsLinks();
    	
    	elementclick(Home_Page.risSubHeading3);
    	checkNoOfRISReportsLinks();
    	verifyRisReportsLinks();
    	
    		 	
    }
    public static void checkTeamFormed() {
    	
    	waitForVisibility(Home_Page.checkTeamText);
    	String c = currentelement(Home_Page.checkTeamText);
    	System.out.println(c);
    	if(c.contains(prop.getProperty("checkTeamText"))) {
    		teamFormed=true;
    	}
    	else {
    		teamFormed=false;
    	}
    	System.out.println(teamFormed);
    }
    
  
//get count for links
// write function here instead of coreactions    
}
