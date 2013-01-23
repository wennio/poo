package exercicio_08;

import java.util.*;

public class Agenda implements AgendaIF{
	
	private List<Contato> contatos;
	
	public Agenda(){
		this.contatos = new ArrayList<Contato>();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Agenda(ArrayList lista){
		this.contatos = lista;
	}
	
	public void adicionarContato(String nome, String tel) throws ContatoExistenteException{
		for(Contato cont: this.contatos){
			if(cont.getNome().equals(nome)){
				throw new ContatoExistenteException("Contato Existente.");
			}
		}
		this.contatos.add(new Contato(nome,tel));
	}
	
	public void removerContato(String nomeContato) throws ContatoInexistenteException{
		for (Contato aux : this.contatos ){
			if(aux.getNome().equals(nomeContato)){
				this.contatos.remove(aux);
				break;
			}
		}
		throw new ContatoInexistenteException ("Contato n�o encontrado.");	
	}
	
	public Contato pesquisarContato(String nomeContato) throws ContatoInexistenteException{
		for (Contato aux : this.contatos ){
			if(aux.getNome().equals(nomeContato)){
				return aux;
			}
		}
		throw new ContatoInexistenteException ("Contato n�o encontrado.");
	}
	public Collection<Contato> getContatos(){
		return this.contatos;
	}
	
	@SuppressWarnings("rawtypes")
	public Iterator getContatosOrdenados(){
		Collections.sort(this.contatos);
		return this.contatos.iterator();
	}
	
}
		