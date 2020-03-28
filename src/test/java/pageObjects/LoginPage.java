package pageObjects;

import static utils.Utils.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//ELEMENTOS
	@FindBy(name = "email")
	private WebElement loginEmail;
	
	@FindBy(name = "passwd")
	private WebElement loginPassword;
	
	@FindBy(name = "SubmitLogin")
	private WebElement botaoSignIn;
	
	//METODOS
	public void preencherCampoLoginEmail(String email) {
		loginEmail.sendKeys(email);
	}
	
	public void preencherCampoPassword(String password) {
		loginPassword.sendKeys(password);
	}
	
	public void clicarNoBotaoSignIn() {
		botaoSignIn.click();
	}
	
}
