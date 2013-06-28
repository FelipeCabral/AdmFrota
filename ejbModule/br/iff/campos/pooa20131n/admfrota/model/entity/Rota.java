package br.iff.campos.pooa20131n.admfrota.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the rota database table.
 * 
 */
@Entity
public class Rota implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String codrota;

	private String destino;

	private String horariochegada;

	private String horariosaida;

	private String origem;

	//bi-directional many-to-one association to Motoristarota
	@OneToMany(mappedBy="rota")
	private List<Motoristarota> motoristarotas;

	//bi-directional many-to-one association to Onibusrota
	@OneToMany(mappedBy="rota")
	private List<Onibusrota> onibusrotas;

	//bi-directional many-to-one association to Passageirorota
	@OneToMany(mappedBy="rota")
	private List<Passageirorota> passageirorotas;

	public Rota() {
	}

	public String getCodrota() {
		return this.codrota;
	}

	public void setCodrota(String codrota) {
		this.codrota = codrota;
	}

	public String getDestino() {
		return this.destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getHorariochegada() {
		return this.horariochegada;
	}

	public void setHorariochegada(String horariochegada) {
		this.horariochegada = horariochegada;
	}

	public String getHorariosaida() {
		return this.horariosaida;
	}

	public void setHorariosaida(String horariosaida) {
		this.horariosaida = horariosaida;
	}

	public String getOrigem() {
		return this.origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public List<Motoristarota> getMotoristarotas() {
		return this.motoristarotas;
	}

	public void setMotoristarotas(List<Motoristarota> motoristarotas) {
		this.motoristarotas = motoristarotas;
	}

	public Motoristarota addMotoristarota(Motoristarota motoristarota) {
		getMotoristarotas().add(motoristarota);
		motoristarota.setRota(this);

		return motoristarota;
	}

	public Motoristarota removeMotoristarota(Motoristarota motoristarota) {
		getMotoristarotas().remove(motoristarota);
		motoristarota.setRota(null);

		return motoristarota;
	}

	public List<Onibusrota> getOnibusrotas() {
		return this.onibusrotas;
	}

	public void setOnibusrotas(List<Onibusrota> onibusrotas) {
		this.onibusrotas = onibusrotas;
	}

	public Onibusrota addOnibusrota(Onibusrota onibusrota) {
		getOnibusrotas().add(onibusrota);
		onibusrota.setRota(this);

		return onibusrota;
	}

	public Onibusrota removeOnibusrota(Onibusrota onibusrota) {
		getOnibusrotas().remove(onibusrota);
		onibusrota.setRota(null);

		return onibusrota;
	}

	public List<Passageirorota> getPassageirorotas() {
		return this.passageirorotas;
	}

	public void setPassageirorotas(List<Passageirorota> passageirorotas) {
		this.passageirorotas = passageirorotas;
	}

	public Passageirorota addPassageirorota(Passageirorota passageirorota) {
		getPassageirorotas().add(passageirorota);
		passageirorota.setRota(this);

		return passageirorota;
	}

	public Passageirorota removePassageirorota(Passageirorota passageirorota) {
		getPassageirorotas().remove(passageirorota);
		passageirorota.setRota(null);

		return passageirorota;
	}

}