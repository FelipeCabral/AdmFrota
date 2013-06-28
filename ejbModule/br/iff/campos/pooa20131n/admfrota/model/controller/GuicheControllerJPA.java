package br.iff.campos.pooa20131n.admfrota.model.controller;

import java.util.List;

import br.iff.campos.pooa20131n.admfrota.model.entity.Guiche;

public class GuicheControllerJPA extends AbstractPersistence {
	
	public Guiche insert(String codguiche, String cpf, String nome){
		Guiche guiche = new Guiche();
		guiche.setCodguiche(codguiche);
		guiche.setCpf(cpf);
		guiche.setNome(nome);
		super.insert(guiche);
		
		return guiche;
	}

	public Guiche update(String codguiche, String cpf, String nome){
		
		Guiche guiche = find(codguiche);
		
		guiche.setCodguiche(codguiche);
		guiche.setCpf(cpf);
		guiche.setNome(nome);
		super.insert(guiche);
		
		return guiche;
		
	}
	
	public Guiche find(String codguiche){
		return super.find(Guiche.class, codguiche);
	}
	
	public void delete(String codguiche){
		super.delete(Guiche.class, codguiche);
	}
	
	public List<Guiche> getLista(){
		return super.findAll(Guiche.class);
	}
	public List<Guiche> findAll(){
		return super.findAll(Guiche.class);
	}
	
	
}
