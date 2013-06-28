package br.iff.campos.pooa20131n.admfrota.model.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the guiche database table.
 * 
 */
@Entity
public class Guiche implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String codguiche;

	private String cpf;

	private String nome;

	public Guiche() {
	}

	public String getCodguiche() {
		return this.codguiche;
	}

	public void setCodguiche(String codguiche) {
		this.codguiche = codguiche;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}