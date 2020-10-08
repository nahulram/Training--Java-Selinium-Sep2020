package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createaccount {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		
		
	 ChromeDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("http://leaftaps.com/opentaps/control/login");
	 

	 driver.findElementById("username").sendKeys("demosalesmanager");
	 
	 
	 driver.findElementById("password").sendKeys("crmsfa");
	 
	 
	 driver.findElementByClassName("decorativeSubmit").click();
	 
	 
	 driver.findElementByLinkText("CRM/SFA").click();
	 
	 driver.findElementByLinkText("Accounts").click();
	  
	 driver.findElementByLinkText("Create Account").click();
	 
	 driver.findElementByXPath("//input[@id='accountName']").sendKeys("Nahulramm");
	 
	 driver.findElementByXPath("//input[@id='officeSiteName']").sendKeys("Testleaf");
	 
	 driver.findElementByXPath("//input[@size='15'][@class='inputBox']").sendKeys("100000");
	 
	 WebElement industry = driver.findElementByName("industryEnumId");
	 
	 Select dropDown = new Select(industry);
	 
	 dropDown.selectByVisibleText("Computer Software");
	 
	WebElement ownership = driver.findElementByName("ownershipEnumId");

	Select onwer = new Select(ownership);
	
	onwer.selectByVisibleText("S-Corporation");
	
	WebElement source = driver.findElementById("dataSourceId");
	
	Select dataS= new Select(source);
	
	dataS.selectByValue("LEAD_EMPLOYEE");
	
	WebElement marketing = driver.findElementById("marketingCampaignId");
	
	Select market = new Select(marketing);
	
	List<WebElement> options = market.getOptions();
	
	int size = options.size();
	
	market.selectByIndex(size-3);
	
	//market.selectByIndex(7);
	
	WebElement state = driver.findElementById("generalStateProvinceGeoId");
	
	Select ss= new Select(state);
	
	ss.selectByValue("TX");
	
	driver.findElementByXPath("//input[@class='smallSubmit']").click();
	
	driver.close();
	
	}

}
