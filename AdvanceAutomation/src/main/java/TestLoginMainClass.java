import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLoginMainClass {

	public TestLoginMainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver()
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.udemy.com");
		driver.manage().window().maximize();
		//create object of pagefactory Base Class
		TestLoginBaseClass t=PageFactory.initElements(driver,TestLoginBaseClass.class);
	    Thread.sleep(2000);
	    t.TestLoginBaseClass("student","Password123");
	    Thread.sleep(2000);
	    //Browser navigation commands
	    driver.navigate().back();
	    Thread.sleep(2000);
	    
	    driver.navigate().forward();
	    Thread.sleep(2000);
	    
	    driver.navigate().to("https://practicetestautomation.com/courses/");
	    Thread.sleep(2000);
	    driver.navigate().refresh();
	    
	
	
	
	
	
	
	}
	

}
