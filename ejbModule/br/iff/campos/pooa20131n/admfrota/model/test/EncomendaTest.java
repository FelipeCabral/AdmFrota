package br.iff.campos.pooa20131n.admfrota.model.test;


import static org.junit.Assert.assertEquals;


import java.util.List;


import org.junit.Test;

import br.iff.campos.pooa20131n.admfrota.model.controller.EncomendaControllerJPA;
import br.iff.campos.pooa20131n.admfrota.model.entity.Encomenda;



public class EncomendaTest {
	
	private EncomendaControllerJPA pencomenda= new EncomendaControllerJPA();
	
	
	@Test
	public void testInsert() {
		Encomenda encomenda = pencomenda.insert("codencomenda","origem", "destino" ,"remetente" ,"destinatario", "cpfdestinat", "identidad");
		assertEquals(encomenda.getCodencomenda(), "codencomenda");
	}
	
	@Test
	public void testUpdate() {
		Encomenda encomenda = pencomenda.update("codencomenda","origem", "destino" ,"remetente" ,"destinatario",
				"cpfUPDATE", "identid" );
		assertEquals(encomenda.getCpfdestinatario(), "cpfUPDATE");
	}

	@Test
	public void testFind() {
		Encomenda encomenda = pencomenda.find("codencomenda");
		assertEquals(encomenda.getDestinatario(), "destinatario");
	}
	
	@Test
	public void testFindAll() {
		List<Encomenda> lprpop = pencomenda.findAll();
		for (Encomenda encomenda : lprpop){
			assertEquals(encomenda.getDestinatario(), "destinatario");
		}
		
	}
	
	@Test
	public void testDelete() {
		pencomenda.delete("codencomenda");

	}

	

}
