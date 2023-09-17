package ArrayList;

import java.util.ArrayList;

// Multi-Diamentioanal ArrayList
public class MultiDimentionalArrayList {
    public static void main(String[] args) {
        // create main list
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1; i<6; i++ ){
           list1.add(i*1);
           list2.add(i*2);
           list3.add(i*3); 
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currArrayList = mainList.get(i);
            for(int j=0; j<currArrayList.size(); j++){
                System.out.print(currArrayList.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainList);
    }
}
