package SeleniumActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Activity7_1 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait (driver, 20);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://training-support.net/selenium/dynamic-attributes");
	    
	    //Getting the title of the page and printing it
	    String title=driver.getTitle();
	    System.out.println("The Title of the Page is: "+ title);
	    //Find Username and Password fields
	    WebElement username=driver.findElement(By.xpath("//input[starts-with(@class,'username')]"));
	    WebElement password=driver.findElement(By.xpath("//input[starts-with(@class,'password')]"));
	    //Type the credentials
	    username.sendKeys("admin");
	    password.sendKeys("password");
	    //Click on login
	    driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	    //Wait for the login message to appear
	    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("action-confirmation"),"Welcome Back, admin"));
	    //Print the login message
	    String loginMsg=driver.findElement(By.id("action-confirmation")).getText();
	    System.out.println("The login message is: "+ loginMsg);
        
	    //Closing the browser
	    driver.close();
	}
}
