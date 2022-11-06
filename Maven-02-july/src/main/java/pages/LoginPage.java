package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	// GIT HUB ///
	@FindBy (xpath="//input[@id='email']")
	private WebElement username;
	
	@FindBy (xpath="//input[@id='pass']")
	private WebElement password;
	
	@FindBy (xpath="//button[text()='Log in']")
	private WebElement Loginbutton;
	

	@FindBy (xpath="//a[text()='Create New Account']")
	private WebElement CreateNewAccount;
	
	@FindBy (xpath="//a[text()='Messenger']")
	private WebElement MessengerLink;
	
	
					public LoginPage(WebDriver driver)
					{
						PageFactory.initElements(driver, this);
					}
					
					public void sendusername() 
					{
						
						username.sendKeys("9822185675");
					}
					
				   public void sendpassword()
				    {
						
					password.sendKeys("bhavi672");
					}
				   
				   public void clicklogin()
				    {	
					   Loginbutton.click();
					}
				   public void clicOnCreateNewAccount()
				    {	
					   CreateNewAccount.click();
					}
				   
				   public void clickmessenger() 
				   {	
				   MessengerLink.click();
				   }
				   
				   
				   //gGroup Of Actions
				   public void  LoginToAplication() {
					   username.sendKeys("bhavesh");
					   password.sendKeys("bhavesh@123");
					   Loginbutton.click();
					   MessengerLink.click();
					   CreateNewAccount.click();
				   }
	
}
