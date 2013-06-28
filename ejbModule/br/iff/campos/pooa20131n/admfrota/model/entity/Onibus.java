package br.iff.campos.pooa20131n.admfrota.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the onibus database table.
 * 
 */
@Entity
public class Onibus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String codonibus;

	private String numeroplaca;

	private String quantlugares;

	private String quantmalas;

	//bi-directional many-to-one association to Encomendasonibus
	@OneToMany(mappedBy="onibus")
	private List<Encomendasonibus> encomendasonibuses;

	//bi-directional many-to-one association to Onibusrota
	@OneToMany(mappedBy="onibus")
	private List<Onibusrota> onibusrotas;

	public Onibus() {
	}

	public String getCodonibus() {
		return this.codonibus;
	}

	public void setCodonibus(String codonibus) {
		this.codonibus = codonibus;
	}

	public String getNumeroplaca() {
		return this.numeroplaca;
	}

	public void setNumeroplaca(String numeroplaca) {
		this.numeroplaca = numeroplaca;
	}

	public String getQuantlugares() {
		return this.quantlugares;
	}

	public void setQuantlugares(String quantlugares) {
		this.quantlugares = quantlugares;
	}

	public String getQuantmalas() {
		return this.quantmalas;
	}

	public void setQuantmalas(String quantmalas) {
		this.quantmalas = quantmalas;
	}

	public List<Encomendasonibus> getEncomendasonibuses() {
		return this.encomendasonibuses;
	}

	public void setEncomendasonibuses(List<Encomendasonibus> encomendasonibuses) {
		this.encomendasonibuses = encomendasonibuses;
	}

	public Encomendasonibus addEncomendasonibus(Encomendasonibus encomendasonibus) {
		getEncomendasonibuses().add(encomendasonibus);
		encomendasonibus.setOnibus(this);

		return encomendasonibus;
	}

	public Encomendasonibus removeEncomendasonibus(Encomendasonibus encomendasonibus) {
		getEncomendasonibuses().remove(encomendasonibus);
		encomendasonibus.setOnibus(null);

		return encomendasonibus;
	}

	public List<Onibusrota> getOnibusrotas() {
		return this.onibusrotas;
	}

	public void setOnibusrotas(List<Onibusrota> onibusrotas) {
		this.onibusrotas = onibusrotas;
	}

	public Onibusrota addOnibusrota(Onibusrota onibusrota) {
		getOnibusrotas().add(onibusrota);
		onibusrota.setOnibus(this);

		return onibusrota;
	}

	public Onibusrota removeOnibusrota(Onibusrota onibusrota) {
		getOnibusrotas().remove(onibusrota);
		onibusrota.setOnibus(null);

		return onibusrota;
	}

}