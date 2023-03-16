package Page_Functions;

import Utils.CoreActions;

import org.openqa.selenium.WebDriver;

import Object_Repository.Login_Page;

public class Login_Page_Func extends CoreActions {
	
	    protected WebDriver driver1;
	    public Login_Page_Func(WebDriver driver)
	    {
	        super(driver);
	        this.driver1=driver;

	    }
	    public static void sendUsername(String text)
	    {
	    	waitForVisibility(Login_Page.USERNAME);
	        enter_value(Login_Page.USERNAME,text);
	    }
	    public static void sendPassword(String text)
	    {
	        clear_data(Login_Page.PASSWORD);
	        sleep(2);
	        enter_value(Login_Page.PASSWORD,text);
	    }
	    public static void ClickSubmit()
	    {
	        click(Login_Page.SUBMIT);
	        sleep(3);
	        
	    }
	   public static void loginWithCredentials() {
		   String username = prop.getProperty("username");
		   String password = prop.getProperty("password");
		   sendUsername(username);
		   sendPassword(password);
	   }
	   
	   public static void loginWithBrokerCredentials() {
		   String username = prop.getProperty("username1");
		   String password = prop.getProperty("password1");
		   sendUsername(username);
		   sendPassword(password);
	   }
}
