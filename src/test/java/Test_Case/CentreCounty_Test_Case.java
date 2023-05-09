package Test_Case;

import org.testng.annotations.Test;

import Page_Functions.Centre_County_Page_Func;
import Page_Functions.Home_Page_Func;
import Page_Functions.Login_Page_Func;
import Utils.CoreTestIntegration;

public class CentreCounty_Test_Case extends CoreTestIntegration{
	
	@Test
	public void verifyHeroSection() {
		
		 Login_Page_Func.loginWithCCARUser();
	     Login_Page_Func.ClickSubmit();
	     Home_Page_Func.closePopUp();
	     Home_Page_Func.supportGettingStartedOption();
	     Home_Page_Func.centreCountyURL();
	     Centre_County_Page_Func.verifyHeroSection();
	          
	}
	@Test
	public void verifyDiscoverBrightSection() {
		
		 Login_Page_Func.loginWithCCARUser();
	     Login_Page_Func.ClickSubmit();
	     Home_Page_Func.closePopUp();
	     Home_Page_Func.supportGettingStartedOption();
	     Home_Page_Func.centreCountyURL();
	     Centre_County_Page_Func.verifyDiscoverBrightSection();
	          
	}

}
