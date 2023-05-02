package Page_Functions;

import Utils.CoreActions;
import junit.framework.Assert;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Object_Repository.Home_Page;
import Object_Repository.Manage_Team_Page;
import Object_Repository.ProductivityView_Page;
import Page_Functions.Manage_Team_Page_Func;

public class ProductivityView_Page_Func extends CoreActions {

	protected WebDriver driver10;
	protected static String totalClosedListingGoal2022;
	protected static String totalClosedListingRevenue2022;
	protected static String totalClosedListingGoal2023;
	protected static String totalClosedListingRevenue2023;
	
	public ProductivityView_Page_Func(WebDriver driver)
    {
        super(driver);
        this.driver10=driver;
    }
	public static void verifyTeamGoals() {
		
		int TeamGoal=Manage_Team_Page_Func.TotalGoal;
		waitForVisibility(ProductivityView_Page.goalVal);
		String totalGoal=currentelement(ProductivityView_Page.goalVal);
		int TotalGoal=Integer.parseInt(totalGoal); 
		Assert.assertEquals(TotalGoal,TeamGoal);
		System.out.println("team goals verified"+" "+TeamGoal);

		
	}
	
	public static void verifyIndividualTLGoals() {
		scroll();
		waitForVisibility(ProductivityView_Page.tlGoal);
		String tlGoal=currentelement(ProductivityView_Page.tlGoal);
		int TlGoal=Integer.parseInt(tlGoal); 
		Assert.assertEquals(TlGoal,Manage_Team_Page_Func.TLGoalValue);
		System.out.println("team lead goals verified"+" "+tlGoal);
	
	}
	
	public static void verifyIndividualTMGoals() {
		
		waitForVisibility(ProductivityView_Page.tmGoal);
		String tmGoal=currentelement(ProductivityView_Page.tmGoal);
		int TMGoal=Integer.parseInt(tmGoal); 
		Assert.assertEquals(TMGoal,Manage_Team_Page_Func.TMGoalValue);
		System.out.println("team member goals verified"+" "+tmGoal);
		sleep(2);
			
	}
	
	public static void verifyStaticData() {
		
		waitForVisibility(ProductivityView_Page.yearDropDown);  
		String currURL= driver.getCurrentUrl();
		Assert.assertTrue(currURL.contains("2022"));
    	String currentListingCount=currentelement(ProductivityView_Page.currentListingCount);
    	String lostListingCount=currentelement(ProductivityView_Page.lostListingCount);
    	String pendingListingCount=currentelement(ProductivityView_Page.pendingListingCount);
    	
    	String currentListingPrice=currentelement(ProductivityView_Page.currentListingPrice);
    	String lostListingPrice=currentelement(ProductivityView_Page.lostListingPrice);
    	String pendingListingPrice=currentelement(ProductivityView_Page.pendingListingPrice);
    	
		Assert.assertEquals(currentListingCount,prop.getProperty("currentListingCount"));
		Assert.assertEquals(lostListingCount,prop.getProperty("lostListingCount"));
		Assert.assertEquals(pendingListingCount,prop.getProperty("pendingListingCount"));
		Assert.assertEquals(currentListingPrice,prop.getProperty("currentListingPrice"));
		Assert.assertEquals(lostListingPrice,prop.getProperty("lostListingPrice"));
		Assert.assertEquals(pendingListingPrice,prop.getProperty("pendingListingPrice"));
		
		waitForVisibility(ProductivityView_Page.tlActualGoal);
		String tlActualGoal=currentelement(ProductivityView_Page.tlActualGoal);
		String tmActualGoal=currentelement(ProductivityView_Page.tmActualGoal);
		String tlActualRevenue=currentelement(ProductivityView_Page.tlActualRevenue);
		String tmActualRevenue=currentelement(ProductivityView_Page.tmActualRevenue);
		totalClosedListingGoal2022= currentelement(ProductivityView_Page.totalClosedListingGoal);
		totalClosedListingRevenue2022= currentelement(ProductivityView_Page.totalClosedListingRevenue);
		
		scroll();
		waitForVisibility(ProductivityView_Page.tlIndividualActualGoal);
		String tlIndividualActualGoal=currentelement(ProductivityView_Page.tlIndividualActualGoal);
		String tmIndividualActualGoal=currentelement(ProductivityView_Page.tmIndividualActualGoal);
		click(ProductivityView_Page.tlRevenueTab);
		String tlIndividualActualRevenue=currentelement(ProductivityView_Page.tlIndividualActualRevenue);
		click(ProductivityView_Page.tmRevenueTab);
		String tmIndividualActualRevenue=currentelement(ProductivityView_Page.tmIndividualActualRevenue);
		
		Assert.assertEquals(tlActualGoal,tlIndividualActualGoal);
		Assert.assertEquals(tmActualGoal,tmIndividualActualGoal);
		Assert.assertEquals("$"+tlActualRevenue,tlIndividualActualRevenue);
		Assert.assertEquals("$"+tmActualRevenue,tmIndividualActualRevenue);
	
	}
	
	public static void verifyCurrYearStaticData() {
		
		scrollup();
		waitForVisibility(ProductivityView_Page.yearDropDown);
		sleep(3);
		click(ProductivityView_Page.yearDropDown);
		sleep(2);
		click(ProductivityView_Page.selectYear2023);
    	String dropdownVal=currentelement(ProductivityView_Page.yearDropDown);
    	Assert.assertTrue(dropdownVal+" is shown",dropdownVal.contains("2023"));
    	System.out.println(dropdownVal);
//    	String currURL= driver.getCurrentUrl();
//		Assert.assertTrue(currURL.contains("2023"));
    	
    	String currentListingCount=currentelement(ProductivityView_Page.currentListingCount);
    	String lostListingCount=currentelement(ProductivityView_Page.lostListingCount);
    	String pendingListingCount=currentelement(ProductivityView_Page.pendingListingCount);
    	
    	String currentListingPrice=currentelement(ProductivityView_Page.currentListingPrice);
    	String lostListingPrice=currentelement(ProductivityView_Page.lostListingPrice);
    	String pendingListingPrice=currentelement(ProductivityView_Page.pendingListingPrice);
    	
    	Assert.assertEquals(currentListingCount,prop.getProperty("currentListingCount1"));
		Assert.assertEquals(lostListingCount,prop.getProperty("lostListingCount1"));
		Assert.assertEquals(pendingListingCount,prop.getProperty("pendingListingCount1"));
		Assert.assertEquals(currentListingPrice,prop.getProperty("currentListingPrice1"));
		Assert.assertEquals(lostListingPrice,prop.getProperty("lostListingPrice1"));
		Assert.assertEquals(pendingListingPrice,prop.getProperty("pendingListingPrice1"));
		
		totalClosedListingGoal2023= currentelement(ProductivityView_Page.totalClosedListingGoal);
		totalClosedListingRevenue2023= currentelement(ProductivityView_Page.totalClosedListingRevenue);
		
		scroll();
		waitForVisibility(ProductivityView_Page.tlIndividualActualGoal);
		String tlIndividualActualGoal=currentelement(ProductivityView_Page.tlIndividualActualGoal);
		String tmIndividualActualGoal=currentelement(ProductivityView_Page.tmIndividualActualGoal);
		click(ProductivityView_Page.tlRevenueTab);
		String tlIndividualActualRevenue=currentelement(ProductivityView_Page.tlIndividualActualRevenue);
		click(ProductivityView_Page.tmRevenueTab);
		String tmIndividualActualRevenue=currentelement(ProductivityView_Page.tmIndividualActualRevenue);
		
		Assert.assertEquals("N/A",tlIndividualActualGoal);
		Assert.assertEquals("N/A",tmIndividualActualGoal);
		Assert.assertEquals("N/A",tlIndividualActualRevenue);
		Assert.assertEquals("N/A",tmIndividualActualRevenue);
    	
		click(Manage_Team_Page.homePage);
		waitForDashboardUrl();
	}
	
	
	
	public static void verifyActualTeamGoal() {
		
		scroll();
		waitForVisibility(Manage_Team_Page.productivityDiv);
		String s1=currentelement(ProductivityView_Page.teamActualGR);	
		System.out.println(s1);
		if(totalClosedListingGoal2023=="0") {
			Assert.assertEquals("N/A",s1);
		}
		if(totalClosedListingRevenue2023=="0.00") {
			click(ProductivityView_Page.prodRevenueOption);
			String s2=currentelement(ProductivityView_Page.teamActualGR);
			Assert.assertEquals("N/A",s2);
			System.out.println(s2);
		}
		elementclick(Home_Page.prodDivDropdown);
    	sendKey(Home_Page.prodDivDropdown,Keys.ARROW_DOWN);
    	elementclick(ProductivityView_Page.prodGoalOption);
    	String s3=currentelement(ProductivityView_Page.teamActualGR);
    	System.out.println(s3);
    	Assert.assertEquals(totalClosedListingGoal2022,s3);
    	elementclick(ProductivityView_Page.prodRevenueOption);
    	String s4=currentelement(ProductivityView_Page.teamActualGR);
    	System.out.println(s4);
    	String c="$"+totalClosedListingRevenue2022.substring(0, totalClosedListingRevenue2022.length() - 3);
    	System.out.println(c);
    	Assert.assertEquals(c,s4);	
    	
    	
    	sleep(2);
	}
	
	
	
	

}
