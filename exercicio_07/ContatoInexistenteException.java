package exercicio_07;
@SuppressWarnings("serial")
public class ContatoInexistenteException extends Exception {
	
	public ContatoInexistenteException(){
		this("Contato Inexistete.");
	}
	public ContatoInexistenteException(String m){
		super (m);
	}
}
