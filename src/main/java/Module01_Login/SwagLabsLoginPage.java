package Module01_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLoginPage 
{

	@FindBy(xpath="//input[@name='user-name']") private WebElement UN;
	@FindBy(xpath="//input[@name='password']") private WebElement PWD;
	@FindBy(xpath="//input[@name='login-button']") private WebElement login;
	
	public SwagLabsLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpSwagLabsLoginPageUsername(String username)
	{
		UN.sendKeys(username);
	}
	
	public void inpSwagLabsLoginPagePassword(String password)
	{
		PWD.sendKeys(password);
	}
	
	public void clickSwagLabsLoginPageLoginButton()
	{
		login.click();
	}
}
