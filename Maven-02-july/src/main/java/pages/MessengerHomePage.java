package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//a[text()='Features']
//a[text()='Desktop app']
//a[text()='Privacy and safety']
//a[text()='For developers']
public class MessengerHomePage {
	
	@FindBy (xpath="//a[text()='Rooms']")
	private WebElement rooms;
	
	@FindBy (xpath="//a[text()='Desktop app']")
	private WebElement Desktopapp;
	
	@FindBy (xpath="//a[text()='Privacy and safety']")
	private WebElement Privacyandsafety;
	
	@FindBy (xpath="//a[text()='For developers']")
	private WebElement Fordevelopers;
	
	
	public MessengerHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	public void Clickonrooms() {
		
		rooms.click();
		
		}
	
    public void ClickonDesktopapp() {
		
	Desktopapp.click();
		
		}

    public void ClickonPrivacyandsafety() {
	
	Privacyandsafety.click();
		
		}

    public void ClickonFordevelopers() {
	
	 Fordevelopers.click();
		
		}
}
