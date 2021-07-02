package SeleniumActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
	
	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://training-support.net/selenium/dynamic-controls");
	    
	    String title=driver.getTitle();
	    System.out.println("The Title of the Page is: "+ title);
	    
	   WebElement textField=driver.findElement(By.id("input-text"));
	   System.out.println("The check box is selected: "+ textField.isEnabled());
	   driver.findElement(By.id("toggleInput")).click();
	   System.out.println("The check box is selected: "+ textField.isEnabled());
	   driver.close();
	   
	    
	}    

}
