package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pages.MenuPage;
import pages.OpcaoEscondidaPage;
import support.BaseTest;

public class OpcaoEscondidaTeste extends BaseTest {
	
	private MenuPage menuPage = new MenuPage();
	
	private OpcaoEscondidaPage opEscondidaPage = new OpcaoEscondidaPage();
	
	@Test
	public void deveEncontrarOpcaoEscondida () {
		menuPage.scrollDown();
		menuPage.acessarOpcaoEscondida();
		assertEquals("Voc� achou essa op��o", opEscondidaPage.obterMensagemSucesso());
		opEscondidaPage.clicarOk();
		
	}

}
