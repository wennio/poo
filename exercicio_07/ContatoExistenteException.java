package exercicio_07;
@SuppressWarnings("serial")
public class ContatoExistenteException extends Exception {
	
		public ContatoExistenteException(){
			this("O Contato J� Existete.");
		}
		public ContatoExistenteException(String m){
			super (m);
		}
}
