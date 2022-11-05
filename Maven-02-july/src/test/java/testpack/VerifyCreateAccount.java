package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.CreateNewAccountFacebook;
import pages.LoginPage;

public class VerifyCreateAccount {
	private WebDriver driver;
	private LoginPage loginPage;
	private CreateNewAccountFacebook createNewAccountFacebook;
	
	
	
	@BeforeClass
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhavesh\\Documents\\instalation\\chromedriver.exe");
        driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
	}
	
	@BeforeMethod
	public void beforemethod() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		 loginPage=new LoginPage(driver);
		loginPage.clicOnCreateNewAccount();
		Thread.sleep(3000);
	}
	
	@Test
	public void VerifyTheCreateAccount() throws InterruptedException {
		 createNewAccountFacebook = new CreateNewAccountFacebook(driver);
		Thread.sleep(5000);
		createNewAccountFacebook.sendFirstname();
		createNewAccountFacebook.sendLastname();
		createNewAccountFacebook.sendEmailOrMobileNo();
//		createNewAccountFacebook.sendReEnterEmail();
		createNewAccountFacebook.sendNewPassword();
		createNewAccountFacebook.Send_Birthday_day();
		createNewAccountFacebook.Send_Birthday_Month();
		createNewAccountFacebook.Send_Birthday_Year();
		createNewAccountFacebook.ClicOnFemale();
		createNewAccountFacebook.ClicOnMale();
		createNewAccountFacebook.ClicOnCustom();
		createNewAccountFacebook.ClicOnPreferred_pronoun();
		createNewAccountFacebook.ClicOnSignUp();	}
	@AfterMethod
	public void LogOut() {
		System.out.println("LogOut");
	}
	@AfterClass
	public void Close() {
		driver.close();
	}

}
