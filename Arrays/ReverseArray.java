package Arrays;

public class ReverseArray {
    public void reverseArray(int numbers[]){
        int first = 0 , last = numbers.length-1;

        while (first < last){
            //swaping
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first ++ ;
            last -- ;
        }
    }
    public static void main(String [] args){
        ReverseArray obj = new ReverseArray();
        int numbers [] ={ 2,4,6,8,10};
        obj.reverseArray(numbers);
        //print
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        System.out.println();
    }
}
