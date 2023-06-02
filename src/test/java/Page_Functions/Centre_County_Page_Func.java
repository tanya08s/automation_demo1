package Page_Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Object_Repository.Centre_County_Page;
import Utils.CoreActions;
import junit.framework.Assert;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class Centre_County_Page_Func  extends CoreActions{
	
	private static Logger logger= Logger.getLogger(Centre_County_Page_Func.class);
	protected WebDriver driver12;
    public Centre_County_Page_Func(WebDriver driver)
    {
    	super(driver);
        this.driver12=driver;

    }
    public static void verifyHeroSection() {
    	
    	waitForVisibility(Centre_County_Page.heroSectionHeading);
    	String c1 = currentelement(Centre_County_Page.heroSectionHeading);
    	Assert.assertTrue(c1+" is shown",c1.contains(prop.getProperty("heroSectionHeading")));
    	
    	String c2 = currentelement(Centre_County_Page.heroSectionSubHeading);
    	Assert.assertTrue(c2+" is shown",c2.contains(prop.getProperty("heroSectionSubHeading")));
    	
    	waitForVisibility(Centre_County_Page.heroSectionImage);
    	String val=getAttribute(Centre_County_Page.heroSectionImage,"src");
    	boolean checkVideo=verifyStringNotNull(val);
    	Assert.assertTrue(checkVideo);
    	
 	  	
 	  	String c3 = currentelement(Centre_County_Page.heroSectionLink1Text);
    	Assert.assertTrue(c3+" is shown",c3.contains(prop.getProperty("heroSectionLink1")));
    	String c4 = currentelement(Centre_County_Page.heroSectionLink2Text);
    	Assert.assertTrue(c4+" is shown",c4.contains(prop.getProperty("heroSectionLink2")));
    	String c5 = currentelement(Centre_County_Page.heroSectionLink3Text);
    	Assert.assertTrue(c5+" is shown",c5.contains(prop.getProperty("heroSectionLink3")));
    	String c6 = currentelement(Centre_County_Page.heroSectionLink4Text);
    	Assert.assertTrue(c6+" is shown",c6.contains(prop.getProperty("heroSectionLink4")));
    	
    	click(Centre_County_Page.heroSectionLink1);
    	boolean checkLink1= verifyElementPresence(Centre_County_Page.headingDiscoverBright);
 	  	Assert.assertTrue(checkLink1);
 	  	
 	  	scrollup();
 	  	click(Centre_County_Page.heroSectionLink2);
    	boolean checkLink2= verifyElementPresence(Centre_County_Page.headingExploreTheTerrain);
 	  	Assert.assertTrue(checkLink2);
 	  	
 	  	scrollup();
 	  	click(Centre_County_Page.heroSectionLink3);
    	boolean checkLink3= verifyElementPresence(Centre_County_Page.headingBeginYourJourney);
 	  	Assert.assertTrue(checkLink3);
 	  	
 	  	scrollup();scrollup();
 	  	click(Centre_County_Page.heroSectionLink4);
    	boolean checkLink4= verifyElementPresence(Centre_County_Page.headingHelp);
 	  	Assert.assertTrue(checkLink4);
 	  	
		logger.info("centre county hero section verified successfully");
   
    }
    
    public static void verifyCardData(String sectionName,int sectionCount) {
    	
    	List<WebElement> elements = driver.findElements(By.xpath("//section[@id='"+sectionName+"']//div[@class='CommonModuleCard']"));
    	int cardCount = elements.size();
    	boolean checkCardCount=false;
    	if(cardCount==6) {
    		checkCardCount=true;
    	}
    	Assert.assertTrue(checkCardCount);
    	boolean moreCards=false;
    	int initialVal=1;
    	logger.info("card count starts from :" + initialVal);
    	logger.info("initial count of cards :" + cardCount);
    	do {
    		for(int i=initialVal;i<=cardCount;i++) {
        		String cardImgSource = driver.findElement(By.xpath("//section[@id='"+sectionName+"']//div[@class='CommonModuleCard'][" + i + "]//div[1]//img")).getAttribute("src");
        		boolean checkSource= verifyStringNotNull(cardImgSource);
        		Assert.assertTrue(checkSource);
        		String cardHeading = driver.findElement(By.xpath("//section[@id='"+sectionName+"']//div[@class='CommonModuleCard'][" + i + "]//div[2]//h3")).getText();
        		boolean checkHeading= verifyStringNotNull(cardHeading);
        		Assert.assertTrue(checkHeading);
        		String cardDescription = driver.findElement(By.xpath("//section[@id='"+sectionName+"']//div[@class='CommonModuleCard'][" + i + "]//div[2]//p")).getText();
        		boolean checkDescription= verifyStringNotNull(cardDescription);
        		Assert.assertTrue(checkDescription);
        	}
    		scrolldown();
    		String moreLessLinkPath="(//a[@class='CommonModuleSeeMoreLessText'])["+sectionCount+"]";
    		waitForVisibility(By.xpath(moreLessLinkPath));
    		String moreLessLinkText=currentelement(By.xpath(moreLessLinkPath));
    		if(moreLessLinkText.contains("See More")) {
    			elementclick(By.xpath(moreLessLinkPath));
    			moreCards=true;
    			initialVal+=6;
    			elements= driver.findElements(By.xpath("//section[@id='"+sectionName+"']//div[@class='CommonModuleCard']"));
    			cardCount=elements.size();
    			logger.info("card count starts from :" + initialVal);
            	logger.info("total count of cards now :" + cardCount);
    		}
    		else {
    			moreCards=false;
    		}
    			
    	}while(moreCards);
       	
    }
    
   public static void verifyDiscoverBrightSection() {
    	
    	waitForVisibility(Centre_County_Page.headingDiscoverBright);
    	String c = currentelement(Centre_County_Page.headingDiscoverBright);
    	Assert.assertTrue(c+" is shown",c.contains(prop.getProperty("headingDiscoverBright")));
    	
    	String c1 = currentelement(Centre_County_Page.discoverBrightSubHeading);
    	Assert.assertTrue(c1+" is shown",c1.contains(prop.getProperty("discoverBrightSubHeading")));
    	
    	String c2 = currentelement(Centre_County_Page.discoverBrightDescription);
    	Assert.assertTrue(c2+" is shown",c2.contains(prop.getProperty("discoverBrightDescription")));
    	
    	String sectionName= "centreCountyDiscoverSection";
    	int sectionCount=1;
    	verifyCardData(sectionName,sectionCount);
    	
    	logger.info("centre county discover bright section verified successfully");
    	
    	
    }
   
    public static void verifyExploreTerrainSection() {
   	
    scroll();	
   	waitForVisibility(Centre_County_Page.headingExploreTheTerrain);
   	String c = currentelement(Centre_County_Page.headingExploreTheTerrain);
   	Assert.assertTrue(c+" is shown",c.contains(prop.getProperty("headingExploreTheTerrain")));
   	
   	String c1 = currentelement(Centre_County_Page.ExploreTheTerrainSubHeading);
   	Assert.assertTrue(c1+" is shown",c1.contains(prop.getProperty("ExploreTheTerrainSubHeading")));
   	
   	String c2 = currentelement(Centre_County_Page.ExploreTheTerrainDescription);
   	Assert.assertTrue(c2+" is shown",c2.contains(prop.getProperty("ExploreTheTerrainDescription")));
   	
   	String sectionName= "centreCountyExploreSection";
   	int sectionCount=2;
   	verifyCardData(sectionName,sectionCount);
   	
   	logger.info("explore the terrain section verified successfully");
   	
   	
   }
    public static void verifyBeginYourJourneySection() {
       	
        scroll();	
       	waitForVisibility(Centre_County_Page.headingBeginYourJourney);
       	String c = currentelement(Centre_County_Page.headingBeginYourJourney);
       	Assert.assertTrue(c+" is shown",c.contains(prop.getProperty("headingBeginYourJourney")));
       	
       	String c1 = currentelement(Centre_County_Page.BeginYourJourneySubHeading);
       	Assert.assertTrue(c1+" is shown",c1.contains(prop.getProperty("BeginYourJourneySubHeading")));
       	
       	String c2 = currentelement(Centre_County_Page.BeginYourJourneyDescription);
       	Assert.assertTrue(c2+" is shown",c2.contains(prop.getProperty("BeginYourJourneyDescription")));
       	
       	String sectionName= "centreCountyBeginSection";
       	int sectionCount=3;
       	verifyCardData(sectionName,sectionCount);
       	
       	logger.info("begin Your Journey section verified successfully");
       
       }
    
    public static void checkLinks(String url) {
    	
    	List<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
    	driver.switchTo().window(browserTabs .get(1));
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.urlContains(url));
    	driver.close();
    	driver.switchTo().window(browserTabs.get(0));
    	
    }
    
    public static void verifyRegisterForLiveTrainingSection() {
    	
    	
    	waitForVisibility(Centre_County_Page.RegisterForLiveTrainingHeading);
       	String c = currentelement(Centre_County_Page.RegisterForLiveTrainingHeading);
       	Assert.assertTrue(c+" is shown",c.contains(prop.getProperty("RegisterForLiveTrainingHeading")));
       	logger.info("Register For Live Training section heading verified successfully");
       	
       	String c1 = currentelement(Centre_County_Page.RegisterForLiveTrainingImg1Heading);
       	Assert.assertTrue(c1+" is shown",c1.contains(prop.getProperty("RegisterForLiveTrainingImg1Heading")));
             	
       	String c2 = currentelement(Centre_County_Page.RegisterForLiveTrainingImg2Heading);
       	Assert.assertTrue(c2+" is shown",c2.contains(prop.getProperty("RegisterForLiveTrainingImg2Heading")));
       	
       	String c3 = currentelement(Centre_County_Page.RegisterForLiveTrainingImg1SubHeading);
       	Assert.assertTrue(c3+" is shown",c3.contains(prop.getProperty("RegisterForLiveTrainingImg1SubHeading")));
       	
       	String c4 = currentelement(Centre_County_Page.RegisterForLiveTrainingImg2SubHeading);
       	Assert.assertTrue(c4+" is shown",c4.contains(prop.getProperty("RegisterForLiveTrainingImg2SubHeading")));
       	
       	String c5 = currentelement(Centre_County_Page.RegisterForLiveTrainingImg1ButtonText);
       	Assert.assertTrue(c5+" is shown",c5.contains(prop.getProperty("RegisterForLiveTrainingImg1ButtonText")));
       	
       	String c6 = currentelement(Centre_County_Page.RegisterForLiveTrainingImg2ButtonText);
       	Assert.assertTrue(c6+" is shown",c6.contains(prop.getProperty("RegisterForLiveTrainingImg2ButtonText")));
       	logger.info("Register For Live Training section both image headings, subheadings and button texts verified successfully");
       	
       	String img1Src = getAttribute(Centre_County_Page.RegisterForLiveTrainingImg1,"src");
		boolean checkSource1= verifyStringNotNull(img1Src);
		Assert.assertTrue(checkSource1);
       	
		String img2Src = getAttribute(Centre_County_Page.RegisterForLiveTrainingImg2,"src");
		boolean checkSource2= verifyStringNotNull(img2Src);
		Assert.assertTrue(checkSource2);
       	logger.info("Register For Live Training section both image source links verified successfully");

		
		elementclick(Centre_County_Page.RegisterForLiveTrainingImg1Button);
		checkLinks(prop.getProperty("RegisterForLiveTrainingLink1"));
		
		elementclick(Centre_County_Page.RegisterForLiveTrainingImg2Button);
		checkLinks(prop.getProperty("RegisterForLiveTrainingLink2"));
       	logger.info("Register For Live Training section both image buttons are clickable and link are verified successfully");

	
    }
    
    public static void verifyHelpSection() {
    	
    	
    	waitForVisibility(Centre_County_Page.helpSectionHeading);
       	String c = currentelement(Centre_County_Page.helpSectionHeading);
       	Assert.assertTrue(c+" is shown",c.contains(prop.getProperty("helpSectionHeading")));
       	logger.info("help section heading verified successfully");
       	
       	String c1 = currentelement(Centre_County_Page.helpSectionLink1Text);
       	Assert.assertTrue(c1+" is shown",c1.contains(prop.getProperty("helpSectionLink1Text")));
       	
       	String c2 = currentelement(Centre_County_Page.helpSectionLink2Text);
       	Assert.assertTrue(c2+" is shown",c2.contains(prop.getProperty("helpSectionLink2Text")));
       	
       	String c3 = currentelement(Centre_County_Page.helpSectionLink3Text);
       	Assert.assertTrue(c3+" is shown",c3.contains(prop.getProperty("helpSectionLink3Text")));
       	
       	String c4 = currentelement(Centre_County_Page.helpSectionLink4Text);
       	Assert.assertTrue(c4+" is shown",c4.contains(prop.getProperty("helpSectionLink4Text")));
       	
       	String c5 = currentelement(Centre_County_Page.helpSectionLink5Text);
       	Assert.assertTrue(c5+" is shown",c5.contains(prop.getProperty("helpSectionLink5Text")));
       	
       	String c6 = currentelement(Centre_County_Page.helpSectionLink6Text);
       	Assert.assertTrue(c6+" is shown",c6.contains(prop.getProperty("helpSectionLink6Text")));
       	
       	String icon1Src = getAttribute(Centre_County_Page.helpSectionLink1Icon,"src");
		boolean checkSource1= verifyStringNotNull(icon1Src);
		Assert.assertTrue(checkSource1);
       	
       	String icon2Src = getAttribute(Centre_County_Page.helpSectionLink2Icon,"src");
		boolean checkSource2= verifyStringNotNull(icon2Src);
		Assert.assertTrue(checkSource2);
       	
       	String icon3Src = getAttribute(Centre_County_Page.helpSectionLink3Icon,"src");
		boolean checkSource3= verifyStringNotNull(icon3Src);
		Assert.assertTrue(checkSource3);
       	
       	String icon4Src = getAttribute(Centre_County_Page.helpSectionLink4Icon,"src");
		boolean checkSource4= verifyStringNotNull(icon4Src);
		Assert.assertTrue(checkSource4);
       	
       	String icon5Src = getAttribute(Centre_County_Page.helpSectionLink5Icon,"src");
		boolean checkSource5= verifyStringNotNull(icon5Src);
		Assert.assertTrue(checkSource5);
       	
       	String icon6Src = getAttribute(Centre_County_Page.helpSectionLink6Icon,"src");
		boolean checkSource6= verifyStringNotNull(icon6Src);
		Assert.assertTrue(checkSource6);
		logger.info("help section links text and icons verified successfully");
		
		elementclick(Centre_County_Page.helpSectionLink1);
		checkLinks(prop.getProperty("helpSectionLink1"));
       	
       	elementclick(Centre_County_Page.helpSectionLink2);
		checkLinks(prop.getProperty("helpSectionLink2"));
       	
       	elementclick(Centre_County_Page.helpSectionLink3);
		checkLinks(prop.getProperty("helpSectionLink3"));
       	
       	elementclick(Centre_County_Page.helpSectionLink4);
		checkLinks(prop.getProperty("helpSectionLink4"));
       	
       	elementclick(Centre_County_Page.helpSectionLink5);
		checkLinks(prop.getProperty("helpSectionLink5"));
       	
       	elementclick(Centre_County_Page.helpSectionLink6);
		checkLinks(prop.getProperty("helpSectionLink6"));
       	logger.info("help section all links verified successfully");
       		
    }
    
   public static void verifySupportSection() {
    	
    	
    	waitForVisibility(Centre_County_Page.supportSectionHeading);
       	String c = currentelement(Centre_County_Page.supportSectionHeading);
       	Assert.assertTrue(c+" is shown",c.contains(prop.getProperty("supportSectionHeading")));
       	logger.info("support section heading verified successfully");
       	
       	String c1 = currentelement(Centre_County_Page.supportSectionSubHeading);
       	Assert.assertTrue(c1+" is shown",c1.contains(prop.getProperty("supportSectionSubHeading")));
       	
       	String c2 = currentelement(Centre_County_Page.supportSectionButton1Text);
       	Assert.assertTrue(c2+" is shown",c2.contains(prop.getProperty("supportSectionButton1Text")));
       	
       	String c3 = currentelement(Centre_County_Page.supportSectionButton2Text);
       	Assert.assertTrue(c3+" is shown",c3.contains(prop.getProperty("supportSectionButton2Text")));
       	   	
		String btn2Source = getAttribute(Centre_County_Page.supportSectionButton2Text,"href");
		Assert.assertTrue(btn2Source+" is shown",btn2Source.contains(prop.getProperty("supportSectionButton2")));
		
      	
       	elementclick(Centre_County_Page.supportSectionButton1Text);
       	waitForUrl(prop.getProperty("helpSectionLink6"));
       	goToPreviousUrl();
       	waitForVisibility(Centre_County_Page.supportSectionButton2Text);
       	elementclick(Centre_County_Page.supportSectionButton2Text);
       	
       	logger.info("support section all links verified successfully");
       	
   }
}
