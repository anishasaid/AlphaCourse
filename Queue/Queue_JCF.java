package Queue;
import java.util.*;

// Create a queue by using Java Collection Framework
public class Queue_JCF{
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        // OR
       // Queue <Integer> q = new ArrayDeque<>();

        /*  here Queue is an interface so we can not create its 
        object 
        we can implement queue  by LinkedList and ArrayDequeue 
        */
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}