package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {
	WebDriver driver; 
    
    @BeforeMethod
    public void method1() {
    driver=new FirefoxDriver();
    driver.get("http://alchemy.hguy.co/orangehrm");

    }
    
    @Test
    public void employeeDetails() {
    	
   	 	String title=driver.getTitle();
    	System.out.println("The Title of the Page is:"+ title);
    	WebElement username=driver.findElement(By.id("txtUsername"));
    	WebElement password=driver.findElement(By.id("txtPassword"));
    	
    	username.sendKeys("orange");
    	password.sendKeys("orangepassword123");
    	
    	driver.findElement(By.id("btnLogin")).click();
    	
    	driver.findElement(By.id("menu_pim_viewPimModule")).click();
    	driver.findElement(By.id("btnAdd")).click();
    	
    	WebElement firstName=driver.findElement(By.id("firstName"));
    	WebElement lastName=driver.findElement(By.id("lastName"));
    	
    	firstName.sendKeys("Oliver");
    	lastName.sendKeys("Jackson");
    	
    	driver.findElement(By.id("btnSave")).click();
    	
    	driver.findElement(By.id("menu_pim_viewPimModule")).click();
    	
    	WebElement empname=driver.findElement(By.id("empsearch_employee_name_empName"));
    	empname.sendKeys("Oliver");
    	
    	
    	driver.findElement(By.id("searchBtn")).click();
    	
    	if(driver.findElement(By.xpath("//*[@class='null']")).isDisplayed())
    	{
            System.out.println("The employee details are found");
    	}
    	else {
    		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
    		driver.findElement(By.xpath("//*[@class='null']")).isDisplayed();
    		System.out.println("The employee details are found");
    	}
    	
    }

    @AfterMethod
    public void method2() {
    	driver.quit();
    } 
}