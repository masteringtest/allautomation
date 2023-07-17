package windowhandeling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentHandle = driver.getWindowHandle();
		System.out.println("parent Window" + parentHandle);
		driver.findElement(By.id("newWindowsBtn")).click();
		driver.manage().window().maximize();
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles.size());
		for (String handle : handles) {
			System.out.println(handle);
			// driver.switchTo().window(handle);
			if (!handle.equals(parentHandle)) {
				System.out.println(driver.switchTo().window(handle).getCurrentUrl());
				String URL = driver.switchTo().window(handle).getCurrentUrl();
				// check url of second child window
				if (URL.equals("https://www.hyrtutorials.com/p/basic-controls.html")) {
					Thread.sleep(2000);
					// First Name
					driver.findElement(By.id("firstName")).sendKeys("Pooja");
					Thread.sleep(2000);

					// Last Name
					driver.findElement(By.id("lastName")).sendKeys("Shrivastava");
					Thread.sleep(2000);

					// male or female
					driver.findElement(By.id("femalerb")).click();
					Thread.sleep(2000);

					// click on language
					driver.findElement(By.id("englishchbx")).click();
					Thread.sleep(2000);

					// EMAIL ID
					driver.findElement(By.id("email")).sendKeys("pooja.12shri@gmail.com");
					Thread.sleep(2000);

					// PASSWORD
					driver.findElement(By.id("password")).sendKeys("pooja123");
					Thread.sleep(2000);

					// CLICK ON REGISTER
					driver.findElement(By.id("registerbtn")).click();
					Thread.sleep(2000);
					// CLOSE WINDOW
					driver.close();
				}

				// second child window
				// URL
				else if (URL.equals("https://www.hyrtutorials.com/p/add-padding-to-containers.html")) {
					// NAME
					driver.findElement(By.xpath("//*[@id=\"post-body-299858861183690484\"]/div/form/div[1]/input[1]"))
							.sendKeys("Pooja");
					// LAST NAME
					driver.findElement(By.xpath("//*[@id=\"post-body-299858861183690484\"]/div/form/div[1]/input[2]"))
							.sendKeys("Shrivastava");
					// EMAIL
					driver.findElement(By.xpath("//*[@id=\"post-body-299858861183690484\"]/div/form/div[1]/input[3]"))
							.sendKeys("pooja.12shri@gmail.com");
					// PASSWORD
					driver.findElement(
							By.xpath("//*[@id=\"post-body-299858861183690484\"]/div/form/div[1]/div[2]/input"))
							.sendKeys("pooja.123");
					// RETYPE PASSWORD
					driver.findElement(By.xpath("//*[@id=\"post-body-299858861183690484\"]/div/form/div[1]/input[4]"))
							.sendKeys("pooja.123");
					// Register
					driver.findElement(
							By.xpath("//*[@id=\"post-body-299858861183690484\"]/div/form/div[1]/div[3]/button[1]"))
							.click();
					// close child window
					driver.close();

				}

			}

		}
		// switch to parent window
		driver.switchTo().window(parentHandle);
		Thread.sleep(2000);
		// text field
		driver.findElement(By.id("name")).sendKeys("Pooja");
		// quit window
		driver.quit();

	}

}
