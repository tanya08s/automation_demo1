package Test_Case;


import org.testng.annotations.Test;

import Page_Functions.Home_Page_Func;
import Page_Functions.Login_Page_Func;
import Utils.CoreActions;
import Utils.CoreTestIntegration;
import junit.framework.Assert;

public class Test_Case_Implementation  extends CoreTestIntegration {
	
	@Test
	public void testing_username_insertion() {
		
		Login_Page_Func.loginWithCredentials();
        Login_Page_Func.ClickSubmit();
        Home_Page_Func.closePopUp();
  
        
	}
}
