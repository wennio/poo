package exercicio_07;
@SuppressWarnings("serial")
public class ContatoExistenteException extends Exception {
	
		public ContatoExistenteException(){
			this("O Contato Já Existete.");
		}
		public ContatoExistenteException(String m){
			super (m);
		}
}
