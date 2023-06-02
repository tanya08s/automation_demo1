package SHOAD_objectRepository;

import org.openqa.selenium.By;

public class organizationPage {
	
	public static final By addOrganizationBtn = By.xpath("//button[contains(text(),'Add Organization')]");
	public static final By organizationPageHeading = By.xpath("//h4[@class='MuiTypography-root MuiTypography-h4 MuiTypography-noWrap css-bvhqyn']");
	public static final By organizationName = By.xpath("//input[@id='textFeild-organization-name']");
	public static final By organizationEmail = By.xpath("//input[@id='textFeild-contact-email']");
	public static final By firstName = By.xpath("//input[@id='textFeild-contact-first-name']");
	public static final By lastName = By.xpath("//input[@id='textFeild-contact-last-name']");
	public static final By phone = By.xpath("//input[@id='contact-phone']");
	public static final By cancel = By.xpath("//button[contains(text(),'Cancel')]");
	public static final By add = By.xpath("//div[@class='MuiStack-root css-72io3h']//button[2]");
	public static final By addBtnText = By.xpath("//div[@class='MuiStack-root css-72io3h']//button[2]//span[1]");
	public static final By alertHeading = By.xpath("//div[@role='alert']//div[2]//div");
	public static final By alertSubHeading = By.xpath("//div[@role='alert']//div[2]//p[1]");
	public static final By organizationKeys = By.xpath("//div[@role='alert']//div[2]//p[2]");
	public static final By viewOrganization = By.xpath("//div[@class='MuiAlert-action css-1mzcepu']//button[1]");
	public static final By closeAlert = By.xpath("//div[@class='MuiAlert-action css-1mzcepu']//button[2]");
	public static final By closeIcon = By.xpath("//*[local-name()='svg' and @data-testid='CloseIcon' ]/*[local-name()='path']");
//	public static final By organizationCard = By.xpath("//div[@class='MuiCardHeader-root css-faujvq']//div//h5[contains(text(),'QA 1')]");
//    public static final By editCard   = By.xpath("(//div[@class='MuiCardHeader-content css-11qjisw']//h5[contains(text(),'QA')])[1]/../../..//div[3]//button[1]");
    public static final By updateBtn   = By.xpath("//div[@class='MuiStack-root css-72io3h']//button[2]");
	public static final By closeEditAlert = By.xpath("//div[@class='MuiAlert-action css-1mzcepu']//button");
}


