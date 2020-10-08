package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.snapdeal.com/");
		
		WebElement mensFashion = driver.findElementByXPath("(//span[@class='catText'])[6]");
		
		
		
		WebElement shirts = driver.findElementByXPath("(//span[text()='Shirts'])[2]");
		
		
		Actions builder = new Actions(driver);
		
		builder.click(mensFashion).click(shirts).perform();
		
		Thread.sleep(3000);
		 
		WebElement quickview = driver.findElementByXPath("//p[@class='product-title']");
		
		Thread.sleep(3000);
		
		builder.moveToElement(quickview).perform();
		
		WebElement quick = driver.findElementByXPath("//div[@class='clearfix row-disc']");
		
		builder.click(quick).perform();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
	}

}
