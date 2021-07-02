package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
	    driver.get("https://www.training-support.net");
	    
	    String title=driver.getTitle();
	    System.out.println("The Title of the Page is: "+ title);
	    
	    WebElement idLocator=driver.findElement(By.id("about-link"));
	    System.out.println("The Text in the Element: "+ idLocator.getText());
	    
	    WebElement classLocator=driver.findElement(By.className("green"));
	    System.out.println("The Text in the Element: "+ classLocator.getText());
	    
	    WebElement textLocator=driver.findElement(By.linkText("About Us"));
	    System.out.println("The Text in the Element: "+ textLocator.getText());
	    
	    WebElement cssLocator=driver.findElement(By.cssSelector(".green"));
	    System.out.println("The Text in the Element: "+ cssLocator.getText());
	    
	    
	    driver.close();

	}

}
