package LinkedListONE;

// Search for a key in a LinkedList.
// Return the position where it is found.
// If not found, return -1. Use Recursion 

public class RecursiveSearch {
    public class Node{
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

    // Add Node in the First position of the LinkedList 
    public void addFirst(int data){

        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return ;
        }

        newNode.next = head;
        head = newNode;
    }

    //Add Node in the middle of the LinkedList
    public void addMiddle(int ind, int data){
        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;

        while(i < ind-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    // This is the Actual Recursion function
    public int helper(Node head , int key){

        //base case
        if(head == null){
            return -1;
        }

        if(head.data == key ){
            return 0;
        }

        //recursion
        int indx = helper(head.next, key);
        if(indx  == -1){
            return -1;
        }

        return indx+1;
    }

    // Recursive Search
    public int  recSearch(int key){
        return helper(head, key);
    }

    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        RecursiveSearch rs = new RecursiveSearch();
        rs.addFirst(5);
        rs.addFirst(4);
        rs.addFirst(3);
        rs.addFirst(2);
        rs.addFirst(1);

        rs.print();

        rs.addMiddle(2, 11);

        rs.print();

        System.out.println(rs.recSearch(11));
        System.out.println(rs.recSearch(10));
    }
}
