package br.com.camarao.resource;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.camarao.model.Camarao;
import br.com.camarao.repository.Camaroes;

@CrossOrigin
@RestController
@RequestMapping("/camarao")
public class CamaraoResource {
	
	@Autowired
	private Camaroes camaroes;

	@GetMapping
	public ResponseEntity<List<Camarao>> listar(){
		return new ResponseEntity<List<Camarao>>(camaroes.findAllByOrderByIdDesc(), HttpStatus.OK);
	}
	
	@GetMapping(value="/last")
	public ResponseEntity<Camarao> buscar(){
		
		Camarao camarao = camaroes.findLastRecord();
		
		return ResponseEntity.status(HttpStatus.OK).body(camarao);
	}
	
	@PostMapping
	public ResponseEntity<Void> salvar(@RequestBody Camarao camarao){
		
		if (camaroes.findById(camarao.getId()).isPresent()) {
			return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
		}
		
		camarao = camaroes.save(camarao);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{codigo}").
				buildAndExpand(camarao.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping
	public ResponseEntity<Camarao> alterar(@RequestBody Camarao camarao){
		
		if (camaroes.findById(camarao.getId()).isPresent()) {
			camarao = camaroes.save(camarao);
			return ResponseEntity.accepted().body(camarao);
		}
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deletar(@PathVariable("id") Integer id) {
		
		Optional<Camarao> camarao = camaroes.findById(id);
		
		if (camarao.isPresent()) {
			camaroes.deleteById(id);
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.notFound().build();
	}

}
