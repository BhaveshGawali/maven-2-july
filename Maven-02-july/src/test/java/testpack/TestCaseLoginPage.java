package testpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.FacebookHomePageFriend;
import pages.FriendRequest;
import pages.LoginPage;

public class TestCaseLoginPage {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhavesh\\Documents\\instalation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		LoginPage loginPage=new LoginPage(driver);
		loginPage.sendusername();
		loginPage.sendpassword();
		loginPage.clicklogin();
		
		
		FacebookHomePageFriend facebookHomePageFriend=new FacebookHomePageFriend(driver);
		facebookHomePageFriend.ClickonFriend();
		//facebookHomePageFriend.ClickOnFriendsRequest();
		
		FriendRequest friendRequest =new FriendRequest(driver);
		
		friendRequest.ClickOnFriendsRequest();
		friendRequest.ClickOnRquestAccept();
	}
}
