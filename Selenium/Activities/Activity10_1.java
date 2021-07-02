package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {
	
	public static void main(String[] args) {
		
	   
		WebDriver driver;
		driver = new FirefoxDriver();
		Actions actions=new Actions(driver);
		//Open the browser
	    driver.get("https://www.training-support.net/selenium/input-events");
	    //Get the title of the page
	    String title=driver.getTitle();
	    System.out.println("The Title of the Page is: "+ title);
	    
	    //Find the cube
	    WebElement cube=driver.findElement(By.id("wrapD3Cube"));
	    //Left click
	    actions.click(cube);
	    WebElement lvalue=driver.findElement(By.className("active"));
	    System.out.println("Left Click value is: "+ lvalue.getText());
	    //double click
	    actions.doubleClick(cube).perform();
	    WebElement dvalue=driver.findElement(By.className("active"));
	    System.out.println("Double Click value is: "+ dvalue.getText());
	    //Right click
	    actions.contextClick(cube).perform();
	    WebElement rvalue=driver.findElement(By.className("active"));
	    System.out.println("Right Click value is: "+ rvalue.getText());
	    
	    //Close the browser
	    driver.close();

	
	}
}
