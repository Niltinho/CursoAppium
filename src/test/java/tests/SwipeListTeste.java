package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import pages.MenuPage;
import pages.SwipeListPage;
import support.BaseTest;

public class SwipeListTeste extends BaseTest {
	
	private MenuPage menuPage = new MenuPage();
	private SwipeListPage swipeListPage = new SwipeListPage();
	
	@Test
	public void deveInteragirSwipeList() {
		menuPage.acessarSwipeList();
		
		swipeListPage.swipeElementRigth("Opção 1");
		swipeListPage.clicarBotaoMais();
		assertTrue(swipeListPage.existeElementoPorTexto("Opção 1 (+)"));
		
		swipeListPage.swipeElementRigth("Opção 4");
		swipeListPage.clicarBotaoMenos();
		assertTrue(swipeListPage.existeElementoPorTexto("Opção 4 (-)"));
		
		swipeListPage.swipeElementLeft("Opção 5 (-)");
		assertTrue(swipeListPage.existeElementoPorTexto("Opção 5"));
	}

}
