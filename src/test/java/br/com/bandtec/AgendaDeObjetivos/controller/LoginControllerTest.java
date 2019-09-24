package br.com.bandtec.AgendaDeObjetivos.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.com.bandtec.AgendaDeObjetivos.domain.Credenciais;

public class LoginControllerTest {
	private LoginController controller;
	
	@Before
	public void setUp() {
		controller = new LoginController();
	}
	
	@Test
	public void LoginComSucesso() 
	{
		controller = new LoginController();
		
		ResponseEntity<String> resposta =  controller.validarLogin(new Credenciais("igual","igual"));
		
		assertEquals(HttpStatus.OK,resposta.getStatusCode());
		assertEquals ("Sucesso",resposta.getBody());
	}
	@Test
	public void LoginComFalha() {
		controller = new LoginController();
		ResponseEntity<String> resposta = controller.validarLogin(new Credenciais("Login","senha"));
		
		assertEquals(HttpStatus.UNAUTHORIZED,resposta.getStatusCode());
		assertEquals ("Sucesso",resposta.getBody());
	}
}
