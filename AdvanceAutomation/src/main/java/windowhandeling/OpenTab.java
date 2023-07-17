package windowhandeling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenTab {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentHandle = driver.getWindowHandle();
		System.out.println("parent Window" + parentHandle);
		driver.findElement(By.id("newTabBtn")).click();
		driver.manage().window().maximize();
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			System.out.println(handle);
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[1]/div/div[2]/div[1]/div[1]/div/div[1]/article/div/div/div[1]/button")).click();
				Thread.sleep(2000);
				System.out.println("confirmation alert message");
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
				driver.close();
				Thread.sleep(2000);
				
			}
		}

		driver.switchTo().window(parentHandle);
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Pooja");
		Thread.sleep(2000);
		driver.quit();

	}

}
