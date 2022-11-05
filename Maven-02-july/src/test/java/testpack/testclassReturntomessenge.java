package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

public class testclassReturntomessenge {
	private WebDriver driver;
	private LoginPage loginPage;
	
	private MessengerHomePage messengerHomePage;
	private MessengerRooms messengerRooms;
//public static void main(String[] args) {
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhavesh\\Documents\\instalation\\chromedriver_win32\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
//	
//	driver.get("https://www.facebook.com/");
//	LoginPage loginPage=new LoginPage(driver);
//	loginPage.clickmessenger();
//	
//	MessengerHomePage messengerHomePage=new MessengerHomePage(driver);
//	messengerHomePage.Clickonrooms();
//	
//	MessengerRooms messengerRooms = new MessengerRooms(driver);
//	messengerRooms.ClickonReturntomessenger();
//	
//	String url =driver.getCurrentUrl();
//	String tital=driver.getTitle();
//	
//	if(url.equals("https://www.messenger.com/") && tital.equals("Messenger"))
//	{
//		System.out.println("PASSED");
//	}else
//	{
//		System.out.println("FAILED");
//	}
	@Parameters("browser")
	@BeforeTest
	public void LunchBrowser(String browserName) {
		System.out.println("Befor Test");
		
		if(browserName.equals("Chrome")) {
			
			driver=Base.OpenChromeBrowser();
		}
          if(browserName.equals("FireBox")) {
			
			driver=Base.OpenFireBoxBrowser();
		}
          if(browserName.equals("Opera"))
  		{
  			driver=Base.OpenOperaBrowser();
  		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@BeforeClass
	public void CreateObject1() {
		System.out.println("Befor Class");
		loginPage=new LoginPage(driver);
		messengerHomePage=new MessengerHomePage(driver);
		
		messengerRooms = new MessengerRooms(driver);
		
	}
	
	@BeforeMethod
	public void OpenRoom() {
		System.out.println("Before Method");
		driver.get("https://www.facebook.com/");
		loginPage.clickmessenger();
		messengerHomePage.Clickonrooms();
		
	}
	
	
	@Test
	public void VerifyReturnMassenger() {
		System.out.println("Test 1");
		messengerRooms.ClickonReturntomessenger();
		String url =driver.getCurrentUrl();
		String tital=driver.getTitle();
		
		if(url.equals("https://www.messenger.com/") && tital.equals("Messenger"))
			{
				System.out.println("PASSED");
			}else
			{
				System.out.println("FAILED");
			}
		
	}
	@AfterMethod
	public void Logout() {
		System.out.println("LogOut");
	}
	@AfterClass
	public void CloseBrowser() {
		System.out.println("After Class");
		loginPage=null;
		messengerHomePage=null;;
		messengerRooms = null;;
		driver.close();
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
		driver.close();
		driver=null;
		System.gc();  //Garbeg Collecter
	}
	
}

