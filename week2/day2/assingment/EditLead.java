package week2.day2.assingment;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("//input[@size='20'][@id='ext-gen248']").sendKeys("Nahul");
		
		driver.findElementByXPath("//input[@size='20'][@id='ext-gen250']").sendKeys("Ram");
		
		driver.findElementByXPath("(//td[@class='x-btn-center'])[7]").click();
		
           Thread.sleep(3000);
         
           driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
           
           
           driver.findElementByLinkText("Edit").click();
		
           driver.findElementById("updateLeadForm_companyName").sendKeys("s");
           
           driver.findElementByName("submitButton").click();

           driver.close();
           
}

}