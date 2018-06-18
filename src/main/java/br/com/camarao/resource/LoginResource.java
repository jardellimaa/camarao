package br.com.camarao.resource;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.camarao.model.Login;
import br.com.camarao.repository.Logins;

@RestController
@RequestMapping("/login")
public class LoginResource {

	@Autowired
	private Logins logins;

	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Login>> listar() {
		return new ResponseEntity<List<Login>>(logins.findAll(), HttpStatus.OK);
	}

	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET, value = "/{login}")
	public ResponseEntity<?> buscar(@PathVariable("login") String login) {

		Optional<Login> usuario = logins.findByLogin(login);

		if (usuario.isPresent()) {
			return ResponseEntity.status(HttpStatus.OK).body(usuario);
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> salvar(@RequestBody Login login){
		
		if (logins.findById(login.getId()).isPresent()) {
			return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
		}
		
		login = logins.save(login);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").
				buildAndExpand(login.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	@CrossOrigin
	@RequestMapping (method = RequestMethod.PUT)
	public ResponseEntity<Login> alterar(@RequestBody Login login){
		
		if (logins.findById(login.getId()).isPresent()) {
			login = logins.save(login);
			return ResponseEntity.accepted().body(login);
		}
		return ResponseEntity.notFound().build();
	}
	
	@RequestMapping(value = "/{login}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deletar(@PathVariable("login") String login) {
		
		Optional<Login> usuario = logins.findByLogin(login);
		
		if (usuario.isPresent()) {
			logins.deleteByLogin(login);
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.notFound().build();
	}

}
