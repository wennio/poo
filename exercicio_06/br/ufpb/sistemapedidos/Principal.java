package exercicio_06.br.ufpb.sistemapedidos;

import java.io.IOException;
import java.util.Scanner;

public class Principal{
	
	public static void main(String[] args){
		GravadorDePedidos gravador = new GravadorDePedidos();
		ControleDePedidos controle = new ControleDePedidos();
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
		
		try {
			gravador.gravaPedido(controle.getPedidos());
			System.out.println("Gravou!");
		} catch (IOException e) {
			e.printStackTrace();
		}
//		try {
//			gravador.lePedido();
			System.out.println("Leu!");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
	}
	
}
		