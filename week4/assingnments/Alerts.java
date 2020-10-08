package week4.assingnments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/Alert.html");
		
		//forAlert box
		
		driver.findElementByXPath("//button[text()='Alert Box']").click();
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		alert.accept();
		
		//for Confirm box
		driver.findElementByXPath("//button[text()='Confirm Box']").click();
	
		Thread.sleep(3000);
		
		alert.accept();
		
		
		//For Prompt box
		driver.findElementByXPath("//button[text()='Prompt Box']").click();
		
		Thread.sleep(3000);
		
		alert.sendKeys("testleaf");
		
		Thread.sleep(3000);
		
		alert.accept();
		
		
		//for Line breaks
		
		driver.executeScript("window.scrollBy(0,1000)");
		
		
		driver.findElementByXPath("//button[text()='Line Breaks?']").click();
		
		//driver.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(3000);
		
		alert.accept();
		
		//for sweet alert
		driver.findElementByXPath("//button[text()='Sweet Alert']").click();
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//button[text()='OK']").click();
		
		driver.close();
		
		
		

	}

}
