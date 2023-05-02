package Test_Case;

import org.testng.annotations.Test;

import Page_Functions.Home_Page_Func;
import Page_Functions.Login_Page_Func;
import Page_Functions.Manage_Brokerage_Page_Func;
import Page_Functions.SearchListings_Page_Func;
import Utils.CoreTestIntegration;

public class SearchListings_Test_Case_Implementation extends CoreTestIntegration {
	
	@Test
	public void searchListings() {
		
		Login_Page_Func.loginWithBrokerCredentials();
		Login_Page_Func.ClickSubmit();
		Home_Page_Func.closePopUp();
		Home_Page_Func.openBrokerageTeamsOption();
		Manage_Brokerage_Page_Func.verifyManageBrokeragePageUrl();
		Manage_Brokerage_Page_Func.editTeam();
		Login_Page_Func.logOutByMenu();
		Login_Page_Func.loginWithNewTLCredentials();
		Login_Page_Func.ClickSubmit();
		Home_Page_Func.closePopUp();
		Home_Page_Func.selectListingOption();
		SearchListings_Page_Func.verifyListingTeamName();
		
	}

}
