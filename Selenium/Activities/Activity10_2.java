package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {
	
	public static void main(String[] args) {
		
		   
		WebDriver driver;
		driver = new FirefoxDriver();
		Actions actions=new Actions(driver);
		String keypressText;
		//Open the browser
	    driver.get("https://www.training-support.net/selenium/input-events");
	    //Get the title of the page
	    String title=driver.getTitle();
	    System.out.println("The Title of the Page is: "+ title);
	    WebElement keypress=driver.findElement(By.id("keyPressed"));
	    //Action for first letter in Caps
	    Action sequence1=actions.sendKeys("K").build();
	    sequence1.perform();
	    keypressText=keypress.getText();
	    System.out.println("THe pressed key is: "+keypressText);
	    //Actions for copy
	    Action sequence2=actions
	    		.keyDown(Keys.CONTROL)
	    		.sendKeys("a")
	    		.sendKeys("c")
	    		.keyUp(Keys.CONTROL)
	    		.build();
	    sequence2.perform();
	    keypressText=keypress.getText();
	    System.out.println("THe pressed key is: "+keypressText);
	    //Close the browser
	    driver.close();
	    
	}

}
