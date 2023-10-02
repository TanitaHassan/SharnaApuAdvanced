package pageObjectModelPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver; //instance variable

	public LoginPage(WebDriver driver) {
		//super();
		this.driver = driver;
		PageFactory.initElements(driver, this);//this lin design for pom
	}
	public WebElement userName(String enterYourUserName) {
		//driver.findElement(By.cssSelector("#email")).sendKeys("tanita");//basic coding
		
		WebElement uName=driver.findElement(By.cssSelector("#email"));//pom coding
		uName.clear();
		uName.sendKeys(enterYourUserName);
		return uName;
		
	}
	public WebElement passWord(String enterYourPassWord) {
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys(enterYourPassWord);
		return pass;
		
	}
	public void loginButton() {
		WebElement loginButton=driver.findElement(By.name("login"));
		loginButton.click();
	}
	public WebElement forgetPass() {
		WebElement forgetPass=driver.findElement(By.linkText("Forgot password?"));
		forgetPass.click();
		return forgetPass;
		
	}
	public WebElement createAccount() {
		WebElement createAccount=driver.findElement(By.linkText("Create new account"));
		createAccount.click();
		return createAccount;
		
		
	}
	

}
