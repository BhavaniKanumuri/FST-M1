package SeleniumActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {
	
	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait (driver, 20);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://training-support.net/selenium/ajax");
	    
	    //Getting the title of the page and printing it
	    String title=driver.getTitle();
	    System.out.println("The Title of the Page is: "+ title);
	    
	    //Find and click Change Content
	    driver.findElement(By.xpath("//button[contains(@class,'violet')]")).click();
	    
	    //Waiting for Hello to appear
	    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"),"HELLO!"));
	    //Printing the message of the new page
	    String msg1=driver.findElement(By.id("ajax-content")).getText();
	    System.out.println("The message on the new page is: "+ msg1);
	    
	    //Waiting for I'm Late to appear
	    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"),"I'm late!"));
	    //Printing the message of the new page
	    String msg2=driver.findElement(By.id("ajax-content")).getText();
	    System.out.println("The message now is: "+ msg2);
	    
	    //Closing the browser
	    driver.close();

	    
	}
}
