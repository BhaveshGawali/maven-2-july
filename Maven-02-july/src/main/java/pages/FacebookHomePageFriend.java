package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookHomePageFriend {

	@FindBy (xpath="//span[text()='Friends']")
	private WebElement Friends;
	
	
	
	public FacebookHomePageFriend(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	public void ClickonFriend() {
		
		Friends.click();
		
		}

}
