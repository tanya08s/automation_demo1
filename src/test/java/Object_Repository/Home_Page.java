package Object_Repository;

import org.openqa.selenium.By;

public class Home_Page {
	
	public static final By close_btn = By.xpath("//button[@id='close-modal-btn']"); 
	public static final By pop_up = By.xpath("(//div[@class='MuiDialog-container MuiDialog-scrollPaper']//div)[1]"); 
	public static final By products_option = By.xpath("(//ul[@id='mega_menu_top']//li//a)[1]");
	public static final By teams_option = By.xpath("(//a[@class='premium-anchor'])[3]");
	
	
}
