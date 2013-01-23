import java.io.FileNotFoundException;
import java.io.IOException;

public class Principal{
	
	public static void main(String[] args){
		
		ControleDePedidos controle = new ControleDePedidos();
		GravadorDePedido gravador = new GravadorDePedido();
		
		Pedido p1 = new Pedido(001);
		p1.setCliente(new Cliente("kelson"));
		Pedido p2 = new Pedido(002);
		p2.setCliente(new Cliente("kelson"));
		controle.adicionaPedido(p1);
		controle.adicionaPedido(p2);
		
		int resultado = controle.calculaQuantidadeDePedidosDoCliente("kelson");
		if (resultado == 2){
			System.out.println("Programa Correto!");
		} else {
			System.out.println("Programa Incorreto!");
		}
		
		try{
			gravador.gravaPedidos(controle.getPedidos());
			System.out.println("Funcionou!");
		} catch (FileNotFoundException e1) {
			System.out.println("Erro 1");
		} catch (IOException e2) {
			System.out.println("Erro 2");
		}
	}
	
}
		