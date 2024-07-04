package Module01_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsHomePage 
{

	@FindBy(xpath="//span[text()='Products']") private WebElement products;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']") private WebElement openMenuBtn;
	
	public SwagLabsHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getproductsText()
	{
		String productsText=products.getText();
		return productsText;
	}
	
	public void clickSwagLabsOpenMenuPageOpenMenuBtn()
	{
		openMenuBtn.click();
	}
}
