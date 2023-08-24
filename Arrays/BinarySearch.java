package Arrays;

public class BinarySearch {
    public static int bSearch(int numbers[] , int key){
        int start = 0;
        int end = numbers.length-1;

        while (start <= end){
            int mid = (start + end)/2;
            // direclty found
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] > key){
                end = mid -1;
            }else{
                start = mid +1;
            }

        }
        return -1;
    }
    public static void main(String []args){
        int numbers[]= {1,2,4,5,6,8,9,10,15,20};
        int key = 15;

        System.out.println("The Key found at index :"+bSearch(numbers, key));
    }
}
