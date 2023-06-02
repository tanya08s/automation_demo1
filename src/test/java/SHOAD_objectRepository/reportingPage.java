package SHOAD_objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.CoreActions;

public class reportingPage extends CoreActions{
	
	protected reportingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static final By reportType= By.xpath("//div[@id='reportTypeDropdown']");
	public static final By listBox= By.xpath("//ul[@role='listbox']");
	public static final By reportTypeValues= By.xpath("//ul[@role='listbox']//li");
	public static final By registrationRequestOption= By.xpath("//ul[@role='listbox']//li[1]");
	public static final By reportTypePlaceholder= By.xpath("//div[@id='reportTypeDropdown']");
	public static final By appIDPlaceholder= By.xpath("//label[@id='textFeild-applicationIdField-label']");
	public static final By statusPlaceholder= By.xpath("//label[@id='statusFieldBox']");
	public static final By registrationReqIDPlaceholder= By.xpath("//label[@id='textFeild-registrationRequestIdField-label']");
	public static final By registrationIDPlaceholder= By.xpath("//label[@id='textFeild-registrationIdField-label']");
	public static final By mlsIDPlaceholder= By.xpath("//label[@id='textFeild-mlsIdField-label']");
	public static final By startDatePlaceholder= By.xpath("//label[@id='showableStartDateField-label']");
	public static final By endDatePlaceholder= By.xpath("//label[@id='showableEndDateField-label']");
	public static final By clearBtn= By.xpath("//button[contains(text(),'Clear')]");
	public static final By searchBtn= By.xpath("//div[@class='MuiStack-root css-1azcoao']//button");
	public static final By statusList= By.xpath("//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']");
	public static final By statusDiv= By.xpath("//div[@id='statusFieldBox']");
	public static final By statusListValues= By.xpath("//ul[@role='listbox']//li");
	public static final By appId= By.xpath("//input[@id='textFeild-applicationIdField']");
	public static final By registrationRequestId= By.xpath("//input[@id='textFeild-registrationRequestIdField']");
	public static final By registrationId= By.xpath("//input[@id='textFeild-registrationIdField']");
	public static final By mlsId= By.xpath("//input[@id='textFeild-mlsIdField']");
	public static final By startDate= By.xpath("//input[@id='showableStartDateField']");
	public static final By endDate= By.xpath("//input[@id='showableEndDateField']");
	public static final By status= By.xpath("//div[@id='statusFieldBox']");
	public static final By statusRequested= By.xpath("//li[@role='option'][1]");
	public static final By JSONheader= By.xpath("//th[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-alignLeft MuiTableCell-sizeMedium css-hk4p1w'][1]");
	public static final By inspectheader= By.xpath("//th[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-alignLeft MuiTableCell-sizeMedium css-hk4p1w'][2]");
	public static final By registrationReqIDheader= By.xpath("//th[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-alignLeft MuiTableCell-sizeMedium css-hk4p1w'][3]//span");
	public static final By statusheader= By.xpath("//th[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-alignLeft MuiTableCell-sizeMedium css-hk4p1w'][4]//span");
	public static final By registrationIDheader= By.xpath("//th[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-alignLeft MuiTableCell-sizeMedium css-hk4p1w'][5]//span");
	public static final By appIDheader= By.xpath("//th[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-alignLeft MuiTableCell-sizeMedium css-hk4p1w'][6]//span");
	public static final By mlsIDheader= By.xpath("//th[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-alignLeft MuiTableCell-sizeMedium css-hk4p1w'][7]//span");
	public static final By listingIDheader= By.xpath("//th[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-alignLeft MuiTableCell-sizeMedium css-hk4p1w'][8]//span");
	public static final By listingAgentheader= By.xpath("//th[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-alignLeft MuiTableCell-sizeMedium css-hk4p1w'][9]//span");
	public static final By listingAgentMLSIDheader= By.xpath("//th[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-alignLeft MuiTableCell-sizeMedium css-hk4p1w'][10]//span");
	public static final By address1header= By.xpath("//th[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-alignLeft MuiTableCell-sizeMedium css-hk4p1w'][11]//span");
	public static final By createdheader= By.xpath("//th[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-alignLeft MuiTableCell-sizeMedium css-hk4p1w'][12]//span");
	public static final By StatusListValues(int value) {
		String xpath= String.format("//ul[@role='listbox']//li[%d]", value); 
		System.out.println(xpath);
		return (By) driver.findElement(By.xpath(xpath));
	}
	
}
