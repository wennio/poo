package exercicio_05;

@SuppressWarnings("serial")
public class ContatoInexistenteException extends Exception{
	public String toString(){
		return "Contato n�o cadastrado!";
	}
}
