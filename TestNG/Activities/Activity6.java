package testNGTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity6 {
	
WebDriver driver;
	
	@BeforeClass
	public void beforeClass(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.training-support.net/selenium/login-form");
	}
	
	@Test(priority=0)
    @Parameters({"username", "password"})
    public void login(String username, String password) {
		WebElement uname=driver.findElement(By.id("username"));
		WebElement pwd=driver.findElement(By.id("password"));
		
		uname.sendKeys(username);
    	pwd.sendKeys(password);
    	driver.findElement(By.xpath("//button[text()='Log in']")).click();
    	
    	String message=driver.findElement(By.id("action-confirmation")).getText();
    	Assert.assertEquals(message, "Welcome Back, admin");	
    	
	}
	@AfterClass
    public void afterClass() {
    	driver.quit();
    }

}
