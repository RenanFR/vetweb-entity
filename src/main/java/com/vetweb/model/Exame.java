package com.vetweb.model;
 //@author renanrodrigues
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "exames")
public class Exame implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long exameId;
	
	private StringBuilder apresentacao;
	
	private StringBuilder encerramento;

	public Long getExameId() {
		return exameId;
	}

	public void setExameId(Long exameId) {
		this.exameId = exameId;
	}

	public StringBuilder getApresentacao() {
		return apresentacao;
	}

	public void setApresentacao(StringBuilder apresentacao) {
		this.apresentacao = apresentacao;
	}

	public StringBuilder getEncerramento() {
		return encerramento;
	}

	public void setEncerramento(StringBuilder encerramento) {
		this.encerramento = encerramento;
	}
	
}
