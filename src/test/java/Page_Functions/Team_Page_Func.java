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
    
    public static WebElement currentelement(By e) { 
    	WebElement ele=driver.findElement(e);
        return ele;
    }
    
    public static void verifyteamspagerootdivcontent() {
    	
    	waitForVisibility(Team_Page.rootdivcont1);
    	WebElement cont1 = currentelement(Team_Page.rootdivcont1);
    	Assert.assertEquals(prop.getProperty("rootDivCont1"), cont1.getText());
    	
    	WebElement cont2 = currentelement(Team_Page.rootdivcont2);
    	Assert.assertEquals(prop.getProperty("rootDivCont2"), cont2.getText());
    	
    	WebElement cont3 = currentelement(Team_Page.rootdivcont3);
    	Assert.assertEquals(prop.getProperty("rootDivCont3"), cont3.getText());
    	

    	WebElement cont4 = currentelement(Team_Page.rootdivcont4);
    	Assert.assertEquals(prop.getProperty("rootDivCont4"), cont4.getText());
    	
    	verifyAvailable(Team_Page.rootdivcontimg1);
    	
    	WebElement cont5 = currentelement(Team_Page.rootdivcont5);
    	Assert.assertEquals(prop.getProperty("rootDivCont5"), cont5.getText());
    	
    	verifyAvailable(Team_Page.rootdivcontimg2);
    	
    	WebElement cont6 = currentelement(Team_Page.rootdivcont6);
    	Assert.assertEquals(prop.getProperty("rootDivCont6"), cont6.getText());
    	
    }
    
    public static void verifyteamspagediv2content() {
    	
    	JavascriptExecutor j = (JavascriptExecutor)driver;
    	j.executeScript("window.scrollBy(0,500)");
    	
    	WebElement cont1 = currentelement(Team_Page.div2cont1);
    	Assert.assertEquals(prop.getProperty("Div2Cont1"), cont1.getText());
    	
    	WebElement cont2 = currentelement(Team_Page.div2item1);
    	Assert.assertEquals(prop.getProperty("Div2Item1"), cont2.getText());
    	
    	WebElement cont3 = currentelement(Team_Page.div2item2);
    	Assert.assertEquals(prop.getProperty("Div2Item2"), cont3.getText());
    	
    	WebElement cont4 = currentelement(Team_Page.div2item3);
    	Assert.assertEquals(prop.getProperty("Div2Item3"), cont4.getText());
    	
    	WebElement cont5 = currentelement(Team_Page.div2item4);
    	Assert.assertEquals(prop.getProperty("Div2Item4"), cont5.getText());
    	
    	WebElement cont6 = currentelement(Team_Page.div2item5);
    	Assert.assertEquals(prop.getProperty("Div2Item5"), cont6.getText());
    	
    	WebElement cont7 = currentelement(Team_Page.div2item6);
    	Assert.assertEquals(prop.getProperty("Div2Item6"), cont7.getText());
    	
    	WebElement cont8 = currentelement(Team_Page.div2item7);
    	Assert.assertEquals(prop.getProperty("Div2Item7"), cont8.getText());
    	
    	WebElement cont9 = currentelement(Team_Page.div2item8);
    	Assert.assertEquals(prop.getProperty("Div2Item8"), cont9.getText());
    }
    
    
    public static void verifyteamspagediv3content() {
    	
    	JavascriptExecutor j = (JavascriptExecutor)driver;
    	j.executeScript("window.scrollBy(0,400)");
    	
    	WebElement cont1 = currentelement(Team_Page.div3cont1);
    	Assert.assertEquals(prop.getProperty("Div3Cont1"), cont1.getText());
    	
    	WebElement cont2 = currentelement(Team_Page.div3cont2);
    	Assert.assertEquals(prop.getProperty("Div3Cont2"), cont2.getText());
    	
    }
    
    public static void verifyteamspagediv4content() {
    	
    	JavascriptExecutor j = (JavascriptExecutor)driver;
    	j.executeScript("window.scrollBy(0,400)");
    	
    	WebElement cont1 = currentelement(Team_Page.div4cont1);
    	Assert.assertEquals(prop.getProperty("Div4Cont1"), cont1.getText());
    	
    	WebElement cont2 = currentelement(Team_Page.div4cont2);
    	Assert.assertEquals(prop.getProperty("Div4Cont2"), cont2.getText());
    	
    	
    	verifyAvailable(Team_Page.div4img1);
    	
    	
    }
  public static void verifyteamspagediv5content() {
    	
    	JavascriptExecutor j = (JavascriptExecutor)driver;
    	j.executeScript("window.scrollBy(0,400)");
    	
    	WebElement cont1 = currentelement(Team_Page.div5cont1);
    	Assert.assertEquals(prop.getProperty("Div5Cont1"), cont1.getText());
    	
    	WebElement cont2 = currentelement(Team_Page.div5cont2);
    	Assert.assertEquals(prop.getProperty("Div5Cont2"), cont2.getText());
    	
    	
    	verifyAvailable(Team_Page.div5img1);
    	
    	
    }
  public static void verifyteamspagediv6content() {
  	
  	JavascriptExecutor j = (JavascriptExecutor)driver;
  	j.executeScript("window.scrollBy(0,400)");
  	
  	WebElement cont1 = currentelement(Team_Page.div6cont1);
  	Assert.assertEquals(prop.getProperty("Div6Cont1"), cont1.getText());
  	
  	WebElement cont2 = currentelement(Team_Page.div6cont2);
  	Assert.assertEquals(prop.getProperty("Div6Cont2"), cont2.getText());
  
  	
  	verifyAvailable(Team_Page.div6img1);
  	
  	
  }
  public static void verifyteamspagediv7content() {
  	
  	JavascriptExecutor j = (JavascriptExecutor)driver;
  	j.executeScript("window.scrollBy(0,400)");
  	
  	WebElement cont1 = currentelement(Team_Page.div7cont1);
  	Assert.assertEquals(prop.getProperty("Div7Cont1"), cont1.getText());
  	
  	WebElement cont2 = currentelement(Team_Page.div7cont2);
  	Assert.assertEquals(prop.getProperty("Div7Cont2"), cont2.getText());
  
  	
  	verifyAvailable(Team_Page.div7img1);
  	
  	
  }
  
  public static void verifyteamspagediv8content() {
	  	
	  	JavascriptExecutor j = (JavascriptExecutor)driver;
	  	j.executeScript("window.scrollBy(0,400)");
	  	
	  	WebElement cont1 = currentelement(Team_Page.div8cont1);
	  	Assert.assertEquals(prop.getProperty("Div8Cont1"), cont1.getText());
	  	
	  	WebElement cont2 = currentelement(Team_Page.div8cont2);
	  	Assert.assertEquals(prop.getProperty("Div8Cont2"), cont2.getText());
	  	
	  	WebElement cont3 = currentelement(Team_Page.div8cont3);
	  	Assert.assertEquals(prop.getProperty("Div8Cont3"), cont3.getText());
	  	
	  	WebElement cont4 = currentelement(Team_Page.div8cont4);
	  	Assert.assertEquals(prop.getProperty("Div8Cont4"), cont4.getText());
	  
	  	WebElement cont5 = currentelement(Team_Page.div8cont5);
	  	Assert.assertEquals(prop.getProperty("Div8Cont5"), cont5.getText());
	  	
	  	WebElement cont6 = currentelement(Team_Page.div8cont6);
	  	Assert.assertEquals(prop.getProperty("Div8Cont6"), cont6.getText());
	  	
	  	WebElement cont7 = currentelement(Team_Page.div8cont7);
	  	Assert.assertEquals(prop.getProperty("Div8Cont7"), cont7.getText());
	  	
	  	WebElement cont8 = currentelement(Team_Page.div8cont8);
	  	Assert.assertEquals(prop.getProperty("Div8Cont8"), cont8.getText());
	  	
	  	WebElement cont9 = currentelement(Team_Page.div8cont9);
	  	Assert.assertEquals(prop.getProperty("Div8Cont9"), cont9.getText());
	  	
	  	WebElement cont10 = currentelement(Team_Page.div8cont10);
	  	Assert.assertEquals(prop.getProperty("Div8Cont10"), cont10.getText());
	  	
	  	WebElement cont11 = currentelement(Team_Page.div8cont11);
	  	Assert.assertEquals(prop.getProperty("Div8Cont11"), cont11.getText());
	  	
	  	WebElement cont12 = currentelement(Team_Page.div8cont12);
	  	Assert.assertEquals(prop.getProperty("Div8Cont12"), cont12.getText());
	  	
	  	WebElement cont13 = currentelement(Team_Page.div8cont13);
	  	Assert.assertEquals(prop.getProperty("Div8Cont13"), cont13.getText());
	  	
//	  	waitForVisibility(Team_Page.div8cont14);
//	  	WebElement cont14 = currentelement(Team_Page.div8cont14);
//	  	Assert.assertEquals(prop.getProperty("Div8Cont14"), cont14.getText());
	  	
	  	WebElement cont15 = currentelement(Team_Page.div8cont15);
	  	Assert.assertEquals(prop.getProperty("Div8Cont15"), cont15.getText());
	  	System.out.print(cont15.getText());
	  	
	  	
	  }
  
  public static void verifyteamspagediv9content() {
	  	
	  	JavascriptExecutor j = (JavascriptExecutor)driver;
	  	j.executeScript("window.scrollBy(0,400)");
	  	
	  	WebElement cont1 = currentelement(Team_Page.div9cont1);
	  	Assert.assertEquals(prop.getProperty("Div9Cont1"), cont1.getText());
	  	
	  	WebElement cont2 = currentelement(Team_Page.div9cont2);
	  	Assert.assertEquals(prop.getProperty("Div9Cont2"), cont2.getText());
	  	
	  	WebElement cont3 = currentelement(Team_Page.div9cont3);
	  	Assert.assertEquals(prop.getProperty("Div9Cont3"), cont3.getText());
	  	
	  	WebElement cont4 = currentelement(Team_Page.div9cont4);
	  	Assert.assertEquals(prop.getProperty("Div9Cont4"), cont4.getText());
	  	
	  	WebElement cont5 = currentelement(Team_Page.div9cont5);
	  	Assert.assertEquals(prop.getProperty("Div9Cont5"), cont5.getText());
	  	
	  	WebElement cont1a = currentelement(Team_Page.div9cont1a);
	  	Assert.assertEquals(prop.getProperty("Div9Cont1a"), cont1a.getText());
	  	
	  	WebElement cont1b = currentelement(Team_Page.div9cont1b);
	  	Assert.assertEquals(prop.getProperty("Div9Cont1b"), cont1b.getText());
	  	
	  	WebElement cont1c = currentelement(Team_Page.div9cont1c);
	  	Assert.assertEquals(prop.getProperty("Div9Cont1c"), cont1c.getText());
	  	
	  	WebElement cont1d = currentelement(Team_Page.div9cont1d);
	  	Assert.assertEquals(prop.getProperty("Div9Cont1d"), cont1d.getText());
	  	
	
	  	WebElement cont1e = currentelement(Team_Page.div9cont1e);
	  	Assert.assertEquals(prop.getProperty("Div9Cont1e"), cont1e.getText());
	  	
	
	  	WebElement cont1f = currentelement(Team_Page.div9cont1f);
	  	Assert.assertEquals(prop.getProperty("Div9Cont1f"), cont1f.getText());
	  	

	  	WebElement cont1g = currentelement(Team_Page.div9cont1g);
	  	Assert.assertEquals(prop.getProperty("Div9Cont1g"), cont1g.getText());
	  	

  }  
  
  public static void verifyteamspagediv10content() {
	  	
	  	JavascriptExecutor j = (JavascriptExecutor)driver;
	  	j.executeScript("window.scrollBy(0,400)");
	  	
	  	WebElement cont1 = currentelement(Team_Page.div10cont1);
	  	Assert.assertEquals(prop.getProperty("Div10Cont1"), cont1.getText());
	  	
	  	WebElement cont2 = currentelement(Team_Page.div10cont2);
	  	Assert.assertEquals(prop.getProperty("Div10Cont2"), cont2.getText());
	  	
  }
  
    public static void teamsignup() {
    	
    	waitForVisibility(Team_Page.teamsGetStarted);
    	click(Team_Page.teamsGetStarted);
    	
    }
    
    public static void verifyteamssignupurl() {
    	
    	waitForTeamsSignUpPage();
    	String teamSignUp=driver.getCurrentUrl();
    	System.out.print(teamSignUp);
    	Assert.assertTrue(teamSignUp.contains("https://teams.tst.brightmls.com/TeamSignUp"));	
    }
    
    public static void teamcreation() {
    	
    	sleep(4);
    	waitForVisibility(Team_Page.teamleadoption);
    	click(Team_Page.teamleadoption);
    	JavascriptExecutor j = (JavascriptExecutor)driver;
    	j.executeScript("window.scrollBy(0,400)");
    	sleep(2);
    	waitForVisibility(Team_Page.teamnameoption);
    	enter_value(Team_Page.teamnameoption,"Archer Pac Team1");
    	sleep(2);
    	j.executeScript("window.scrollBy(0,400)");
    	waitForVisibility(Team_Page.premiumteamoption);
    	click(Team_Page.premiumteamoption);
    	
    	
    }
    
    public static void closePopUp() {
    	
    	sleep(2);
    	waitForVisibility(Team_Page.popup);
    	click(Team_Page.popupclose);
    	
    }
    public static void submit() {
    	
    	JavascriptExecutor j = (JavascriptExecutor)driver;
    	j.executeScript("window.scrollBy(0,600)");
    	waitForVisibility(Team_Page.aggrementcheckbox1);
    	click(Team_Page.aggrementcheckbox1);
    	waitForVisibility(Team_Page.aggrementcheckbox2);
    	click(Team_Page.aggrementcheckbox2);
    	waitForVisibility(Team_Page.submit);
    	click(Team_Page.submit);
    	sleep(4);
    	
    }
    public static void verifyTeamReqSubmission() {
    	
    	sleep(2);
    	waitForVisibility(Team_Page.submission);
    	WebElement c = currentelement(Team_Page.submission);
	  	Assert.assertEquals(prop.getProperty("submissionText"), c.getText());
    	
    }
    
    
    
    
	
}
