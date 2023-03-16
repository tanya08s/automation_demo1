package Page_Functions;

import Object_Repository.Home_Page;
import Utils.CoreActions;
import junit.framework.Assert;

import org.openqa.selenium.WebDriver;

public class Home_Page_Func extends CoreActions {
	protected WebDriver driver2;
    public Home_Page_Func(WebDriver driver)
    {
        super(driver);
        this.driver2=driver;
    }
    public static void closePopUp() {
    	
    	
    	sleep(3);
    	waitForDashboardUrl();
//    	driver.getCurrentUrl().equals("https://www.tst.brightmls.com/dashboard");
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
  

}
