package SeleniumActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 {
	
	public static void main(String[] args) {

		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Open the browser
	    driver.get("https://www.training-support.net/selenium/javascript-alerts");
	    //Get the title of the page
	    String title=driver.getTitle();
	    System.out.println("The Title of the Page is: "+ title);
	    
	    //Find the confirm button
	    driver.findElement(By.id("confirm")).click();
	    //Switch to  alert tab
	    Alert confirmAlert=driver.switchTo().alert();
	    //Get and print the text
	    String alertText=confirmAlert.getText();
	    System.out.println("The Confirm Alert text is: "+ alertText);
	    //Close the alert by accept
	    //confirmAlert.accept();
	    //Close the alert by dismiss
	    confirmAlert.dismiss();
	    //Close the browser
	    driver.close();
	}    

}
