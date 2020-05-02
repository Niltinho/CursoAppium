package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import pages.MenuPage;
import support.BaseTest;

public class SwipeTeste extends BaseTest {
	
	private MenuPage menuPage = new MenuPage();
	
	@Test
	public void deveRealizarSwipe() {
		menuPage.acessarSwipe();
		assertTrue(menuPage.existeElementoPorTexto("a esquerda"));
		menuPage.swipeLeft();;
		assertTrue(menuPage.existeElementoPorTexto("E veja se"));
		menuPage.clicarPorTexto("›");
		assertTrue(menuPage.existeElementoPorTexto("Chegar até o fim!"));
		menuPage.swipeRight();
		assertTrue(menuPage.existeElementoPorTexto("você consegue"));
		menuPage.clicarPorTexto("‹");
		assertTrue(menuPage.existeElementoPorTexto("Mova a tela para"));
	}

}
