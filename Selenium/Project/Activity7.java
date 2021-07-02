package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity7 {
WebDriver driver; 
WebDriverWait wait;
    
    @BeforeMethod
    public void method1() {
    driver=new FirefoxDriver();
    wait=new WebDriverWait(driver,10);
    driver.get("http://alchemy.hguy.co/orangehrm");

    }
    
    @Test
    public void workExperience() {
    	
    	Actions a = new Actions(driver);
   	 	String title=driver.getTitle();
    	System.out.println("The Title of the Page is:"+ title);
    	WebElement username=driver.findElement(By.id("txtUsername"));
    	WebElement password=driver.findElement(By.id("txtPassword"));
    	
    	username.sendKeys("orange");
    	password.sendKeys("orangepassword123");
    	
    	driver.findElement(By.id("btnLogin")).click();
    
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='menu_pim_viewMyDetails']")));
        driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click();
        driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click();
        a.sendKeys(Keys.PAGE_DOWN).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[9]/a")));
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[9]/a")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("addWorkExperience")));
        driver.findElement(By.id("addWorkExperience")).click();
        
        WebElement company=driver.findElement(By.id("experience_employer"));
    	WebElement jobTitle=driver.findElement(By.id("experience_jobtitle"));
    	WebElement from=driver.findElement(By.id("experience_from_date"));
    	WebElement to=driver.findElement(By.id("experience_to_date"));
    	WebElement comment=driver.findElement(By.id("experience_comments"));
    	
    	company.sendKeys("IBM-India");
    	jobTitle.sendKeys("Test Specialist");
    	from.sendKeys("2018-04-01");
    	to.sendKeys("2021-04-02");
    	comment.sendKeys("Selenium activities");
    	
    	driver.findElement(By.id("btnWorkExpSave")).click();
    
    }
    @AfterMethod
    public void method2() {
    	driver.quit();
    } 
}
