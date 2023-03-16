package Test_Case;

import org.testng.annotations.Test;

import Page_Functions.Broker_Home_Page_Func;
import Page_Functions.Login_Page_Func;
import Page_Functions.Broker_Manage_Brokerage_Page_Func;
import Utils.CoreActions;
import Utils.CoreTestIntegration;
import junit.framework.Assert;


public class Broker_Test_Case_Implementation extends CoreTestIntegration{
	
	@Test
	public void brightMlsBrokerTest() {
		
		Login_Page_Func.loginWithBrokerCredentials();;
		Login_Page_Func.ClickSubmit();
		Broker_Home_Page_Func.closePopUp();
		Broker_Home_Page_Func.openBrokerageTeamsOption();
		Broker_Manage_Brokerage_Page_Func.verifyManageBrokeragePageUrl();
		Broker_Manage_Brokerage_Page_Func.acceptTeam();
		
		
	}

}
