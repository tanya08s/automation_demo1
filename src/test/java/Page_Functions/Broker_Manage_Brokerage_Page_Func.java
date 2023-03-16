package Page_Functions;

import Object_Repository.Broker_Manage_Brokerage_Page;
import Object_Repository.Team_Page;
import Utils.CoreActions;
import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Broker_Manage_Brokerage_Page_Func extends CoreActions{
	
	protected WebDriver driver6;
    public Broker_Manage_Brokerage_Page_Func(WebDriver driver)
    {
        super(driver);
        this.driver6=driver;
    }
    
    public static WebElement currentelement(By e) { 
    	WebElement ele=driver.findElement(e);
        return ele;
    }
    
    public static void verifyManageBrokeragePageUrl() {
    	waitForManageBrokeragePageUrl();
    	String brokeragePageUrl=driver.getCurrentUrl();
    	Assert.assertTrue(brokeragePageUrl.contains("https://teams.tst.brightmls.com/manageBrokerage"));	
    }
    
    public static void declineTeam() {
    	waitForVisibility(Broker_Manage_Brokerage_Page.decline_team);
    	click(Broker_Manage_Brokerage_Page.decline_team);
    }
    
    public static void acceptTeam() {
    	sleep(2);
    	sleep(2);
    	sleep(2);
    	waitForVisibility(Broker_Manage_Brokerage_Page.accept_team);
    	click(Broker_Manage_Brokerage_Page.accept_team);
    	sleep(2);
    	sleep(2);
    }
     public static void VerifyTeamAcceptance() {
    	 
    	waitForVisibility(Broker_Manage_Brokerage_Page.team_acceptance_alert);
     	WebElement c = currentelement(Broker_Manage_Brokerage_Page.team_acceptance_alert);
 	  	Assert.assertEquals(prop.getProperty("teamAcceptanceSuccess"), c.getText());
    	 
     }
    
    

}
