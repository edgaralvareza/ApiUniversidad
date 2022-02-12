package com.ibm.proyectos.universidad.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Embeddable
public class Direccion implements Serializable 
{
	private String calle;
	private String numero;
	private String codigoPostal;
	private String departamento;
	private String piso;
	private String localidad;
	
	





	public Direccion(String calle, String numero, String codigoPostal, String departamento, String piso,
			String localidad) {
		
		this.calle = calle;
		this.numero = numero;
		this.codigoPostal = codigoPostal;
		this.departamento = departamento;
		this.piso = piso;
		this.localidad = localidad;
	}







	public Direccion() {
		
	}







	private static final long serialVersionUID = -2980510590208089582L;

}
