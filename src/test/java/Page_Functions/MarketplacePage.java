package Page_Functions;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import Utils.CoreActions;

public class MarketplacePage extends CoreActions{
	
	protected WebDriver driver1;
	private static Logger logger= Logger.getLogger(MarketplacePage.class);
    public MarketplacePage(WebDriver driver)
    {
        super(driver);
        this.driver1=driver;
    }
	public static void pageToMarketplace() {
		
		driver.get(prop.getProperty("urlNew"));
		logger.info("marketplace url opened");
	}

}
