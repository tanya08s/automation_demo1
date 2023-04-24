package Test_Case;

import org.testng.annotations.Test;

import Page_Functions.Home_Page_Func;
import Page_Functions.Login_Page_Func;
import Page_Functions.Manage_Brokerage_Page_Func;
import Utils.CoreActions;
import Utils.CoreTestIntegration;
import junit.framework.Assert;


public class Broker_Test_Case_Implementation extends CoreTestIntegration{
	
	@Test
	public void disbandTeam() {
		
		Login_Page_Func.loginWithBrokerCredentials();;
		Login_Page_Func.ClickSubmit();
		Home_Page_Func.closePopUp();
		Home_Page_Func.openBrokerageTeamsOption();
		Manage_Brokerage_Page_Func.verifyManageBrokeragePageUrl();
		Manage_Brokerage_Page_Func.disbandTeam();
		Manage_Brokerage_Page_Func.verifyDisbandAlertContent();
	
		
	}
	@Test
	public void acceptTeam() {
		
		Login_Page_Func.loginWithBrokerCredentials();;
		Login_Page_Func.ClickSubmit();
		Home_Page_Func.closePopUp();
		Home_Page_Func.openBrokerageTeamsOption();
		Manage_Brokerage_Page_Func.verifyManageBrokeragePageUrl();
		Manage_Brokerage_Page_Func.acceptTeam();
		Manage_Brokerage_Page_Func.VerifyTeamAcceptance();
		
	}
	@Test
	public void declineTeam() {
		
		Login_Page_Func.loginWithBrokerCredentials();
		Login_Page_Func.ClickSubmit();
		Home_Page_Func.closePopUp();
		Home_Page_Func.openBrokerageTeamsOption();
		Manage_Brokerage_Page_Func.verifyManageBrokeragePageUrl();
		Manage_Brokerage_Page_Func.declineTeam();
		
	}

}
