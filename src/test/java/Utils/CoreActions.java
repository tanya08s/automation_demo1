package Utils;

import java.util.concurrent.TimeoutException;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    public static void click(By element)
    {
        driver.findElement(element).click();
    }
    public static void enter_value(By element,String text)
    {
        driver.findElement(element).sendKeys(text);
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

}
