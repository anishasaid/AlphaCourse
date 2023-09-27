package LinkedListTWO;

//Intersection of Two Linked Lists

//In a system there are two singly linked list.
// By some programming error, the end node of one
//of the linked lists got linked to the second list, 
//forming an inverted Y-shaped list. Write a
//program to get the point where two linked lists merge.
//We have to find the intersection part in this system.

public class FindIntersection {
    public static class Node {
        int data ;
        Node next ;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public Node getIntrsectionNode(Node head1 , Node head2){
        while(head2 != null){
            Node temp = head1;
            while(temp != null){
                if(temp == head2){
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }
    public static void main(String[] args) {
        FindIntersection fi = new FindIntersection();

        Node head1, head2;
        head1 = new Node(10); // 10
        head2 = new Node(3); //3

        Node newNode = new Node(6);
        head2.next = newNode;  // 3->6

        newNode = new Node(9);
        head2.next.next = newNode; // 3->6->9

        newNode = new Node(15);
        head1.next = newNode;  // 10->15
        head2.next.next.next = newNode; //3->6->9->15

        newNode = new Node(30);
        head1.next.next = newNode; //10->15->30

        head1.next.next.next = null;//10->15->30->null

        Node intersectionPoint = fi.getIntrsectionNode(head1, head2);

        if(intersectionPoint == null ){
            System.out.println("There is no intersection point");
        }else{
            System.out.println("Intersection point : "+ intersectionPoint.data);
        }

    }
}
