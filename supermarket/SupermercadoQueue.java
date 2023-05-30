package supermarket;
import java.util.LinkedList;
import java.util.Queue;

import entities.Cliente;

public class SupermercadoQueue {
private Queue<Cliente> queue;
    
    public SupermercadoQueue() {
        queue = new LinkedList<>();
    }
    
    public void enqueue(Cliente cliente) {
        queue.add(cliente);
    }
    
    public Cliente dequeue() {
        return queue.poll();
    }
    
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
    public int getSize() {
        return queue.size();
    }
}


