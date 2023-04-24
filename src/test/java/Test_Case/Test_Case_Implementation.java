package Test_Case;


import org.testng.annotations.Test;

import Page_Functions.Home_Page_Func;
import Page_Functions.Login_Page_Func;
import Page_Functions.Manage_Team_Page_Func;
import Page_Functions.Team_Page_Func;
import Utils.CoreActions;
import Utils.CoreTestIntegration;
import junit.framework.Assert;

public class Test_Case_Implementation  extends CoreTestIntegration {
	
	@Test
	public void verifyTeamsAuthContent() {
		
		Login_Page_Func.loginWithCredentials();
        Login_Page_Func.ClickSubmit();
        Home_Page_Func.closePopUp();
        Home_Page_Func.teamsOption();
        Team_Page_Func.verifyteamspageurl();
        Team_Page_Func.verifyteamspagerootdivcontent();
        Team_Page_Func.verifyteamspagediv2content();
        Team_Page_Func.verifyteamspagediv3content();
        Team_Page_Func.verifyteamspagediv4content();
        Team_Page_Func.verifyteamspagediv5content();
        Team_Page_Func.verifyteamspagediv6content();
        Team_Page_Func.verifyteamspagediv7content();
        Team_Page_Func.verifyteamspagediv8content();
        Team_Page_Func.verifyteamspagediv9content();
        Team_Page_Func.verifyteamspagediv10content();
               
	}
	    @Test
        public void verifyTeamCreationError() {
        	Login_Page_Func.loginWithCredentials();
            Login_Page_Func.ClickSubmit();
            Home_Page_Func.closePopUp();
        	Home_Page_Func.teamsOption();
            Team_Page_Func.creatingTeam();
            Team_Page_Func.teamError();
            
        }
        
	    @Test
	    public void teamCreation() {
	    	
	    	Login_Page_Func.loginWithCredentials();
            Login_Page_Func.ClickSubmit();
            Home_Page_Func.closePopUp();
        	Home_Page_Func.teamsOption();
            Team_Page_Func.creatingTeam();
            Team_Page_Func.verifyTeamReqSubmission();
	    }
	    
	    @Test
	    public void verifyTeamCreationError2() {
	    	
	    	Login_Page_Func.loginWithCredentials();
	        Login_Page_Func.ClickSubmit();
	        Home_Page_Func.closePopUp();
            Home_Page_Func.teamsOption();
            Team_Page_Func.verifyteamspageurl();
            Team_Page_Func.teamError2();
  	
	    }
	    @Test
	    public void addTeamMember() {
	    	
	    	Login_Page_Func.loginWithCredentials();
	        Login_Page_Func.ClickSubmit();
	        Home_Page_Func.closePopUp();
	        Home_Page_Func.selectManageTeamOption();
	    	Manage_Team_Page_Func.addTeamMember();
	    }
	    
	    @Test
	    public void verifyTMResendRequest(){
	    	
	    	Login_Page_Func.loginWithCredentials();
	        Login_Page_Func.ClickSubmit();
	        Home_Page_Func.closePopUp();
	        Home_Page_Func.selectManageTeamOption();
	    	Manage_Team_Page_Func.resendTMInvite();
	    	Manage_Team_Page_Func.verifyResendAlert();
	    }
        
	    @Test
	    public void verifyTMCancelRequest() {
	    	
	    	Login_Page_Func.loginWithCredentials();
	        Login_Page_Func.ClickSubmit();
	        Home_Page_Func.closePopUp();
	        Home_Page_Func.selectManageTeamOption();
	    	Manage_Team_Page_Func.cancelTMInvite();
	    	
	    }
	    
	    @Test
	    public void verifyProductivityViewTL() {
	    	
	    	Login_Page_Func.loginWithCredentials();
	        Login_Page_Func.ClickSubmit();
	        Home_Page_Func.closePopUp();
	        Home_Page_Func.selectManageTeamOption();
	        Manage_Team_Page_Func.setViewTL();
	        Login_Page_Func.logOutByMenu();
	        Login_Page_Func.loginWithCredentials();
	        Login_Page_Func.ClickSubmit();
	        Home_Page_Func.closePopUp();
	        Manage_Team_Page_Func.verifyProductivityViewTL();
	    	
	    }
	    
	    @Test
	    public void verifyProductivityViewTM(){
	    	
	    	Login_Page_Func.loginWithCredentials();
	        Login_Page_Func.ClickSubmit();
	        Home_Page_Func.closePopUp();
	        Home_Page_Func.selectManageTeamOption();
	        Manage_Team_Page_Func.setViewTM();
	        Login_Page_Func.logOutByMenu();
	    	Login_Page_Func.loginWithTMCredentials();
	    	Login_Page_Func.ClickSubmit();
	        Home_Page_Func.closePopUp();
	        Manage_Team_Page_Func.verifyProductivityViewTM();
	    }
	    
	    
	    @Test
	    public void verifyRISMediaContent() {
	    	
	    	Login_Page_Func.loginWithCredentials();
	        Login_Page_Func.ClickSubmit();
	        Home_Page_Func.closePopUp();
	        Home_Page_Func.verifyRISMediaContent();
	    }
	    
	    
	   	
}
