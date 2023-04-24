package Test_Case;

import org.testng.annotations.Test;

import Page_Functions.Login_Page_Func;
import Page_Functions.Home_Page_Func;
import Page_Functions.Manage_Team_Page_Func;

import Utils.CoreActions;
import Utils.CoreTestIntegration;
import junit.framework.Assert;

public class Manage_Team_Test_Case_Implementation extends CoreTestIntegration{
	
	@Test
	public void teamLeadTest() {
		
		Login_Page_Func.loginWithCredentials();
        Login_Page_Func.ClickSubmit();
        Home_Page_Func.closePopUp();
        Home_Page_Func.selectManageTeamOption();
        Manage_Team_Page_Func.verifyTLManageTeamsPageUrl();
        Manage_Team_Page_Func.verifyTopSection();
        Manage_Team_Page_Func.verifyMidSection();
	}

}
