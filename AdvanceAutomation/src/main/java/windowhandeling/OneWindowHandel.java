package windowhandeling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OneWindowHandel {

	public static void main(String[] args) throws InterruptedException {
	//	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentHandle = driver.getWindowHandle();
		System.out.println("parent Window" + parentHandle);
		driver.findElement(By.id("newWindowBtn")).click();
		driver.manage().window().maximize();
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			System.out.println(handle);
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				driver.findElement(By.id("firstName")).sendKeys("Pooja");
				driver.close();
			}
		}

		driver.switchTo().window(parentHandle);
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Shrivastava");
		driver.quit();

	}

}
