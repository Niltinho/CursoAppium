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
		
		swipeListPage.swipeElementRigth("Op��o 1");
		swipeListPage.clicarBotaoMais();
		assertTrue(swipeListPage.existeElementoPorTexto("Op��o 1 (+)"));
		
		swipeListPage.swipeElementRigth("Op��o 4");
		swipeListPage.clicarBotaoMenos();
		assertTrue(swipeListPage.existeElementoPorTexto("Op��o 4 (-)"));
		
		swipeListPage.swipeElementLeft("Op��o 5 (-)");
		assertTrue(swipeListPage.existeElementoPorTexto("Op��o 5"));
	}

}
