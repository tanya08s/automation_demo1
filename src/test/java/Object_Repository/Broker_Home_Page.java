package Object_Repository;

import org.openqa.selenium.By;

public class Broker_Home_Page {
	
	public static final By close_btn = By.xpath("//button[@id='close-modal-btn']"); 
	public static final By pop_up = By.xpath("(//div[@class='MuiDialog-container MuiDialog-scrollPaper']//div)[1]");
	public static final By  menu= By.xpath("((//div[@id='bright-megamenu']//div//div//div)[2]//nav//ul)[1]");
	public static final By brokerage_teams_option = By.xpath("(((//div[@id='bright-megamenu']//div//div//div)[2]//nav//ul)[1]//li//ul//li//li//ul//li[@role='presentation'])[5]");

}
