package SeleniumActivities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_2 {
	
	public static void main(String[] args) {
		//Create WebDriver Instance
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Open the browser
	    driver.get("https://training-support.net/selenium/tables");
	    //Number of columns
	    List<WebElement> cols= driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));
	    //Number of rows
	    List<WebElement> rows= driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
	    //Print the number of rows
	    System.out.println("The number of  rows are: "+ rows.size());
	    //Print the number of columns
	    System.out.println("The number of columns are:"+ cols.size());
	    //Find and print the second row and second column
	    WebElement secondRow= driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
	    System.out.println("The second row and second column data is:"+ secondRow.getText());
	    //Click the header of the first column
	    driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[2]")).click();
	    //Print the values again
	    WebElement secondRowafter= driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
	    System.out.println("The second row and second column data after sorting is:"+ secondRowafter.getText());
	    
	    //Print the cell values of a footer
	    WebElement footer=driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
	    System.out.println("The footer is: "+ footer.getText());
	    
	    //Closing the browser
	    driver.close();
	}
}
