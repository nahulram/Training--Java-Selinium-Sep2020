package week4.assingnments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		  ChromeDriver driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("http://leafground.com/pages/Window.html");
		  
		  driver.findElementByXPath("//button[@id='home']").click();
		  
//click button to go to homepage 
		  
		  Set<String> firstscreen = driver.getWindowHandles();
		  
		  List<String>first=new ArrayList<String>(firstscreen);
		  
		  String firstwindow = first.get(1);
		  
		  driver.switchTo().window(firstwindow);
		  
		  driver.close();
		  
//find the number of opened windows
		  
		  Set<String> second = driver.getWindowHandles();
		  
		  List<String>secondscreen=new ArrayList<String>(second);
		  
		  String secondwindow = secondscreen.get(0);
		  
		  driver.switchTo().window(secondwindow);
		  
		  driver.findElementByXPath("//button[text()='Open Multiple Windows']").click()
		  ;
		  
		  Set<String> muliple = driver.getWindowHandles();
		  
		  List<String>mul=new ArrayList<String>(muliple);
		  
		  int totalwindows = mul.size();
		  
		  System.out.println("The total number of windows opened is"+"  "+totalwindows);
		 
		   
 //Close all except this window

		  String aa = mul.get(1);
		  
		  driver.switchTo().window(aa); driver.close();
		  
		  String bb = mul.get(0);
		  
		  driver.switchTo().window(bb);
		  
		  driver.close();
		 
	

//wait for 5 seconds
		  
	ChromeDriver Driver = new ChromeDriver();
	
	Driver.manage().window().maximize();
	
	Driver.get("http://leafground.com/pages/Window.html");
	
	Driver.findElementByXPath("//button[text()='Wait for 5 seconds']").click();
	
	Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	Driver.quit();
	

	}

}
