package week2.day2.assingment;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkWithEditFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Edit.html");
		
		driver.manage().window().maximize();
		
		/*
		 * driver.findElementById("email").sendKeys("nahulram@gmail.com");
		 * 
		 * driver.get("http://leafground.com/pages/Button.html");
		 * 
		 * driver.findElementById("home").click();
		 * 
		 * driver.findElementByLinkText("HyperLink").click();
		 * 
		 * driver.findElementByLinkText("Go to Home Page").click();
		 */
		
		
		//driver.findElementByLinkText("Image").click();
		
		//driver.get( "http://leafground.com/pages/radio.html");
		
		//driver.findElementById("yes").click();
		
		//driver.get("http://leafground.com/pages/checkbox.html");
		
	//	driver.findElementByLinkText("Java").click();
		
		/*
		 * driver.get("http://leafground.com/pages/Dropdown.html");
		 * 
		 * WebElement dd = driver.findElementById("dropdown1");
		 * 
		 * Select dropDown = new Select(dd);
		 * 
		 * List<WebElement> options = dropDown.getOptions();
		 * 
		 * int size = options.size();
		 * 
		 * dropDown.selectByIndex(size-4);
		 * 
		 * WebElement dd2 = driver.findElementByName("dropdown2");
		 * 
		 * Select dropDown2= new Select(dd2);
		 * 
		 * dropDown2.selectByVisibleText("Selenium");
		 * 
		 * WebElement dd3 = driver.findElementById("dropdown3");
		 * 
		 * Select dropDown3 = new Select(dd3);
		 * 
		 * dropDown3.selectByValue("1");
		 * 
		 * driver.findElementByClassName("example").sendKeys("selenium");
		 * 
		 */
		
		driver.get("http://leafground.com/pages/checkbox.html");
		
		if((driver.findElementByXPath("(//input[@type='checkbox'])[6]").isSelected())==true)
		{
			System.out.println("The selenium checkbox is selected");
		}
			
			
			else {
				
				driver.findElementByXPath("(//input[@type='checkbox'])[6]").click();
			}
			
		}
	
		
		
		
		
	}



