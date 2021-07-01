package ractivities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity2 {
	
	//Declare AndroidDriver
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;
    
    @BeforeClass
	public void setUp() throws MalformedURLException {
		//Set desired capabilities
		DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel4Emulator");
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);
        
        //Set Appium server URL
        URL remoteURL=new URL("http://localhost:4723/wd/hub");
        //Initializing AndroidDriver
        driver=new AndroidDriver<MobileElement>(remoteURL, caps);
        wait = new WebDriverWait(driver, 10);
	}
    @Test
    public void titlePage() {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		//Go the URL
		driver.get("https://www.training-support.net/");
		//Title of the page
		String pageTitle=driver.findElementByXPath("//android.view.View[@text='Training Support']").getText();
		System.out.println("The Page Title is: "+ pageTitle);
		//Click on About Us button
		driver.findElementByXPath("//android.view.View[@text='About Us']").click();
		//Print the title of the new page
		String newPageTitle=driver.findElementByXPath("//android.view.View[@text='About Us']").getText();
		System.out.println("The New Page Title is: "+ newPageTitle);
		
		//Assertions
		Assert.assertEquals(pageTitle, "Training Support");
		Assert.assertEquals(newPageTitle, "About Us");
    }
    
    @AfterClass
    public void tearDown() {
    	driver.quit();
    }
}





