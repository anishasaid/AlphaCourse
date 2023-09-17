package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class OperationsOnArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add element  
        list.add(1);  // O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("orignal list : "+list);

        //***************** .sort() **************************
        // ascending order
        Collections.sort(list);
        System.out.println("Ascending Order :"+list);

        // decending order 
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Decending Order :"+list);

        // *************** .size() **********************
        // System.out.println(list.size());

        // //print the arraylist
        // for(int i=0; i<list.size(); i++){
        //     System.out.print(list.get(i)+ " ");
        // }
        // System.out.println();

        //************************************************

        // ******************* .add() ***********************

        // list.add(1, 50);            // O(n)
        // System.out.println(list);

        // ****************************************************
        
        //**************** .get() element ***********************

        // int element = list.get(2);     //O(1)
        // System.out.println(element);

        // ***************************************************

        // ***************.remove() element  //O(n) ***********

        // list.remove(2);
        // System.out.println(list);

        //***************************************************


        //****************** .set() element    //O(n) *********
        //list.set(2, 9);
        //System.out.println(list);

        //**********************************************************

        //*********************** .contains()    //O(n) *******
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));
    }
}
