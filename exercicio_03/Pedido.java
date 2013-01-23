package exercicio_03;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Pedido implements Serializable{

	private long numeroDoPedido;
	private Cliente cliente;
	private ArrayList<ItemDePedido> itens;
	
	public Pedido(long numeroDoPedido){
		itens = new ArrayList<>();
		setNumeroDoPedido(numeroDoPedido);
	}
	
	public void adicionaItem(ItemDePedido item){
		itens.add(item);
	}
	
	public long getNumeroDoPedido(){
		return numeroDoPedido;
	}
	
	public void setNumeroDoPedido(long numeroDoPedido){
		this.numeroDoPedido = numeroDoPedido;
	}
	
	public Cliente getCliente(){
		return cliente;
	}
	
	public void setCliente(Cliente cliente){
		this.cliente = cliente;
	}
	
	public ArrayList<ItemDePedido> getItens() {
		return itens;
	}
}
	
	