package br.com.camarao.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.camarao.model.Camarao;
import br.com.camarao.repository.Camaroes;

@RestController
@RequestMapping("/camarao")
public class CamaraoResource {
	
	@Autowired
	private Camaroes camaroes;

	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Camarao>> listar(){
		return new ResponseEntity<List<Camarao>>(camaroes.findAll(), HttpStatus.OK);
	}
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET, value="/last")
	public ResponseEntity<Camarao> buscar(){
		
		Camarao camarao = camaroes.findLastRecord();
		
		return ResponseEntity.status(HttpStatus.OK).body(camarao);
	}

}
