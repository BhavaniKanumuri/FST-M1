package SeleniumActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.training-support.net/selenium/simple-form");
	    
	    String title=driver.getTitle();
	    System.out.println("The Title of the Page is: "+ title);
	    
	    WebElement firstName=driver.findElement(By.xpath("//input[@id='firstName']"));
	    WebElement lastName=driver.findElement(By.xpath("//input[@id='lastName']"));
	    
	    firstName.sendKeys("John");
	    lastName.sendKeys("Lincoln");
	    
	    WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	    WebElement contactNo=driver.findElement(By.xpath("//input[@id='number']"));
	    
	    email.sendKeys("Helloworld@123.com");
	    contactNo.sendKeys("1234125678");
	    
	    driver.findElement(By.xpath("//textarea")).sendKeys("This is an example message");
	    
        driver.findElement(By.xpath("//input[@class='ui green button']")).click();
  
	}
	    
}
