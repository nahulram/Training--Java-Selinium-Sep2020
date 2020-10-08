package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropabale {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement ss = driver.findElementByXPath("//div[@id='draggable']");
		
		WebElement tt = driver.findElementByXPath("//div[@id='droppable']");
		
		Actions builder = new Actions(driver);
		
		Thread.sleep(3000);
		
		builder.clickAndHold(ss).moveToElement(tt).perform();

	}

}
