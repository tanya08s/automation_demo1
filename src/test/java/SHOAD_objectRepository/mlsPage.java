package SHOAD_objectRepository;

import org.openqa.selenium.By;

public class mlsPage {
	
	public static final By mlsOption= By.xpath("(//div[@class='MuiListItemText-root MuiListItemText-inset css-1ni0dl2'])[2]");
	public static final By mlsHeading=By.xpath("//h4[@class='MuiTypography-root MuiTypography-h4 MuiTypography-noWrap css-bvhqyn']");
	public static final By addMLSBtn= By.xpath("//header//button");
	public static final By mlsName= By.xpath("//input[@id='textFeild-mls-name']");
	public static final By mlsEmail= By.xpath("//input[@id='textFeild-contact-email']");
	public static final By firstName= By.xpath("//input[@id='textFeild-contact-first-name']");
	public static final By lastName= By.xpath("//input[@id='textFeild-contact-last-name']");
	public static final By phone= By.xpath("//input[@id='contact-phone']");
	public static final By webhookURL= By.xpath("//input[@id='textFeild-webhook-url']");
	public static final By webhookHeaderName= By.xpath("//input[@id='textFeild-webhook-header-name']");
	public static final By webhookHeaderValue= By.xpath("//input[@id='textFeild-webhook-header-value']");
	public static final By addMLs= By.xpath("//div[@class='MuiStack-root css-72io3h']//button[2]");
	public static final By MLSKeys  = By.xpath("//div[@role='alert']//div[2]//p[2]");
	public static final By viewMLS  = By.xpath("//div[@class='MuiAlert-action css-1mzcepu']//button[1]");
//	public static final By MLSCard  = By.xpath("//div[@class='MuiCardHeader-root css-faujvq']//div//h5[contains(text(),'mls test5')]");
//    public static final By editMLS= By.xpath("//div[@class='MuiCardHeader-root css-faujvq']//div//h5[contains(text(),'mls test5')][1]/../../..//div[3]//button[1]");

}
