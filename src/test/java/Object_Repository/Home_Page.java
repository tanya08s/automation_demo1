package Object_Repository;

import org.openqa.selenium.By;

public class Home_Page {
	
	public static final By close_btn = By.xpath("//button[@id='close-modal-btn']"); 
	public static final By pop_up = By.xpath("(//div[@class='MuiDialog-container MuiDialog-scrollPaper']//div)[1]"); 
	public static final By products_option = By.xpath("(//ul[@id='mega_menu_top']//li//a)[1]");
	public static final By teams_option = By.xpath("(//a[@class='premium-anchor'])[3]");
	public static final By brokerage_teams_option = By.xpath("//a[@href='https://teams.tst.brightmls.com/manageBrokerage']");
	public static final By menu= By.xpath("//ul[@id='mega_menu_right']");
	public static final By manage_team= By.xpath("//a[@href='https://teams.tst.brightmls.com/manageTeam']");
	public static final By risHeading= By.xpath("//h2[@id='RISMedia_container_heading']");
	public static final By risSubHeading1= By.xpath("//button[@id='RISMedia_container_tab_0']//span//span");
	public static final By risSubHeading2= By.xpath("//button[@id='RISMedia_container_tab_1']//span//span");
	public static final By risSubHeading3= By.xpath("//button[@id='RISMedia_container_tab_2']//span//span");
	public static final By risImg= By.xpath("//img[@class='spotlightImage']");
	public static final By risImgText= By.xpath("//h3[@id='RISMedia_containerfeatured_title']");
	public static final By risImgSubText= By.xpath("//p[@id='RISMedia_containerfeatured_author']");
	public static final By risNewsCard1= By.xpath("//div[@class='RISMedia_container_panel_0_RISNews']//a[1]");
	public static final By risNewsCard2= By.xpath("//div[@class='RISMedia_container_panel_0_RISNews']//a[2]");
	public static final By risNewsCard3= By.xpath("//div[@class='RISMedia_container_panel_0_RISNews']//a[3]");
	public static final By risNewsButton= By.xpath("//a[@id='RISMedia_container_panel_0_RISNews_viewAll_container']");
	public static final By risEventCard1= By.xpath("//a[@id='RISMedia_container_panel_0_RISEvents0_NewsCard']");
	public static final By risEventCard2= By.xpath("//a[@id='RISMedia_container_panel_0_RISEvents1_NewsCard']");
	public static final By risEventButton= By.xpath("//a[@id='RISMedia_container_panel_0_RISEvents_viewAll_container']");
	public static final By risReportCard1= By.xpath("//div[@class='RISMedia_container_panel_0_RISReports']//a[1]");
	public static final By risReportCard2= By.xpath("//div[@class='RISMedia_container_panel_0_RISReports']//a[2]");
	public static final By risReportCard3= By.xpath("//div[@class='RISMedia_container_panel_0_RISReports']//a[3]");
	public static final By risReportButton= By.xpath("//a[@id='RISMedia_container_panel_0_RISReports_viewAll_container']");
	public static final By checkTeamText= By.xpath("(//p[@class='MuiTypography-root icon-text MuiTypography-body1'])[3]");
	
}
