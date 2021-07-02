package testNGTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.training-support.net");
		
	}
    @Test
    public void exampletest() {
    	String title=driver.getTitle();
    	System.out.println("The Title of the Page is:"+ title);
    	Assert.assertEquals("Training Support", title);
    	driver.findElement(By.id("about-link")).click();
    	System.out.println("The Title of the NewPage is:"+ driver.getTitle());
    	Assert.assertEquals(driver.getTitle(), "About Training Support");
    }
	
    
    @AfterMethod
    public void aftermethod() {
    	driver.quit();
    }
}
