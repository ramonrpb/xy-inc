package br.com.ramonbarros.gps.dto;

import java.io.Serializable;

public class DistanciaDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer x1;
	private Integer x2;
	private Integer y1;
	private Integer y2;
	
	public DistanciaDTO() {
	}

	public DistanciaDTO(Integer x1, Integer x2, Integer y1, Integer y2) {
		super();
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	public Integer getX1() {
		return x1;
	}

	public void setX1(Integer x1) {
		this.x1 = x1;
	}

	public Integer getX2() {
		return x2;
	}

	public void setX2(Integer x2) {
		this.x2 = x2;
	}

	public Integer getY1() {
		return y1;
	}

	public void setY1(Integer y1) {
		this.y1 = y1;
	}

	public Integer getY2() {
		return y2;
	}

	public void setY2(Integer y2) {
		this.y2 = y2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((x1 == null) ? 0 : x1.hashCode());
		result = prime * result + ((x2 == null) ? 0 : x2.hashCode());
		result = prime * result + ((y1 == null) ? 0 : y1.hashCode());
		result = prime * result + ((y2 == null) ? 0 : y2.hashCode());
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
		DistanciaDTO other = (DistanciaDTO) obj;
		if (x1 == null) {
			if (other.x1 != null)
				return false;
		} else if (!x1.equals(other.x1))
			return false;
		if (x2 == null) {
			if (other.x2 != null)
				return false;
		} else if (!x2.equals(other.x2))
			return false;
		if (y1 == null) {
			if (other.y1 != null)
				return false;
		} else if (!y1.equals(other.y1))
			return false;
		if (y2 == null) {
			if (other.y2 != null)
				return false;
		} else if (!y2.equals(other.y2))
			return false;
		return true;
	}
	
}
