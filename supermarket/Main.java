package supermarket;
import entities.Cliente;
import entities.Supermercado;
public class Main {

		public static void main(String[] args) {
	      
	        
	        Supermercado supermercado = new Supermercado();
	        
	        
	        Cliente cliente1 = new Cliente("João");
	        Cliente cliente2 = new Cliente("Maria");
	        Cliente cliente3 = new Cliente("Pedro");
	        Cliente cliente4 = new Cliente("vinicios");
	        
	        supermercado.addClienteToExpressQueue(cliente1); 
	        supermercado.addClienteToRegularQueue(cliente2);  
	        supermercado.addClienteToRegularQueue(cliente3);  
	        supermercado.addClienteToExpressQueue(cliente4);
	        
	        Cliente servedCliente1 = supermercado.serveNextClienteFromExpressQueue();
	        Cliente servedCliente2 = supermercado.serveNextClienteFromRegularQueue();  
	        
	        
	        System.out.println("Cliente atendido na fila expressa: " + servedCliente1.getNome());
	        System.out.println("Cliente atendido na fila regular: " + servedCliente2.getNome());
	        
	        System.out.println("Tamanho da fila expressa: " + supermercado.getExpressQueueSize());
	        System.out.println("Tamanho da fila regular: " + supermercado.getRegularQueueSize());
	    }
	

	

} 
