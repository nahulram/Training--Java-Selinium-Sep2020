package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Irctc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.findElementByXPath("//button[@class='btn btn-primary']").click();
		
		driver.findElementByLinkText( "FLIGHTS" ).click();
		
		
		String firsttitle = driver.getTitle();
		
		System.out.println(firsttitle);
		
		
		Set<String> setofhandles = driver.getWindowHandles();
		
		List<String>ListofHandles=new ArrayList<String>(setofhandles);
		
		String secondscreen = ListofHandles.get(1);
		
		driver.switchTo().window(secondscreen);
		
		String secondtittle = driver.getTitle();
		
		System.out.println(secondtittle);
		
		String firstreference = ListofHandles.get(0);
		
		driver.switchTo().window(firstreference);
		
		driver.close();
		
		
		
		
	}

}
