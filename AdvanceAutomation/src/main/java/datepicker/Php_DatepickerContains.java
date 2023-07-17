package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Php_DatepickerContains {

public static void main(String[] args) throws InterruptedException {
		
		String month= "July 2023";
		String day = " 20";

		System.setProperty("webdriver", "C:\\Users\\ganes\\OneDrive\\Desktop\\Automation testing\\Browser extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//URL
		driver.get("https://www.phptravels.net/");
		
		//check in
		
		driver.findElement(By.xpath("//*[@id=\"onereturn\"]/div[3]/div/div[1]/div")).click();
		Thread.sleep(3000);
		
		while(true)
		{
			String text= driver.findElement(By.xpath("html/body/div[9]/div[1]/table/thead/tr[1]/th[2]")).getText();
			if (text.equals(month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[9]/div[1]/table/thead/tr[1]/th[3]")).click();
			}
			

		}
		driver.findElement(By.xpath("//body[1]/div[9]/div[1]/table[1]/tbody[1]/tr/td[contains(text(),'20')]")).click();
}}
		
		
		
		
		
		
		
		