package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	 private final WebDriver driver;
	 
	    public Driver()
	    {
	    	WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
	    }
	    public WebDriver getDriver()
	    {
	        return  driver;
	    }


}
