package br.com.ramonbarros.gps.utilitario;

import br.com.ramonbarros.gps.dto.DistanciaDTO;

public class Utils {

	public static Double calcularDistancia(DistanciaDTO distanciaDTO ) {
		return Math.hypot(distanciaDTO.getX1()-distanciaDTO.getX2(), distanciaDTO.getY1()-distanciaDTO.getY2());
	}
}
