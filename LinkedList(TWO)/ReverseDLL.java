package LinkedListTWO;

// Reverse the Doublly Linked List
public class ReverseDLL {
    public class Node {
        int data ;
        Node next ;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // Add First 
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    // remove first
    public int removeFirst(){
        if(head == null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size --;
        return val;
    }

    // Add Last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return ;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    // Remove Last
    public int removeLast(){
        if(head == null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = tail.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    // REVERSE LL
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ReverseDLL rdll = new ReverseDLL();

        rdll.addFirst(4);
        rdll.addFirst(3);
        rdll.addFirst(2);
        rdll.addFirst(1);

        rdll.print();

        // rdll.removeFirst();
        //rdll.addLast(5);
        //rdll.print();
        //rdll.removeLast();
        //rdll.print();

        rdll.reverse();
        rdll.print();
    }
}
