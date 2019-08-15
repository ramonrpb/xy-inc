package br.com.ramonbarros.gps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ramonbarros.gps.dto.PontoInteresseDTO;
import br.com.ramonbarros.gps.entity.Coordenada;
import br.com.ramonbarros.gps.service.CoordenadaService;

@RestController
@RequestMapping("${coordenada.servlet.path}")
public class CoordenadaController {
	
	@Autowired
	private CoordenadaService service;
	
	@GetMapping
    public ResponseEntity<List<Coordenada>> buscarTodos() {
        final List<Coordenada> lista = service.buscarTodos();
        return ResponseEntity.ok().body(lista);
    }

	@PostMapping
	public ResponseEntity<Void> salvar(@RequestBody Coordenada coordenada){
		service.salvar(coordenada);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@GetMapping("/gps")
	public ResponseEntity<List<Coordenada>> buscarPontosInteresse(@RequestBody PontoInteresseDTO poi) {
		final List<Coordenada> lista = service.buscarPontosInteresse(poi);
		return ResponseEntity.ok().body(lista);
	}
}
