package LinkedListTWO;

import java.util.LinkedList;
// Basic introduction of LinkedList 
// How to create, Add, Remove elements(objects) from LinkedList
public class LinkedListIntro {
    public static void main(String[] args) {
        // create LinkedList
        LinkedList<Integer> ll = new LinkedList<>();

        // Add
        ll.addFirst(0);
        ll.addLast(1);
        ll.addLast(2);

        System.out.println(ll);

        // Remove
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}
