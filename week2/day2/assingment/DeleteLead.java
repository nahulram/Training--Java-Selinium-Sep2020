package week2.day2.assingment;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver= new ChromeDriver();
				
			driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("demosalesmanager");
				
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Find Leads").click();
		
		  driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[2]").click();
		  
		  driver.findElementByName("phoneNumber").sendKeys("9629458384");
		  
		  driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		  
		  Thread.sleep(3000);
		  
		  driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		  
		  Thread.sleep(3000);
		  
		  driver.findElementByClassName("subMenuButtonDangerous").click();
		  
		  driver.findElementByLinkText("Find Leads").click();
		  
		  driver.close();
		 
	}

}
