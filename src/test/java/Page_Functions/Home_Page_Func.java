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
    	
    	waittillurlis();
    	sleep(3);
//    	driver.getCurrentUrl().equals("https://www.tst.brightmls.com/dashboard");
    	System.out.println("dashboard opened");
    	sleep(3);
    	System.out.println("waiting for pop-up");
    	verifyAvailable(Home_Page.pop_up);
    	click(Home_Page.close_btn);
 
    	
    }
//    public void verifydashboardurl() {
//    	Assert.assertEquals(prop.getProperty("dashboard_url"),actual_url,"The actual and expected url don’t match, login failed!!");
//    }

}
