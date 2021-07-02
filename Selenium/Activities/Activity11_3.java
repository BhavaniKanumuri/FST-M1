package SeleniumActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {
	
	public static void main(String[] args) {

		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Open the browser
	    driver.get("https://www.training-support.net/selenium/javascript-alerts");
	    //Get the title of the page
	    String title=driver.getTitle();
	    System.out.println("The Title of the Page is: "+ title);
	    
	    //Find the prompt button
	    driver.findElement(By.id("prompt")).click();
	    //Switch to  alert tab
	    Alert promptAlert=driver.switchTo().alert();
	    //Get and print the text
	    String alertText=promptAlert.getText();
	    System.out.println("The Prompt Alert text is: "+ alertText);
	    //Send keys in prompt
	    promptAlert.sendKeys("Yes, you are!");
	    //Close the alert
	    promptAlert.accept();
	    
	    //Close the browser
	    driver.close();

	}
}
