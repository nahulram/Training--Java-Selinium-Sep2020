package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		
		  driver.findElementById("username").sendKeys("demosalesmanager");
		  
		  driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		  
		  
		  driver.findElementByClassName("decorativeSubmit").click();
		  
		  driver.findElementByLinkText("CRM/SFA").click();
		  
		  driver.findElementByPartialLinkText("Leads").click();
		  
		  driver.findElementByLinkText("Create Lead").click();
		  
		  driver.findElementById("createLeadForm_companyName").sendKeys("Testleaf");
		  
		  driver.findElementById("createLeadForm_firstName").sendKeys("Nahul");
		  
		  driver.findElementById("createLeadForm_lastName").sendKeys("Ram");
		  
		  driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9488085958");
		  
		  WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		  
		  
		  Select dropDown = new Select(source);
		  
		  dropDown.selectByVisibleText("Employee");
		  
		  WebElement marketingCampign =
		  driver.findElementById("createLeadForm_marketingCampaignId");
		  
		  Select drop = new Select(marketingCampign);
		  
		  
		  drop.selectByValue("9001");
		  
		  WebElement industry =
		  driver.findElementById("createLeadForm_industryEnumId");
		  
		  Select dropD = new Select(industry);
		  List<WebElement> options = dropD.getOptions();
		  
		  int size = options.size(); 
		  
		/*
		 * for(int i =1 ;i <size-1; i++){
		 * 
		 * options.get(i).click();
		 * 
		 * Thread.sleep(1000);
		 * 
		 * 
		 * }
		 */
			
			
		  
		options.get(size-2).click();
		  
		 // dropD.selectByIndex(1);
		  
		 //WebElement oneElement = options.get(1);
         
        // oneElement.click();
	    
	     WebElement corperation = driver.findElementById("createLeadForm_ownershipEnumId");
	  
		Select vv = new Select  (corperation);
		
		vv.selectByIndex(5);
		
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		
		Select co = new Select(country);
		
	    co.selectByVisibleText("India");
	    
	    driver.findElementByName("submitButton").click();
		
	}
	
	
	
	
	
	

}
