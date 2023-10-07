package Stack;
import java.util.*;

//Palindrome Linked List
//We have a singly linked list of characters, write a function
//that returns true if the given list is a
//palindrome, else false

//Input : A->B->C->B->A
//Output : Yes It is Palindrome

public class Question9 {
    // Node class
    public static class Node{
        int data ;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head ;
    public static Node tail;
    public static int size;  
    
    // Method isPalindrom
    public static boolean isPalindrome(Node head){
        Node temp = head;
        boolean ispalin = true;

        Stack<Integer> stack = new Stack<Integer>();

        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        while (head != null) {
            int i = stack.pop();
            if (head.data == i) {
                ispalin = true;
            }else {
                ispalin = false;
                break;
            }
            head = head.next;
        }
        return ispalin;
    }
    
    public static void main(String[] args) {
         Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(3);
        Node six = new Node(2);
        Node seven = new Node(1);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        boolean condition = isPalindrome(one);
        System.out.println("Palindrome :" + condition);
    }   
}
