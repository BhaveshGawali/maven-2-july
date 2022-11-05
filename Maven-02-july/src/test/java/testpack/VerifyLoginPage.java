package testpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.FacebookHomePageFriend;
import pages.FriendRequest;
import pages.LoginPage;

public class VerifyLoginPage {
private	WebDriver driver;
private LoginPage  loginPage;
private FriendRequest friendRequest;
private FacebookHomePageFriend facebookHomePageFriend;

	@BeforeClass
	public void BrowserLunch() {
		System.out.println("Befor Class");
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhavesh\\Documents\\instalation\\chromedriver_win32\\chromedriver.exe");
//		 driver=new ChromeDriver();
//		 System.setProperty("webdriver.gecko.driver","C:\\Users\\Bhavesh\\Documents\\instalation\\geckodriver-v0.32.0-win32\\geckodriver.exe");
//		 WebDriver driver =new FirefoxDriver();
		System.setProperty("webdriver.edge.driver","C:\\Users\\Bhavesh\\Documents\\instalation\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void OpenLoginPage() {
		System.out.println("Before Method");
		driver.get("https://www.facebook.com/");
		 loginPage=new LoginPage(driver);
		loginPage.sendusername();
		loginPage.sendpassword();
		loginPage.clicklogin();
		
	}
	
	@Test
	public void VerifyTheAddFriend() {
		System.out.println("Test 1");
		 facebookHomePageFriend=new FacebookHomePageFriend(driver);
		facebookHomePageFriend.ClickonFriend();
		//facebookHomePageFriend.ClickOnFriendsRequest();
		
		 friendRequest =new FriendRequest(driver);
		
		friendRequest.ClickOnFriendsRequest();
		friendRequest.ClickOnRquestAccept();
	}
	@AfterMethod
	public void LogOut() {
		System.out.println("After Method");
		System.out.println("LOgout");
	}
	@AfterClass
	public void Close() {
		System.out.println("After Class");
		driver.close();
	}
}
