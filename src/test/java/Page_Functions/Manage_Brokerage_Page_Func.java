package Page_Functions;

import Object_Repository.Manage_Brokerage_Page;
import Object_Repository.Manage_Team_Page;
import Object_Repository.Team_Page;
import Utils.CoreActions;
import junit.framework.Assert;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Manage_Brokerage_Page_Func extends CoreActions{
	
	protected WebDriver driver6;
	public static boolean reqSent;
	public static String newTeamName;
	public static String TLName;
    public Manage_Brokerage_Page_Func(WebDriver driver)
    {
        super(driver);
        this.driver6=driver;
    }
      
    public static void verifyManageBrokeragePageUrl() {
    	waitForManageBrokeragePageUrl();
    	String brokeragePageUrl=driver.getCurrentUrl();
    	Assert.assertTrue(brokeragePageUrl.contains("https://teams.tst.brightmls.com/manageBrokerage"));	
    }
    public static void disbandTeam() {
    	
    	sleep(2);
    	sleep(2);
    	sleep(2);
    	sleep(2);
    	waitForVisibility(Manage_Brokerage_Page.rows_per_page);
    	click(Manage_Brokerage_Page.rows_per_page);
    	waitForVisibility(Manage_Brokerage_Page.all_rows);
    	click(Manage_Brokerage_Page.all_rows);	
    	waitForVisibility(Manage_Brokerage_Page.team_name);
    	String c=currentelement(Manage_Brokerage_Page.team_name);
    	System.out.println(c);
    	if(c.equals(prop.getProperty("teamName"))) {
    		click(Manage_Brokerage_Page.disband_option);
    		waitForVisibility(Manage_Brokerage_Page.disbandButton);
    		click(Manage_Brokerage_Page.disbandButton);
    		loadingWait();
    		waitForVisibility(Manage_Brokerage_Page.team_disband_alert);
    		waitTillDisapper(Manage_Brokerage_Page.team_disband_alert);
    		sleep(2);
    		System.out.println("Team disbanded successfully");
    	}else {
    		System.out.println("No such team exists!!");
    	}
    	
    }
    
    public static void declineTeam() {
    
    	sleep(3);
    	waitForVisibility(Manage_Brokerage_Page.declineTeam);
        click(Manage_Brokerage_Page.declineTeam);
        waitForVisibility(Manage_Brokerage_Page.declineAlert);
        click(Manage_Brokerage_Page.declineAlert);
        loadingWait();
        waitForVisibility(Manage_Brokerage_Page.team_decline_alert);
        waitTillDisapper(Manage_Brokerage_Page.team_decline_alert);
        sleep(3);
    	System.out.println("Team declined successfully");
    }
    public static void VerifyTeamAcceptance() {
   	 
    	waitForVisibility(Manage_Brokerage_Page.team_acceptance_alert);
    	String c = currentelement(Manage_Brokerage_Page.team_acceptance_alert);
 	  	Assert.assertEquals(prop.getProperty("teamAcceptanceSuccess"), c);
 	  	waitTillDisapper(Manage_Brokerage_Page.team_acceptance_alert);
        sleep(3);
    	 
     }
    public static void acceptTeam(By e) {
    	
    	sleep(3);
    	waitForVisibility(e);
        click(e);
        loadingWait();
        VerifyTeamAcceptance();
        System.out.println("Team accepted successfully");
    	
    }

    public static void acceptArcherTeam() {
    	
    	acceptTeam(Manage_Brokerage_Page.acceptTeam);
    }
    
    public static void acceptKellyTeam() {
    	
    	acceptTeam(Manage_Brokerage_Page.acceptKellyTeam);
    }
    
    
    public static void verifyTeamDisband() {
   	 Assert.assertTrue(verifyElementAbsent(Manage_Brokerage_Page.team_name));
    }
    
    public static void checkTeamReq() {
    	
    	waitForVisibility(Manage_Brokerage_Page.rows_per_page);
    	click(Manage_Brokerage_Page.rows_per_page);
    	waitForVisibility(Manage_Brokerage_Page.all_rows);
    	click(Manage_Brokerage_Page.all_rows);	
    	if(verifyElementPresence(Manage_Brokerage_Page.team_name)==true) {
    		click(Manage_Brokerage_Page.disband_option);
    		waitForVisibility(Manage_Brokerage_Page.disbandAlertHeading);
    		click(Manage_Brokerage_Page.disbandButton);
    		loadingWait();
    		waitForVisibility(Manage_Brokerage_Page.team_disband_alert);
    		waitTillDisapper(Manage_Brokerage_Page.team_disband_alert);
    		sleep(2);
    		System.out.println("Team disbanded successfully");
    		verifyTeamDisband();
    		
    	}
    	else if(verifyElementPresence(Manage_Brokerage_Page.declineTeam)==true) {
    		declineTeam();
    	}
    	else {
    		System.out.println("Team not found!!");
    	}
    }
     
    public static void editTeam() {
    	
    	sleep(2);
    	waitForVisibility(Manage_Brokerage_Page.rows_per_page);
    	click(Manage_Brokerage_Page.rows_per_page);
    	waitForVisibility(Manage_Brokerage_Page.all_rows);
    	click(Manage_Brokerage_Page.all_rows);	
    	waitForVisibility(Manage_Brokerage_Page.editKellyTeam);
    	click(Manage_Brokerage_Page.editKellyTeam);
    	loadingWait();
    	scroll();
    	waitForVisibility(Manage_Brokerage_Page.editTeamName);
    	String newName=currentelement(Manage_Brokerage_Page.editTeamName);
     	clearWebField(Manage_Brokerage_Page.editTeamName);
    	newTeamName=newName+generateRandom(1);
    	System.out.println(newTeamName);
    	enter_value(Manage_Brokerage_Page.editTeamName,newTeamName);
    	TLName=getAttribute(Manage_Brokerage_Page.TLName,"value");
    	click(Manage_Brokerage_Page.saveTeamName);
    	waitForVisibility(Manage_Brokerage_Page.saveTeamNamePopup);
    	click(Manage_Brokerage_Page.saveTeamNamePopup);
    	loadingWait();
    }
    
 	
     public static void verifyDisbandAlertContent() {
    	 
    	waitForVisibility(Manage_Brokerage_Page.disbandAlertHeading);
     	String c1 = currentelement(Manage_Brokerage_Page.disbandAlertHeading);
     	String disbandAlertHeading= prop.getProperty("disbandAlertHeading");
     	Assert.assertTrue(c1+" is shown",c1.contains(disbandAlertHeading));
     	
     	String c2 = currentelement(Manage_Brokerage_Page.disbandAlertSubHeading);
     	String disbandAlertSubHeading= prop.getProperty("disbandAlertSubHeading");
     	Assert.assertTrue(c2+" is shown",c2.contains(disbandAlertSubHeading));
     	
     	String c3 = currentelement(Manage_Brokerage_Page.disbandAlertCont1);
     	String disbandAlertCont1= prop.getProperty("disbandAlertCont1");
     	Assert.assertTrue(c3+" is shown",c3.contains(disbandAlertCont1));
     	
     	String c4 = currentelement(Manage_Brokerage_Page.disbandAlertCont2);
     	String disbandAlertCont2= prop.getProperty("disbandAlertCont2");
     	Assert.assertTrue(c4+" is shown",c4.contains(disbandAlertCont2));
     	
     	String c5 = currentelement(Manage_Brokerage_Page.disbandAlertCont3);
     	String disbandAlertCont3= prop.getProperty("disbandAlertCont3");
     	Assert.assertTrue(c5+" is shown",c5.contains(disbandAlertCont3));
     	
     	String c6 = currentelement(Manage_Brokerage_Page.disbandAlertCont4);
     	String disbandAlertCont4= prop.getProperty("disbandAlertCont4");
     	Assert.assertTrue(c6+" is shown",c6.contains(disbandAlertCont4));
     	
     	String c7 = currentelement(Manage_Brokerage_Page.disbandAlertStrongText1);
     	String disbandAlertStrongText1= prop.getProperty("disbandAlertStrongText");
     	Assert.assertTrue(c7+" is shown",c7.contains(disbandAlertStrongText1));
     	
     	String c8 = currentelement(Manage_Brokerage_Page.disbandAlertStrongText2);
     	String disbandAlertStrongText2= prop.getProperty("disbandAlertStrongText");
     	Assert.assertTrue(c8+" is shown",c8.contains(disbandAlertStrongText2));
     	
     	verifyAvailable(Manage_Brokerage_Page.cancelButton);
     	verifyAvailable(Manage_Brokerage_Page.disbandButton);
     	
     }
     
    
    
    

}
