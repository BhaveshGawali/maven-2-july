package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.CreateNewAccountFacebook;
import pages.LoginPage;

public class TestClassCreateNewAccount {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhavesh\\Documents\\instalation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.get("https://www.facebook.com/");
		LoginPage loginPage=new LoginPage(driver);
		loginPage.clicOnCreateNewAccount();
		Thread.sleep(3000);
		CreateNewAccountFacebook createNewAccountFacebook = new CreateNewAccountFacebook(driver);
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
		createNewAccountFacebook.ClicOnSignUp();
	}

}
