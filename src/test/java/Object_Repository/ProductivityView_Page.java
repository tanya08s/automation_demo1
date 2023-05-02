package Object_Repository;

import org.openqa.selenium.By;

public class ProductivityView_Page {
	
	public static final By goalVal=By.xpath("//div[@id='goals-card-actual-figures']//div[2]//p"); 
	public static final By tlGoal=By.xpath("(//div[@id='productoverview-datawrap']//div[@class='figureWrap greyishBack'])[1]");
	public static final By tmGoal=By.xpath("(//div[@id='productoverview-datawrap']//div[@class='figureWrap greyishBack'])[2]");
	public static final By yearDropDown= By.xpath("//div[@id='yearSelectDropDown']");
	public static final By yearDropDownSvg= By.xpath("//*[local-name()='svg' and @class='MuiSvgIcon-root MuiSelect-icon']/*[local-name()='path']");
	public static final By currentListingCount= By.xpath("(//div[@id='dashboard-listingNumber'])[1]");
	public static final By lostListingCount= By.xpath("(//div[@id='dashboard-listingNumber'])[2]");
	public static final By pendingListingCount= By.xpath("(//div[@id='dashboard-listingNumber'])[3]");
	public static final By currentListingPrice= By.xpath("(//p[@id='dashboard-priceTag'])[1]");
	public static final By lostListingPrice= By.xpath("(//p[@id='dashboard-priceTag'])[2]");
	public static final By pendingListingPrice= By.xpath("(//p[@id='dashboard-priceTag'])[3]");
	public static final By tlActualGoal= By.xpath("//td[@id='Closed_table_cell_td_0']//div//span[3]");
	public static final By tmActualGoal= By.xpath("//td[@id='Closed_table_cell_td_1']//div//span[3]");
	public static final By tlActualRevenue= By.xpath("//td[@id='volume_table_cell_td_0']//div//span[3]");
	public static final By tmActualRevenue= By.xpath("//td[@id='volume_table_cell_td_1']//div//span[3]");
	public static final By tlIndividualActualGoal= By.xpath("(//div[@id='productoverview-wrapper']//div[@id='productoverview-datawrap']//div//div[@class='flexCol']//div[1])[1]");
	public static final By tmIndividualActualGoal= By.xpath("(//div[@id='productoverview-wrapper']//div[@id='productoverview-datawrap']//div//div[@class='flexCol']//div[1])[3]");
	public static final By tlIndividualActualRevenue= By.xpath("(//div[@id='productoverview-wrapper']//div[@id='productoverview-datawrap']//div//div[@class='flexCol']//div[1])[1]");
	public static final By tmIndividualActualRevenue= By.xpath("(//div[@id='productoverview-wrapper']//div[@id='productoverview-datawrap']//div//div[@class='flexCol']//div[1])[3]");
	public static final By tlRevenueTab= By.xpath("(//div[@id='productoverview-tab2'])[1]");
	public static final By tmRevenueTab= By.xpath("(//div[@id='productoverview-tab2'])[3]");
	public static final By selectYear2023= By.xpath("//ul[@role='listbox']//li[@data-value='2023']");
	public static final By totalClosedListingGoal= By.xpath("//tr[@id='dashboard_tfoot_tr']//td[3]//div//span");
	public static final By totalClosedListingRevenue= By.xpath("//tr[@id='dashboard_tfoot_tr']//td[4]//div//span");
	public static final By teamActualGR= By.xpath("//div[@id='productoverview-datawrap']//div//div[@class='flexCol']//div[1]");
	public static final By prodRevenueOption= By.xpath("//div[@id='productoverview-tab2']");
	public static final By prodGoalOption= By.xpath("//div[@id='productoverview-tab1']");
	
	
	
	
}
