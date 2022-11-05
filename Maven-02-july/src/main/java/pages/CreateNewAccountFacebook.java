package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccountFacebook {

	
	@FindBy (xpath="//input[@name='firstname']")
	private WebElement Firstname;
	
	@FindBy (xpath="//input[@name='lastname']")
	private WebElement Lastname;
	
	@FindBy (xpath="//input[@name='reg_email__']")
	private WebElement EmailOrMobileNo;
	
//	@FindBy (xpath="//input[@name='reg_email_confirmation__']")
//	private WebElement ReEnterEmail;
	
	@FindBy (xpath="//input[@name='reg_passwd__']")
	private WebElement NewPassword;
	
	@FindBy (xpath="//select[@name='birthday_day']")
	private WebElement Birthday_day;
	
	@FindBy (xpath="//select[@name='birthday_month']")
	private WebElement Birthday_Month;
	

	@FindBy (xpath="//select[@name='birthday_year']")
	private WebElement Birthday_Year;
	
	@FindBy (xpath="(//input[@name='sex'])[1]")
	private WebElement Female;
	
	@FindBy (xpath="(//input[@name='sex'])[2]")
	private WebElement Male;
	
	@FindBy (xpath="(//input[@name='sex'])[3]")
	private WebElement Custom;
	
	@FindBy (xpath="//select[@name='preferred_pronoun']")
	private WebElement Preferred_pronoun;
	
	@FindBy (xpath="(//button[text()='Sign Up'])[1]")
	private WebElement SignUp;
	
	
	public CreateNewAccountFacebook(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}

	
	
	public void sendFirstname() {
		
		Firstname.sendKeys("Bhavesh");
	}
	
	public void sendLastname() {
		
		Lastname.sendKeys("Gawali");
	}
	public void sendEmailOrMobileNo() {
		
		EmailOrMobileNo.sendKeys("9822185675");
	}
	
//    public void sendReEnterEmail() {
//		
//	ReEnterEmail.sendKeys("bhaveshgawali2212@gmail.com");
//	}

	public void sendNewPassword() {
		
		NewPassword.sendKeys("Omsai@123");
	}
	
	public void Send_Birthday_day() {
		
		Birthday_day.sendKeys("29");
	}
	
    public void Send_Birthday_Month() {
    	Select s=new Select(Birthday_Month);
    	s.selectByValue("7");
	}
    
    
    public void Send_Birthday_Year() {
    	Select s=new Select(Birthday_Year);
    	s.selectByValue("1997");
	}
    
    public void ClicOnFemale() {
	Female.click();
		
	}
    
    public void ClicOnMale() {
    	Male.click();
    		
    	}
    public void ClicOnCustom() {
    	Custom.click();
    		
    	}
    public void ClicOnPreferred_pronoun() {
    	Select s=new Select(Preferred_pronoun);
    	s.selectByValue("2");
    		
    	}
    public void ClicOnSignUp() {
    	SignUp.click();
    }	
    
}

