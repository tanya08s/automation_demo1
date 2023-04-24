package Object_Repository;

import org.openqa.selenium.By;

public class Manage_Team_Page {
	
	public static final By pageHeading = By.xpath("//h1[@id='manage_team_page_rm_heading']");
    public static final By pageDescription = By.xpath("//p[@id='manage_team_page_rm_discription']");

    public static final By teamName= By.xpath("//div[@class='team_search_and_container']//div//div//h2");
    public static final By teamText= By.xpath("//div[@class='team_search_and_container']//div//div//p");
    public static final By syndicateCheckbox= By.xpath("((//div[@class='team_search_and_container']//div//div)[2]//label//span)[1]");
    public static final By syndicateText= By.xpath("((//div[@class='team_search_and_container']//div//div)[2]//label//span)[4]");
    public static final By syndicateImg= By.xpath("(//div[@class='team_search_and_container']//div//div)[2]//img");
    public static final By searchPlaceholder= By.xpath("(//div[@id='manage_team_page_search_section']//div)[3]//div//div//div//label");
    public static final By searchDropdownButton= By.xpath("(((//div[@id='manage_team_page_search_section']//div)[3]//div//div//div)[2]//div//button)[2]");
    public static final By tableHeading1= By.xpath("(//div[@class='team_search_and_table']//div//div//table//thead//tr//th)[1]");
    public static final By tableHeading2= By.xpath("(//div[@class='team_search_and_table']//div//div//table//thead//tr//th)[2]");
    public static final By tableHeading3= By.xpath("(//div[@class='team_search_and_table']//div//div//table//thead//tr//th)[3]");
    public static final By tableHeading4= By.xpath("(//div[@class='team_search_and_table']//div//div//table//thead//tr//th)[4]");
    public static final By tableHeading5= By.xpath("(//div[@class='team_search_and_table']//div//div//table//thead//tr//th)[5]");
    public static final By tableHeading6= By.xpath("(//div[@class='team_search_and_table']//div//div//table//thead//tr//th)[6]");
    public static final By tableHeading7= By.xpath("(//div[@class='team_search_and_table']//div//div//table//thead//tr//th)[7]");
    
    public static final By tableBody1= By.xpath("(//div[@class='team_search_and_table']//div//div//table//tbody//tr//td)[1]//div");
    public static final By tableBody2= By.xpath("(//div[@class='team_search_and_table']//div//div//table//tbody//tr//td)[2]");
    public static final By tableBody3= By.xpath("(//div[@class='team_search_and_table']//div//div//table//tbody//tr//td)[3]");
    public static final By tableBodyCheckbox= By.xpath("(//div[@class='team_search_and_table']//div//div//table//tbody//tr//td)[4]//label//span//span//input");
    public static final By tableBody4= By.xpath("((//div[@class='team_search_and_table']//div//div//table//tbody//tr//td)[4]//label//span)[4]");
    public static final By tableBody5= By.xpath("(//div[@class='team_search_and_table']//div//div//table//tbody//tr//td)[5]//div//div");
    public static final By tableBody6= By.xpath("(//div[@class='team_search_and_table']//div//div//table//tbody//tr//td)[6]");
    public static final By tableBody7= By.xpath("(//div[@class='team_search_and_table']//div//div//table//tbody//tr//td)[7]//button");

    public static final By searchBox= By.xpath("//input[@id='manage_team_page_search_rowautoComplete']");
    public static final By addToTeam= By.xpath("//div[@role='presentation']");
    public static final By inviteToTeamButton = By.xpath("//button[@id='invite-teamMember-button1']");
    public static final By resendInvite= By.xpath("//button[@id='cancel-invite-teamMember-button1'][1]");
    public static final By cancelInvite= By.xpath("//button[@id='cancel-invite-teamMember-button1'][2]");
    public static final By cancelPopUp= By.xpath("//button[@id='popup_button_Cancel']");
    public static final By resendPopUp= By.xpath("//button[@id='popup_button_Resend']");
    public static final By resendVerifyALERT= By.xpath("//div[@class='toastHeader']");
    public static final By resendVerifyALERTDescription= By.xpath("//div[@class='toastHeader toastDescription']");
    public static final By resendAlertIcon= By.xpath("//*[local-name()='svg' and @class='MuiSvgIcon-root toastIcon']/*[local-name()='path']");
    public static final By resendAlertClose= By.xpath("//*[local-name()='svg' and @class='MuiSvgIcon-root toastIcon toastify__close']/*[local-name()='path']");
    public static final By resendAlertDiv= By.xpath("//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--default mainContainer']");
    public static final By productivityViewInput= By.xpath("//div[@id='report_view_select_id0']");
    public static final By homeIcon= By.xpath("//div[@id='brightLogo_div_id']");
    public static final By productivityDiv= By.xpath("//div[@id='list_activity_card_id_productivityOverview-container']");
    public static final By viewDetails= By.xpath("//a[@id='list_activity_anchor_productivityOverview-container']");
    public static final By setProductivityViewTL= By.xpath("//div[@id='report_view_select_id0']");
    public static final By setProductivityViewTM1= By.xpath("//div[@id='report_view_select_id1']");
    public static final By teamDropdown= By.xpath("(//ul[@role='listbox']//li)[1]");
    public static final By individualDropdown= By.xpath("(//ul[@role='listbox']//li)[2]");
}
