package week4.assingnments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeastCompletedProgress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/table.html");
		
		
		List<WebElement>row = driver.findElementsByXPath("//table//tr//td[2]");
		
		//int aa = row.size();
		//System.out.println(aa);
		
		List<Integer>vital=new ArrayList<Integer>();
		
		for (WebElement values : row) {
			
			System.out.println(values.getText());
			
			String least = values.getText().replaceAll("%", "");
			
			
			vital.add(Integer.parseInt(least));
			
		}
		
	Collections.sort(vital);
	Integer lowest = vital.get(0);
	driver.findElementByXPath("//td[contains(text(),'"+lowest+"')]/following-sibling::td/input").click();

	}
	

}
