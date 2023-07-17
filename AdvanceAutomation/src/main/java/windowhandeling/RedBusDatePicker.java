package windowhandeling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBusDatePicker {

	
	public static void main(String[] args) throws InterruptedException {
		//pop-up
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("disable-notifications");
		option.addArguments("disable-geolocation");
		option.addArguments("disable-media-stream");
		
		
		//WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
		
        
        // URL
		driver.get("https://phptravels.net/");
		Thread.sleep(2000);
		
		String year="2023";
		String month="july";
		String date="30";
		
		//Click on date
		driver.findElement(By.className("datepicker dropdown-menu"));
		
		
		
		while(true)
		{
			//String monthyear=driver.findElement(By.xpath("")).click();
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
