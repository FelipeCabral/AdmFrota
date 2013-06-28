package br.iff.campos.pooa20131n.admfrota.model.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the encomendasonibus database table.
 * 
 */
@Entity
public class Encomendasonibus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String codencomendasonibus;

	//bi-directional many-to-one association to Encomenda
	@ManyToOne
	@JoinColumn(name="codencomendas")
	private Encomenda encomenda;

	//bi-directional many-to-one association to Onibus
	@ManyToOne
	@JoinColumn(name="codonibus")
	private Onibus onibus;

	public Encomendasonibus() {
	}

	public String getCodencomendasonibus() {
		return this.codencomendasonibus;
	}

	public void setCodencomendasonibus(String codencomendasonibus) {
		this.codencomendasonibus = codencomendasonibus;
	}

	public Encomenda getEncomenda() {
		return this.encomenda;
	}

	public void setEncomenda(Encomenda encomenda) {
		this.encomenda = encomenda;
	}

	public Onibus getOnibus() {
		return this.onibus;
	}

	public void setOnibus(Onibus onibus) {
		this.onibus = onibus;
	}

}