package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom 
{
	@FindBy(name="login")
	private WebElement login;
	
	public Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement login2()
	{return login;}
}
