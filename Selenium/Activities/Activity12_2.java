package SeleniumActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity12_2 {
	
	    public static void main(String[] args) {
	    
	    	WebDriver driver;
	    	
			driver = new FirefoxDriver();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Open the browser
		    driver.get("https://www.training-support.net/selenium/iframes");
		    //Get the title of the page
		    String title=driver.getTitle();
		    System.out.println("The Title of the Page is: "+ title);
		    
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        //Switch to first iFrame on the page
	        driver.switchTo().frame(0);

	        //Switch to first iFrame in that frame
	        driver.switchTo().frame(0);

	        //Get heading text in iFrame
	        WebElement frameHeading1 = driver.findElement(By.cssSelector("div.content"));
	        System.out.println(frameHeading1.getText());

	        //Switch back to parent page
	        driver.switchTo().defaultContent();

	        //Switch to first iFrame on the page
	        driver.switchTo().frame(0);

	        //Switch to second iFrame in that frame
	        driver.switchTo().frame(1);

	        //Get heading text in iFrame
	        WebElement frameHeading2 = driver.findElement(By.cssSelector("div.content"));
	        System.out.println(frameHeading2.getText());

	        //Close browser
	        driver.close();
	    }
	}


