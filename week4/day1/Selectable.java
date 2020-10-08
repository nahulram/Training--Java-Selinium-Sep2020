package week4.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/selectable/");
		
		driver.executeScript("window.scrollBy(0,1000)");
		
		driver.switchTo().frame(0);
		
		 WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		
	WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");
		
		 WebElement item5 = driver.findElementByXPath("//li[text()='Item 5']");
		
		 WebElement itme7 = driver.findElementByXPath("//li[text()='Item 7']");
		
		
		Actions builder = new Actions(driver);
		
		builder.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).click(itme7).keyUp(Keys.CONTROL).perform();
		
		
 
	}

}
