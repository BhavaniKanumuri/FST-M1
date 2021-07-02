package SeleniumActivities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {
WebDriver driver; 
WebDriverWait wait;
    
    @BeforeMethod
    public void method1() {
    driver=new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("http://alchemy.hguy.co/orangehrm");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    wait=new WebDriverWait(driver,10);
    }
    
    @Test
    public void emerContacts() {

    	WebElement username=driver.findElement(By.id("txtUsername"));
    	WebElement password=driver.findElement(By.id("txtPassword"));
    	
    	username.sendKeys("orange");
    	password.sendKeys("orangepassword123");
    	
    	driver.findElement(By.id("btnLogin")).click();
    	
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='menu_pim_viewMyDetails']")));
        driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click();
        driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click();
        
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[3]/a")));
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[3]/a")).click();
    	
    	List<WebElement> rowData=driver.findElements(By.tagName("tr"));
    	List<WebElement> colData=driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
    	
    	System.out.println("The rows size is: "+rowData.size());
    	System.out.println("The columns size is: "+colData.size());
    	
    	for(WebElement data: rowData) {
    		System.out.println(data.getText());
    	}
    		
    	
    }
    @AfterMethod
    public void method2() {
    	driver.quit();
    } 
    
}
