package SeleniumActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver; 
    
	@BeforeMethod
    public void method1() {
    
    driver=new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("http://alchemy.hguy.co/orangehrm");
	}
    
    @Test
    public void header1() {
    	
    WebElement image=driver.findElement(By.tagName("img"));
    
    System.out.println("The header is:"+ image.getAttribute("src"));
    }

    
    
    @AfterMethod
    
    public void method2() {
    	driver.quit();
    }
}
	
