package week4.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToysWithTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/table.html");
		
		List<WebElement> rowsize = driver.findElementsByXPath("//table[@id='table_id']//tr");
		
		int row = rowsize.size();
		
		System.out.println(row);
		
		List<WebElement> cellsize = driver.findElementsByXPath("//table[@id='table_id']//tr/th");
		
		int cell = cellsize.size();
		System.out.println(cell);
		
		
		for(int i=2;i<=row;i++) {
			
			  int sizecount = driver.findElementsByXPath("//table[@id='table_id']//tr["+i+"]/td").size();
			 
		 
		for(int j=1;j<=sizecount;j++) {
			
			WebElement celll = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td["+j+"]");
			
			String celltext = celll.getText();
		
			System.out.println(celltext+" ");
			
			
		}
		 System.out.println();
		}
		
	}

}
