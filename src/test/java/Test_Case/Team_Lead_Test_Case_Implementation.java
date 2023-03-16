package Test_Case;

import org.testng.annotations.Test;

import Page_Functions.Login_Page_Func;
import Page_Functions.TL_Home_Page_Func;
import Page_Functions.TL_Manage_Team_Page_Func;

import Utils.CoreActions;
import Utils.CoreTestIntegration;
import junit.framework.Assert;

public class Team_Lead_Test_Case_Implementation extends CoreTestIntegration{
	
	@Test
	public void teamLeadTest() {
		
		Login_Page_Func.loginWithCredentials();
        Login_Page_Func.ClickSubmit();
        TL_Home_Page_Func.closePopUp();
        TL_Home_Page_Func.selectManageTeamOption();
        TL_Manage_Team_Page_Func.verifyTLManageTeamsPageUrl();
        TL_Manage_Team_Page_Func.verifyTopSection();
        TL_Manage_Team_Page_Func.verifyMidSection();
	}

}
