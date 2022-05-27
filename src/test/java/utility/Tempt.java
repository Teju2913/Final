package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tempt 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Support\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
		
		
	Actions act=new Actions(driver) ;
	driver.findElementByXPath("//*[text()='Login']");
	WebElement abc=driver.findElementByXPath("//*[text()='Login']");
	act.moveToElement(abc).build().perform();
	driver.findElementByXPath("//*[text()='My Profile']").click();
	driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("9860757712");
	driver.findElementByXPath("//*[@type='password']").sendKeys("rushikesh@2913");
	driver.findElementByXPath("(//*[@type='submit'])[2]").click();
	
	Thread.sleep(6000);
	driver.findElementByXPath("//*[text()='Manage Addresses']").click();
	
	driver.findElementByXPath("//*[@class='_1QhEVk']").click();
	driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("rani");
	driver.findElementByXPath("(//*[@type='text'])[3]").sendKeys("9860757712");
	driver.findElementByXPath("(//*[@type='text'])[4]").sendKeys("412307");
	driver.findElementByXPath("(//*[@type='text'])[5]").sendKeys("Pune");
	driver.findElementByXPath("//*[@name='addressLine1']").sendKeys("nagar,ahmed");
//river.findElementByXPath("_//*[@class='_1XFPmK']").click();
	driver.findElementByXPath("(//*[@type='button'])[2]").click();
//river.findElementByXPath("(//*[text()='Confirm address']").click();
	
	}	

}
