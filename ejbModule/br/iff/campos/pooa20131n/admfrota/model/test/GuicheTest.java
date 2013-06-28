package br.iff.campos.pooa20131n.admfrota.model.test;

import static org.junit.Assert.assertEquals;


import java.util.List;


import org.junit.Test;

import br.iff.campos.pooa20131n.admfrota.model.controller.GuicheControllerJPA;
import br.iff.campos.pooa20131n.admfrota.model.entity.Guiche;

public class GuicheTest {

	private GuicheControllerJPA pguiche= new GuicheControllerJPA();
	
	
	@Test
	public void testInsert() {
		Guiche guiche = pguiche.insert("codguiche", "cpf", "nome");
		assertEquals(guiche.getCodguiche(), "codguiche");
		
		
	}	
	
	@Test
	public void testUpdate() {
		Guiche guiche = pguiche.update("codguiche", "cpfUPDATE", "nome");
		assertEquals(guiche.getCpf(), "cpfUPDATE");
	}

	@Test
	public void testFind() {
		Guiche guiche = pguiche.find("codguiche");
		assertEquals(guiche.getNome(), "nome");
	}
	
	@Test
	public void testFindAll() {
		List<Guiche> lprpop = pguiche.findAll();
		for (Guiche guiche : lprpop){
			assertEquals(guiche.getNome(), "nome");
		}
		
	}

	@Test
	public void testDelete() {
		pguiche.delete("codguiche");

	}
	



}
