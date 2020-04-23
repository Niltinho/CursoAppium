package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import pages.MenuPage;
import pages.SplashPage;
import support.BaseTest;

public class SplashTeste extends BaseTest {
	
	private MenuPage menuPage = new MenuPage();
	private SplashPage splashPage = new SplashPage();
	
	@Test
	public void deveAguardarSplashSumir() {
		menuPage.acessarSplash();
		splashPage.telaSplashVisivel();
		splashPage.aguardaSplashSumir();
		
		assertTrue(menuPage.existeElementoPorTexto("Formulário"));
		
	}

}
