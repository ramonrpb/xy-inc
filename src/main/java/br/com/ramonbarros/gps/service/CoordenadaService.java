package br.com.ramonbarros.gps.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ramonbarros.gps.dto.DistanciaDTO;
import br.com.ramonbarros.gps.dto.PontoInteresseDTO;
import br.com.ramonbarros.gps.entity.Coordenada;
import br.com.ramonbarros.gps.repository.CoordenadaRepository;
import br.com.ramonbarros.gps.utilitario.Utils;

@Service
public class CoordenadaService {

	@Autowired
	private CoordenadaRepository repository;
	
	public void salvar(Coordenada coordenada) {
		repository.save(coordenada);
	}
	
	public List<Coordenada> buscarTodos(){
		return repository.findAll();
	}

	public List<Coordenada> buscarPontosInteresse(PontoInteresseDTO poi) {
		List<Coordenada> lista = new ArrayList<>();
		List<Coordenada> pontosInteresse = new ArrayList<>();
		lista = buscarTodos();
		
		DistanciaDTO distanciaDTO;
		for(Coordenada c : lista) {
			distanciaDTO = new DistanciaDTO(poi.getX(), c.getX(), poi.getY(), c.getY());
			Double valor = Utils.calcularDistancia(distanciaDTO);
			if(valor <= poi.getDistanciaMaxima()) {
				pontosInteresse.add(c);
			}
		}
		return pontosInteresse;
	}
}
