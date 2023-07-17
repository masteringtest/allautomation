import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM {

	

	public static void main(String[] args) throws IOException, InterruptedException {
		//1 CREATE OBJECT OF PROPERTY CLASS
		
		Properties p=new Properties();
		Select s = null;
		
		//step 2create object of file input stream:to store properties path
		
		FileInputStream file=new FileInputStream("C:\\Users\\ashi_\\Desktop\\automation\\automation\\eclipse_selenium\\AdvanceAutomation\\src\\main\\java\\OrangeHRM.properties");
		
		
		//step3 Load Property File
		
		p.load(file);
		System.setProperty(p.getProperty("BrowserName"),p.getProperty("BrowserPath"));
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getProperty("URL"));
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(p.getProperty("UsernameXpath"))).sendKeys(p.getProperty("Username"));
		Thread.sleep(2000);
		driver.findElement(By.xpath(p.getProperty("PasswordXpath"))).sendKeys(p.getProperty("Password"));
		Thread.sleep(2000);
		driver.findElement(By.xpath(p.getProperty("LoginButtonXpath"))).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath(p.getProperty("paul"))).click();
		driver.findElement(By.xpath(p.getProperty("LogoutButtonXpath"))).click();
		 
		
	}

}
