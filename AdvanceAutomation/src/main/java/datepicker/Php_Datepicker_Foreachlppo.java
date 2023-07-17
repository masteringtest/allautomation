package datepicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Php_Datepicker_Foreachlppo {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  
		  driver.navigate().to("https://phptravels.net/"); 
			 Thread.sleep(2000);
			 
			 
		 //Expected date>>scanner or JoptionPane 
		String month="July ";
		String year="2023";
		String date="30";
		  
		  //click on date
		  driver.findElement(By.xpath("//*[@id=\"departure\"]")).click();
		  Thread.sleep(2000);

		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,500)");

//MONTH YEAR
		  while(true)
		  {
				  String mn=driver.findElement(By.xpath("/html[1]/body[1]/div[9]/div[1]/table[1]/thead[1]/tr[1]/th[2]")).getText();
				  String a[]=mn.split("") ;
				  String mon=a[0];
				  String yr=a[1];
				  
				  
				  if(month.equalsIgnoreCase(mon)&& year.equalsIgnoreCase(yr))
					  break;
				  else 
					  driver.findElement(By.xpath("//*[@id=\"fadeinbody\"]/div[9]/div[1]/table[1]/thead[1]/tr[1]/th[3]")).click();
				  Thread.sleep(2000);
			  }

//date selection
		  List<WebElement> dateSelection=driver.findElements(By.xpath("//body[1]/div[9]/div[1]/table[1]/tbody[1]/tr/td"));

				for(WebElement e:dateSelection)
				{
					//Thread.sleep(2000);
					String date1=e.getText();
					if(date1.equals(date))
					{
					e.click();
					break;	
					}
				}
}
}