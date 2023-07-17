package windowhandeling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseMoveOverGuru99 {

	public static void main(String[] args) throws InterruptedException {

		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guru99.com/");

		// create object of action class

		Actions a = new Actions(driver);

		// mouse move over create list of web element
		List<WebElement> ls = driver
				.findElements(By.xpath("/html/body/div[1]/div/div/div/main/div/article/div/div[1]/div[2]/div[1]/div"));

		// storing size
		int size = ls.size();
		System.out.println("No of web element:" + 36);

		for (int i = 1; i <= size; i++) {
			Thread.sleep(3000);

			System.out
					.println(driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div/div[1]/div[2]/div[1]")).getText());
			Thread.sleep(3000);

			a.moveToElement(driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div/div[1]/div[2]/div[1]"))).perform();
			Thread.sleep(3000);
			// System.out.println("value of i" + i);
		}
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div/div[1]/div[1]/div[2]/div/div[2]/span[1]/a/img"))
				.click();
		driver.navigate().back();
		driver.close();
	

	}

}
