package activities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GoogleKeep_Activity2 {
	//Declare AndroidDriver
	AndroidDriver<MobileElement> driver;
	
	@BeforeClass
	public void setUp() throws MalformedURLException {
		//Set desired capabilities
		DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel4Emulator");
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", true);
        
        //Set Appium server URL
        URL remoteURL=new URL("http://localhost:4723/wd/hub");
        //Initializing AndroidDriver
        driver=new AndroidDriver<MobileElement>(remoteURL, caps);
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
       
	}
	
	@Test
	public void addNote() {
		//Click on Create New Note
		driver.findElementById("com.google.android.keep:id/new_note_button").click();
		//Adding the title
		MobileElement elem1=driver.findElementById("com.google.android.keep:id/editable_title");
		elem1.click();
		elem1.sendKeys("This is the Page Title");
		
		//Adding the description
		MobileElement elem2=driver.findElementById("com.google.android.keep:id/edit_note_text");
		elem2.click();
		elem2.sendKeys("This is a description");
		//Pressing the back button
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]").click();
		
		//Assertions
		MobileElement e1=driver.findElementById("com.google.android.keep:id/index_note_title");
    	String el1=e1.getText();
    	Assert.assertEquals(el1,"This is the Page Title" );

		
	}
	
	@AfterClass
    public void tearDown() {
    	driver.quit();
    }
}
