package exercicio_03;

import java.util.ArrayList;

public class ControleDePedidos implements InterfaceSistemaDeControle{

	private ArrayList<Pedido> pedidos;
	
	public ControleDePedidos(){
		pedidos = new ArrayList<Pedido>();
	}
	
	public int calculaQuantidadeDePedidosDoCliente(String nomeDoCliente){
		int cont = 0;
		for(Pedido p : pedidos){
			if(p.getCliente().getNome().equals(nomeDoCliente)){
				cont ++;
			}
		}
		return cont;
	}
		
	public void adicionaPedido(Pedido p){
		pedidos.add(p);
	}
	
	public void removePedido(long numPedido){
		for(Pedido p : pedidos){
			if(p.getNumeroDoPedido() == numPedido){
				pedidos.remove(p);
			}
		}
	}
	
	public ArrayList<Pedido> pesquisaPedidosIncluindoProduto(long codProduto){
		ArrayList<Pedido> retorno = new ArrayList<>();
		for(Pedido p : pedidos){
			for(ItemDePedido i : p.getItens()){
				if(i.getCodProduto() == codProduto){
					retorno.add(p);
				}
			}
		}
		return retorno;
	}
	
	public ArrayList<Pedido>  getPedidos(){
		return pedidos;
	}
	
}
	
	
	