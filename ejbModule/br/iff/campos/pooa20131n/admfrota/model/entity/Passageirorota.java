package br.iff.campos.pooa20131n.admfrota.model.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the passageirorota database table.
 * 
 */
@Entity
public class Passageirorota implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String codpassageirorota;

	//bi-directional many-to-one association to Passageiro
	@ManyToOne
	@JoinColumn(name="codpassageiro")
	private Passageiro passageiro;

	//bi-directional many-to-one association to Rota
	@ManyToOne
	@JoinColumn(name="codrota")
	private Rota rota;

	public Passageirorota() {
	}

	public String getCodpassageirorota() {
		return this.codpassageirorota;
	}

	public void setCodpassageirorota(String codpassageirorota) {
		this.codpassageirorota = codpassageirorota;
	}

	public Passageiro getPassageiro() {
		return this.passageiro;
	}

	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}

	public Rota getRota() {
		return this.rota;
	}

	public void setRota(Rota rota) {
		this.rota = rota;
	}

}