package Test_Case;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page_Functions.Home_Page_Func;
import Page_Functions.Login_Page_Func;
import Page_Functions.Manage_Brokerage_Page_Func;
import Page_Functions.Manage_Team_Page_Func;
import Page_Functions.Team_Page_Func;
import Utils.CoreTestIntegration;

public class Team_Test_Case_Implementation extends CoreTestIntegration {
	
	
	@BeforeMethod(alwaysRun = true)
	public void checkTeamStatus() {
		Login_Page_Func.loginWithBrokerCredentials();
        Login_Page_Func.ClickSubmit();
		Home_Page_Func.closePopUp();
		Home_Page_Func.openBrokerageTeamsOption();
		Manage_Brokerage_Page_Func.checkTeamReq();
		Login_Page_Func.logOutByMenu();
	}
	
	@Test
	public void Team() {
		Login_Page_Func.loginWithCredentials();
        Login_Page_Func.ClickSubmit();
        Team_Page_Func.teamCreationByUrl();
        Team_Page_Func.makeTeam();
        Login_Page_Func.logOutByMenu();
        Login_Page_Func.loginWithBrokerCredentials();
        Login_Page_Func.ClickSubmit();
		Home_Page_Func.closePopUp();
		Home_Page_Func.openBrokerageTeamsOption();
		Manage_Brokerage_Page_Func.acceptArcherTeam();
		Login_Page_Func.logOutByMenu();
		Login_Page_Func.loginWithCredentials();
        Login_Page_Func.ClickSubmit();
        Home_Page_Func.closePopUp();
        Home_Page_Func.selectManageTeamOption();
	}

}
