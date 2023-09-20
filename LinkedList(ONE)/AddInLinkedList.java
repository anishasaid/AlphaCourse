package LinkedListONE;
// Add the element at the first position of the LinkedList
public class AddInLinkedList {
    // node class
    public static class Node{
        int data;
        Node next ;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    // created a size veraible to count the number of nodes
    // java initializes its value by default 0
    public static int size ;

    public void addFirst(int data){

       // step 1 => create new node 
       Node newNode = new Node(data) ;

       size++;

       // when my linkedlist is empty 
        if(head == null){
            head = tail = newNode;
            return ;
        }

       //step 2 => newNode next = head 
       newNode.next = head;

       // step 3 => head = newNode
       head = newNode;
    }

    public void print(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        AddInLinkedList ll = new AddInLinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(0);
        
        ll.print();

        System.out.println(ll.size);
    }
}
