package week4.assingnments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServicenowTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://dev68594.service-now.com/");

		Thread.sleep(3000);

		//Entering username and password
		
		driver.switchTo().frame("gsft_main");

		driver.findElementByXPath("//input[@class='form-control']").sendKeys("admin");

		driver.findElementByXPath("//input[@id='user_password']").sendKeys("India@123");

		driver.findElementByXPath("//button[text()='Login']").click();

		//incident filter navigator
		
		driver.findElementByXPath("//input[@id='filter']").sendKeys("incident");

		Thread.sleep(3000);

		driver.executeScript("window.scrollBy(0,1000)");
		
		//click All

		Thread.sleep(3000);

		driver.findElementByXPath("(//div[text()='All'])[2]").click();

		Thread.sleep(3000);
		
		//click new button

		driver.switchTo().frame("gsft_main");

		driver.findElementByXPath("//button[text()='New']").click();
		
		//select valur for caller 
		
		Thread.sleep(3000);

		driver.findElementByXPath("//div[@class='input-group ref-container']//button[1]").click();

		Set<String> second = driver.getWindowHandles();
		
		
		int a = second.size();
		
		//System.out.println(a);

		List<String> secondwindow = new ArrayList<String>(second);
		

		String secondscreen = secondwindow.get(1);

		// System.out.println(secondscreen);

		driver.switchTo().window(secondscreen);

		driver.findElementByXPath("//a[text()='Abel Tuter']").click();

		String firstscreen = secondwindow.get(0);

		driver.switchTo().window(firstscreen);

		//select valur for short description
		
		driver.switchTo().frame("gsft_main");

		driver.findElementByXPath("//a[@id='lookup.incident.short_description']").click();
		
		
		Set<String> thirdscreen = driver.getWindowHandles();
		List<String>third = new ArrayList<String>(thirdscreen);
		
		int b = thirdscreen.size();
		System.out.println(b);
		
		
		String thirdwindow = third.get(1);
		
		driver.switchTo().window(thirdwindow);
		 
		  driver.findElementByXPath("//a[text()='Issue with email']").click();
		  
		
		  String fourth = third.get(0);
		  
		  driver.switchTo().window(fourth);
		  
		  driver.switchTo().frame("gsft_main");
		  
		  //Read the incident number
		 
		  Thread.sleep(15000);
		  
		  //search & verification of incident number
		  
		  driver. findElementByXPath("//button[@class='form_action_button header  action_context btn btn-default']").click();
		  
		  driver.findElementByXPath("//input[@class='form-control']").sendKeys("INC0014084");
	
		  Actions builder = new Actions(driver);
		  
		  builder.sendKeys(Keys.ENTER).perform();
		  
		  Thread.sleep(5000);
		 
		 driver.close();
	}

}
