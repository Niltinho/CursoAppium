package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pages.AbaPage;
import pages.MenuPage;
import support.BaseTest;

public class AbaTeste extends BaseTest {
	
	private MenuPage menuPage = new MenuPage();
	private AbaPage abaPage = new AbaPage();
	
	@Test
	public void deveInteragirComAbas() {
		menuPage.acessarAbas();
		
		assertEquals("Este é o conteúdo da Aba 1", abaPage.obterTextoAba1());
		abaPage.acessarAba2();
		assertEquals("Este é o conteúdo da Aba 2", abaPage.obterTextoAba2());
	}
}
