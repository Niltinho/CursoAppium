package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import jdk.nashorn.internal.ir.annotations.Ignore;
import pages.FormularioPage;
import pages.MenuPage;
import support.DriverFactory;

public class FormularioTeste {

	private MenuPage menuPage = new MenuPage();
	private FormularioPage formPage = new FormularioPage();
	
	@Before
	public void setUp() throws MalformedURLException {
	
	menuPage.acessarFormulario();
	}
	
	@Ignore
	public void deveInstalarApp() {
		
	}
	
	@Test
	public void devePreencherCampoTexto() {
		/*List<MobileElement> elementosEncontrados = DriverFactory.getDriver().findElements(By.className("android.widget.TextView"));
		for(MobileElement elemento: elementosEncontrados) {
			System.out.println(elemento.getText());
		}
		elementosEncontrados.get(1).click();*/
		formPage.setNome("Nilton");
		assertEquals("Nilton", formPage.obterNome());
		System.out.println(formPage.obterNome());
	}
	
	@Test
	public void deveInteragirCombo() {
		formPage.setConsole("PS4");
		assertEquals("PS4", formPage.obterConsole());
		//Select comboConsole = new Select (driver.findElement(MobileBy.AccessibilityId("console")));
		//comboConsole.selectByVisibleText("PS4");
	}
	
	@Test
	public void deveInteragirSwitchCheckBox() {
		assertFalse(formPage.isCheckMarcado());
		assertTrue(formPage.isSwitchMarcado());
		
		formPage.clicarCheckBox();
		formPage.clicarSwitch();
		
		assertTrue(formPage.isCheckMarcado());
		assertFalse(formPage.isSwitchMarcado());
	}
	
	@Test
	public void deveRealizarCadastro() {
		formPage.setNome("Nilton");
		formPage.setConsole("XBox One");
		formPage.clicarCheckBox();
		formPage.clicarSwitch();
		formPage.clicarSalvar();
				
		System.out.println(formPage.obterNomeCadastrado());
		System.out.println(formPage.obterConsoleCadastrado());
		System.out.println(formPage.obterCheckCadastrado());
		System.out.println(formPage.obterSwitchCadastrado());
		
		assertEquals("Nome: Nilton", formPage.obterNomeCadastrado());
		assertEquals("Console: xone", formPage.obterConsoleCadastrado());
		assertEquals("Checkbox: Marcado", formPage.obterCheckCadastrado());
		assertEquals("Switch: Off", formPage.obterSwitchCadastrado());
	}
	
	@After
	public void tearDown() {
		DriverFactory.killDriver();
	}

}
