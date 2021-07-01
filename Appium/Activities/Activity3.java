package ractivities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity3 {
	
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
        caps.setCapability("appPackage", "com.android.calculator2");
        caps.setCapability("appActivity", ".Calculator");
        caps.setCapability("noReset", true);
        
        //Set Appium server URL
        URL remoteURL=new URL("http://localhost:4723/wd/hub");
        //Initializing AndroidDriver
        driver=new AndroidDriver<MobileElement>(remoteURL, caps);
        wait = new WebDriverWait(driver, 10);
    
    }
    @Test
    public void add() {
    	driver.findElementById("com.android.calculator2:id/digit_5").click();
    	driver.findElementById("com.android.calculator2:id/op_add").click();
    	driver.findElementById("com.android.calculator2:id/digit_9").click();
    	//Click on equal to
    	driver.findElementById("com.android.calculator2:id/eq").click();
    	//Print result
    	String result=driver.findElementById("com.android.calculator2:id/result").getText();
    	System.out.println("The addition of 5 and 9 is: "+ result);
    	Assert.assertEquals(result, "14");
    }
    @Test
    public void sub() {
    	driver.findElementById("com.android.calculator2:id/digit_1").click();
    	driver.findElementById("com.android.calculator2:id/digit_0").click();
    	driver.findElementById("com.android.calculator2:id/op_sub").click();
    	driver.findElementById("com.android.calculator2:id/digit_5").click();
    	//Click on equal to
    	driver.findElementById("com.android.calculator2:id/eq").click();
    	//Print result
    	String result=driver.findElementById("com.android.calculator2:id/result").getText();
    	System.out.println("The subtraction of 10 and 5 is: "+ result);
    	Assert.assertEquals(result, "5");
    }
    @Test
    public void mul() {
    	driver.findElementById("com.android.calculator2:id/digit_5").click();
    	driver.findElementById("com.android.calculator2:id/op_mul").click();
    	driver.findElementById("com.android.calculator2:id/digit_1").click();
    	driver.findElementById("com.android.calculator2:id/digit_0").click();
    	driver.findElementById("com.android.calculator2:id/digit_0").click();
    	//Click on equal to
    	driver.findElementById("com.android.calculator2:id/eq").click();
    	//Print result
    	String result=driver.findElementById("com.android.calculator2:id/result").getText();
    	System.out.println("The multiplication of 5 and 100 is: "+ result);
    	Assert.assertEquals(result, "500");
    }
    @Test
    public void div() {
    	driver.findElementById("com.android.calculator2:id/digit_5").click();
    	driver.findElementById("com.android.calculator2:id/digit_0").click();
    	driver.findElementById("com.android.calculator2:id/op_div").click();
    	driver.findElementById("com.android.calculator2:id/digit_2").click();
    	//Click on equal to
    	driver.findElementById("com.android.calculator2:id/eq").click();
    	//Print result
    	String result=driver.findElementById("com.android.calculator2:id/result").getText();
    	System.out.println("The division of 50 and 2 is: "+ result);
    	Assert.assertEquals(result, "25");
    }
    
    @AfterClass
    public void tearDown() {
    	driver.quit();
    }
}
