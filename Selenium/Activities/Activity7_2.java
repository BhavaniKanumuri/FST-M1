package SeleniumActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_2 {
	
	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait (driver, 20);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://training-support.net/selenium/dynamic-attributes");
	    
	    //Getting the title of the page and printing it
	    String title=driver.getTitle();
	    System.out.println("The Title of the Page is: "+ title);
	    //Find Signup Elements
	    WebElement username= driver.findElement(By.xpath("//input[contains(@class,'-username')]"));
	    WebElement password= driver.findElement(By.xpath("//input[contains(@class,'-password')]"));
        WebElement confirmPwd= driver.findElement(By.xpath("//label[text()='Confirm Password']/following::input[1]"));
        WebElement email= driver.findElement(By.xpath("//input[starts-with(@class,'email')]"));
        //Sending Keys to the elements
        username.sendKeys("John");
        password.sendKeys("Johnpassword");
        confirmPwd.sendKeys("Johnpassword");
        email.sendKeys("john.abc@gmail.com");
        //Click on Sign Up
        driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
        //Wait for the login message to appear
	    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("action-confirmation"),"Thank you for registering, John"));
	    //Print the login message
	    String loginMsg=driver.findElement(By.id("action-confirmation")).getText();
	    System.out.println("The login message is: "+ loginMsg);
	    
	    //Closing the browser
	    driver.close();
        
        
	
	}
	
}
