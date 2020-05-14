package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import page.SeuBarriga.SBContasPage;
import page.SeuBarriga.SBHomePage;
import page.SeuBarriga.SBLoginPage;
import page.SeuBarriga.SBMenuPage;
import page.SeuBarriga.SBMovimentacaoPage;
import page.SeuBarriga.SBResumoPage;
import pages.MenuPage;
import support.BaseTest;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SBTeste extends BaseTest {
	
	private MenuPage menuPage = new MenuPage();
	private SBLoginPage loginPage = new SBLoginPage();
	private SBMenuPage sbMenuPage = new SBMenuPage();
	private SBContasPage sbContasPage = new SBContasPage();
	private SBMovimentacaoPage sbMovPage = new SBMovimentacaoPage();
	private SBHomePage sbHomePage = new SBHomePage();
	private SBResumoPage sbResumoPage = new SBResumoPage();
	
	@Before
	public void setUp() {
	menuPage.acessarSeuBarrigaNativo();
	
	loginPage.logar("nilton01@teste.com", "niltonteste");
	}
	
	@Test
	public void teste1_deveInserirContaComSucesso() {
		sbMenuPage.acessarContas();
		
		sbContasPage.setConta("Conta Teste");
		sbContasPage.clicarBotaoSalvar();
		assertEquals("Conta adicionada com sucesso", sbContasPage.validarContaCriada());
	}
	
	@Test
	public void teste2_deveExcluirConta() {
		sbMenuPage.acessarContas();
		
		sbContasPage.cliqueLongo("Conta Teste");
		sbContasPage.clicarBotaoExcluir();
		assertEquals("Conta excluída com sucesso", sbContasPage.validarContaExcluida());
	}
	
	@Test
	public void teste3_deveValidarInclusaoMov() {
		sbMenuPage.acessarMovimentacao();
		
		sbMovPage.clicarBotaoSalvar();
		assertEquals("Descrição é um campo obrigatório", sbMovPage.validarCampoObrigatorio());
		sbMovPage.setDescricao("Descrição Teste");
		
		sbMovPage.clicarBotaoSalvar();
		assertEquals("Interessado é um campo obrigatório", sbMovPage.validarCampoObrigatorio());
		sbMovPage.setInteressado("Interessado Teste");
		
		sbMovPage.clicarBotaoSalvar();
		assertEquals("Valor é um campo obrigatório", sbMovPage.validarCampoObrigatorio());
		sbMovPage.setValor("100");
		sbMovPage.setConta("Conta para extrato");
		
		sbMovPage.clicarBotaoSalvar();
		assertEquals("Movimentação cadastrada com sucesso", sbMovPage.validarCampoObrigatorio());
	}
	
	@Test
	public void teste4_deveAtualizarSaldoAoExcluirMovimentacao() {
		assertTrue(sbHomePage.existeElementoPorTexto("534.00"));
		
		sbMenuPage.acessarResumo();
		sbResumoPage.excluirMovimentacao("Movimentacao 3, calculo saldo");
		assertTrue(sbResumoPage.existeElementoPorTexto("Movimentação removida com sucesso!"));
		
		sbMenuPage.acessarHome();
		sbHomePage.aguardarElementoPorTexto("Conta para saldo");
		sbHomePage.scroll(0.3, 0.9);
		assertTrue(sbHomePage.existeElementoPorTexto("-1000.00"));
	}
}
