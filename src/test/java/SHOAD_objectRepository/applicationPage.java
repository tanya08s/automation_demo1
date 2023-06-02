package SHOAD_objectRepository;

import org.openqa.selenium.By;
public class applicationPage {
	
	public static final By status  = By.xpath("(//p[@class='MuiTypography-root MuiTypography-body2 css-68o8xu'])[4]");
	public static final By certification = By.xpath("(//p[@class='MuiTypography-root MuiTypography-body2 css-68o8xu'])[5]");
	public static final By orgID = By.xpath("(//p[@class='MuiTypography-root MuiTypography-body2 css-68o8xu'])[6]");
	public static final By appID = By.xpath("(//p[@class='MuiTypography-root MuiTypography-body2 css-68o8xu'])[7]");
	public static final By editApp= By.xpath("(//div[@class='MuiCardHeader-root css-faujvq']//div//h5[1]/../../..//div[3]//button)[1]");
	public static final By heading= By.xpath("//h4[@class='MuiTypography-root MuiTypography-h4 MuiTypography-noWrap css-bvhqyn']");
	public static final By editCertification= By.xpath("(//p[@class='MuiTypography-root MuiTypography-body1 css-15vuy4d'])[1]");
	public static final By editStatus= By.xpath("(//p[@class='MuiTypography-root MuiTypography-body1 css-15vuy4d'])[2]");
	public static final By certificationValue= By.xpath("(//span[@class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-9l3uo3'])[1]");
	public static final By statusValue= By.xpath("(//span[@class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-9l3uo3'])[2]");
	public static final By disableBtn= By.xpath("//button[contains(text(),'Disable')]");
	public static final By certificationInput= By.xpath("(//input[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3'])[1]");
	public static final By statusInput= By.xpath("(//input[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3'])[2]");
	public static final By popupDiv= By.xpath("//div[@role='presentation']");
	public static final By popupYes= By.xpath("//div[@role='presentation']//button[2]");
	public static final By back= By.xpath("//button[contains(text(),'Back')]");
	public static final By appName= By.xpath("//input[@id='textFeild-application-name'and (@disabled)]");
	public static final By contactEmail= By.xpath("//input[@id='textFeild-contact-email'and (@disabled)]");		
    public static final By firstName= By.xpath("//input[@id='textFeild-contact-first-name'and (@disabled)]");
    public static final By lastName= By.xpath("//input[@id='textFeild-contact-last-name'and (@disabled)]");		
    public static final By phone=	By.xpath("//input[@id='contact-phone'and (@disabled)]");
    public static final By OrgId=	By.xpath("//input[@id='organization-id'and (@disabled)]");
    public static final By AppId=	By.xpath("//input[@id='application-id'and (@disabled)]");
   
}
