package week2.day2.assingment;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		//driver.findElementByLinkText(using)
	
		driver.findElementByPartialLinkText( "CRM").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Find Leads").click();
		
	driver.findElementByXPath("(//a[@class='x-tab-right'])[3]").click();
	
	driver.findElementByName("emailAddress").sendKeys("nahulram@gmail.com");
	
Thread.sleep(3000);
	
	driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
	
	Thread.sleep(3000);
	
	driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
	
	driver.findElementByLinkText("Duplicate Lead").click();
		
	driver.findElementByName("submitButton").click();
	
	driver.close();
	
	}

}
