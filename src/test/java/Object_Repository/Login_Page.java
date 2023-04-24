package Object_Repository;

import org.openqa.selenium.By;

public class Login_Page {
	
	    public static final By USERNAME = By.xpath("//input[@id='username']");
	    public static final By PASSWORD = By.xpath("//input[@id='password']");
	    public static final By SUBMIT = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root jss44 MuiButton-contained MuiButton-containedPrimary']");
        public static final By logOut = By.xpath("//a[contains(text(),'Logout')]");
        public static final By logIn = By.xpath("(//a[@href='https://www.tst.brightmls.com'])[2]");
        public static final By logInBtn = By.xpath("//button[@id='login_id_unauth']");
}
