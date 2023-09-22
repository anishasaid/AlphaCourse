package LinkedListONE;

// Search for a key in a Linked List. Return the position where 
// it is found .
// if not found , return -1.

public class IterativeSearch {
    public class Node {
        int data ;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    } 
    public static Node head;
    public static Node tail;
    public  static int size;
    
    //add last
    public void addLast(int data){
        Node newNode  = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public int itrSearch(int key){ // Time Complexity - O(n)
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){  // key found
                return i;
            }
            temp = temp.next;
            i++;  
        }
        // key not found
        return -1;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        IterativeSearch is = new IterativeSearch();

        is.addLast(1);
        is.addLast(2);
        is.addLast(3);
        is.addLast(4);
        is.addLast(5);

        is.print();

        System.out.println(is.itrSearch(3));
        System.out.println(is.itrSearch(10));

    }
}
