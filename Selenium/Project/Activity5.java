package SeleniumActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {

WebDriver driver; 
WebDriverWait wait;
    
    @BeforeMethod
    public void method1() {
    driver=new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("http://alchemy.hguy.co/orangehrm");
    wait=new WebDriverWait(driver,10);

    }
    
    @Test
    public void employeeDetailsEdit() throws InterruptedException {
    	
   	 	String title=driver.getTitle();
    	System.out.println("The Title of the Page is:"+ title);
    	WebElement username=driver.findElement(By.id("txtUsername"));
    	WebElement password=driver.findElement(By.id("txtPassword"));
    	
    	username.sendKeys("orange");
    	password.sendKeys("orangepassword123");
    	
    	driver.findElement(By.id("btnLogin")).click();
    	wait.until(ExpectedConditions.elementToBeClickable(By.id("menu_pim_viewMyDetails")));
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
        
       
        
        WebElement firstName=driver.findElement(By.id("personal_txtEmpFirstName"));
    	WebElement lastName=driver.findElement(By.id("personal_txtEmpLastName"));
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	WebElement gender=driver.findElement(By.id("personal_optGender_1"));
    	Select select=new Select(driver.findElement(By.id("personal_cmbNation")));
    	WebElement dob=driver.findElement(By.id("personal_DOB"));
    	
    	firstName.clear();
    	firstName.sendKeys("Indigo");
    	lastName.clear();
    	lastName.sendKeys("Chester");
    	gender.click();
    	select.selectByIndex(4);
    	dob.clear();
    	dob.sendKeys("1900-07-07");
    	
    	driver.findElement(By.id("btnSave")).click();

    }
    @AfterMethod
    public void method2() {
    	driver.quit();
    } 
}
