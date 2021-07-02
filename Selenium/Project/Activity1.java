package SeleniumActivities;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 { 
	
	    WebDriver driver; 
	    
	    @BeforeMethod
	    public void method1() {
	    
	    driver=new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("http://alchemy.hguy.co/orangehrm");
	    }
	    @Test
	    public void hrmPage() {
	    	String title=driver.getTitle();
	    	System.out.println("The Title of the Page is:"+ title);
	    	Assert.assertEquals("OrangeHRM", title);
	    	
	    }
	    @AfterMethod
	    public void method2() {
	    	driver.quit();
	    }
		

	}

