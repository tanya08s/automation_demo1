package Utils;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import Object_Repository.Manage_Brokerage_Page;

public class CoreActions extends CoreTestIntegration {
	
	protected static WebDriver driver;
    protected static WebDriverWait waiter;
    protected Boolean value;
    protected int size_shown;
    protected CoreActions(WebDriver driver)
    {
        this.driver=driver;
        this.waiter=new WebDriverWait(driver,10);
    }
    protected static boolean waitForVisibility(By element) {
        boolean isVisible = true;
        waiter.until(ExpectedConditions.visibilityOfElementLocated(element));
        return isVisible;
    }
    public static void waitForDashboardUrl() {
        String changed_url = "https://www.tst.brightmls.com/dashboard";
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlMatches(changed_url));
    }
    public static void waitForTeamsPageUrl() {
        String changedUrl = "https://www.tst.brightmls.com/products/teams-auth";
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlMatches(changedUrl));
    }
    
    public static void waitForManageTeamsPageUrl() {
        String changedUrl = "https://teams.tst.brightmls.com/manageTeam";
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlMatches(changedUrl));
    }
    public static void openTeamSignUpUrl() {
    	
    	((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    	driver.get(prop.getProperty("url2"));
    }
    public static void teamsProductivityUrl() {
    	
    	String changed_url = "https://teams.tst.brightmls.com/teamProductivityDetails";
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains(changed_url));
    }
	public static void waitForLogOut(By element) {
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
    public static void waitForLogInHome() {
    	String changedUrl = "https://www.tst.brightmls.com/home";
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.urlMatches(changedUrl));
    }
    public static void waitForLogInPage() {
    	String changedUrl = "https://login.tst.brightmls.com/login";
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.urlMatches(changedUrl));
    }
    public static void waitForManageBrokeragePageUrl() {
        String changedUrl = "https://teams.tst.brightmls.com/manageBrokerage";
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.urlMatches(changedUrl));
    }
    public static void waitForTeamsSignUpPage() {
        String changedUrl = "https://teams.tst.brightmls.com/TeamSignUp";
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.urlMatches(changedUrl));
    }
    public static void waitForOktaURL() {
        String changedUrl = "https://okta.brightmls.com/";
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.urlMatches(changedUrl));
    }
    public static void waitForMatrixURL() {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.urlContains("matrix.tst.brightmls"));
    }
    public static void logOutUrl() {
    	String url = "https://www.tst.brightmls.com/logout";
    	driver.navigate().to(url);

    }
    public static void teamSignUpPageURL() {
    	String url = "https://teams.tst.brightmls.com/TeamSignUp";
    	driver.navigate().to(url);

    }
    
    public static void scroll() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,500)", "");
    }
    public static void scrolldown() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,1020)", "");
    }
    public static void scrollup() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,-700)", "");
    }
    
    
    public static void elementclick(By e) {
    	
    	WebElement l = currentEle(e);
    	JavascriptExecutor ex = (JavascriptExecutor)driver;
    	ex.executeScript("arguments[0].click();", l);
    	}
    
  public static void webelementclick(WebElement l) {
    	
    	
    	JavascriptExecutor ex = (JavascriptExecutor)driver;
    	ex.executeScript("arguments[0].click();", l);
    	}
    
    public static void checkOktaURL() {
    	
    	List<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
    	driver.switchTo().window(browserTabs .get(1));
    	waitForOktaURL();
    	driver.close();
    	driver.switchTo().window(browserTabs.get(0));
    	
    }
    
    public static void waitForUrl(String url) {
    	WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.urlContains(url));
    }
    
    public static String currentelement(By e) { 
    	
    	String text=driver.findElement(e).getText();
        return text;
    }
    
    public static void goToPreviousUrl() {
    	driver.navigate().back();
    }
    
    public static void refresh() {
    	driver.navigate().refresh();
    }
    
  public static WebElement currentEle(By e) { 
    	
    	WebElement ele=driver.findElement(e);
        return ele;
    }
  
   public static void loadingWait() {
	  
	  WebElement element=currentEle(Manage_Brokerage_Page.loader);
  	  WebDriverWait wait = new WebDriverWait(driver, 5000L);
      wait.until(ExpectedConditions.visibilityOf(element)); 
      wait.until(ExpectedConditions.invisibilityOf(element)); 
   }
   
   public static void loadingWait2() {
		  
		  WebElement element=currentEle(Manage_Brokerage_Page.loader2);
	  	  WebDriverWait wait = new WebDriverWait(driver, 5000L);
	      wait.until(ExpectedConditions.visibilityOf(element)); 
	      wait.until(ExpectedConditions.invisibilityOf(element)); 
	   }
  
   public static void waitTillDisapper(By e) {
	  WebElement element=currentEle(e);
	  WebDriverWait wait = new WebDriverWait(driver, 5000L);
	  wait.until(ExpectedConditions.invisibilityOf(element)); 
   }
    
   public static  String generateRandom(int l){
	  
	  String AlphaNumericStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz0123456789";
      StringBuilder s = new StringBuilder(l);
	  int i;
	  for ( i=0; i<l; i++) {
		  int ch = (int)(AlphaNumericStr.length() * Math.random());
		  s.append(AlphaNumericStr.charAt(ch));
		  }
	  return s.toString();
   }
  
    public static String getAttribute(By e,String val) { 
    	
    	String ele=driver.findElement(e).getAttribute(val);
        return ele;
    }
    public static List<WebElement> currentelements(By e) { 
    	
        List <WebElement> ls=driver.findElements(e);
        return ls;
    }
    
    public static int getElementCount(By e) { 
    	
        List <WebElement> ls=driver.findElements(e);
        int count=ls.size();
        return count;
    }
    
    public static void click(By element)
    {
        driver.findElement(element).click();
    }
    public static void enter_value(By element,String text)
    {
    	
        driver.findElement(element).sendKeys(text);
    }
    
    public static void clearWebField(By e){
    	WebElement element=currentEle(e);
        while(!element.getAttribute("value").equals("")){
            element.sendKeys(Keys.BACK_SPACE);
        }
    }
    public static void sendKey(By element,Keys key)
    {
      currentEle(element);  
      driver.findElement(element).sendKeys(key);
    }
    public static void clear_data(By element)
    {
        driver.findElement(element).clear();
    }
 
    public static void sleep(double sec)
    {
        try {
            Thread.sleep((long)(sec * 1000));
        }catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
    }
    public static void verifyAvailable(By element) {
    	driver.findElement(element);
    }
    public static boolean verifyTextNotNull(By element) {
    	String s=currentelement(element);
    	if (s == null || s.isEmpty() || s.trim().isEmpty()) {
    		return false;
    	}
    	else {
    		return true;
    	}
    	
    }
    public static boolean verifyStringNotNull(String s) {
    	
    	if (s == null || s.isEmpty() || s.trim().isEmpty()) {
    		return false;
    	}
    	else {
    		return true;
    	}
    	
    }
    public static boolean verifyAvailableAndVisible(By element) {
    	
    	 try {
             driver.findElement(element).isDisplayed();
         } 
         catch (Exception e) {
             return false;
         }
    	 return true;  	
    }
    public static boolean verifyElementAbsent(By element){
        try {
            driver.findElement(element);
            return false;

        } 
        catch (NoSuchElementException e) {
            return true;
        }
    }
    public static boolean verifyElementPresence(By element) {
    	try {
    		if(driver.findElement(element).isDisplayed()==true);
        	return true;
    	}
    	catch (NoSuchElementException e) {
            return false;
        }
    	
    }
    
    public static boolean checkIfClickable( By e) {
    	
    	WebElement element=driver.findElement(e);
    	if (element.isDisplayed() && element.isEnabled()) {
    	    return true;
    	}
    	else {
    		return false;
    	}
    	
    }

}
