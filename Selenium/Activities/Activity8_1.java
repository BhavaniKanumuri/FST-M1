package SeleniumActivities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1 {

	public static void main(String[] args) {
		//Create WebDriver Instance
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Open the browser
	    driver.get("https://training-support.net/selenium/tables");
	    //Number of columns
	    List<WebElement> cols= driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[1]/td"));
	    //Number of rows
	    List<WebElement> rows= driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr"));
	    //Print the number of rows
	    System.out.println("The number of  rows are: "+ rows.size());
	    //Print the number of columns
	    System.out.println("The number of columns are:"+ cols.size());
	    //Find the third row
	    List<WebElement> thirdRow= driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[3]/td"));
	    //Print the third row
	    for(WebElement row:thirdRow) {
	    	System.out.println("The third row data is:"+ row.getText());
	    }
	    //Find the second row and second column
	    WebElement secondRow= driver.findElement(By.xpath("//table[contains(@class,'striped')]/tbody/tr[2]/td[2]"));
	    //Print the second row and second column data
	    System.out.println("The second row and second column data is:"+ secondRow.getText());
	    
	    //Close the browser
	    driver.close();
 
	}
}
