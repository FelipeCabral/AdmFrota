package br.iff.campos.pooa20131n.admfrota.model.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the motoristarota database table.
 * 
 */
@Entity
public class Motoristarota implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String codmotoristarota;

	//bi-directional many-to-one association to Motorista
	@ManyToOne
	@JoinColumn(name="codmotorista")
	private Motorista motorista;

	//bi-directional many-to-one association to Rota
	@ManyToOne
	@JoinColumn(name="codrota")
	private Rota rota;

	public Motoristarota() {
	}

	public String getCodmotoristarota() {
		return this.codmotoristarota;
	}

	public void setCodmotoristarota(String codmotoristarota) {
		this.codmotoristarota = codmotoristarota;
	}

	public Motorista getMotorista() {
		return this.motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	public Rota getRota() {
		return this.rota;
	}

	public void setRota(Rota rota) {
		this.rota = rota;
	}

}