package br.iff.campos.pooa20131n.admfrota.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the motorista database table.
 * 
 */
@Entity
public class Motorista implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String codmotorista;

	private String cpf;

	private String endereco;

	private String nome;

	private String numeromatricula;

	//bi-directional many-to-one association to Motoristarota
	@OneToMany(mappedBy="motorista")
	private List<Motoristarota> motoristarotas;

	public Motorista() {
	}

	public String getCodmotorista() {
		return this.codmotorista;
	}

	public void setCodmotorista(String codmotorista) {
		this.codmotorista = codmotorista;
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

	public String getNumeromatricula() {
		return this.numeromatricula;
	}

	public void setNumeromatricula(String numeromatricula) {
		this.numeromatricula = numeromatricula;
	}

	public List<Motoristarota> getMotoristarotas() {
		return this.motoristarotas;
	}

	public void setMotoristarotas(List<Motoristarota> motoristarotas) {
		this.motoristarotas = motoristarotas;
	}

	public Motoristarota addMotoristarota(Motoristarota motoristarota) {
		getMotoristarotas().add(motoristarota);
		motoristarota.setMotorista(this);

		return motoristarota;
	}

	public Motoristarota removeMotoristarota(Motoristarota motoristarota) {
		getMotoristarotas().remove(motoristarota);
		motoristarota.setMotorista(null);

		return motoristarota;
	}

}