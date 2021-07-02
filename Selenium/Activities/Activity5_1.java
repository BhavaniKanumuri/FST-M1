package SeleniumActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://training-support.net/selenium/dynamic-controls");
	    
	    String title=driver.getTitle();
	    System.out.println("The Title of the Page is: "+ title);
	    
	    WebElement element=driver.findElement(By.xpath("//input[@class='willDisappear']"));
	    System.out.println("The check box is displayed: "+ element.isDisplayed());
	    driver.findElement(By.id("toggleCheckbox")).click();
	    System.out.println("The check box is displayed: "+ element.isDisplayed());
	    
	    driver.close();
	    
	}

}
