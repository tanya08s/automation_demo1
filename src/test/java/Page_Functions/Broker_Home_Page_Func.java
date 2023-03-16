package Page_Functions;

import org.openqa.selenium.WebDriver;

import Object_Repository.Broker_Home_Page;
import Utils.CoreActions;
import junit.framework.Assert;

public class Broker_Home_Page_Func extends CoreActions {
	
	protected WebDriver driver5;
    public Broker_Home_Page_Func(WebDriver driver)
    {
        super(driver);
        this.driver5=driver;
    }
    
    public static void closePopUp() {
    	
    	sleep(3);
    	waitForDashboardUrl();
    	System.out.println("broker id dashboard opened");	
    	sleep(8);
    	System.out.println("waiting for pop-up");
    	waitForVisibility(Broker_Home_Page.pop_up);
    	verifyAvailable(Broker_Home_Page.pop_up);
    	click(Broker_Home_Page.close_btn);
    	sleep(2);
    	sleep(2);
    	sleep(2);
    }
    
    public static void openBrokerageTeamsOption() {
    	
    	waitForVisibility(Broker_Home_Page.menu);
    	click(Broker_Home_Page.menu);
    	waitForVisibility(Broker_Home_Page.brokerage_teams_option);
    	click(Broker_Home_Page.brokerage_teams_option);
    	sleep(2);
    	
    }
    


}
