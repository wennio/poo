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
	 * M�todo que calcula a quantidade de pedidos de um determinado cliente
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
	 * M�todo adiciona um Pedido p
	 */
	public void adicionaPedido(Pedido p){
		pedidos.add(p);
	}
	
	/**
	 * M�todo remove um Pedido de acordo com o numero do pedido passado como par�metro
	 */
	public void removePedido(long numPedido){
		for(Pedido p : pedidos){
			if(p.getNumeroDoPedido() == numPedido){
				pedidos.remove(p);
			}
		}
	}
	
	/**
	 * M�todo pesquisa pedidos e retorna um Array de pedidos que possuam um c�digo de produto iqual ao passado no par�metro
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
	 * M�todo get que retorna o Array de Pedido 
	 * @return
	 */
	public ArrayList<Pedido>  getPedidos(){
		return pedidos;
	}
	
}
	
	
	