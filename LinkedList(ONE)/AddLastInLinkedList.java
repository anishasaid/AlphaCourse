package LinkedListONE;

//add the new node the last of linked list

public class AddLastInLinkedList {
    public static class Node{
        int data;
        Node next;

        public Node( int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    // add element at the first 
    public void addFirst(int data){
        //step 1 - create new node
        Node newNode = new Node(data);

        //special case: if linked list is empty
        if(head == null){
            head = tail = newNode;
            return ;
        }

        // step 2 - newNode.next = head
        newNode.next = head;

        // step 3 - head = newNode
        head = newNode;
    }

    //add element at the last
    public void addLast(int data){
        //step 1 -create new node
        Node newNode = new Node(data);

        //spacial case 
        if(head == null){
            head = tail = newNode;
            return;
        }

        // step2 - tail.next = newnode
        tail.next = newNode;

        // step 3 - assign new node as tail
        tail = newNode;
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
        AddLastInLinkedList ll = new AddLastInLinkedList();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.addLast(6);
        ll.addLast(7);

        ll.print();
    } 
}
