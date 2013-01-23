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
	 * M�todo que adiciona um pedido em um Array de pedidos
	 * @param p - Recebendo um objeto do tipo Pedido
	 */
	public void adicionaPedido(Pedido p);
	
	/**
	 * M�todo que varre um array de Pedido e remove o pedido de acordo com o par�metro recebido no m�todo
	 * @param numPedido - numero do pedido que ser� pesquisado no Array
	 */
	public void removePedido(long numPedido);
	
	/**
	 * Este m�todo varre um Array de Pedido onde quando o c�digo do produto no Array comparado com o c�digo do 
	 * produto passado como par�metro forem iquais, este m�todo retorna um Array com os pedidos de codigo de 
	 * produtos iquais
	 * @param codProduto
	 * @return
	 */
	public ArrayList<Pedido> pesquisaPedidosIncluindoProduto(long codProduto);

}
