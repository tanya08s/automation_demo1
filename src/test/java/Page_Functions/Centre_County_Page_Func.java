package Page_Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Object_Repository.Centre_County_Page;
import Utils.CoreActions;
import junit.framework.Assert;

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
    	if(cardCount<=6) {
    		checkCardCount=true;
    	}
    	Assert.assertTrue(checkCardCount);
    	boolean moreCards=false;
    	int initialVal=1;
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
    

}
