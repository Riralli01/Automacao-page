package Metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosLoginpage {

	WebDriver nav;
	
	public void abrirNavegador (String url) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		nav = new ChromeDriver();
		nav.manage().window().maximize();
		nav.get("url");
	
	}
	
	
	public void clicar (By elemento) {
	nav.findElement(elemento).click();
		
}
	
	public void preencherCampo (By elemento,String texto) {
		nav.findElement(elemento).sendKeys(texto);
		
	}
	
	public void pausar (int tempo) throws InterruptedException {
		Thread.sleep(tempo);
		
	}
	
	public void fecharNavegador () {
		nav.quit();
		
	}
	
	public void tirarprint(String nome)throws IOException {
		TakesScreenshot print = ((TakesScreenshot)nav);
		File doc = print.getScreenshotAs(OutputType.FILE);
		File savePrint =new File ("./src/evidencias"+ nome +".png");
				FileUtils.copyFile(doc, savePrint);
		
	}
	
	public void validarTexto (String text , By elemento) {
		String texto = nav.findElement(elemento).getText();
		System.out.println();
		assertEquals(texto, text);
	}
	
	
}
