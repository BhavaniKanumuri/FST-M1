package SeleniumActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://training-support.net/selenium/simple-form");
	    
	    String title=driver.getTitle();
	    System.out.println("The Title of the Page is: "+ title);
		
	    WebElement firstName=driver.findElement(By.id("firstName"));
	    WebElement lastName=driver.findElement(By.id("lastName"));
	    
	    firstName.sendKeys("Ricky");
	    lastName.sendKeys("Monty");
	    
	    WebElement email=driver.findElement(By.id("email"));
	    WebElement contactNo=driver.findElement(By.id("number"));
	    
	    email.sendKeys("Helloworld@123.com");
	    contactNo.sendKeys("1234125678");
	    
	    driver.findElement(By.xpath("//input[@class='ui green button']")).click();
	    
	    driver.close();
	    }
}
