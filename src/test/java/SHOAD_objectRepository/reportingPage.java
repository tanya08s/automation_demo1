package SHOAD_objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.CoreActions;

public class reportingPage{
	
	public static final By reportType= By.xpath("//div[@id='reportTypeDropdown']");
	public static final By listBox= By.xpath("//ul[@role='listbox']");
	public static final By reportTypeValues= By.xpath("//ul[@role='listbox']//li");
	public static final By registrationRequestOption= By.xpath("//ul[@role='listbox']//li[1]");
	public static final By registrationsOption= By.xpath("//ul[@role='listbox']//li[2]");
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
	public static final By ListValues= By.xpath("//ul[@role='listbox']//li");
	public static final By appId= By.xpath("//input[@id='textFeild-applicationIdField']");
	public static final By registrationRequestId= By.xpath("//input[@id='textFeild-registrationRequestIdField']");
	public static final By registrationId= By.xpath("//input[@id='textFeild-registrationIdField']");
	public static final By mlsId= By.xpath("//input[@id='textFeild-mlsIdField']");
	public static final By startDate= By.xpath("//input[@id='showableStartDateField']");
	public static final By endDate= By.xpath("//input[@id='showableEndDateField']");
	public static final By status= By.xpath("//div[@id='statusFieldBox']");
	public static final By statusRequested= By.xpath("//ul[@role='listbox']//li");
	public static final By JSONheader= By.xpath("//th[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-alignLeft MuiTableCell-sizeMedium css-hk4p1w'][1]");
	public static final By inspectheader= By.xpath("//th[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-alignLeft MuiTableCell-sizeMedium css-hk4p1w'][2]");
	public static final By registrationReqIDheader= By.xpath("(//th[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-alignLeft MuiTableCell-sizeMedium css-hk4p1w']//span[contains(text(),'Registration Request ID')])[1]");
	public static final By statusheader= By.xpath("(//th[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-alignLeft MuiTableCell-sizeMedium css-hk4p1w']//span[contains(text(),'Status')])[1]");
	public static final By registrationIDheader= By.xpath("//th[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-alignLeft MuiTableCell-sizeMedium css-hk4p1w']//span[contains(text(),'Registration ID')]");
	public static final By appIDheader= By.xpath("//th[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-alignLeft MuiTableCell-sizeMedium css-hk4p1w']//span[contains(text(),'Application ID')]");
	public static final By mlsIDheader= By.xpath("(//th[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-alignLeft MuiTableCell-sizeMedium css-hk4p1w']//span[contains(text(),'MLS ID')])[1]");
	public static final By listingIDheader= By.xpath("(//th[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-alignLeft MuiTableCell-sizeMedium css-hk4p1w']//span[contains(text(),'Listing ID')])[1]");
	public static final By listingAgentheader= By.xpath("(//th[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-alignLeft MuiTableCell-sizeMedium css-hk4p1w']//span[contains(text(),'Listing Agent')])[1]");
	public static final By listingAgentMLSIDheader= By.xpath("(//th[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-alignLeft MuiTableCell-sizeMedium css-hk4p1w']//span[contains(text(),'Listing Agent MLS ID')])[1]");
	public static final By address1header= By.xpath("(//th[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-alignLeft MuiTableCell-sizeMedium css-hk4p1w']//span[contains(text(),'Address')])[1]");
	public static final By createdheader= By.xpath("(//th[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-alignLeft MuiTableCell-sizeMedium css-hk4p1w']//span[contains(text(),'Created')])[1]");
	public static final By rowsPerPage= By.xpath("//p[@class='MuiTablePagination-selectLabel css-1chpzqh']");
	public static final By rowsPerPageValue= By.xpath("(//div[@aria-haspopup='listbox'])[3]");
	public static final By recordCount= By.xpath("//p[@class='MuiTablePagination-displayedRows css-1chpzqh']");
    public static final By rows= By.xpath("//tr[@class='MuiTableRow-root css-w18wvc']");
	public static final By nextPageBtn= By.xpath("//button[@title='Go to next page']");
	public static final By rowsPerPageDropdown= By.xpath("(//*[local-name()='svg' and @data-testid='ArrowDropDownIcon' ]/*[local-name()='path'])[3]");
	public static final By statusValue= By.xpath("//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-1qlm6ta'][2]");
	public static final By exportCSVBtn= By.xpath("//button[contains(text(),'Export CSV')]");
	public static final By registrationReqIDValue= By.xpath("//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-1qlm6ta'][1]");
	public static final By errorHeading= By.xpath("//h2[@class='MuiTypography-root MuiTypography-h2 css-18luabv']");
	public static final By errorDescription= By.xpath("//h6[@class='MuiTypography-root MuiTypography-subtitle1 css-1a4uric']");
	public static final By resultDiv= By.xpath("//div[@class='MuiStack-root css-9mw6bp']");
	public static final By viewJSON= By.xpath("(//th[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-sizeMedium css-sygs5q']//button)[1]");
	
	public static final By startDateTimeInput = By.xpath("//input[@id='showableStartDateField']");
	public static final By endDateTimeInput = By.xpath("//input[@id='showableEndDateField']");
	public static final By startDateTimeIcon = By.xpath("(//button[@aria-label='Choose date'])[1]");
	public static final By endDateTimeIcon = By.xpath("//button[@aria-label='Choose date']");
	public static final By currentMonthYear  = By.xpath("//div[@class='MuiPickersCalendarHeader-label css-1v994a0']");
	public static final By yearDropdown = By.xpath("//button[@aria-label='calendar view is open, switch to year view']");
	public static final By yearList = By.xpath("//div[@class='PrivatePickersYear-root PrivatePickersYear-modeDesktop css-j9zntq']//button");
	public static final By yearDropdownup = By.xpath("//button[@aria-label='year view is open, switch to calendar view']");
	public static final By weekDaysList = By.xpath("//div[@class='MuiDayPicker-header css-1n2mv2k']//span");
	public static final By currentdate = By.xpath("//button[@role='gridcell' and @tabindex='0']");
	public static final By prevMonthBtn = By.xpath("//button[@aria-label='Previous month']");
	public static final By nextMonthBtn = By.xpath("//button[@aria-label='Next month']");
	public static final By timeIcon = By.xpath("//button[@aria-label='pick time']");
	public static final By selectedDate  = By.xpath("//button[contains(text(),'15')]");
	public static final By selectedDateNew  = By.xpath("//button[contains(text(),'1')]");
	
	public static final By selectedEndDate  = By.xpath("//button[contains(text(),'15')]");
	public static final By selectedHour = By.xpath("//div[@aria-label='Select hours. Selected time is 12:00 AM']//span[3]");
	public static final By selectedMins = By.xpath("//div[@aria-label='Select minutes. Selected time is 3:00 AM']//span[3]");
	public static final By prevTimeView = By.xpath("//button[@aria-label='open previous view']");
	public static final By nextTimeView = By.xpath("//button[@aria-label='open next view']");
	public static final By hoursMinsList = By.xpath("//span[@role='option']");
	public static final By selectedEndMins = By.xpath("//div[@aria-label='Select minutes. Selected time is 12:00 AM']//span[10]");
	public static final By selectpm = By.xpath("//div[@class='MuiClock-root css-fhpqww']//button[2]");
	public static final By calendericon = By.xpath("//*[local-name()='svg' and @data-testid='DateRangeIcon']/*[local-name()='path']");
	public static final By timeicon = By.xpath("//*[local-name()='svg' and @data-testid='AccessTimeIcon']/*[local-name()='path'][1]");
	
	
	public static final By registrationsAppid  = By.xpath("//label[@id='textFeild-registrationsApplicationIdField-label']");
	public static final By registrationsMLSid = By.xpath("//label[@id='textFeild-registrationsMlsIdField-label']");
	public static final By registrationsStartDate = By.xpath("//label[@id='registrationsShowableStartDatetimeField-label']");
	public static final By registrationsEndDate = By.xpath("//label[@id='registrationsShowableEndDatetime-label']");
	public static final By registrationsappidInput = By.xpath("//input[@id='textFeild-registrationsApplicationIdField']");
	public static final By registrationsmlsidInput = By.xpath("//input[@id='textFeild-registrationsMlsIdField']");
	public static final By registrationsstartdateInput = By.xpath("//input[@id='registrationsShowableStartDatetimeField']");
	public static final By registrationsenddateInput = By.xpath("//input[@id='registrationsShowableEndDatetime']");
	public static final By registrationIDvalue = By.xpath("(//tr[@class='MuiTableRow-root css-w18wvc']//td)[2]");
	public static final By applicationIDvalue = By.xpath("(//tr[@class='MuiTableRow-root css-w18wvc']//td)[3]");
	public static final By mlsIDvalue = By.xpath("(//tr[@class='MuiTableRow-root css-w18wvc']//td)[4]");
	public static final By inspectList  = By.xpath("//th[@aria-sort='ascending']/../td//a");
	public static final By viewjsonList = By.xpath("(//th[@scope='row']//button)");
	public static final By ID1 = By.xpath("(//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-sygs5q'])[1]/following::td");
	public static final By ID2= By.xpath("(//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-sygs5q'])[2]/following::td");
	public static final By ID3 = By.xpath("(//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-sygs5q'])[3]/following::td");
	public static final By registationinputID  = By.xpath("//input[@id='textFeild-registrationRegistrationId']");
	public static final By inspectIcon = By.xpath("//*[local-name()='svg' and @data-testid='PageviewOutlinedIcon']/*[local-name()='path']");
//	public static final By  = By.xpath("");
//	
//	public static final By  = By.xpath("");
//	public static final By  = By.xpath("");
//	public static final By  = By.xpath("");
	
	
}
