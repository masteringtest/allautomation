package igp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Rakhi {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Properties p = new Properties();
		FileInputStream file = new FileInputStream(
				"C:\\Users\\ashi_\\Desktop\\automation\\automation\\eclipse_selenium\\AdvanceAutomation\\src\\main\\java\\Property.properties");
		p.load(file);
		System.setProperty(p.getProperty("BrowserName"), p.getProperty("BrowserPath"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Select s;

		// URL
		driver.get(p.getProperty("URLIGB"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		Thread.sleep(2000);

//		driver.findElement(By.xpath("//*[@id=\"user-menu\"]/div")).click();
//		String usn1 = JOptionPane.showInputDialog("enter username");
//		Thread.sleep(3000);
//		driver.findElement(
//				By.xpath("/html/body/div[3]/div/div[2]/section/section/div/div[2]/form[1]/div[1]/div[1]/div/input"))
//				.sendKeys(usn1);
//		Thread.sleep(1000);
//		String pwd1 = JOptionPane.showInputDialog("enter password");
//		Thread.sleep(1000);
//		driver.findElement(By.id("passwd")).sendKeys(pwd1);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"row-submit\"]/div/button")).click();
//		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div")).click();
          //home category
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[2]")).click();
		Actions a = new Actions(driver);
		List<WebElement> js = driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[2]"));

		int size1 = js.size();
		System.out.println("Igp home categories" + size1);

		// step4 for loop
		for (int j = 1; j <= size1; j++) {
			// Wait
			Thread.sleep(2000);

			// Display Web Element Name
			System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[2][" + j + "]")).getText());

			// Perform Mouse Hover
			a.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[2][" + j + "]"))).click()
					.perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]")).click();
			Thread.sleep(2000);
			System.out.println();

			List<WebElement> ls = driver.findElements(By.xpath("/html/body/div[4]/div/div[2]/section[1]/div[2]"));

			int size = ls.size();
			System.out.println("Home page categories" + size);

			// step4 for loop
			for (int i = 1; i <= size; i++) {
				// Wait
				Thread.sleep(2000);

				// Display Web Element Name
				System.out.println(driver
						.findElement(By.xpath("/html/body/div[4]/div/div[2]/section[1]/div[2][" + i + "]")).getText());

				// Perform Mouse Hover
				a.moveToElement(
						driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/section[1]/div[2][" + i + "]")))
						.click().perform();
				Thread.sleep(2000);
				System.out.println();

				 driver.findElement(By.xpath("//*[@id=\"selection-panel\"]/div[2]/a[1]")).click();
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/section[1]/div[2]/a[1]")).click();
				System.out.println();
//				List<WebElement> ms = driver.findElements(By.xpath("/html/body/div[4]/div/div[2]/section[1]/div[2]"));
//
//				int size2 = ms.size();
//				System.out.println("Rakhi Categories" + size2);
//				
//				// step4 for loop
//				for (int k = 1; k <= size2; k++) {
//					
//
//					// Display Web Element Name
//					System.out.println(
//							driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[2]/div[1]/div[3]/div[1][" + k + "]"))
//									.getText());
//
//					String rakhi = driver
//							.findElement(By.xpath("/html/body/div[4]/div/div[2]/section[1]/div[2][" + k + "]"))
//							.getText();
//
////					// Perform Mouse Hover
//
//					a.moveToElement(
//							driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/section[1]/div[2][" + k + "]")))
//							.click().perform();

//					if (rakhi.equals("All Rakhis")) {
//						driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/section[1]/div[2][" + k + "]"))
//								.click();
					}
					driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/section[1]/div[2]/a[1]")).click();
					driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/ul/li[1]")).click();

					driver.findElement(By.xpath("//body/div[@id='site-wrapper']/div[1]/div[2]/section[1]/div[2]/a[1]"))
							.click();
					Thread.sleep(2000);
					driver.findElement(
							By.xpath("//body/div[@id='site-wrapper']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[1]"))
							.click();
					List<WebElement> ls3 = driver.findElements(By.xpath(
							"//body/div[@id='site-wrapper']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[2]/div[1]/div[3]/div[1]"));

					int size3 = ls.size();
					System.out.println("Home page categories" + size3);

					// step4 for loop
					for (int l = 1; l <= size; l++) {
						// Wait
						Thread.sleep(2000);

						// Display Web Element Name
						System.out.println(driver.findElement(By.xpath(
								"//body/div[@id='site-wrapper']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[2]/div[1]/div[3]/div[1]["
										+ l + "]"))
								.getText());

						// Perform Mouse Hover
						a.moveToElement(driver.findElement(By.xpath(
								"//body/div[@id='site-wrapper']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[2]/div[1]/div[3]/div[1]["
										+ l + "]")))
								.click().perform();

						// body/div[@id='site-wrapper']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]
						driver.findElement(By
								.xpath("//body/div[@id='site-wrapper']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]"))
								.click();
						System.out.println();//for next line

						List<WebElement> ns = driver.findElements(By.xpath(
								"//body/div[@id='site-wrapper']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[2]/div[1]/div[3]/div[1]"));

						int size4 = ns.size();
						System.out.println("Home page categories" + size4);

						// step4 for loop
						for (int m = 1; m <= size4; m++) {
							// Wait
							Thread.sleep(2000);

							// Display Web Element Name
							System.out.println(driver.findElement(By.xpath(
									"//body/div[@id='site-wrapper']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[2]/div[1]/div[3]/div[1]["
											+ m + "]"))
									.getText());

							// Perform Mouse Hover
							a.moveToElement(driver.findElement(By.xpath(
									"//body/div[@id='site-wrapper']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[2]/div[1]/div[3]/div[1]["
											+ m + "]")))
									.click().perform();
							Thread.sleep(2000);
							driver.findElement(By.xpath(
									"//body/div[@id='site-wrapper']/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]"))
									.click();
							// domestic
							driver.findElement(By.xpath("//button[@id='address-domestic']")).click();
							// enter pincode
							driver.findElement(By.xpath("//input[@id='pincode']")).sendKeys("411036");
							// apply
							driver.findElement(By.xpath(
									"//body/div[@id='site-wrapper']/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[2]/div[2]/div[2]/div[2]/a[1]"))
									.click();

							driver.findElement(By.xpath(
									"//body/div[@id='site-wrapper']/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]"))
									.click();

							driver.findElement(
									By.xpath("/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]"))
									.click();
							Thread.sleep(2000);
							driver.findElement(By.cssSelector(
									"body.content-wrapper.desktop:nth-child(2) div.site-wrapper:nth-child(10) div.site-wrapper-desk section.relative.no-prod-pad-5.product-grid-container.top-bar-links-padding:nth-child(2) div.row.seo-row.p-l-r-40 div.col.s5.delivery-location-box:nth-child(2) div.pull-right div.spl-del-wrapper div.row.no-margin div.col.s12 ul.spl-del-tag-list li.spl-del-label.spl-del-tag-item.button-none.igp-revamp-del-loc-cont div.spl-del-popup.revamp-igp-spl-del-popup.width-360.left-14.is-active div.spl-inner-content div.row.no-margin.spl-del-actions.igp-revamp-del-btn:nth-child(2) div.col.s6.no-padding:nth-child(2) > a.apply-spl-del.d-apply.Paragraph-12-XS--Semibold"))
									.click();
							Thread.sleep(2000);
							driver.close();
						}
					}

				}
			}
		}
	

