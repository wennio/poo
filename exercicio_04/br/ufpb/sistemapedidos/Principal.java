package exercicio_04.br.ufpb.sistemapedidos;

import java.util.Scanner;

public class Principal{
	
	public static void main(String[] args){
		ItemDePedido itens;
		Pedido p = new Pedido(001);
		Scanner input = new Scanner(System.in);
		while(true){
			long codProduto = input.nextLong();
			if(codProduto == 0){
				break;
			}
			int quantidade = input.nextInt();
			double valorUnitario = input.nextDouble();
			itens = new ItemDePedido(quantidade, codProduto, valorUnitario);
			p.adicionaItem(itens);
		}
		double valorTotal = 0;
		for (ItemDePedido i : p.getItens()) {
			valorTotal += i.getValorUnitario();
		}
		System.out.println("Valor total: " + valorTotal + " R$");
		input.close();
	}
	
}
		