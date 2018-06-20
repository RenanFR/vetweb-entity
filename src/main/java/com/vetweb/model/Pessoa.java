package com.vetweb.model;
 // @author 11151504898

import java.time.LocalDate;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.br.CPF;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "pessoas")
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa implements Serializable {
	
	private static final long serialVersionUID = 6060276588160861739L;
	
    public enum TipoPessoa { FISICA, JURIDICA }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pessoaId;
    
    @NotBlank
    private String nome;
    
    @NotBlank
    private String rg;
    
    @NotBlank @CPF
    private String cpf;
    
    private char sexo;
    
    private TipoPessoa tipoPessoa;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate inclusao;
    
    private String nacionalidade;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate nascimento; 
    
    private Endereco endereco;
    
    private Contato contato;

	public Pessoa() {
        this.inclusao = LocalDate.now();
    }

    public Pessoa(Long pessoaId, String nome, String rg, String cpf, char sexo, TipoPessoa tipoPessoa, LocalDate inclusao, String nacionalidade, LocalDate nascimento, Endereco endereco, Contato contato) {
        this.pessoaId = pessoaId;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.sexo = sexo;
        this.tipoPessoa = tipoPessoa;
        this.inclusao = inclusao;
        this.nacionalidade = nacionalidade;
        this.nascimento = nascimento;
        this.endereco = endereco;
        this.contato = contato;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
    public LocalDate getInclusao() {
        return inclusao;
    }

    public void setInclusao(LocalDate inclusao) {
        this.inclusao = inclusao;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public Long getPessoaId() {
        return pessoaId;
    }

    public void setPessoaId(Long pessoaId) {
        this.pessoaId = pessoaId;
    }
    
    @Override
    public String toString() {
        return nome;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pessoaId == null) ? 0 : pessoaId.hashCode());
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
		Pessoa other = (Pessoa) obj;
		if (pessoaId == null) {
			if (other.pessoaId != null)
				return false;
		} else if (!pessoaId.equals(other.pessoaId))
			return false;
		return true;
	}    
    
}
