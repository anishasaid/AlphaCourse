package LinkedListONE;

public class Practice1 {
    // create node class
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    //******************************************************** */
    // Add element at first of the list
    public void addFirst(int data){
        //step 1 - create newNode
        Node newNode = new Node(data);

        size++;

        //spacial case 
        if(head == null){
            head = tail = newNode;
            return ;
        }

        //step 2 - newNode.next = head
        newNode.next = head;

        //step 3 - head = newNode (make new node a head)
        head  = newNode;
    }

    //******************************************************** */
    // Add element at the middle of the list
    public void add(int data, int inx){

        //step 1 - create node 
        Node newNode = new Node(data);

        size++;
        
        Node temp = head;
        int i = 0;

        //find previous node of the inx node
        while(i < inx-1){
            temp = temp.next;
            i++;
        }

        //if(i == inx-1) 
        // node insertion 
        newNode.next = temp.next;
        temp.next = newNode;
    
    }

    //******************************************************** */
    //Add element at the last of LinkedList
    public void addLast(int data){
        //step 1 - create new Node
        Node newNode = new  Node(data);

        size++;
        
        //now tail will point to the new node 
        tail.next = newNode;

        // and lastly make new node as a tail
        tail = newNode;
    }

    //******************************************************** */
    public void print(){
        Node temp = head;
       
        while(temp != null){
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Practice1 p = new Practice1();
        p.addFirst(5);
        p.addFirst(4);
        p.addFirst(3);
        p.addFirst(2);
        p.addFirst(1);

        p.add(33, 3);

        p.addLast(55);

        p.print();

        System.out.println(p.size);
    }
}
