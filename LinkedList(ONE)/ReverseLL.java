package LinkedListONE;

// Reverse a LinkedList 
public class ReverseLL {

    public class Node{
        int data ;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;
    // Add Node 
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // print function
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // Reverse Method
    public void reverse(){
        Node prev = null;
        Node curr = tail = head ;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        ReverseLL rl = new ReverseLL();

        rl.addFirst(5);
        rl.addFirst(4);
        rl.addFirst(3);
        rl.addFirst(2);
        rl.addFirst(1);

        rl.print();

        rl.reverse();

        rl.print();
    }
}
