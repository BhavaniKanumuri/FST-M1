package testNGTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;
	
	@BeforeTest
	public void beforeClass(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.training-support.net/selenium/target-practice");
	}
	@Test
	public void testcase1() {
		String title=driver.getTitle();
    	System.out.println("The Title of the Page is:"+ title);
    	Assert.assertEquals("Target Practice", title);
	}
	@Test
	public void testcase2() {
		WebElement blackbutton=driver.findElement(By.cssSelector("button[class.ui black button"));
		Assert.assertTrue(blackbutton.isDisplayed());
		Assert.assertEquals(blackbutton.getText(),"black");
	}
	@Test(enabled=false)
	public void testcase3() {
		String subHeading= driver.findElement(By.className("sub header")).getText();
		Assert.assertEquals(subHeading,"Practice your element targetting here!");
	}
	
	@Test
	public void testcase4() {
		throw new SkipException("This test case is skipped");
	}
	@AfterTest
    public void afterClass() {
    	driver.quit();
    }
}
