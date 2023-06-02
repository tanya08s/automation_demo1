package SHOAD_objectRepository;

import org.openqa.selenium.By;

public class loginPage {
	
	public static final By userId = By.xpath("//input[@id='textFeild-userId']");
	public static final By password = By.xpath("//input[@id='textFeild-passwordFeild']");
	public static final By signinBtn = By.xpath("//button[contains(text(),'Sign In')]");
	public static final By alertDiv = By.xpath("//div[@role='alert']");
	public static final By alertDivHeading = By.xpath("//div[@role='alert']//div//div");
	public static final By alertDivDescription = By.xpath("//div[@role='alert']//div//p");
	public static final By alertDivErrorIcon = By.xpath("//*[local-name()='svg' and @data-testid='ErrorOutlineIcon' ]/*[local-name()='path']");
	public static final By alertDivSuccessIcon = By.xpath("//*[local-name()='svg' and @data-testid='CheckCircleOutlineIcon' ]/*[local-name()='path']");
	public static final By logout = By.xpath("//div//span[contains(text(),'Logout')]");

}
