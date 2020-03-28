package stepsDefinitions;

import static utils.Utils.acessarSistema;
import static utils.Utils.capturarScreenshot;
import static utils.Utils.driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	@Before
	public void setup() {
		acessarSistema();
	}
	
	@After
	public void after(Scenario scenario) {
		capturarScreenshot(scenario);
		driver.quit();
	}

}
