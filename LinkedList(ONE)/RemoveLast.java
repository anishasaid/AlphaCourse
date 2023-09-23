package LinkedListONE;

public class RemoveLast {

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

    public void addFirst(int data){
        //step1 - create newNode
        Node newNode = new Node(data);

        size++;

        //spacial case
        if(head == null){
            head = tail = newNode;
            return ;
        }

        //step2 - newNode.next = head
        newNode.next = head;

        //step3 - head = newNode
        head = newNode;
    }

    public int  removeLast(){

        if(size == 0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE ;
        }else if (size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        //prev : i = size-2 
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next ;
        }

        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev ;
        size --;
        return val;
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
        RemoveLast rl = new RemoveLast();
        rl.addFirst(5);
        rl.addFirst(4);
        rl.addFirst(3);
        rl.addFirst(2);
        rl.addFirst(1);

        rl.print();

        rl.removeLast();
        
        rl.print();
        System.out.println("size of LinkedList :" + size);
    }
}
