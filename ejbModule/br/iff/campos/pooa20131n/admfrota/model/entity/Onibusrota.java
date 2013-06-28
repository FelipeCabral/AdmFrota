package br.iff.campos.pooa20131n.admfrota.model.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the onibusrota database table.
 * 
 */
@Entity
public class Onibusrota implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String codonibusrota;

	//bi-directional many-to-one association to Onibus
	@ManyToOne
	@JoinColumn(name="codonibus")
	private Onibus onibus;

	//bi-directional many-to-one association to Rota
	@ManyToOne
	@JoinColumn(name="codrota")
	private Rota rota;

	public Onibusrota() {
	}

	public String getCodonibusrota() {
		return this.codonibusrota;
	}

	public void setCodonibusrota(String codonibusrota) {
		this.codonibusrota = codonibusrota;
	}

	public Onibus getOnibus() {
		return this.onibus;
	}

	public void setOnibus(Onibus onibus) {
		this.onibus = onibus;
	}

	public Rota getRota() {
		return this.rota;
	}

	public void setRota(Rota rota) {
		this.rota = rota;
	}

}