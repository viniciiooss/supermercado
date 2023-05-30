package entities;

import supermarket.SupermercadoQueue;

public class Supermercado {
	
	    private SupermercadoQueue expressQueue;
	    private SupermercadoQueue regularQueue;
	    
	    public Supermercado() {
	        expressQueue = new SupermercadoQueue();
	        regularQueue = new SupermercadoQueue();
	    }
	    
	    public void addClienteToExpressQueue(Cliente cliente) {
	        expressQueue.enqueue(cliente);
	    }
	    
	    public void addClienteToRegularQueue(Cliente cliente) {
	        regularQueue.enqueue(cliente);
	    }
	    
	    public Cliente serveNextClienteFromExpressQueue() {
	        return expressQueue.dequeue();
	    }
	    
	    public Cliente serveNextClienteFromRegularQueue() {
	        return regularQueue.dequeue();
	    }
	    
	    public int getExpressQueueSize() {
	        return expressQueue.getSize();
	    }
	    
	    public int getRegularQueueSize() {
	        return regularQueue.getSize();
	    }
	    
}
