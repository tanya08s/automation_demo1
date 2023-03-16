package Page_Functions;

import Utils.CoreActions;
import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Object_Repository.TL_Manage_Team_Page;
import Object_Repository.Team_Page;

public class TL_Manage_Team_Page_Func extends CoreActions {
	
	protected WebDriver driver8;
    public TL_Manage_Team_Page_Func(WebDriver driver)
    {
        super(driver);
        this.driver8=driver;
    }
    
    public static void verifyTLManageTeamsPageUrl() {
    	
    	waitForManageTeamsPageUrl();
    	String manageTeamPageUrl=driver.getCurrentUrl();
    	System.out.print(manageTeamPageUrl);
    	Assert.assertTrue(manageTeamPageUrl.contains("https://teams.tst.brightmls.com/manageTeam"));
    	sleep(2);
    	
    }
    
    public static WebElement currentelement(By e) { 
    	WebElement ele=driver.findElement(e);
        return ele;
    }
    
    public static void verifyTopSection() {
    	
    	sleep(3);
   
    	waitForVisibility(TL_Manage_Team_Page.pageHeading);
    	WebElement c1 = currentelement(TL_Manage_Team_Page.pageHeading);
    	Assert.assertEquals(prop.getProperty("pageheading"), c1.getText());
    	
    	WebElement c2 = currentelement(TL_Manage_Team_Page.pageDescription);
    	Assert.assertEquals(prop.getProperty("pagedescription"), c2.getText());
    	
    }
    public static void verifyMidSection() {
    	
    	WebElement c1 = currentelement(TL_Manage_Team_Page.teamName);
    	Assert.assertEquals(prop.getProperty("teamname"), c1.getText());
    	
    	WebElement c2 = currentelement(TL_Manage_Team_Page.teamText);
    	Assert.assertEquals(prop.getProperty("teamtext"), c2.getText());
    	
    	verifyAvailable(TL_Manage_Team_Page.syndicateCheckbox);
    	
    	WebElement c3 = currentelement(TL_Manage_Team_Page.syndicateText);
    	Assert.assertEquals(prop.getProperty("syndicatetext"), c3.getText());
    	
    	verifyAvailable(TL_Manage_Team_Page.syndicateImg);
    	
    	WebElement c4 = currentelement(TL_Manage_Team_Page.searchPlaceholder);
    	Assert.assertEquals(prop.getProperty("searchplaceholder"), c4.getText());
    	
    	verifyAvailable(TL_Manage_Team_Page.searchDropdownButton);
    	
    	WebElement c5 = currentelement(TL_Manage_Team_Page.tableHeading1);
    	Assert.assertEquals(prop.getProperty("tableHeading1"), c5.getText());
    	WebElement c6 = currentelement(TL_Manage_Team_Page.tableHeading2);
    	Assert.assertEquals(prop.getProperty("tableHeading2"), c6.getText());
    	WebElement c7 = currentelement(TL_Manage_Team_Page.tableHeading3);
    	Assert.assertEquals(prop.getProperty("tableHeading3"), c7.getText());
    	WebElement c8 = currentelement(TL_Manage_Team_Page.tableHeading4);
    	Assert.assertEquals(prop.getProperty("tableHeading4"), c8.getText());
    	WebElement c9 = currentelement(TL_Manage_Team_Page.tableHeading5);
    	Assert.assertEquals(prop.getProperty("tableHeading5"), c9.getText());
    	WebElement c10 = currentelement(TL_Manage_Team_Page.tableHeading6);
    	Assert.assertEquals(prop.getProperty("tableHeading6"), c10.getText());
    	WebElement c11 = currentelement(TL_Manage_Team_Page.tableHeading7);
    	Assert.assertEquals(prop.getProperty("tableHeading7"), c11.getText());
    	
    	WebElement c12 = currentelement(TL_Manage_Team_Page.tableBody1);
    	Assert.assertEquals(prop.getProperty("tableBody1"), c12.getText());
    	
    	WebElement c13 = currentelement(TL_Manage_Team_Page.tableBody2);
    	Assert.assertEquals(prop.getProperty("tableBody2"), c13.getText());
    	
    	WebElement c14 = currentelement(TL_Manage_Team_Page.tableBody3);
    	Assert.assertEquals(prop.getProperty("tableBody3"), c14.getText());
    	
    	WebElement c15 = currentelement(TL_Manage_Team_Page.tableBody4);
    	Assert.assertEquals(prop.getProperty("tableBody4"), c15.getText());
    	
    	WebElement c16 = currentelement(TL_Manage_Team_Page.tableBody5);
    	Assert.assertEquals(prop.getProperty("tableBody5"), c16.getText());
    	
    	verifyAvailable(TL_Manage_Team_Page.tableBodyCheckbox);
    	
    	WebElement c17 = currentelement(TL_Manage_Team_Page.tableBody6);
    	System.out.print(c17.getText());
    	Assert.assertEquals(prop.getProperty("tableBody6"), c17.getText());
    	
    	verifyAvailable(TL_Manage_Team_Page.tableBody7);

    	
   
    }
	
	

}
