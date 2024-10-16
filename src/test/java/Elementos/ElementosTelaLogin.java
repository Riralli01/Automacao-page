package Elementos;

import org.openqa.selenium.By;

public class ElementosTelaLogin {

	private By iconeLogin = By.id("menuUser");
	
	private By campoDeUsername = By.name("Username");
	
	private By campoDePassword = By.name("password");
	
	private By btnlogin = By.id("sing_in_btn");

	
	public By getIconeLogin() {
		return iconeLogin;
	}

	public By getCampoDeUsername() {
		return campoDeUsername;
	}

	public By getCampoDePassword() {
		return campoDePassword;
	}

	public By getBtnlogin() {
		return btnlogin;
	}

	
	}
	

	

