package Page_Functions;


import Utils.CoreActions;
import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Object_Repository.Team_Page;

public class Team_Page_Func extends CoreActions {
	
	protected WebDriver driver3;
    public Team_Page_Func(WebDriver driver)
    {
        super(driver);
        this.driver3=driver;
    }
    
    public static void verifyteamspageurl() {
    	
    	waitForTeamsPageUrl();
    	String teamPageUrl=driver.getCurrentUrl();
    	System.out.print(teamPageUrl);
    	Assert.assertTrue(teamPageUrl.contains("https://www.tst.brightmls.com/products/teams-auth"));	
    }
   
    public static void verifyteamspagerootdivcontent() {
    	
    	waitForVisibility(Team_Page.rootdivcont1);
    	String cont1 = currentelement(Team_Page.rootdivcont1);
    	Assert.assertEquals(prop.getProperty("rootDivCont1"), cont1);
    	
    	String cont2 = currentelement(Team_Page.rootdivcont2);
    	Assert.assertEquals(prop.getProperty("rootDivCont2"), cont2);
    	
    	String cont3 = currentelement(Team_Page.rootdivcont3);
    	Assert.assertEquals(prop.getProperty("rootDivCont3"), cont3);
    	

    	String cont4 = currentelement(Team_Page.rootdivcont4);
    	Assert.assertEquals(prop.getProperty("rootDivCont4"), cont4);
    	
    	verifyAvailable(Team_Page.rootdivcontimg1);
    	
    	String cont5 = currentelement(Team_Page.rootdivcont5);
    	Assert.assertEquals(prop.getProperty("rootDivCont5"), cont5);
    	
    	verifyAvailable(Team_Page.rootdivcontimg2);
    	
    	String cont6 = currentelement(Team_Page.rootdivcont6);
    	Assert.assertEquals(prop.getProperty("rootDivCont6"), cont6);
    	
    }
    
    public static void verifyteamspagediv2content() {
    	
    	String cont1 = currentelement(Team_Page.div2cont1);
    	Assert.assertEquals(prop.getProperty("Div2Cont1"), cont1);
    	
    	String cont2 = currentelement(Team_Page.div2item1);
    	Assert.assertEquals(prop.getProperty("Div2Item1"), cont2);
    	
    	String cont3 = currentelement(Team_Page.div2item2);
    	Assert.assertEquals(prop.getProperty("Div2Item2"), cont3);
    	
    	String cont4 = currentelement(Team_Page.div2item3);
    	Assert.assertEquals(prop.getProperty("Div2Item3"), cont4);
    	
    	String cont5 = currentelement(Team_Page.div2item4);
    	Assert.assertEquals(prop.getProperty("Div2Item4"), cont5);
    	
    	String cont6 = currentelement(Team_Page.div2item5);
    	Assert.assertEquals(prop.getProperty("Div2Item5"), cont6);
    	
    	String cont7 = currentelement(Team_Page.div2item6);
    	Assert.assertEquals(prop.getProperty("Div2Item6"), cont7);
    	
    	String cont8 = currentelement(Team_Page.div2item7);
    	Assert.assertEquals(prop.getProperty("Div2Item7"), cont8);
    	
    	String cont9 = currentelement(Team_Page.div2item8);
    	Assert.assertEquals(prop.getProperty("Div2Item8"), cont9);
    }
    
    
    public static void verifyteamspagediv3content() {
    
    	String cont1 = currentelement(Team_Page.div3cont1);
    	Assert.assertEquals(prop.getProperty("Div3Cont1"), cont1);
    	
    	String cont2 = currentelement(Team_Page.div3cont2);
    	Assert.assertEquals(prop.getProperty("Div3Cont2"), cont2);
    	
    }
    
    public static void verifyteamspagediv4content() {
    
    	String cont1 = currentelement(Team_Page.div4cont1);
    	Assert.assertEquals(prop.getProperty("Div4Cont1"), cont1);
    	
    	String cont2 = currentelement(Team_Page.div4cont2);
    	Assert.assertEquals(prop.getProperty("Div4Cont2"), cont2);
    	
    	
    	verifyAvailable(Team_Page.div4img1);
    	
    	
    }
  public static void verifyteamspagediv5content() {
    	
	    String cont1 = currentelement(Team_Page.div5cont1);
    	Assert.assertEquals(prop.getProperty("Div5Cont1"), cont1);
    	
    	String cont2 = currentelement(Team_Page.div5cont2);
    	Assert.assertEquals(prop.getProperty("Div5Cont2"), cont2);
    	
    	
    	verifyAvailable(Team_Page.div5img1);
    	
    	
    }
  public static void verifyteamspagediv6content() {
  	
	String cont1 = currentelement(Team_Page.div6cont1);
  	Assert.assertEquals(prop.getProperty("Div6Cont1"), cont1);
  	
  	String cont2 = currentelement(Team_Page.div6cont2);
  	Assert.assertEquals(prop.getProperty("Div6Cont2"), cont2);
  
  	
  	verifyAvailable(Team_Page.div6img1);
  	
  	
  }
  public static void verifyteamspagediv7content() {
  	
  
	String cont1 = currentelement(Team_Page.div7cont1);
  	Assert.assertEquals(prop.getProperty("Div7Cont1"), cont1);
  	
  	String cont2 = currentelement(Team_Page.div7cont2);
  	Assert.assertEquals(prop.getProperty("Div7Cont2"), cont2);
  
  	
  	verifyAvailable(Team_Page.div7img1);
  	
  	
  }
  
  public static void verifyteamspagediv8content() {
	  	
	  	
	    String cont1 = currentelement(Team_Page.div8cont1);
	  	Assert.assertEquals(prop.getProperty("Div8Cont1"), cont1);
	  	
	  	String cont2 = currentelement(Team_Page.div8cont2);
	  	Assert.assertEquals(prop.getProperty("Div8Cont2"), cont2);
	  	
	  	String cont3 = currentelement(Team_Page.div8cont3);
	  	Assert.assertEquals(prop.getProperty("Div8Cont3"), cont3);
	  	
	  	String cont4 = currentelement(Team_Page.div8cont4);
	  	Assert.assertEquals(prop.getProperty("Div8Cont4"), cont4);
	  
	  	String cont5 = currentelement(Team_Page.div8cont5);
	  	Assert.assertEquals(prop.getProperty("Div8Cont5"), cont5);
	  	
	  	String cont6 = currentelement(Team_Page.div8cont6);
	  	Assert.assertEquals(prop.getProperty("Div8Cont6"), cont6);
	  	
	  	String cont7 = currentelement(Team_Page.div8cont7);
	  	Assert.assertEquals(prop.getProperty("Div8Cont7"), cont7);
	  	
	  	String cont8 = currentelement(Team_Page.div8cont8);
	  	Assert.assertEquals(prop.getProperty("Div8Cont8"), cont8);
	  	
	  	String cont9 = currentelement(Team_Page.div8cont9);
	  	Assert.assertEquals(prop.getProperty("Div8Cont9"), cont9);
	  	
	  	String cont10 = currentelement(Team_Page.div8cont10);
	  	Assert.assertEquals(prop.getProperty("Div8Cont10"), cont10);
	  	
	  	String cont11 = currentelement(Team_Page.div8cont11);
	  	Assert.assertEquals(prop.getProperty("Div8Cont11"), cont11);
	  	
	  	String cont12 = currentelement(Team_Page.div8cont12);
	  	Assert.assertEquals(prop.getProperty("Div8Cont12"), cont12);
	  	
	  	String cont13 = currentelement(Team_Page.div8cont13);
	  	Assert.assertEquals(prop.getProperty("Div8Cont13"), cont13);
	  	
	  	String cont15 = currentelement(Team_Page.div8cont15);
	  	Assert.assertEquals(prop.getProperty("Div8Cont15"), cont15);
	  	System.out.print(cont15);
	  	
	  	
	  }
  
  public static void verifyteamspagediv9content() {
	  
	    String cont1 = currentelement(Team_Page.div9cont1);
	  	Assert.assertEquals(prop.getProperty("Div9Cont1"), cont1);
	  	
	  	String cont2 = currentelement(Team_Page.div9cont2);
	  	Assert.assertEquals(prop.getProperty("Div9Cont2"), cont2);
	  	
	  	String cont3 = currentelement(Team_Page.div9cont3);
	  	Assert.assertEquals(prop.getProperty("Div9Cont3"), cont3);
	  	
	  	String cont4 = currentelement(Team_Page.div9cont4);
	  	Assert.assertEquals(prop.getProperty("Div9Cont4"), cont4);
	  	
	  	String cont5 = currentelement(Team_Page.div9cont5);
	  	Assert.assertEquals(prop.getProperty("Div9Cont5"), cont5);
	  	
	  	String cont1a = currentelement(Team_Page.div9cont1a);
	  	Assert.assertEquals(prop.getProperty("Div9Cont1a"), cont1a);
	  	
	  	String cont1b = currentelement(Team_Page.div9cont1b);
	  	Assert.assertEquals(prop.getProperty("Div9Cont1b"), cont1b);
	  	
	  	String cont1c = currentelement(Team_Page.div9cont1c);
	  	Assert.assertEquals(prop.getProperty("Div9Cont1c"), cont1c);
	  	
	  	String cont1d = currentelement(Team_Page.div9cont1d);
	  	Assert.assertEquals(prop.getProperty("Div9Cont1d"), cont1d);
	  	
	  	String cont1e = currentelement(Team_Page.div9cont1e);
	  	Assert.assertEquals(prop.getProperty("Div9Cont1e"), cont1e);
	  	
	  	String cont1f = currentelement(Team_Page.div9cont1f);
	  	Assert.assertEquals(prop.getProperty("Div9Cont1f"), cont1f);
	  	
	  	String cont1g = currentelement(Team_Page.div9cont1g);
	  	Assert.assertEquals(prop.getProperty("Div9Cont1g"), cont1g);
	  	

  }  
  
  public static void verifyteamspagediv10content() {
	  	
	    String cont1 = currentelement(Team_Page.div10cont1);
	  	Assert.assertEquals(prop.getProperty("Div10Cont1"), cont1);
	  	
	  	String cont2 = currentelement(Team_Page.div10cont2);
	  	Assert.assertEquals(prop.getProperty("Div10Cont2"), cont2);
	  	
  }
  
    public static void teamsignup() {
    	
    	sleep(2);
    	waitForVisibility(Team_Page.teamsGetStarted);
    	click(Team_Page.teamsGetStarted);
    	
    }
    
    public static void verifyteamssignupurl() {
    	
    	waitForTeamsSignUpPage();
    	String teamSignUp=driver.getCurrentUrl();
    	Assert.assertTrue(teamSignUp.contains("https://teams.tst.brightmls.com/TeamSignUp"));	
    }
    
    public static void teamcreation() {
    	
    	sleep(4);
    	sleep(2);
    	waitForVisibility(Team_Page.teamleadoption);
    	click(Team_Page.teamleadoption);
    	waitForVisibility(Team_Page.teamnameoption);
    	enter_value(Team_Page.teamnameoption,"Archer Pac Team1");
    	
    }
    
   public static void teamMemberCheckbox() {
	   
	    sleep(2);	
    	click(Team_Page.agentcheckbox2);
    	String c2 = getAttribute(Team_Page.agentcheckbox2,"value");
        System.out.println(c2);
    	
    	click(Team_Page.agentcheckbox3);
    	String c3 = getAttribute(Team_Page.agentcheckbox3,"value");
        System.out.println(c3);
    	
	    
    	click(Team_Page.agentcheckbox1);
    	String c1 = getAttribute(Team_Page.agentcheckbox1,"value");
        System.out.println(c1);
    	
    	
    }
    public static void teamsProOption() {
    	
    	waitForVisibility(Team_Page.premiumteamoption);
    	click(Team_Page.premiumteamoption);
    	sleep(2);
    	waitForVisibility(Team_Page.popup);
    	click(Team_Page.popupclose);
    	waitForVisibility(Team_Page.aggrementcheckbox1);
    	click(Team_Page.aggrementcheckbox1);
    	waitForVisibility(Team_Page.aggrementcheckbox2);
    	click(Team_Page.aggrementcheckbox2);
    	
    }
    
    public static void teamsOption() {
    	
    	waitForVisibility(Team_Page.basicteamoption);
    	click(Team_Page.basicteamoption);
    	waitForVisibility(Team_Page.aggrementcheckbox1);
    	click(Team_Page.aggrementcheckbox1);
    	
    }
    
    
    public static void verifyTeamReqSubmission() {
    	
    	sleep(2);
    	waitForVisibility(Team_Page.submission);
    	String c = currentelement(Team_Page.submission);
	  	Assert.assertEquals(prop.getProperty("submissionText"), c);
	  	System.out.println("Team request successfully submitted");
    	
    }
    
   public static void submit() {
    	
    	waitForVisibility(Team_Page.submit);
    	click(Team_Page.submit);
    	sleep(5);
    	verifyTeamReqSubmission();
    		
    }
    public static void teamError() {
    	
    	sleep(2);
    	String c = currentelement(Team_Page.teamError);
    	String errorText= prop.getProperty("errorText");
    	Assert.assertTrue(c+" is shown",c.contains(errorText));
    	String c1 = currentelement(Team_Page.errorCode);
    	String errorCode= prop.getProperty("errorCode");
    	Assert.assertTrue(c1+" is shown",c1.contains(errorCode));
  
    }
    
   
    public static void creatingTeam() {
    	teamsignup();
    	verifyteamssignupurl();
    	teamcreation();
    	teamMemberCheckbox();
    	teamsProOption();
    	submit();
    	sleep(2);
    }
    
    public static void teamCreationByUrl() {
    	
    	sleep(3);
    	teamSignUpPageURL();
    	sleep(3);
//    	teamcreation();
//    	teamMemberCheckbox();
//    	teamsProOption();
//    	submit();
    	
    }
    public static void makeTeam() {
    	sleep(3);
    	verifyteamssignupurl();
    	teamcreation();
    	teamMemberCheckbox();
    	teamsProOption();
    	submit();
    	sleep(2);
    	
    }
    
    
    public static void teamError2() {
    	
    	waitForVisibility(Team_Page.rootdivcont4);
    	String c = currentelement(Team_Page.rootdivcont4);
    	System.out.println(c);
    	if(c.equals(prop.getProperty("rootDivCont7"))){
    		openTeamSignUpUrl();
        	teamcreation();
        	teamMemberCheckbox();
        	teamsOption();
        	submit();
        	teamError();
    	}
    	else {
    		System.out.println("Team is in pending state!! Accept or decline team first.");
    	}
    		
    }
    
    
    
	
}
