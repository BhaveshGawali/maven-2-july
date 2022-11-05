package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Setup.Base;
import pages.LoginPage;
import pages.MessengerHomePage;
import pages.MessengerRooms;

public class VerifyRetunTOMassengerandHelpCenter extends Base{
	private WebDriver driver;
	private LoginPage loginPage;
	private MessengerHomePage messengerHomePage;
	private MessengerRooms messengerRooms;
	@Parameters ("browser")
	
	@BeforeTest
	public void LunchBrowser (String browserName) {
		System.out.println("browserName");
		if(browserName.equals("Chrome"))
		{
			driver=OpenChromeBrowser();
		}
//		if(browserName.equals("Edge"))
//		{
//			driver=OpenEdgeBrowser();
//		}
		if(browserName.equals("FireBox"))
		{
			driver=OpenFireBoxBrowser();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@BeforeClass
	public void CreatePOMobject() {
		loginPage=new LoginPage(driver);
		messengerHomePage=new MessengerHomePage(driver);
		messengerRooms = new MessengerRooms(driver);

	}
	
	@BeforeMethod
	public void OpenRoomPage() {
		System.out.println("Before Method");
		driver.get("https://www.facebook.com/");
		
		loginPage.clickmessenger();
		
		messengerHomePage.Clickonrooms();
		
	}
	
	@Test
	public void VerifyHelpCenterButton() {
		System.out.println("Test 1");
        messengerRooms.Clickonhelpcenter();
		
		String url =driver.getCurrentUrl();
		String tital=driver.getTitle();
		
		Assert.assertEquals(url, "https://www.messenger.com/help");
		Assert.assertEquals(tital, "Messenger Help Centre");
		
//		if(url.equals("https://www.messenger.com/help") && tital.equals("Messenger Help Centre"))
//		{
//			System.out.println("PASSED");
//		}else
//		{
//			System.out.println("FAILED");
//		}
	}
	
	
	@Test
	public void VerifyReturnToMessengerButton() {
	System.out.println("TEST2");
	
    messengerRooms.ClickonReturntomessenger();
	
	String url =driver.getCurrentUrl();
	String tital=driver.getTitle();
	Assert.assertEquals(url, "https://www.messenger.com/");
	Assert.assertEquals(tital, "Messenger");
	
	
//	if(url.equals("https://www.messenger.com/") && tital.equals("Messenger"))
//	{
//		System.out.println("PASSED");
//	}else
//	{
//		System.out.println("FAILED");
//	}
//	
	}
	
	@AfterMethod
	public void Logout() {
		System.out.println("After Method");
		System.out.println("LogOut");
	}
	@AfterClass
	public void ClearObject() {
		loginPage=null;
		messengerHomePage=null;;
		messengerRooms = null;;
		driver.close();
	}
	@AfterTest
	public void CloseBrowser() {
		driver.close();
		driver=null;
		System.gc();  //Garbeg Collecter
	}
}

	

