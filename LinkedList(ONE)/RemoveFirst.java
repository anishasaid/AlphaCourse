package LinkedListONE;

// Remove First Element or Node from the LinkedList
public class RemoveFirst {
    // Create Node class
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //add First 
    public void addFirst(int data){
        //step 1 = create new node
        Node newNode = new Node(data);

        size++;

        //spacial case
        if(head == null){
            head = tail = newNode;
            return; 
        }

        // step 2 
        newNode.next = head;

        //step 3 
        head = newNode;

        
    }
    // Add last 
    // public void addLast(int data){
    //     //step 1 - create Node
    //     Node newNode = new Node(data);

    //     size++;

    //     // //spacial case
    //     // if(head == null){
    //     //     head = tail = null;
    //     //     return ;
    //     // }

    //     //step 2 - last node will point to the newNode
    //     tail.next = newNode;

    //     // step 3 - make newNode as a tail
    //     tail = newNode;
    // }

        public int  removeFirst(){
            if(size == 0){
                System.out.println("LL is empty ");
                return Integer.MIN_VALUE;
            }else if(size == 1 ){
                int val = head.data;
                head = tail = null ;
                size = 0;
                return val;

            }
            int val = head.data;
            head = head.next;
            size --;
            return val;
        }

    // print the linkedlist
    public void print(){
        Node temp = head;
       
        while(temp != null){
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        RemoveFirst rv = new RemoveFirst();
        
        rv.addFirst(0);
        rv.addFirst(1);
        rv.addFirst(2);
        rv.addFirst(3);
        rv.addFirst(4);

        // rv.addLast(1);
        // rv.addLast(2);
        // rv.addLast(3);
        // rv.addLast(4);
        // rv.addLast(5);

        rv.print();

        rv.removeFirst();

        rv.print();

        System.out.println("size of the linkedlist: "+ rv.size);
    }
}
