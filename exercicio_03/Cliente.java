package exercicio_03;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Cliente implements Serializable{

	private String nome;
	
	public Cliente(String nome){
		setNome(nome);
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
}