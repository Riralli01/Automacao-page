package Steps;

import java.io.IOException;

import Elementos.ElementosTelaLogin;
import Elementos.ElementosTelacadastro;
import Metodos.MetodosLoginpage;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;

public class test {
	ElementosTelaLogin e = new ElementosTelaLogin();
	ElementosTelacadastro cad = new ElementosTelacadastro();
	MetodosLoginpage m = new MetodosLoginpage();

	
	@Dado("que estou no site {string}")
	public void que_estou_no_site( String url) throws InterruptedException {
	   m.abrirNavegador(url);
	   m.pausar(2000);
	}

	@Quando("clicar em icone de logar")
	public void clicar_em_icone_de_logar() throws InterruptedException {
	   m.clicar(e.getIconeLogin());
	   m.pausar(2000);
	}

	@Quando("preenche campo de usuario")
	public void preenche_campo_de_usuario() {
	    m.preencherCampo(e.getCampoDeUsername(), "Riralli01");
	}

	@Quando("preencher campo de senha")
	public void preencher_campo_de_senha() throws IOException {
	    m.preencherCampo(e.getCampoDePassword(), "153947Rd");
	    m.tirarprint("teste Login");
	}

	@Quando("clicar para logar")
	public void clicar_para_logar() throws InterruptedException {
	    m.clicar(e.getBtnlogin());
	    m.pausar(2000);
	}

	@Entao("e logado com sucesso")
	public void e_logado_com_sucesso() {
	    m.fecharNavegador();
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
