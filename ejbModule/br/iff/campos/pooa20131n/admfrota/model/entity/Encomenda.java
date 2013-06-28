package br.iff.campos.pooa20131n.admfrota.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the encomendas database table.
 * 
 */
@Entity
@Table(name="encomendas")
public class Encomenda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String codencomenda;

	private String cpfdestinatario;

	private String destinatario;

	private String destino;

	private String identidadedestinatario;

	private String origem;

	private String remetente;

	//bi-directional many-to-one association to Encomendasonibus
	@OneToMany(mappedBy="encomenda")
	private List<Encomendasonibus> encomendasonibuses;

	public Encomenda() {
	}

	public String getCodencomenda() {
		return this.codencomenda;
	}

	public void setCodencomenda(String codencomenda) {
		this.codencomenda = codencomenda;
	}

	public String getCpfdestinatario() {
		return this.cpfdestinatario;
	}

	public void setCpfdestinatario(String cpfdestinatario) {
		this.cpfdestinatario = cpfdestinatario;
	}

	public String getDestinatario() {
		return this.destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getDestino() {
		return this.destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getIdentidadedestinatario() {
		return this.identidadedestinatario;
	}

	public void setIdentidadedestinatario(String identidadedestinatario) {
		this.identidadedestinatario = identidadedestinatario;
	}

	public String getOrigem() {
		return this.origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getRemetente() {
		return this.remetente;
	}

	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}

	public List<Encomendasonibus> getEncomendasonibuses() {
		return this.encomendasonibuses;
	}

	public void setEncomendasonibuses(List<Encomendasonibus> encomendasonibuses) {
		this.encomendasonibuses = encomendasonibuses;
	}

	public Encomendasonibus addEncomendasonibus(Encomendasonibus encomendasonibus) {
		getEncomendasonibuses().add(encomendasonibus);
		encomendasonibus.setEncomenda(this);

		return encomendasonibus;
	}

	public Encomendasonibus removeEncomendasonibus(Encomendasonibus encomendasonibus) {
		getEncomendasonibuses().remove(encomendasonibus);
		encomendasonibus.setEncomenda(null);

		return encomendasonibus;
	}

}