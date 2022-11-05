package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessengerRooms {
	
	@FindBy (xpath="//a[text()=' Return to messenger.com ']")
	private WebElement Returntomessenger;
	
	@FindBy (xpath="//a[text()=' Visit our help center ']")
	private WebElement helpcenter;
	
	//constracter
	
	public MessengerRooms(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

   public void ClickonReturntomessenger() {
		
	   Returntomessenger.click();
		
		}
	
    public void Clickonhelpcenter() {
		
    	helpcenter.click();
		
		}
}
