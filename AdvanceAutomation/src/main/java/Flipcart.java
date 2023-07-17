import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flipcart {

	public Flipcart() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		//1 CREATE OBJECT OF PROPERTY CLASS
		
				Properties p=new Properties();
				Select s = null;
				
				//step 2create object of file input stream:to store properties path
				
				FileInputStream file=new FileInputStream("C:\\Users\\ashi_\\Desktop\\automation\\automation\\eclipse_selenium\\AdvanceAutomation\\src\\main\\java\\OrangeHRM.properties");
				
				
				//step3 Load Property File
				
				p.load(file);
				System.setProperty(p.getProperty("BrowserName1"),p.getProperty("BrowserPath1"));
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(p.getProperty("URL1"));
				
				Thread.sleep(2000);
				driver.findElement(By.xpath(p.getProperty("TopOffers"))).click();;
				Thread.sleep(2000);
				driver.findElement(By.xpath(p.getProperty("Sportsbooksandmore"))).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(p.getProperty("Books")));
				s.selectByValue("Academics");
				
				 
	}

}
