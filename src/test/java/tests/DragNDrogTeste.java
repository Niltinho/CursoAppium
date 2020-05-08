package tests;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import pages.DragNDropPage;
import pages.MenuPage;
import support.BaseTest;

public class DragNDrogTeste extends BaseTest {
	
	private MenuPage menuPage = new MenuPage();
	private DragNDropPage dragNDropPage = new DragNDropPage();
	
	private String[] estadoInicial = new String[]{"Esta", "� uma lista", "Drag em Drop!", "Fa�a um clique longo,", "e arraste para", "qualquer local desejado."};
	private String[] estadoIntermedi�rio = new String[]{"� uma lista", "Drag em Drop!", "Fa�a um clique longo,", "e arraste para", "Esta", "qualquer local desejado."};
	private String[] estadoFinal = new String[]{"Fa�a um clique longo,", "� uma lista", "Drag em Drop!", "e arraste para", "Esta", "qualquer local desejado."};
	
	@Test
	public void deveEfetuarDragNDrop() throws InterruptedException {
		menuPage.acessarDragNDrop();
		
		Thread.sleep(3000);
		assertArrayEquals(estadoInicial, dragNDropPage.obterLista());
		
		dragNDropPage.arrastar("Esta", "e arraste para");
		assertArrayEquals(estadoIntermedi�rio, dragNDropPage.obterLista());
		
		dragNDropPage.arrastar("Fa�a um clique longo,", "� uma lista");
		assertArrayEquals(estadoFinal, dragNDropPage.obterLista());
	}

}
