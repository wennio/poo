package exercicio_09;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class TestaAgendaMap {
	
				
		@Test
		public void AgendaMapTest() {
			AgendaMap agenda = new AgendaMap();
		
			try{
				agenda.adicionarContato("kelson", "88858450");
			}catch (ContatoExistenteException exc){
				fail("O contato kelson não foi adicinado.");
			}
		
			try{
				assertEquals(agenda.pesquisarContato("kelson").getNome(), "kelson");
			} catch  (ContatoInexistenteException exc){
				fail("O contato kelson não foi encontrado.");
			}
		
			
			try{
				agenda.removerContato("kelson");
			} catch (ContatoInexistenteException excecao1){
				fail("O contato kelson não foi encontrado para ser removido.");
			
			}
			
			try{
				assertEquals(agenda.pesquisarContato("kelson").getNome(), "kelson");
				fail("Removeu um contato que não existe.");
			} catch  (ContatoInexistenteException excecao){
					
			}
			
			try{
				agenda.adicionarContato("kelson", "888584501");
				agenda.adicionarContato("vera", "88980922");
			} catch (ContatoExistenteException excecao){
				fail("Erro ao adicionar os contatos vera e kelson");
			}
			
			Iterator <Contato> contOrdenados = agenda.getContatosOrdenados();
			assertTrue(contOrdenados.hasNext());
			
			
			Contato cont1 = contOrdenados.next();
			assertEquals("vera", cont1.getNome());
				
			assertTrue(contOrdenados.hasNext());
			Contato cont2 = contOrdenados.next();
			assertEquals("kelson", cont2.getNome());
		}
}
