package Object_Repository;

import org.openqa.selenium.By;

public class TL_Manage_Team_Page {
	
	public static final By pageHeading = By.xpath("//section[@id='manage_team_page_rm']//div//div[@id='manage_team_page_rm_mx_wd_cont']//div//div//h1");
    public static final By pageDescription = By.xpath("//div[@id='manage_team_page_rm_mx_wd_cont']//div//div//p//p");

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


}
