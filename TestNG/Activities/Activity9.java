package testNGTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {
WebDriver driver;
	
	@BeforeClass
	public void beforeclass(){
		driver = new FirefoxDriver();
		Reporter.log("Starting Test Case");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.training-support.net/selenium/javascript-alerts");
	    Reporter.log("Browser is opened");
	    Reporter.log("Page title is " + driver.getTitle());
	}
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("Test Case execution is started");
        driver.switchTo().defaultContent();
	}
    @Test(priority=0)
    public void simpleAlertTestCase() {
    	Reporter.log("Simple Alert Test Case has been started");
    	driver.findElement(By.id("simple")).click();
    	Reporter.log("Simple Alert has been opened");
    	Alert simpleAlert=driver.switchTo().alert();
    	Reporter.log("The focus is switched to Simple Alert");
    	
    	String alertText=simpleAlert.getText();
    	Reporter.log("The message is"+ alertText );
    	Assert.assertEquals("This is a JavaScript Alert!", alertText);
        simpleAlert.accept();
        Reporter.log("Simple Alert is closed");
        Reporter.log("Simple Alert Test Case has ended");
    }
	@Test(priority=1)
	public void confirmAlertTestCase() {
		Reporter.log("Confirm Alert Test Case has been started");
    	driver.findElement(By.id("confirm")).click();
    	Reporter.log("Confirm Alert has been opened");
    	Alert confirmAlert=driver.switchTo().alert();
    	Reporter.log("The focus is switched to Confirm Alert");
    	
    	String alertText=confirmAlert.getText();
    	Reporter.log("The message is"+ alertText );
    	Assert.assertEquals("This is a JavaScript Confirmation!", alertText);
        confirmAlert.accept();
        Reporter.log("Confirm Alert is closed");
        Reporter.log("Confirm Alert Test Case has ended");
	}
	
	@Test(priority=2)
	public void promptAlertTestCase() {
		Reporter.log("Prompt Alert Test Case has been started");
    	driver.findElement(By.id("prompt")).click();
    	Reporter.log("Prompt Alert has been opened");
    	Alert promptAlert=driver.switchTo().alert();
    	Reporter.log("The focus is switched to Prompt Alert");
    	
    	String alertText=promptAlert.getText();
    	Reporter.log("The message is"+ alertText );
    	promptAlert.sendKeys("Welcome!");
    	Reporter.log("Text has been entered in Prompt Alert");
    	Assert.assertEquals("This is a JavaScript Prompt!", alertText);
        promptAlert.accept();
        Reporter.log("Prompt Alert is closed");
        Reporter.log("Prompt Alert Test Case has ended");
	}
	@AfterClass
    public void afterclass() {
		Reporter.log("Test case has been ended");
    	driver.quit();
    }
}
