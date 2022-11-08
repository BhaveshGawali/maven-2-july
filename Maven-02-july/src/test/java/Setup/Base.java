package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {

	// ***********  git  ************//
	//Browser related code
	public static WebDriver OpenChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhavesh\\Documents\\instalation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
	}
	
//	public static WebDriver OpenEdgeBrowser() {
//		System.setProperty("webdriver.Edge.driver","C:\\Users\\Bhavesh\\Documents\\instalation\\msedgedriver.exe");
//		WebDriver driver=new EdgeDriver();
//		return driver;
//	}
	public static WebDriver OpenFireBoxBrowser() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Bhavesh\\Documents\\instalation\\geckodriver-v0.32.0-win32\\geckodriver.exe");
	     WebDriver driver =new FirefoxDriver();
		return driver;
	}
	public static WebDriver OpenOperaBrowser() {
		System.setProperty("webdriver.opera.driver","C:\\Users\\Bhavesh\\Documents\\instalation\\operadriver_win64\\operadriver_win64\\operadriver.exe");
	     WebDriver driver =new OperaDriver();
		return driver;
	}
}


