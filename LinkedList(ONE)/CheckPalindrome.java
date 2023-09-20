package LinkedListONE;

// Check if Linked List is Palindrome

public class CheckPalindrome {
    public class Node {
        int data ;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node  tail;
    public static int size ;

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    //helper function
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow =slow.next ; // move one step 
            fast = fast.next.next; // move two step
        }
        return slow;
    }

    public boolean isPalindrome(){

        if(head == null && head.next == null){
            return true;
        }
        // step 1 - find mid 
        Node mid = findMid(head);

        //step 2 - reverse the half part from mid
        Node prev = null;
        Node curr = mid;
        Node next ;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right parts head
        Node left = head ; // left parts head

        //step 3 - check left against right part  
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next ;
        }
        return true;
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
        CheckPalindrome cp = new CheckPalindrome();
        cp.addLast(1);
        cp.addLast(2);
        cp.addLast(2);
       // cp.addLast(1);

        cp.print();

        System.out.println(cp.isPalindrome()); 
    }
}
