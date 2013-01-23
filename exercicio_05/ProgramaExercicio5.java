package exercicio_05;

public class ProgramaExercicio5 {

	public static void main(String[] args) {
		Agenda a1 = new Agenda();
		
		a1.adicionarContato("kelson", "88858450");
		
		try {
			a1.pesquisarContato("kelson");
			System.out.println("Contato 1 existente!");
		} catch (ContatoInexistenteException e) {
			System.out.println(e);
		}
		
		try {
			a1.pesquisarContato("Ze ninguem");
			System.out.println("Contato 2 existente!");
		} catch (ContatoInexistenteException e) {
			System.out.println(e);
		}
		
	}

}
