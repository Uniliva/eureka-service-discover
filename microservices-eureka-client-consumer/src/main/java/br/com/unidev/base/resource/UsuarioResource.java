package br.com.unidev.base.resource;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.unidev.base.model.Usuario;
import br.com.unidev.base.service.EurekaService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioResource {

//criando um objeto do tipo restTemplate que vai buscar os dados da api
	private RestTemplate restTemplate = new RestTemplate();

	@Autowired
	private EurekaService eurekaService;

	@Value("${app.uniService.serviceId}")
	private String uniServiceID;

	@Value("${app.uniService.endpoint.greeting}")
	private String uniServiceEndpointUri;

	@GetMapping("")
	public ResponseEntity<?> getRandomGreeting() {
		URI uri = eurekaService.getInstance(uniServiceID);
		Usuario usuario = restTemplate.getForObject(uri.toString() + uniServiceEndpointUri, Usuario.class);
		System.out.println(usuario.toString());
		usuario.setNome("uniliva alves");
		return ResponseEntity.status(HttpStatus.OK).body("Mudei o nome para :" + usuario.getNome());
	}

}
