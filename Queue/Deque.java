package Queue;
import java.util.*;
// Deque - Double Ended Queue
public class Deque { 
   
    public static void main(String[] args) {

        //Deque <Integer> deque = new LinkedList<>();

        LinkedList<Integer> deque = new LinkedList<>();
        deque.addFirst(1); // 1
        deque.addFirst(2); // 2 1
        System.out.println(deque); 
        
        deque.addLast(3); // 2 1 3 
        deque.addLast(4) ; // 2 1 3 4 
        System.out.println(deque); 

        int removeF = deque.removeFirst(); // 1 3 4
        int removeL = deque.removeLast(); // 1 3 
        System.out.println(deque);

        // deque.getFirst(); // 1 
        // deque.getLast() ; // 3

        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());


    }    
}
