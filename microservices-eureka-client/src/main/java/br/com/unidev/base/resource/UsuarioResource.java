package br.com.unidev.base.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unidev.base.model.Usuario;

@RestController
@RequestMapping("/usuarios")
public class UsuarioResource {
	
	@GetMapping("")
	public ResponseEntity<?> getUsuario(){
		
		Usuario usuario = new Usuario("unilie", "masculino", 23,"uniliva@hotmail.com");
		return ResponseEntity.ok(usuario);
	}

}
