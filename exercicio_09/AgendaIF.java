package exercicio_09;
import java.util.*;

/**
 * Interface utilizada para CRUD de uma agenda
 * @author Wennio
 *
 */
public interface AgendaIF {
	
	/**
	 * M�todo que adiciona um Contato.
	 * 
	 * @param nome recebe uma string com o nome do contato
	 * @param tel recebe uma string com o numero do contato
	 */
	public void adicionarContato(String nome, String tel)throws ContatoExistenteException; 
	
	/**
	 * M�todo que remove um Contato.
	 * 
	 * @param string com o nome do contato a ser pesquisado pra da� ser removido
	 * @throws ContatoInexistenteException
	 */
	public void removerContato(String nomeContato) throws ContatoInexistenteException;
	
	/**
	 * M�todo pesquisa um Contato atrav�s de uma chave de busca passada como par�metro
	 * 
	 * @param nomeContato - string com o nome do contato a ser pesquisado
	 * @return Retorna o contato encontrado
	 * @throws ContatoInexistenteException
	 */
	public Contato pesquisarContato(String nomeContato) throws ContatoInexistenteException;
	
	/**
	 * M�todo que retorna uma cole��o de contatos
	 */
	public Collection<Contato> getContatos();
	
	/**
	 * M�todo que retorna um Iterator de contatos ordenados
	 */
	@SuppressWarnings("rawtypes")
	public Iterator getContatosOrdenados();
}
