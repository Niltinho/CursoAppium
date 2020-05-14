package page.SeuBarriga;

import io.appium.java_client.MobileBy;
import support.BasePage;

public class SBMovimentacaoPage extends BasePage {
	
	public void clicarBotaoSalvar() {
		clicarPorTexto("SALVAR");
	}
	
	public void setDescricao(String descricao) {
		escreverCampoPorTexto("Descrição", descricao);
	}
	
	public void setInteressado(String interessado) {
		escreverCampoPorTexto("Interessado", interessado);
	}
	
	public void setValor(String valor) {
		clicarPorTexto("Valor");
		escreverCampoPorTexto("Valor", valor);
	}
	
	public void setConta(String conta) {
		selecionarCombo(MobileBy.xpath("//*[@text='Selecione uma conta...']"), conta);
	}
	
	public String validarCampoObrigatorio() {
		return obterTexto(MobileBy.xpath("//*[@class='android.widget.TextView' and @index='11']"));
	}

}
