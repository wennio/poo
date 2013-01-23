package exercicio_06.br.ufpb.sistemapedidos;

import java.util.ArrayList;

/**
 * Classe que implements a interface InterfaceSistemaDeControle
 * @author Wennio
 *
 */
public class ControleDePedidos implements InterfaceSistemaDeControle{

	private ArrayList<Pedido> pedidos;
	
	/**
	 * Construtor instanciando um Array de Pedido
	 */
	public ControleDePedidos(){
		pedidos = new ArrayList<Pedido>();
	}
	
	/**
	 * Método que calcula a quantidade de pedidos de um determinado cliente
	 * @param nomeDoCliente
	 * @return um int com a quantidade de pedidos de um determinado cliente
	 */
	public int calculaQuantidadeDePedidosDoCliente(String nomeDoCliente){
		int cont = 0;
		for(Pedido p : pedidos){
			if(p.getCliente().getNome().equals(nomeDoCliente)){
				cont ++;
			}
		}
		return cont;
	}
	
	/**
	 * Método adiciona um Pedido p
	 */
	public void adicionaPedido(Pedido p){
		pedidos.add(p);
	}
	
	/**
	 * Método remove um Pedido de acordo com o numero do pedido passado como parâmetro
	 */
	public void removePedido(long numPedido){
		for(Pedido p : pedidos){
			if(p.getNumeroDoPedido() == numPedido){
				pedidos.remove(p);
			}
		}
	}
	
	/**
	 * Método pesquisa pedidos e retorna um Array de pedidos que possuam um código de produto iqual ao passado no parâmetro
	 */
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
	
	/**
	 * Método get que retorna o Array de Pedido 
	 * @return
	 */
	public ArrayList<Pedido>  getPedidos(){
		return pedidos;
	}
	
}
	
	
	