package LinkedListTWO;

// Print the LinkedList in a ZIGZAG patteren
public class ZigZagLL {
    public class Node {
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
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void zigZag(){

        // find middle
        Node slow = head ;
        Node fast = head.next ;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // reverse the 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr ;
            curr = next;
        }
        Node left = head ;
        Node right = prev;

        Node nextL , nextR;

        // alternate merge - zigzag merge
       while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            // update 
            left = nextL;
            right = nextR;
       }

    }
    public static void main(String[] args) {
        ZigZagLL zz = new ZigZagLL();
        zz.addFirst(6);
        zz.addFirst(5);
        zz.addFirst(4);
        zz.addFirst(3);
        zz.addFirst(2);
        zz.addFirst(1);

        zz.print();

        zz.zigZag();

        zz.print();
    }
}
