package br.iff.campos.pooa20131n.admfrota.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the passageiro database table.
 * 
 */
@Entity
public class Passageiro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String codpassageiro;

	private String cpf;

	private String endereco;

	private String nome;

	private String numerocadeira;

	//bi-directional many-to-one association to Passageirorota
	@OneToMany(mappedBy="passageiro")
	private List<Passageirorota> passageirorotas;

	public Passageiro() {
	}

	public String getCodpassageiro() {
		return this.codpassageiro;
	}

	public void setCodpassageiro(String codpassageiro) {
		this.codpassageiro = codpassageiro;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumerocadeira() {
		return this.numerocadeira;
	}

	public void setNumerocadeira(String numerocadeira) {
		this.numerocadeira = numerocadeira;
	}

	public List<Passageirorota> getPassageirorotas() {
		return this.passageirorotas;
	}

	public void setPassageirorotas(List<Passageirorota> passageirorotas) {
		this.passageirorotas = passageirorotas;
	}

	public Passageirorota addPassageirorota(Passageirorota passageirorota) {
		getPassageirorotas().add(passageirorota);
		passageirorota.setPassageiro(this);

		return passageirorota;
	}

	public Passageirorota removePassageirorota(Passageirorota passageirorota) {
		getPassageirorotas().remove(passageirorota);
		passageirorota.setPassageiro(null);

		return passageirorota;
	}

}