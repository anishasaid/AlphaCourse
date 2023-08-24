package Arrays;

public class LinearSearch {
   
    public int lsearch(int numbers[], int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]== key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String srgs[]){
        LinearSearch obj = new LinearSearch();

        int numbers[] = {1,8,4,6,77,25,45,22};
        int key = 17;

        int index = obj.lsearch(numbers, key);
        if(index == -1){
            System.out.println("Number Not Found");
        }else{
            System.out.println("Key is at index :"+ index);
        }
    }
}
