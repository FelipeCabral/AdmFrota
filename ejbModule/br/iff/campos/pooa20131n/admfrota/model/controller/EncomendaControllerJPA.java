package br.iff.campos.pooa20131n.admfrota.model.controller;

import java.util.List;

import br.iff.campos.pooa20131n.admfrota.model.entity.Encomenda;

public class EncomendaControllerJPA extends AbstractPersistence{
	
	public Encomenda insert(String codencomenda, String origem, String destino ,String remetente ,String destinatario, String cpfdestinatario, String identidadedestinatario)
	{
		Encomenda encomenda = new Encomenda();
		encomenda.setCodencomenda(codencomenda);
		encomenda.setCpfdestinatario(cpfdestinatario);
		encomenda.setDestinatario(destinatario);
		encomenda.setDestino(destino);
		encomenda.setIdentidadedestinatario(identidadedestinatario);
		encomenda.setOrigem(origem);
		encomenda.setRemetente(remetente);
		super.insert(encomenda);
		
		return encomenda;
	}

	public Encomenda update(String codencomenda, String origem, String destino ,String remetente ,String destinatario, String cpfdestinatario, String identidadedestinatario)
	{
		
		Encomenda encomenda = find(codencomenda);
		
		encomenda.setCodencomenda(codencomenda);
		encomenda.setCpfdestinatario(cpfdestinatario);
		encomenda.setDestinatario(destinatario);
		encomenda.setDestino(destino);
		encomenda.setIdentidadedestinatario(identidadedestinatario);
		encomenda.setOrigem(origem);
		encomenda.setRemetente(remetente);
		super.insert(encomenda);
		
		return encomenda;
		
	}
	
	public Encomenda find(String codencomenda){
		return super.find(Encomenda.class, codencomenda);
	}
	
	public void delete(String codencomenda){
		super.delete(Encomenda.class, codencomenda);
	}
	
	public List<Encomenda> getLista(){
		return super.findAll(Encomenda.class);
	}
	public List<Encomenda> findAll(){
		return super.findAll(Encomenda.class);
	}
	
	
}
