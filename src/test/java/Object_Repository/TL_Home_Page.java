package Object_Repository;

import org.openqa.selenium.By;

public class TL_Home_Page {
	
	public static final By close_btn = By.xpath("//button[@id='close-modal-btn']"); 
	public static final By pop_up = By.xpath("(//div[@class='MuiDialog-container MuiDialog-scrollPaper']//div)[1]"); 
	public static final By menu= By.xpath("//ul[@id='mega_menu_right']");
	public static final By manage_team= By.xpath("//a[@href='https://teams.tst.brightmls.com/manageTeam']");

}
