package Test_Case;


import org.testng.annotations.Test;

import Page_Functions.Home_Page_Func;
import Page_Functions.Login_Page_Func;
import Page_Functions.Team_Page_Func;
import Utils.CoreActions;
import Utils.CoreTestIntegration;
import junit.framework.Assert;

public class Test_Case_Implementation  extends CoreTestIntegration {
	
	@Test
	public void brightMlsTest() {
		
		Login_Page_Func.loginWithCredentials();
        Login_Page_Func.ClickSubmit();
        Home_Page_Func.closePopUp();
        Home_Page_Func.teamsOption();
//        Team_Page_Func.verifyteamspageurl();
//        Team_Page_Func.verifyteamspagerootdivcontent();
//        Team_Page_Func.verifyteamspagediv2content();
//        Team_Page_Func.verifyteamspagediv3content();
//        Team_Page_Func.verifyteamspagediv4content();
//        Team_Page_Func.verifyteamspagediv5content();
//        Team_Page_Func.verifyteamspagediv6content();
//        Team_Page_Func.verifyteamspagediv7content();
//        Team_Page_Func.verifyteamspagediv8content();
//        Team_Page_Func.verifyteamspagediv9content();
//        Team_Page_Func.verifyteamspagediv10content();

        Team_Page_Func.teamsignup();
        Team_Page_Func.verifyteamssignupurl();
        Team_Page_Func.teamcreation();
        Team_Page_Func.closePopUp();
        Team_Page_Func.submit();
        Team_Page_Func.verifyTeamReqSubmission();
  
        
	}
}
