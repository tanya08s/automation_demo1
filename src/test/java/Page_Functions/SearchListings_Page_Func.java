package Page_Functions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Object_Repository.SearchListings_Page;
import Page_Functions.Manage_Brokerage_Page_Func;


import Utils.CoreActions;

public class SearchListings_Page_Func extends CoreActions{
	
	protected static String ListingId="MDMC2137134";
	protected WebDriver driver12;
	public SearchListings_Page_Func(WebDriver driver)
    {
        super(driver);
        this.driver12=driver;
    }
	public static void verifyListingTeamName() {
		
		waitForVisibility(SearchListings_Page.teamName);
		String name =currentelement(SearchListings_Page.teamName);
		Assert.assertEquals(name,Manage_Brokerage_Page_Func.newTeamName);
		System.out.println(name);
		String tlname =currentelement(SearchListings_Page.listingAgent);
		Assert.assertEquals(tlname,"Kelly Arc");
		System.out.println(tlname);
		sleep(2);
	
	}
	
}
