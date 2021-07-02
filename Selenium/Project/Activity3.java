package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {
	
	WebDriver driver; 
    
    @BeforeMethod
    public void method1() {
    
        driver=new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
    }
    
    @Test
    public void login() {
    	
    	String title=driver.getTitle();
    	System.out.println("The Title of the Page is:"+ title);
    	WebElement username=driver.findElement(By.id("txtUsername"));
    	WebElement password=driver.findElement(By.id("txtPassword"));
    	
    	username.sendKeys("orange");
    	password.sendKeys("orangepassword123");
    	
    	driver.findElement(By.id("btnLogin")).click();
    	
    	
        Boolean display=driver.findElement(By.xpath("//*[@id='menu_dashboard_index']")).isDisplayed();
        System.out.println("You are in Homepage now: "+display);
    
    	
    }

    @AfterMethod
    public void method2() {
    	driver.quit();
    }
    
    
    
}
