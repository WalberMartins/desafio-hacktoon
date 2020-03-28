package pageObjects;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAnAccountPage {
	
	public CreateAnAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	//ELEMENTOS
	@FindBy(xpath = "//a[@class=\"login\"]")
	private WebElement menuSignIn;
	
	@FindBy(name = "email_create")
	private WebElement campoEmailAdd;
	
	@FindBy(name = "SubmitCreate")
	private WebElement botaoCreateAnAccount;
	
	@FindBy(name = "customer_firstname")
	private WebElement campoFirstName;
	
	@FindBy(name = "customer_lastname")
	private WebElement campoLastName;
	
	@FindBy(name="passwd")
	private WebElement campoPassword;
	
	@FindBy(name = "address1")
	private WebElement campoAddrs;
	
	@FindBy(name = "city")
	private WebElement campoCity;
	
	@FindBy(name = "postcode")
	private WebElement campoPostCode;
	
	@FindBy(name = "phone_mobile")
	private WebElement campoPhone;
	
	@FindBy(name = "submitAccount")
	private WebElement botaoRegister;
	
	//METODOS
	public void acessarMenuSignIn() {
		menuSignIn.click();
	}
	
	public void preencherCampoEmailAdd(String email) {
		campoEmailAdd.sendKeys(email);
	}
	
	public void clicarBotaoCreateAnAccount() {
		botaoCreateAnAccount.submit();
	}
	
	public void preencherCampoFirstName(String name) {
		campoFirstName.sendKeys(name);
	}
	
	public void preencherCampoLastName(String lastName) {
		campoLastName.sendKeys(lastName);
	}
	
	public void preencherCampoPassword(String password) {
		campoPassword.sendKeys(password);
	}
	
	public void selecionarNoCampoDateOfBirth(String dateBirth) {
		String[] dateBirthArray = dateBirth.split("/");
		
		Select selectDays = new Select(driver.findElement(By.name("days")));
		selectDays.selectByValue(dateBirthArray[0]);
		
		Select selectMonths = new Select(driver.findElement(By.name("months")));
		selectMonths.selectByValue(dateBirthArray[1].replaceAll("0", ""));
		
		Select selectYears = new Select(driver.findElement(By.name("years")));
		selectYears.selectByValue(dateBirthArray[2]);
		
 	}
	
	public void preencherCampoAddrs(String addrs) {
		campoAddrs.sendKeys(addrs);
	}
	
	public void preencherCampoCity(String city) {
		campoCity.sendKeys(city);
	}
	
	public void selecionarNoCampoState(String state) {
		String valueOption = driver.findElement(By.xpath("//option[.='"+state+"']")).getAttribute("value").toString().replaceAll("[^0-9]", "");
		
		Select selectState = new Select(driver.findElement(By.name("id_state")));
		selectState.selectByValue(valueOption);
	}
	
	public void preencherCampoPostalCode(String postalCode) {
		campoPostCode.sendKeys(postalCode);
	}
	
	public void selecionarNoCampoCountry(String country) {
		Select selectCountry = new Select(driver.findElement(By.name("id_country")));
		selectCountry.selectByVisibleText(country);
	}
	
	public void preencherNocampoPhone(String phone) {
		campoPhone.sendKeys(phone);
	}
	
	public void clicarNoBotaoRegister() {
		botaoRegister.click();
	}
	
	//VALIDAÇÕES
	public void validarUsuarioLogado(String usuario) {
		String usuarioLogado = driver.findElement(By.xpath("//a/span[.='"+usuario+"']")).getText();
		assertEquals(usuario, usuarioLogado);
	}

}
