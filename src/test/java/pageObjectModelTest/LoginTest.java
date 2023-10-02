package pageObjectModelTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectModelPage.LoginPage;

public class LoginTest {
	WebDriver driver;
	LoginPage loginPage;
	@BeforeMethod
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void loginTest() {
		loginPage=new LoginPage(driver);
		loginPage.userName("tanita");
		loginPage.passWord("123");
		loginPage.loginButton();
		
	}
	@AfterMethod
	public void closeApp() {
		if(driver !=null) {
			driver.quit();
		}
	}
}

