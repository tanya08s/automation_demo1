package Page_Functions;

import Object_Repository.TL_Home_Page;

import Utils.CoreActions;
import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TL_Home_Page_Func extends CoreActions {

	protected WebDriver driver7;
	
    public TL_Home_Page_Func(WebDriver driver)
    {
        super(driver);
        this.driver7=driver;
    }
    
    public static void closePopUp() {
    	
    	sleep(3);
    	waitForDashboardUrl();
    	System.out.println("tl dashboard opened");	
    	sleep(8);
    	System.out.println("waiting for pop-up");
    	waitForVisibility(TL_Home_Page.pop_up);
    	verifyAvailable(TL_Home_Page.pop_up);
    	click(TL_Home_Page.close_btn);
    	sleep(2);
    	sleep(2);
    	
    }
    
    public static void selectManageTeamOption() {
    	
    	waitForVisibility(TL_Home_Page.menu);
    	click(TL_Home_Page.menu);
    	waitForVisibility(TL_Home_Page.manage_team);
    	verifyAvailable(TL_Home_Page.manage_team);
    	click(TL_Home_Page.manage_team);
    	
    }
    
}
