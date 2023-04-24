package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Page_Functions.Marketplace_Page_Func;

public class TestIntegrationMarketplace {
	
	public static FileInputStream propInput;
	public static Properties prop;
	protected WebDriver driver;
	protected Marketplace_Page_Func marketplace_page_obj;
	
	@BeforeClass
    public void open() throws IOException {
    	
    	try {
			propInput= new FileInputStream("src/test/java/resources/config.properties");
			prop= new Properties();
			prop.load(propInput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    	driver=new Driver().getDriver();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("urlNew"));
        marketplace_page_obj= new Marketplace_Page_Func(driver);
	}   
	
   @AfterClass(alwaysRun=true)
   public void close()
   {
      driver.quit();
   }
}
