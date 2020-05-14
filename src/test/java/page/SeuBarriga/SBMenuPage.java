package page.SeuBarriga;

import pages.MenuPage;

public class SBMenuPage extends MenuPage {
	
	public void acessarHome() {
		clicarPorTexto("HOME");
	}
	
	public void acessarContas() {
		clicarPorTexto("CONTAS");
	}
	
	public void acessarMovimentacao() {
		clicarPorTexto("MOV...");
	}
	
	public void acessarResumo() {
		clicarPorTexto("RESUMO");
	}

}
