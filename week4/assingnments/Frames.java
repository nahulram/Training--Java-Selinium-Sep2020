package week4.assingnments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/frame.html");
		
		
		//i am inside a frame
		
		  driver.switchTo().frame(0);
		  
		  driver.findElementByXPath("//button[text()='Click Me']").click();
		  
		  driver.switchTo().defaultContent();
		 
		
		//nested frame
		
		  driver.switchTo().frame(1);
		  
		  driver.switchTo().frame("frame2");
		  
		  driver.findElementByXPath("//button[@id='Click1']").click();
		  
		  driver.switchTo().defaultContent();
		 
		
		//total number of frames
		 
		int size = driver.findElementsByTagName("iframe").size();
		
		System.out.println(size);
		
		int count=size;
		
		for(int i=0 ;i<size;i++) {
			
			driver.switchTo().frame(i);
			
				count=count+driver.findElementsByTagName("iframe").size();
				driver.switchTo().defaultContent();

		}
		
		System.out.println(count);
	
		
		
		
		
		
		
		
		

	}

}
