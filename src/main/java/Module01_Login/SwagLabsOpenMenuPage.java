package Module01_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsOpenMenuPage 
{

	
	@FindBy(xpath="//a[text()='Logout']") private WebElement logoutBtn;
	
	public SwagLabsOpenMenuPage(WebDriver driver)
	{
		PageFactory.initElements(driver,  this);	
	}
	
	
	
	public void clickSwagLabsOpenMenuPageLogoutBtn()
	{
		logoutBtn.click();
	}
}
