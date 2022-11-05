package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FriendRequest {
	
	@FindBy (xpath="//span[text()='Friend requests']")
	private WebElement FriendsRequest;
	
	@FindBy (xpath="//span[text()='Confirm']")
	private WebElement RquestAccept;
	
	@FindBy (xpath="//span[text()='Delete']")
	private WebElement RequestDelete;
	
	
	public FriendRequest(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	public void ClickOnFriendsRequest() {
		
		FriendsRequest.click();
		
		}
    public void ClickOnRquestAccept() {
		
	RquestAccept.click();
		
		}
    public void ClickOnRequestDeletet() {
	
	RequestDelete.click();
	
	}

}
