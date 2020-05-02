package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pages.CliquesPage;
import pages.MenuPage;
import support.BaseTest;

public class CliquesTeste extends BaseTest {
	
	private MenuPage menuPage = new MenuPage();
	private CliquesPage cliquesPage = new CliquesPage();
	
	@Test
	public void deveInteragirComCliqueLongo() {
		menuPage.acessarCliques();
		
		cliquesPage.selecionarCliqueLongo("Clique Longo");
		assertEquals("Clique Longo", cliquesPage.obterTextoCliqueLongo());
	}
	
	@Test
	public void deveInteragirComCliqueDuplo() {
		menuPage.acessarCliques();
		
		cliquesPage.selecionarCliqueDuplo();
		assertEquals("Duplo Clique", cliquesPage.obterTextoCliqueDuplo());
	}

}
