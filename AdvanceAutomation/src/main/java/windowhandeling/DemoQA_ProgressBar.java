package windowhandeling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoQA_ProgressBar {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
		// URL
		driver.get("https://demoqa.com/progress-bar");
		Thread.sleep(2000);
		
		//start STOP button
		driver.findElement(By.id("startStopButton")).click();
		
		
		WebElement progressbar=driver.findElement(By.id("//*[@id=progressBar\"]/div"));
		
		//CONDITION
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		boolean status=wait.until(ExpectedConditions.attributeToBe(progressbar, "aria-valuenow", "99"));
		Thread.sleep(2000);
		if(status==true)
		{
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("resetButton")));
			
		}
		
		driver.close();
		
		
		
		
		
		
		

	}

}
