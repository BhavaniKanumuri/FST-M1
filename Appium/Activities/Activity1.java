package ractivities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity1 {
	//Declare AndroidDriver
	AndroidDriver<MobileElement> driver;
	WebDriverWait wait;
	
	@Test
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
        System.out.println("Calculator app is open");
        
        //Multiplication of numbers
        //Click on first number
        driver.findElementById("com.android.calculator2:id/digit_5").click();
        System.out.println("The first number is 5");
        //Click on multiply button
        driver.findElementById("com.android.calculator2:id/op_mul").click();
        //Click on second number
        driver.findElementById("com.android.calculator2:id/digit_9").click();
        System.out.println("The second number is 9");
        //Verifying the result
        MobileElement result=driver.findElementByXPath("//android.widget.TextView[contains(@text,'45')]");
        String res=result.getText();
        System.out.println("The multiplication of 5 and 9 is: "+ res);
        Assert.assertEquals(res,"45");
    
	}
}
