package SeleniumActivities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {
	
	public static void main(String[] args) {
		//Create WebDriver Instance
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Open the browser
	    driver.get("https://training-support.net/selenium/selects");
	    
	    //Display chosen option
	    WebElement chosenOpt=driver.findElement(By.id("single-value"));
	    //Find the dropdown element on the webpage
	    Select dropdown=new Select(driver.findElement(By.id("single-select")));
	    
	    //Select second option by Visible text
	    dropdown.selectByVisibleText("Option 2");
	    System.out.println(chosenOpt.getText());
	    
	    //Select third option by Index
	    dropdown.selectByIndex(3);
	    System.out.println(chosenOpt.getText());
	    
	    //Select fourth option by Value
	    dropdown.selectByValue("4");
	    System.out.println(chosenOpt.getText());
	    
	    //Get all the dropdown options
	    List<WebElement> options= dropdown.getOptions();
	    for(WebElement alloptions:options) {
	    	System.out.println("The Options displayed are: "+ alloptions.getText());
	    }
	    
        //Close the browser
	    driver.close();
	}
}
