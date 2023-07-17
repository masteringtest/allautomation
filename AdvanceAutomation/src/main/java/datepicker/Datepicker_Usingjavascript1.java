package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker_Usingjavascript1 {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.Chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
		// URL
		driver.get("https://phptravels.net/");
		Thread.sleep(2000);
		//departdate button
		WebElement button=driver.findElement(By.xpath("//input[@id='departure'])[1]"));
		String date="30-07-2023";
		
	//	datePicker(driver,button,date);

	}

}
