package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerJavaScript {
  @Test
  public void phptravel() throws InterruptedException {
	 // WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
		// URL
		driver.get("https://phptravels.net/");
		Thread.sleep(2000);
		//FROM
		driver.findElement(By.xpath(""));
	//	WebElement from =driver.findElement(By.xpath("//*[@id="onereturn"]/div[2]/div[2]/div[2]/span/span[1]/span"));
	//	from.sendKeys("HYD");
		Thread.sleep(3000);
	//	findElement(By.xpath("")).click();
		Thread.sleep(2000);
		//To
	//	WebElement from =driver.findElement(By.xpath("//*[@id="onereturn"]/div[2]/div[2]/div[2]/span/span[1]/span"));
	//	from.sendKeys("HYD");
		Thread.sleep(3000);
	//	findElement(By.xpath("")).click();
		Thread.sleep(2000);
		
		
		
		
		//departdate button
		WebElement button=driver.findElement(By.xpath("//input[@id='departure'])[1]"));
		String date="30-07-2023";
		
		datePicker(driver,button,date);
  }
  public static void datePicker(WebDriver driver,WebElement element,String date)
  {
	  JavascriptExecutor js=((JavascriptExecutor)driver);
	  js.executeScript("arguments[0].setAttributes('value','"+date+"')",element);
	  
  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }

