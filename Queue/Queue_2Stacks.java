package Queue;

import java.util.*;

// Create a Queue using 2 stacks 
public class Queue_2Stacks {
    // Node class
    public static class Node{
        int data;
        Node next ;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue{
        // create 2 stacks
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2  = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        // Add()  - O(n)
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        //remove()  - O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1 ;
            }
            return s1.pop();
        }

        // peek()  - O(1)
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(3);
        q.add(5);
        q.add(7);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
