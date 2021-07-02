package SeleniumActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity6 {
WebDriver driver; 
WebDriverWait wait;
    
    @BeforeMethod
    public void method1() {
    	driver=new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait=new WebDriverWait(driver,10);
    }
    
    @Test
    public void directory() {
    	
    	WebElement username=driver.findElement(By.id("txtUsername"));
    	WebElement password=driver.findElement(By.id("txtPassword"));
    	
    	username.sendKeys("orange");
    	password.sendKeys("orangepassword123");
    	
    	driver.findElement(By.id("btnLogin")).click();
    	//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='menu_directory_viewDirectory']//b")));
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='menu_directory_viewDirectory']")));
        WebElement element=driver.findElement(By.xpath("//a[@id='menu_directory_viewDirectory']"));
        element.click();

        
        if(element.isDisplayed() && element.isEnabled()) {
        	System.out.println("The element is visible and enabled");
    		element.click();
    		System.out.println("The element is clickable");
    	}
        
        element.click();
        String actualElem=driver.findElement(By.xpath("//div[@class='head']//h1")).getText();
    	System.out.println("The header is:"+ actualElem);
    	Assert.assertEquals("Search Directory", actualElem);
    	
    	
    }
    @AfterMethod
    public void method2() {
    	driver.quit();
    } 
}
