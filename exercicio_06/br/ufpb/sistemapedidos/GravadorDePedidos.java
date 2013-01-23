package exercicio_06.br.ufpb.sistemapedidos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GravadorDePedidos {
	
	public void gravaPedido(ArrayList<Pedido> pedido) throws IOException {
		try(FileOutputStream fOut = new FileOutputStream("C:/Users/Wennio/workspace/atividades_poo/src/exercicio_06/br/ufpb/sistemapedidos/pedidos.ser")){
			try(ObjectOutputStream oOut = new ObjectOutputStream(fOut)){
				for (Pedido pedido2 : pedido) {
					oOut.writeObject(pedido2);
				}
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Pedido> lePedido() throws FileNotFoundException, IOException, ClassNotFoundException {
		try(FileInputStream fIn = new FileInputStream("C:/Users/Wennio/workspace/atividades_poo/src/exercicio_06/br/ufpb/sistemapedidos/pedidos.ser")){
			try(ObjectInputStream oIn = new ObjectInputStream(fIn)){
				return (ArrayList<Pedido>) oIn.readObject();
			}
		}
	}

}
