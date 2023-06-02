package SHOAD_pageFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import Utils.CoreActions;


public class page extends CoreActions {
	
	protected WebDriver driver1;
	private static Logger logger= Logger.getLogger(page.class);
    public page(WebDriver driver)
    {
        super(driver);
        this.driver1=driver;
    }
	public static void pageToShoad() {
		
		driver.get(prop.getProperty("SHOADURL"));
		logger.info("shoad url opened");
	}

	
}
