import java.io.FileInputStream;
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

		// swich to iframe

		driver.switchTo().frame(driver.findElement(By.xpath((p.getProperty("Gframe")))));

		// CRAETE OBJECT OF APPLICATION CLASS
		Actions a = new Actions(driver);

		WebElement src = driver.findElement(By.xpath((p.getProperty("5000"))));
		WebElement dec = driver.findElement(By.xpath((p.getProperty("bank"))));
		//Webe
		//Thread.sleep(2000);
		driver.close();
	}
}
