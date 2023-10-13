package Queue;
import java.util.*;

// Reverse a Queue 
public class QueueReversal {

    public static void reverse(Queue<Integer>q){

        Stack<Integer> s = new Stack<>();

        // Now push all elements of queue in stack
        while(!q.isEmpty()){
            s.push(q.remove());
        }

        // And again pop all elements from stack and add in queue
        while(!s.isEmpty()){
            q.add(s.pop());
        }    
    }
   
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverse(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+ " ");
        }
        System.out.println();
    }
}
