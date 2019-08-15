package br.com.ramonbarros.gps.dto;

import java.io.Serializable;

public class PontoInteresseDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer x;
	private Integer y;
	private Integer distanciaMaxima;
	
	public PontoInteresseDTO() {
	}
	
	public PontoInteresseDTO(Integer x, Integer y, Integer distanciaMaxima) {
		super();
		this.x = x;
		this.y = y;
		this.distanciaMaxima = distanciaMaxima;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public Integer getDistanciaMaxima() {
		return distanciaMaxima;
	}

	public void setDistanciaMaxima(Integer distanciaMaxima) {
		this.distanciaMaxima = distanciaMaxima;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((distanciaMaxima == null) ? 0 : distanciaMaxima.hashCode());
		result = prime * result + ((x == null) ? 0 : x.hashCode());
		result = prime * result + ((y == null) ? 0 : y.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PontoInteresseDTO other = (PontoInteresseDTO) obj;
		if (distanciaMaxima == null) {
			if (other.distanciaMaxima != null)
				return false;
		} else if (!distanciaMaxima.equals(other.distanciaMaxima))
			return false;
		if (x == null) {
			if (other.x != null)
				return false;
		} else if (!x.equals(other.x))
			return false;
		if (y == null) {
			if (other.y != null)
				return false;
		} else if (!y.equals(other.y))
			return false;
		return true;
	}

}
