package datepicker;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Dummy_tickit {

	            public static void main(String[] args) throws InterruptedException {
				ChromeOptions options = new ChromeOptions();
		    	options.addArguments("disable-notifications");
		       // WebDriverManager.chromedriver().setup();
		        WebDriver driver = new ChromeDriver(options);
		        driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		        Thread.sleep(3000);
		        
		        
		        
		        
		        
		        
		        String year= "2024";
		        String month = "Jun";
		        String date = "12";
		        
		        driver.findElement(By.xpath("//*[@id=\"departon_field\"]/span")).click();
		        Select s = new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]")));
		        s.selectByIndex(6);
		       
		        
		        Thread.sleep(3000);
		      Select a= new Select(  driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[2]")));
		      a.selectByVisibleText("2024");
		      Thread.sleep(3000);
		      //driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[7]/a")).click();
		      
		      List<WebElement> pooja = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
		      for(WebElement ps:pooja) {
		    	  String date1 = ps.getText();
		    	  if (date1.equals(date)) {
		    		  ps.click();
		    		  break;
		    	  }
		      }
		      
			}

		

	}


