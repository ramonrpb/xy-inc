package br.com.ramonbarros.gps.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import br.com.ramonbarros.gps.entity.Coordenada;

public interface CoordenadaRepository extends JpaRepositoryImplementation<Coordenada, Long>{

}
