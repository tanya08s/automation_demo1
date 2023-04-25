package Object_Repository;

import org.openqa.selenium.By;

public class Manage_Brokerage_Page {
	
	public static final By decline_team=By.xpath("((//table[@id='manage_brokerage_dt']//tbody//tr//td)[6]//div//button)[2]");
    public static final By accept_team=By.xpath("((//div[@id='manage_brokerageteamMember_mx_wd_cont']//table[@id='manage_brokerage_dt']//tbody//tr//td)[6]//div//button)[1]");
    public static final By team_acceptance_alert= By.xpath("//div[@class='toastHeader']");
    public static final By team_decline_alert= By.xpath("//div[@class='toastHeader']");
    public static final By team_disband_alert= By.xpath("//div[@class='toastHeader']");
    public static final By brokerPageHeading= By.xpath("//h1[@id='manage_brokerage_heading']");
    public static final By rows_per_page= By.xpath("//select[@aria-label='rows per page']");
    public static final By all_rows= By.xpath("//select[@aria-label='rows per page']//option[5]");
    public static final By teams_rows= By.xpath("//table[@id='manage_brokerage_dt']//tbody//tr");
    public static final By team_name= By.xpath("//table[@id='manage_brokerage_dt']//tbody//tr[@class='MuiTableRow-root manage_brokerage_tr can_edit']//td[2]//span[contains(text(),'Archer Pac Team1')]");
    public static final By disband_option= By.xpath("(//table[@id='manage_brokerage_dt']//tbody//tr[@class='MuiTableRow-root manage_brokerage_tr can_edit']//td[2]//span[contains(text(),'Archer Pac Team1')])/../..//td[6]");
    public static final By declineAlert= By.xpath("//button[@id='popup_button_decline_button']");
    public static final By disbandAlertHeading= By.xpath("//div[@id='manage_brokerage_dt_customizedDialogs_heading_discription']//h1");
    public static final By disbandAlertSubHeading= By.xpath("//div[@class='disband_summary']//p");
    public static final By disbandAlertCont1= By.xpath("//div[@class='disband_summary']//ul//li[1]");
    public static final By disbandAlertCont2= By.xpath("//div[@class='disband_summary']//ul//li[2]");
    public static final By disbandAlertCont3= By.xpath("//div[@class='disband_summary']//ul//li[3]");
    public static final By disbandAlertCont4= By.xpath("//div[@class='disband_summary']//ul//li[4]");
    public static final By disbandAlertStrongText1= By.xpath("//div[@class='disband_summary']//ul//li[1]//strong");
    public static final By disbandAlertStrongText2= By.xpath("//div[@class='disband_summary']//ul//li[2]//strong");
    public static final By cancelButton= By.xpath("//button[@id='popup_button_Cancel']");
    public static final By disbandButton= By.xpath("//button[@id='popup_button_disbandTeam']");
    public static final By acceptTeam= By.xpath("//table[@id='manage_brokerage_dt']//tbody//tr[@class='MuiTableRow-root manage_brokerage_tr ']//td[2]//span[contains(text(),'Archer Pac Team1')]/../..//td[6]//div//button[1]");
    public static final By declineTeam=	By.xpath("//table[@id='manage_brokerage_dt']//tbody//tr[@class='MuiTableRow-root manage_brokerage_tr ']//td[2]//span[contains(text(),'Archer Pac Team1')]/../..//td[6]//div//button[2]");
    public static final By loader= By.xpath("//div[@role='progressbar']");
  
}
