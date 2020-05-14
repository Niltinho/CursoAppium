package page.SeuBarriga;

import support.BasePage;

public class SBLoginPage extends BasePage {
	
	public void setEmail(String email) {
		escreverCampoPorTexto("Nome", email);
	}
	
	public void setSenha(String senha) {
		escreverCampoPorTexto("Senha", senha);
	}
	
	public void clicarBotaoEntrar() {
		clicarPorTexto("ENTRAR");
	}
	
	public void logar(String email, String senha) {
		setEmail(email);
		setSenha(senha);
		clicarBotaoEntrar();
	}

}
