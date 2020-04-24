package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pages.AlertPage;
import pages.MenuPage;
import support.BaseTest;

public class AlertTeste extends BaseTest {
	
	private MenuPage menuPage = new MenuPage();
	private AlertPage alertPage = new AlertPage();
	
	@Test
	public void deveConfirmarAlerta() {
		menuPage.acessarAlertas();
		
		alertPage.clicarAlertaConfirm();
		assertEquals("Info", alertPage.obterTituloAlerta());
		assertEquals("Confirma a operação?", alertPage.obterMensagemAlerta());
		alertPage.clicarBotaoConfirmar();
		assertEquals("Confirmado", alertPage.obterMensagemAlerta());
		alertPage.clicarBotaoSair();
	}
	

}
