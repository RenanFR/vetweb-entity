package com.vetweb.model;
//@author renan.rodrigues@metasix.com.br

import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name = "colaboradores")
public class Colaborador extends Pessoa {
	
	private static final long serialVersionUID = 1L;
	
	private String cargo;
	
    private double salario;

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
    
}
