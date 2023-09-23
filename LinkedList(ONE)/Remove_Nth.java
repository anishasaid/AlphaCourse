package LinkedListONE;

// Find and Remove Nth node from End

public class Remove_Nth {
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

    // Add element 
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

    //Remove the Nth node from end
    public void deleteNthfromEnd(int n){
        // calculate size
        int sz = 0 ;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head = head.next;
            return;
        }

        //sz-n
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    // Print the LinkedList
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Remove_Nth rn = new Remove_Nth();
        rn.addFirst(5);
        rn.addFirst(4);
        rn.addFirst(3);
        rn.addFirst(2);
        rn.addFirst(1);

        rn.print();
        rn.deleteNthfromEnd(3);
        rn.print();
    }
}
