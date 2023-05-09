package Page_Functions;

import Utils.CoreActions;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Object_Repository.Home_Page;
import Object_Repository.Login_Page;

public class Login_Page_Func extends CoreActions {
	
	    protected static WebDriver driver1;
	    public Login_Page_Func(WebDriver driver)
	    {
	        super(driver);
	        Login_Page_Func.driver1=driver;

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
	   
	   public static void loginWithCCARUser() {
		   String username = prop.getProperty("usernameC");
		   String password = prop.getProperty("password1");
		   sendUsername(username);
		   sendPassword(password);
		   
	   }
	   
	   public static void loginWithBrokerCredentials() {
		   String username = prop.getProperty("username1");
		   String password = prop.getProperty("password1");
		   sendUsername(username);
		   sendPassword(password);
	   }
	   public static void loginWithTMCredentials() {
		   String username = prop.getProperty("teamMemberId");
		   String password = prop.getProperty("password");
		   sendUsername(username);
		   sendPassword(password);
	   }
	   public static void loginWithNewTLCredentials() {
		   String username = prop.getProperty("newusertl");
		   String password = prop.getProperty("password");
		   sendUsername(username);
		   sendPassword(password);
	   }
	   public static void loginWithNewUserCredentials() {
		   String username = prop.getProperty("newid1");
		   String password = prop.getProperty("password1");
		   sendUsername(username);
		   sendPassword(password);
	   }
	   public static void loginWithNewTMCredentials() {
		   String username = prop.getProperty("newusertm");
		   String password = prop.getProperty("password");
		   sendUsername(username);
		   sendPassword(password);
	   }
	   public static void logOutByMenu() {
		   sleep(1);
		   click(Home_Page.menu);
		   sleep(2);
		   click(Login_Page.logOut);
		   sleep(4);
//           Assert.assertTrue(driver.getCurrentUrl().contains("logout"),"logout is not successful.");
           waitForLogOut(Login_Page.logIn);
		   click(Login_Page.logIn);
		   waitForLogInHome();
		   click(Login_Page.logInBtn);
		   waitForLogInPage();		
	   }
	   public static void logOutByURL() {
		   logOutUrl();
		   sleep(2);
		   click(Login_Page.logIn);
		   waitForLogInHome();
		   click(Login_Page.logInBtn);
		   waitForLogInPage();
	   }
	   
	   public static void switchToNewLogin() {
	     	
	     	((JavascriptExecutor) driver).executeScript("window.open()");
	     	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	     	driver.switchTo().window(tabs.get(1));
	     	String url = "https://login.tst.brightmls.com/login";
	     	driver.navigate().to(url);

	     }
}
