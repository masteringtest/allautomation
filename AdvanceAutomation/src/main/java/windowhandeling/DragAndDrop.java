package windowhandeling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException, IOException {
		Properties p = new Properties();
		FileInputStream file = new FileInputStream(
				"C:\\Users\\ashi_\\Desktop\\automation\\automation\\eclipse_selenium\\AdvanceAutomation\\src\\main\\java\\Property.properties");
		p.load(file);
        System.setProperty(p.getProperty("BrowserName"), p.getProperty("BrowserPath"));
		//WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

		// URL
		driver.get(p.getProperty("GURL"));
		Thread.sleep(2000);

		// CRAETE OBJECT OF APPLICATION CLASS
		Actions a = new Actions(driver);

		WebElement src = driver.findElement(By.xpath((p.getProperty("BANK"))));
		WebElement dest = driver.findElement(By.xpath((p.getProperty("ACCOUNT"))));
		WebElement src1 = driver.findElement(By.xpath((p.getProperty("5000"))));
		WebElement dest1 = driver.findElement(By.xpath((p.getProperty("AMOUNT"))));
		WebElement src2 = driver.findElement(By.xpath((p.getProperty("SALES"))));
		WebElement dest2 = driver.findElement(By.xpath((p.getProperty("ACCOUNT1"))));
		WebElement src3 = driver.findElement(By.xpath((p.getProperty("5000R"))));
		WebElement dest3 = driver.findElement(By.xpath((p.getProperty("AMOUNT1"))));
		Thread.sleep(2000);
		a.clickAndHold(src).pause(2).moveToElement(dest).release().pause(2).build().perform();
		Thread.sleep(2000);
		a.clickAndHold(src1).pause(2).moveToElement(dest1).release().pause(2).build().perform();
		Thread.sleep(2000);
		a.clickAndHold(src2).pause(2).moveToElement(dest2).release().pause(2).build().perform();
		Thread.sleep(2000);
		a.clickAndHold(src3).pause(2).moveToElement(dest3).release().pause(2).build().perform();;
		Thread.sleep(2000);
		
		
	
	
	}


		
	}


