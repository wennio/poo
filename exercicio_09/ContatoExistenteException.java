package exercicio_09;
@SuppressWarnings("serial")
public class ContatoExistenteException extends Exception {
	
		public ContatoExistenteException(){
			this("O Contato Já Existe.");
		}
		public ContatoExistenteException(String m){
			super (m);
		}
}
