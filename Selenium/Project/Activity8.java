package SeleniumActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity8 {
	
	
    WebDriver driver; 
    WebDriverWait wait;
    
    @BeforeMethod
    public void method1() {
    driver=new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("http://alchemy.hguy.co/orangehrm");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    wait=new WebDriverWait(driver,10);

    }
    
    @Test
    public void applyLeave() {

    	WebElement username=driver.findElement(By.id("txtUsername"));
    	WebElement password=driver.findElement(By.id("txtPassword"));
    	
    	username.sendKeys("orange");
    	password.sendKeys("orangepassword123");
    	
    	driver.findElement(By.id("btnLogin")).click();
    	driver.findElement(By.id("menu_dashboard_index")).click();
    	
    	WebElement temp=driver.findElement(By.xpath("//img[@src='/orangehrm/symfony/web/webres_5d69118beeec64.10301452/orangehrmLeavePlugin/images/ApplyLeave.png']"));
    	temp.click();
    	
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='menu_leave_applyLeave']")));
    	driver.findElement(By.xpath("//a[@id='menu_leave_applyLeave']")).click();
    	WebElement fromDate=driver.findElement(By.id("applyleave_txtFromDate"));
    	WebElement toDate=driver.findElement(By.id("applyleave_txtToDate"));
    	WebElement comment=driver.findElement(By.id("applyleave_txtComment"));
    	
    	driver.findElement(By.xpath("//*[@id='applyleave_txtLeaveType']")).click();
    	//select.selectByIndex(1);
    	fromDate.sendKeys("2020-04-01");
    	toDate.sendKeys("2020-04-02");
    	comment.sendKeys("Applying leave");
    	
    	driver.findElement(By.id("applyBtn")).click();
    	
    	
    	driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
    	if(driver.findElement(By.xpath("//a[@href='/orangehrm/symfony/web/index.php/leave/viewLeaveRequest/id/12']")).isDisplayed()) {
    	    System.out.println("The status of the leave is visible");
    	
    	}
    }
    @AfterMethod
    public void method2() {
    	driver.quit();
    } 
    
}
