package SeleniumActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
	
	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.training-support.net/selenium/target-practice");
	    
	    String title=driver.getTitle();
	    System.out.println("The Title of the Page is: "+ title);
	    
	    String thirdHeader=driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
	    System.out.println("The Third Header is: "+ thirdHeader);
	    
	    String fifthHeader=driver.findElement(By.xpath("//h5")).getCssValue("color");
	    System.out.println("The fifth header color is: "+fifthHeader);
	    
	    String violetButton=driver.findElement(By.xpath("//button[@class='ui violet button']")).getAttribute("class");
	    System.out.println("The class attributes of violet button are: "+ violetButton);
	    
	    String greyButton=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
	    System.out.println("The grey button text is: "+ greyButton);
	    
	    
	    
	    driver.close();

	}
}
