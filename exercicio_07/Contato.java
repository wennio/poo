package exercicio_07;
import java.io.Serializable;
@SuppressWarnings("serial")
public class Contato implements Serializable {

	private String nome, telefone;
	
	public Contato(){
		this("","");
	}
	
	public Contato(String n, String t){
		this.nome = n;
		this.telefone = t;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
