package br.com.bandtec.AgendaDeObjetivos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.bandtec.AgendaDeObjetivos.domain.Credenciais;
import br.com.bandtec.AgendaDeObjetivos.repository.TodosUsuarios;
@RestController
public class LoginController 
{
	
	@Autowired
	public TodosUsuarios todosUsuario;
	
	
	@PostMapping("/login")
	public ResponseEntity<String> validarLogin(@RequestBody Credenciais credenciais) {
		
		if(todosUsuario.usuarioExiste(credenciais) == null) {
			//return ResponseEntity.ok("Sucesso");
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login não encontrato");
		}else {
			
			return ResponseEntity.ok("Sucesso");
		}			
	}
	
}
