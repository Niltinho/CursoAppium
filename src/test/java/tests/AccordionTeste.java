package tests;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pages.AccordionPage;
import pages.MenuPage;
import support.BaseTest;

public class AccordionTeste extends BaseTest {
	
	private MenuPage menuPage = new MenuPage();
	private AccordionPage accorPage = new AccordionPage();
	
	@Test
	public void deveInteragirComAccordion() {
		menuPage.acessarAccordion();
		
		accorPage.selecionarOpcao("1");
		assertEquals("Esta é a descrição da opção 1", accorPage.obterDescricaoOpcao("1"));
	}

}
