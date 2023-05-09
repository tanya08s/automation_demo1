package Object_Repository;

import org.openqa.selenium.By;

public class Centre_County_Page {
	
	public static final By heroSectionHeading= By.xpath("//div[@id='centreCountyHeaderSectiontitleWrap']//p"); 
	public static final By heroSectionSubHeading= By.xpath("//h1[@id='centreCountyHeaderSectiondetailText']"); 
	public static final By heroSectionImage= By.xpath("//div[@id='centreCountyHeaderSectionvideoBox']//iframe[@id='centreCountyHeaderSectioniframeStyles']"); 
	public static final By heroSectionLink1Text= By.xpath("//a[@id='centreCountyanchorTagRates']//p"); 
	public static final By heroSectionLink2Text= By.xpath("//a[@id='centreCountyanchorTagQuestions']//p"); 
	public static final By heroSectionLink3Text= By.xpath("//a[@id='centreCountyanchorTagRates'][2]//p"); 
	public static final By heroSectionLink4Text= By.xpath("//a[@id='centreCountycentercountyTagQuestions']//p");
	public static final By heroSectionLink1= By.xpath("//a[@id='centreCountyanchorTagRates']"); 
	public static final By heroSectionLink2= By.xpath("//a[@id='centreCountyanchorTagQuestions']"); 
	public static final By heroSectionLink3= By.xpath("//a[@id='centreCountyanchorTagRates'][2]"); 
	public static final By heroSectionLink4= By.xpath("//a[@id='centreCountycentercountyTagQuestions']");
	public static final By headingDiscoverBright= By.xpath("//h1[@id='centreCountyDiscoverSectionCommonModuleSubHeading']");
	public static final By headingExploreTheTerrain= By.xpath("//h1[@id='centreCountyExploreSectionCommonModuleSubHeading']");
	public static final By headingBeginYourJourney= By.xpath("//h1[@id='centreCountyBeginSectionCommonModuleSubHeading']");
	public static final By headingHelp= By.xpath("//section[@id='centreCountyHelpSection']//div//div//h2");
	public static final By discoverBrightCards= By.xpath("//section[@id='centreCountyDiscoverSection']//div[@class='CommonModuleCard']");
	public static final By seeMoreLessLink= By.xpath("(//a[@class='CommonModuleSeeMoreLessText'])[1]");
	public static final By discoverBrightSubHeading= By.xpath("//section[@id='centreCountyDiscoverSection']//div//div//p[1]");
	public static final By discoverBrightDescription= By.xpath("//section[@id='centreCountyDiscoverSection']//div//div//h5[1]");
	
	
	

}
