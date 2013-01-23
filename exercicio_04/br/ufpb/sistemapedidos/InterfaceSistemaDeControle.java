package exercicio_04.br.ufpb.sistemapedidos;

import java.util.ArrayList;

/**
 * 
 * Interface que ajuda no CRUD - create, read, update e delete
 * implementado-a no sistema de controle
 * @author Wennio
 *
 */

public interface InterfaceSistemaDeControle{
	
	/**
	 * Método que adiciona um pedido em um Array de pedidos
	 * @param p - Recebendo um objeto do tipo Pedido
	 */
	public void adicionaPedido(Pedido p);
	
	/**
	 * Método que varre um array de Pedido e remove o pedido de acordo com o parâmetro recebido no método
	 * @param numPedido - numero do pedido que será pesquisado no Array
	 */
	public void removePedido(long numPedido);
	
	/**
	 * Este método varre um Array de Pedido onde quando o código do produto no Array comparado com o código do 
	 * produto passado como parâmetro forem iquais, este método retorna um Array com os pedidos de codigo de 
	 * produtos iquais
	 * @param codProduto
	 * @return
	 */
	public ArrayList<Pedido> pesquisaPedidosIncluindoProduto(long codProduto);

}
