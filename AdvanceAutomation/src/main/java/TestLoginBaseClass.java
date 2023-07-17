import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestLoginBaseClass {

	
	@FindBy(id="username")
	WebElement Username;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="loginbutton")
	WebElement loginbutton;
	
	
	public void TestLoginBaseClass(String usn,String pwd)
	{
	
		Username.sendKeys("usn");
		Password.sendKeys("pwd");
		loginbutton.click();
		
	}
	
		
	}


