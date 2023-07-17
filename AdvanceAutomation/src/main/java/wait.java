import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class wait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		

		// URL
		driver.get("https://google.com/");
//		Thread.sleep(2000);
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Explicit Wait
		//WebDriverwait wait=new WebDriverwait
		

	}

}
