package week4.assingnments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLeads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Merge Leads").click();
		
		driver.findElementByXPath("//table[@class='twoColumnForm']//td[2]/a").click();
		
		  Set<String> firstwindow = driver.getWindowHandles();
		  
		  List<String>first = new ArrayList<String>(firstwindow);
		  
		  int ww = first.size();
		  
		  System.out.println(ww);
		  
		  String secondscreen = first.get(1);
		  
		  driver.switchTo().window(secondscreen);
		 
	
	     driver.findElementByXPath("//div[@class='x-form-element']//input").sendKeys("10017");
	     
	     
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	
	Thread.sleep(3000);
	
	 driver.findElementByLinkText("10017").click();
	
		
		  Set<String> secondwindow = driver.getWindowHandles();
		  
		  List<String>second =new ArrayList<String>(secondwindow);
		  
		  String firstscreen = second.get(0);
		  
		  driver.switchTo().window(firstscreen);
		 
	
	driver.findElementByXPath("//table[@class='twoColumnForm']//tr[2]/td[2]/a").click();
	
Set<String> third = driver.getWindowHandles();
 
List<String>thirdwindow = new ArrayList<String>(third);

String thirdscreen = thirdwindow.get(1);

driver.switchTo().window(thirdscreen);


		 // Thread.sleep(3000);
		 
		  
		  driver.findElementByXPath("//div[@class='x-form-element']//input").sendKeys("10020");
		  
		
		  driver.findElementByXPath("//button[text()='Find Leads']").click();
		  
		  Thread.sleep(3000);
		  
		  driver.findElementByLinkText("10020").click();
		  
		  Set<String> fourth = driver.getWindowHandles();
		  
		  List<String>fourthwindow = new ArrayList<String>(fourth);

		  String fourthscreen = thirdwindow.get(0);

		  driver.switchTo().window(fourthscreen);
		  
		  driver.findElementByXPath("//a[text()='Merge']").click();
		  
		   Alert alert = driver.switchTo().alert();
		   
		   alert.accept();
		   
		   driver.findElementByLinkText("//a[text()='Find Leads']").click();
		   
		   driver.findElementByXPath("//input[@name='id']").sendKeys("10017");
		   
		   Set<String> lastscreen = driver.getWindowHandles();
		   
		   List<String>last = new ArrayList<String>(lastscreen);
		   
		   String finalscreen = last.get(1);
		   
		   driver.switchTo().window(finalscreen);
		  
		  driver.quit();
		 
	  
		
	}

}
