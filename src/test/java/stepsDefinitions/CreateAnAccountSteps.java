package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CreateAnAccountPage;

public class CreateAnAccountSteps {
	
	CreateAnAccountPage createAccountPage = new CreateAnAccountPage();
	
	@Dado("que eu acesse o menu Sign in")
	public void queEuAcesseOMenuSignIn() {
	    createAccountPage.acessarMenuSignIn();
	}

	@Quando("^eu preencher o campo Email address com \"([^\"]*)\"$")
	public void euPreencherOCampoEmailAddressCom(String email) throws Throwable {
		createAccountPage.preencherCampoEmailAdd(email);
	}

	@E("^clicar no botao Create an account$")
	public void clicarNoBotaoCreateAnAccount() throws Throwable {
		createAccountPage.clicarBotaoCreateAnAccount();
	}

	@E("^preencher o campo First name com \"([^\"]*)\"$")
	public void preencherOCampoFirstNameCom(String name) throws Throwable {
		createAccountPage.preencherCampoFirstName(name);
	}

	@E("^preencher o campo Last name com \"([^\"]*)\"$")
	public void preencherOCampoLastNameCom(String lastName) throws Throwable {
		createAccountPage.preencherCampoLastName(lastName);
	}

	@E("^preencher o campo Password com \"([^\"]*)\"$")
	public void preencherOCampoPasswordCom(String password) throws Throwable {
		createAccountPage.preencherCampoPassword(password);
	}

	@E("^selecionar no campo Date of Birth com \"([^\"]*)\"$")
	public void selecionarNoCampoDateOfBirthCom(String dateBirth) throws Throwable {
		createAccountPage.selecionarNoCampoDateOfBirth(dateBirth);
	}

	@E("^preencher o campo Address com \"([^\"]*)\"$")
	public void preencherOCampoAddressCom(String addrs) throws Throwable {
		createAccountPage.preencherCampoAddrs(addrs);
	}

	@E("^preencher o campo City com \"([^\"]*)\"$")
	public void preencherOCampoCityCom(String city) throws Throwable {
		createAccountPage.preencherCampoCity(city);
	}

	@E("^selecionar no campo State \"([^\"]*)\"$")
	public void selecionarNoCampoState(String state) throws Throwable {
		createAccountPage.selecionarNoCampoState(state);
	}

	@E("^preencher o campo Zip/Postal Code \"([^\"]*)\"$")
	public void preencherOCampoZipPostalCode(String postalCode) throws Throwable {
		createAccountPage.preencherCampoPostalCode(postalCode);
	}

	@E("^selecionar no campo Country \"([^\"]*)\"$")
	public void selecionarNoCampoCountry(String country) throws Throwable {
		createAccountPage.selecionarNoCampoCountry(country);
	}

	@E("^preencher no campo Mobile phone \"([^\"]*)\"$")
	public void preencherNoCampoMobilePhone(String phone) throws Throwable {
		createAccountPage.preencherNocampoPhone(phone);
	}

	@E("^clicar no botao Register$")
	public void clicarNoBotaoRegister() throws Throwable {
		createAccountPage.clicarNoBotaoRegister();
	}

	@Entao("^o sistema apresenta o usuario \"([^\"]*)\" logado$")
	public void oSistemaApresentaOUsuarioLogado(String usuario) throws Throwable {
		createAccountPage.validarUsuarioLogado(usuario);
	}
	
}
