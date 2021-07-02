package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_3 {

	public static void main(String[] args) {

		WebDriver driver;
		driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		//Open the browser
	    driver.get("https://training-support.net/selenium/drag-drop");
	    //Get the title of the page
	    String title=driver.getTitle();
	    System.out.println("The Title of the Page is: "+ title);
	    //Find the ball
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));
	    
	    WebElement ball = driver.findElement(By.id("draggable"));
        WebElement drop1 = driver.findElement(By.id("droppable"));
        WebElement drop2 = driver.findElement(By.id("dropzone2"));
        //Drag and drop to zone1
        Actions dragAndDrop=new Actions(driver);
        dragAndDrop.dragAndDrop(ball,drop1).build().perform();
        //Waiting for the color to change
        wait.until(ExpectedConditions.attributeToBeNotEmpty(drop1,"background-color"));
        System.out.println("Ball is in Drop Zone 1");
        //Drag and drop to zone2
        dragAndDrop.dragAndDrop(ball,drop2).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(drop2,"background-color"));
        System.out.println("Ball is in Drop Zone 2");
        
        //Close the browser
        driver.close();
        
	    
	}
}
