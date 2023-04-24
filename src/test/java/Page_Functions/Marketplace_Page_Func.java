package Page_Functions;
import Utils.CoreActions;
import junit.framework.Assert;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Object_Repository.Marketplace_Page;
public class Marketplace_Page_Func extends CoreActions  {
	
	 protected static WebDriver driver9;
	 public Marketplace_Page_Func(WebDriver driver)
	    
	    {
	        super(driver);
	        Marketplace_Page_Func.driver9=driver;
	    }
	 
	 public static void waitForBrightUrl() {
		    String changedUrl = "https://tst.brightmls.com/home";
	        WebDriverWait wait = new WebDriverWait(driver, 20);
	        wait.until(ExpectedConditions.urlMatches(changedUrl));
	 }
	 public static void checkBrightLinkUrl() {
		    List<String> browserTabs = new ArrayList<String> (driver9.getWindowHandles());
	    	driver9.switchTo().window(browserTabs .get(1));
	    	waitForBrightUrl();
	    	driver9.close();
	    	driver9.switchTo().window(browserTabs.get(0));
	 }
	 
	 public static Boolean checkurl(String url) {
		 
		String mainUrl = "https://tst.brightmls.com/open";
		 
		if(url == null || url.isEmpty()){
			 return false;
		}

		if(!url.startsWith(mainUrl)){
			 return false;
		}
		return true;
	 }
	 
	 public static void checkLinks() {
		 
		 sleep(2);
		 sleep(2);
		 waitForVisibility(Marketplace_Page.storiesLink);
		 String storyUrl=getAttribute(Marketplace_Page.storiesLink,"href");
		 Assert.assertTrue(checkurl(storyUrl));
		 String principlesUrl=getAttribute(Marketplace_Page.principlesLink,"href");
		 Assert.assertTrue(checkurl(principlesUrl));
		 String benefitsUrl=getAttribute(Marketplace_Page.benefitsLink,"href");
		 Assert.assertTrue(checkurl(benefitsUrl));
		 waitForVisibility(Marketplace_Page.principlesLink);
		 waitForVisibility(Marketplace_Page.benefitsLink);
		 waitForVisibility(Marketplace_Page.brightMlsLink);
		 elementclick(Marketplace_Page.brightMlsLink);
		 checkBrightLinkUrl();
		 
	 }
}
