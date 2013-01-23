package exercicio_07;
import java.util.*;

public class AgendaMap implements AgendaIF{

	private Map<String,Contato> contatos;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public AgendaMap(){
		this.contatos = new HashMap();	
	}
	
	public AgendaMap(HashMap<String,Contato> m){
		this.contatos = m;
	}
	
	public void adicionarContato(String nome, String tel) throws ContatoExistenteException{
		if (this.contatos.containsKey(nome)){
			throw new ContatoExistenteException("Contato Existente.");
		}
		this.contatos.put(nome,new Contato(nome,tel));
	}

	
	public void removerContato(String nomeContato) throws ContatoInexistenteException {
		if(this.contatos.containsKey(nomeContato)){
				this.contatos.remove(nomeContato);
				return;
				}
		throw new ContatoInexistenteException ("Contato n�o encontrado.");	
	}
	
	public Contato pesquisarContato(String nomeContato) throws ContatoInexistenteException {
		if(this.contatos.containsKey(nomeContato)){
			return this.contatos.get(nomeContato);
		}
		throw new ContatoInexistenteException ("Contato n�o encontrado.");
	}
	
	public Collection<Contato> getContatos(){
		List<Contato> retorno = new ArrayList<Contato>();
		for(Contato aux : this.contatos.values()){
			retorno.add(aux);
		}
		return retorno;
	}
}
