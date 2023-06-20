package Utils;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import Page_Functions.*;
import SHOAD_pageFunctions.dashboardPageFunc;
import SHOAD_pageFunctions.loginPageFunc;
import SHOAD_pageFunctions.organizationPageFunc;
import SHOAD_pageFunctions.page;


public class CoreTestIntegration {
	
	public static FileInputStream propInput;
	public static Properties prop;
	protected WebDriver driver;
    protected Login_Page_Func login_page_obj;
    protected Home_Page_Func home_page_obj;
    protected Team_Page_Func team_page_obj;
    protected Manage_Brokerage_Page_Func broker_manage_brokerage_page_obj;
    protected Manage_Team_Page_Func tl_manage_team_page_func;
    protected ProductivityView_Page_Func productivityView_page_obj;
    protected SearchListings_Page_Func listings_page_obj;
    protected Centre_County_Page_Func centreCounty_page_obj;
    protected Marketplace_Page_Func marketplace_page_obj;
    protected loginPageFunc loginPageFuncObj;
	protected page pageObj;
	protected organizationPageFunc organizationPageFuncObj;
	protected dashboardPageFunc dashboardPageFuncObj;
    
    @BeforeClass
    public void openBrowser(){
    	
    	try {
			propInput= new FileInputStream("src/test/java/resources/config.properties");
			prop= new Properties();
			try {
				prop.load(propInput);
			}
			catch(IOException e) {
				e.printStackTrace();
			}
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    	String log4jConfPath = "src/test/java/resources/log4j.properties";
    	PropertyConfigurator.configure(log4jConfPath);
    	driver=new Driver().getDriver();
        driver.manage().window().maximize();
  //      driver.get(prop.getProperty("url"));
        login_page_obj=new Login_Page_Func(driver);
        home_page_obj=new Home_Page_Func(driver);
        team_page_obj=new Team_Page_Func(driver);
        broker_manage_brokerage_page_obj=new Manage_Brokerage_Page_Func(driver);
        tl_manage_team_page_func=new Manage_Team_Page_Func(driver);
        productivityView_page_obj=new ProductivityView_Page_Func(driver);
        listings_page_obj=new SearchListings_Page_Func(driver);
        centreCounty_page_obj= new Centre_County_Page_Func(driver);
        marketplace_page_obj= new Marketplace_Page_Func(driver);
        loginPageFuncObj= new loginPageFunc(driver);
        pageObj= new page(driver);
        organizationPageFuncObj=new organizationPageFunc(driver);
        dashboardPageFuncObj= new dashboardPageFunc(driver);
        
    }
//    
//    @AfterClass(alwaysRun=true)
//    public void close()
//    {
//        driver.quit();
//    }

}
