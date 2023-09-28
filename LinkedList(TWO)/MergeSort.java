package LinkedListTWO;

// Merge sort on LinkedList 

public class MergeSort {
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
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // slow and fast approach - calculate mid of LL
    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next ;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow ; // mid
    }
    // merge 2 sorted linked list
    public Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next; 
        }

        return mergedLL.next;
    }
    // merge sort
    public Node mergeSort(Node head){

        //base case
        if(head == null || head.next == null){
            return head;
        }
       
        // find mid
        Node mid = getMid(head);

        // divid left and right and perform merge sort
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);  // left part
        Node newRight = mergeSort(rightHead); // right part

        // merge
        return merge(newLeft, newRight);
    }
    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        ms.addFirst(1);
        ms.addFirst(2);
        ms.addFirst(3);
        ms.addFirst(4);
        ms.addFirst(5);

        ms.print();

        ms.head = ms.mergeSort(ms.head);
        ms.print();
    }
}
