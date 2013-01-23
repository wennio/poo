import java.util.ArrayList;
import java.io.*;

public class GravadorDePedido {

	@SuppressWarnings("unchecked")
	public ArrayList<Pedido> lePedidos() throws FileNotFoundException, IOException, ClassNotFoundException {
		try(FileInputStream fIn = new FileInputStream("C:/Users/Wennio/Desktop/exercicio_01/arquivo.ser")){
			try(ObjectInputStream oIn = new ObjectInputStream(fIn)){
				return (ArrayList<Pedido>) oIn.readObject();
			}
		}
	}
	
	public void gravaPedidos(ArrayList<Pedido> pedidos) throws FileNotFoundException, IOException{
		try(FileOutputStream fOut = new FileOutputStream("C:/Users/Wennio/Desktop/exercicio_01/arquivo.ser")){
			try(ObjectOutputStream oOut = new ObjectOutputStream(fOut)){
				for (Pedido pedido : pedidos) {
					oOut.writeObject(pedido);
				}
			}
		}
	}
}
