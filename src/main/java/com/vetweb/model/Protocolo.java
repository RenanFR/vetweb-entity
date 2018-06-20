package com.vetweb.model;
 //@author renanrodrigues

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Protocolo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String nome;
	
	private String especie;
	
	private Integer aplicacao;
	
	private Integer intervalo;
	
	private Vacina vemApos;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public Integer getAplicacao() {
		return aplicacao;
	}
	
	public void setAplicacao(Integer aplicacao) {
		this.aplicacao = aplicacao;
	}
	public Integer getIntervalo() {
		return intervalo;
	}
	
	public void setIntervalo(Integer intervalo) {
		this.intervalo = intervalo;
	}
	
	public Vacina getVemApos() {
		return vemApos;
	}
	
	public void setVemApos(Vacina vemApos) {
		this.vemApos = vemApos;
	}
	
}
