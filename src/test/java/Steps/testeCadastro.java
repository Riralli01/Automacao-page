package Steps;

import Elementos.ElementosTelaLogin;
import Elementos.ElementosTelacadastro;
import Metodos.MetodosLoginpage;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;

public class testeCadastro {
	ElementosTelaLogin e = new ElementosTelaLogin();
	ElementosTelacadastro cad = new ElementosTelacadastro();
	MetodosLoginpage m = new MetodosLoginpage();


	
	
	@Quando("clicar no botao nova conta")
	public void clicar_no_botao_nova_conta() throws InterruptedException {
	    m.clicar(cad.getbtnnovaconta());
	    m.pausar(2000);
	}

	@Quando("preencher campos obrigatorios")
	public void preencher_campos_obrigatorios() {
	    
	}

	@Quando("clicar no aceitar termos")
	public void clicar_no_aceitar_termos() {
	    
	}

	@Entao("a conta e criada com sucesso")
	public void a_conta_e_criada_com_sucesso() {
	    
	}
}
