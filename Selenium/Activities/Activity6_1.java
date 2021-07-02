package SeleniumActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity6_1 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://training-support.net/selenium/dynamic-controls");
	    
	    //Getting the title of the page and printing it
	    String title=driver.getTitle();
	    System.out.println("The Title of the Page is: "+ title);
	    
	    //Finding and clicking the checkbox toggle button
	    driver.findElement(By.id("toggleCheckbox")).click();
	    
	    //Waiting for the checkbox to disappear
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    //Clicking the button again
	    driver.findElement(By.id("toggleCheckbox")).click();
	    
	    //Waiting for the checkbox to appear
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	    //Clicking the checkbox again
	    driver.findElement(By.className("willDisappear")).click();
	    
	    //Closing the browser
	    driver.close();
  
	}

}
