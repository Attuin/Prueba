package org.persistence;

import javax.persistence.*;

@Entity
@Table(name = "TIENDA")
public class Tienda {

	@Id
	private long id_tiend;
	@Basic
	private String nombre;
	public long getId_tiend() {
		return id_tiend;
	}

	public void setId_tiend(long id) {
		this.id_tiend = id;
	}

	public void setNombre(String param) {
		this.nombre = param;
	}

	public String getNombre() {
		return nombre;
	}

}