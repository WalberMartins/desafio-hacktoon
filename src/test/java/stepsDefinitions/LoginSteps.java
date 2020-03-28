package stepsDefinitions;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

public class LoginSteps {
	
	LoginPage loginPage = new LoginPage();
	
	@Quando("eu preencher o campo de login Email address com {string}")
	public void euPreencherOCampoDeLoginEmailAddressCom(String email) {
	    loginPage.preencherCampoLoginEmail(email);
	}

	@E("^preencher o campo de login Password com \"([^\"]*)\"$")
	public void preencherOCampoDeLoginPasswordCom(String password) throws Throwable {
		loginPage.preencherCampoPassword(password);
	}

	@E("^clicar no botao Sign in$")
	public void clicarNoBotaoSignIn() throws Throwable {
		loginPage.clicarNoBotaoSignIn();
	}

}
