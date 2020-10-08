package week4.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VeriftTrain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://erail.in/");

		driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();
		
		driver.findElementById("txtStationFrom").clear();
		
		driver.findElementById("txtStationFrom").sendKeys("ms");
		
		driver.findElementById("txtStationFrom").sendKeys(Keys.TAB);
		
		driver.findElementById("txtStationTo").clear();
	
		driver.findElementById("txtStationTo").sendKeys("mdu");
		
		driver.findElementById("txtStationTo").sendKeys(Keys.TAB);
		
		Thread.sleep(3000);
	
		int size = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr").size();
		
		System.out.println(size);
		
		
		List<String> ListTrainNames= new ArrayList<String>();
		
		
		for(int i=1;i<=size;i++) {
			
			String text = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]/a").getText();
			
			ListTrainNames.add(text);
			
			System.out.println(text);
		}
		
		int size2 = ListTrainNames.size();

		System.out.println(size2);
		
		
		Set<String> setTrainNames=new HashSet<String>(ListTrainNames);
		
		int size3 = setTrainNames.size();
		
		System.out.println(size3);
		
		
		if(size2==size3) {
			
			
			System.out.println("no duplicates");
		}
		else {
			
			System.out.println("Duplicates are posssible");
		}
	}

}
