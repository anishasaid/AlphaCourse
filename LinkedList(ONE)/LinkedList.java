package LinkedListONE;

// add new node in the middle of the linkedlist
public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data ){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        //step 1 - create new node
        Node newNode = new Node(data);

        //if at starting my linked list is empty
        if(head == null){
            head = tail = newNode;
            return ;
        }

        //step 2 - newNode.next = head
        newNode.next = head;

        //step 3 - head = newNode
        head = newNode;
    }

    //add the element at the middle of linkedlist
    public void add(int ind , int data){
        // again create new node
        Node newNode = new Node(data);

        // create temp
        Node temp = head;
        int i = 0;

        while (i< ind-1){
            temp = temp.next;
            i++;
        }

        //i == ind-1; temp -> prev
        // new node is inserted 
        newNode.next = temp.next;
        temp.next = newNode;
        
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);

        ll.add(2, 9);

        ll.print();

    }
    
}
