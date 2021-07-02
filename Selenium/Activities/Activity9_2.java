package SeleniumActivities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {
	
	public static void main(String[] args) {
		//Create WebDriver Instance
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Open the browser
	    driver.get("https://training-support.net/selenium/selects");
	    
	    //Display the text of a chosen option
	    WebElement element=driver.findElement(By.id("multi-value"));
	    //Find the Multi Select webelement
	    Select multi=new Select(driver.findElement(By.id("multi-select")));
	    if (multi.isMultiple()) {
	    	//Select by visible text
	    	multi.selectByVisibleText("Javascript");
	    	System.out.println(element.getText());
	    	//Select by Value
	    	multi.selectByValue("node");
	    	System.out.println(element.getText());
	    	//Select by index- 4, 5 and 6
	    	for(int i=4;i<=6;i++) {
	    		multi.selectByIndex(i);
	    	}
	    	System.out.println(element.getText());
	    	//Deselect by value
	    	multi.deselectByValue("node");
	    	System.out.println(element.getText());
	    	//Deselect by Index
	    	multi.deselectByIndex(7);
	    	System.out.println(element.getText());
	    	
	    	//Print first selected option
	    	multi.getFirstSelectedOption();
	    	System.out.println(element.getText());
	    	//Print all the selected options
	    	List<WebElement> selected= multi.getAllSelectedOptions();
		    for(WebElement allselected:selected) {
		    	System.out.println("The Options displayed are: "+ allselected.getText());
		    }
		    //Deselect all the options
		    multi.deselectAll(); 
		    System.out.println(element.getText());
	    }
	    driver.close();
	    
	}

}
	
