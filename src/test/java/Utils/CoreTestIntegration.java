package Utils;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import Page_Functions.*;


public class CoreTestIntegration {
	
	public static FileInputStream propInput;
	public static Properties prop;
	protected WebDriver driver;
    protected Login_Page_Func login_page_obj;
    protected Home_Page_Func home_page_obj;
    protected Team_Page_Func team_page_obj;
    protected Broker_Home_Page_Func broker_home_page_obj;
    protected Broker_Manage_Brokerage_Page_Func broker_manage_brokerage_page_obj;
    protected TL_Home_Page_Func tl_home_page_obj;
    protected TL_Manage_Team_Page_Func tl_manage_team_page_func;
    
    
    @BeforeClass
    public void openBrowser() throws IOException {
    	
    	try {
			propInput= new FileInputStream("src/test/java/resources/config.properties");
			prop= new Properties();
			prop.load(propInput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    	driver=new Driver().getDriver();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
        login_page_obj=new Login_Page_Func(driver);
        home_page_obj=new Home_Page_Func(driver);
        team_page_obj=new Team_Page_Func(driver);
        broker_home_page_obj=new Broker_Home_Page_Func(driver);
        broker_manage_brokerage_page_obj=new Broker_Manage_Brokerage_Page_Func(driver);
        tl_home_page_obj=new TL_Home_Page_Func(driver);
        tl_manage_team_page_func=new TL_Manage_Team_Page_Func(driver);
        
    }
    
//    @AfterClass(alwaysRun=true)
//    public void close()
//    {
//        driver.quit();
//    }

}
