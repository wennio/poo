package exercicio_05;

public class Contato {
	private String nome;
	private String tel;
	
	public Contato(String nome, String tel) {
		setNome(nome);
		setTel(tel);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	
}
