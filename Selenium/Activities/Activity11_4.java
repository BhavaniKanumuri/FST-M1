package SeleniumActivities;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_4 {
	
	public static void main(String[] args) {

		WebDriver driver;
		driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		//Open the browser
	    driver.get("https://www.training-support.net/selenium/tab-opener");
	    //Get the title of the page
	    String title=driver.getTitle();
	    System.out.println("The Title of the Page is: "+ title);
	    
	    //Handling the tab
	    String handle= driver.getWindowHandle();
	    System.out.println("The current window is: "+handle);
	    //Find the new tab and click it
	    driver.findElement(By.id("launcher")).click();
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    //Get all the handles
	    Set<String> allWindows=driver.getWindowHandles();
	    System.out.println("All the window handlwes are:"+allWindows);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    //For each handle
	    for (String handles: driver.getWindowHandles()) {
	    	driver.switchTo().window(handles);
	    }
	     //Print the handle of the current window
        System.out.println("Current window handle: " + driver.getWindowHandle());
        //Wait for page to load completely
        wait.until(ExpectedConditions.titleIs("Newtab"));
        //Print New Tab Title
        System.out.println("New Tab Title is: " + driver.getTitle());
 
        //Get heading on new page
        String newTabText = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("New tab heading is: " + newTabText);
 
        //Open Another Tab
        driver.findElement(By.linkText("Open Another One!")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
 
        //Make sure the new tab's handle is part of the handles set
        allWindows = driver.getWindowHandles();
        System.out.println("All window handles: " + allWindows);
 
        //Loop through the handles set till we get to the newest handle
        for (String handles : driver.getWindowHandles()) {
            driver.switchTo().window(handles);
        }
 
        //Print the handle of the current window
        System.out.println("New tab handle: " + driver.getWindowHandle());
 
        //Wait for the newest tab to load completely
        wait.until(ExpectedConditions.titleIs("Newtab2"));
 
        //Print New Tab Title
        System.out.println("New Tab Title is: " + driver.getTitle());
 
        //Get heading on new page
        newTabText = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("New tab heading is: " + newTabText);
 
        //Close the browser
        driver.quit();
    }
	   

}
