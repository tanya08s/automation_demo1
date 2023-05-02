package Test_Case;
import org.testng.annotations.Test;

import Page_Functions.Home_Page_Func;
import Page_Functions.Login_Page_Func;
import Page_Functions.Manage_Team_Page_Func;
import Page_Functions.ProductivityView_Page_Func;

import Utils.CoreTestIntegration;

public class ProductivityView_Test_Case_Implementation extends CoreTestIntegration{
	
	@Test
	public void verifyGoals() {
		Login_Page_Func.loginWithNewTLCredentials();
		Login_Page_Func.ClickSubmit();
		Home_Page_Func.closePopUp();
		Home_Page_Func.selectManageTeamOption();
		Manage_Team_Page_Func.verifyTLManageTeamsPageUrl();
		Manage_Team_Page_Func.setTLGoals();
		Manage_Team_Page_Func.setTMGoals();
		Manage_Team_Page_Func.navigateToDashboard();
		Manage_Team_Page_Func.verifyViewDetailsPresence();
		ProductivityView_Page_Func.verifyTeamGoals();
		ProductivityView_Page_Func.verifyIndividualTLGoals();
		ProductivityView_Page_Func.verifyIndividualTMGoals();
		
	}
	
	@Test
	public void verifyPreviousYearListingData() {
		
		Login_Page_Func.loginWithNewUserCredentials();
		Login_Page_Func.ClickSubmit();
		Home_Page_Func.closePopUp();
		Home_Page_Func.selectYearProdDiv();
		ProductivityView_Page_Func.verifyStaticData();
		ProductivityView_Page_Func.verifyCurrYearStaticData();
		ProductivityView_Page_Func.verifyActualTeamGoal();
		
	
	}
	
	
	

}
