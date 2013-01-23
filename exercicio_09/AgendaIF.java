package exercicio_09;
import java.util.*;

/**
 * Interface utilizada para CRUD de uma agenda
 * @author Wennio
 *
 */
public interface AgendaIF {
	
	/**
	 * Método que adiciona um Contato.
	 * 
	 * @param nome recebe uma string com o nome do contato
	 * @param tel recebe uma string com o numero do contato
	 */
	public void adicionarContato(String nome, String tel)throws ContatoExistenteException; 
	
	/**
	 * Método que remove um Contato.
	 * 
	 * @param string com o nome do contato a ser pesquisado pra daí ser removido
	 * @throws ContatoInexistenteException
	 */
	public void removerContato(String nomeContato) throws ContatoInexistenteException;
	
	/**
	 * Método pesquisa um Contato através de uma chave de busca passada como parâmetro
	 * 
	 * @param nomeContato - string com o nome do contato a ser pesquisado
	 * @return Retorna o contato encontrado
	 * @throws ContatoInexistenteException
	 */
	public Contato pesquisarContato(String nomeContato) throws ContatoInexistenteException;
	
	/**
	 * Método que retorna uma coleção de contatos
	 */
	public Collection<Contato> getContatos();
	
	/**
	 * Método que retorna um Iterator de contatos ordenados
	 */
	@SuppressWarnings("rawtypes")
	public Iterator getContatosOrdenados();
}
