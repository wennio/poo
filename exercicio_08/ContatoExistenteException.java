package exercicio_08;

@SuppressWarnings("serial")
public class ContatoExistenteException extends Exception {
	
		public ContatoExistenteException(){
			this("O Contato J� Existe.");
		}
		public ContatoExistenteException(String m){
			super (m);
		}
}
