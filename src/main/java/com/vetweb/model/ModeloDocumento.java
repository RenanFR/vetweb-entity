package com.vetweb.model;
 //@author renanrodrigues

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "modelosDocumento")
public class ModeloDocumento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String nome;
	
	private boolean infoCliente;
    
    private StringBuilder modelo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isInfoCliente() {
		return infoCliente;
	}

	public void setInfoCliente(boolean infoCliente) {
		this.infoCliente = infoCliente;
	}

	public StringBuilder getModelo() {
		return modelo;
	}

	public void setModelo(StringBuilder modelo) {
		this.modelo = modelo;
	}
}
