//Question : Use the following sorting algorithms to sort an array in DESCENDING order :
//a. Bubble Sort
//b. Selection Sort
//c. Insertion Sort
//d. Counting Sort
//You can use this array as an example : [3, 6, 2, 1, 8, 7, 4, 5, 3, 1]

public class Practice {

    public static void bubbleSorting ( int arr[]){
        for(int turn=0 ;turn < arr.length-1;turn++){
            for(int j=0 ; j< arr.length-1;j++){
                if(arr[j ] > arr[j+1]){
                    //swaping 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSorting(int arr[]){
        for(int i=0 ; i< arr.length-1;i++){
            int minPos = i;
            for(int j= i+1; j<=arr.length-1 ; j++){
                if ( arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            //swaping 
            int temp = arr[minPos];
            arr[minPos]  =  arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSorting(int arr[]){
        for(int i=1 ;i<arr.length;i++){
            int curr =arr[i];
            int prev = i-1;
            while(prev >=0 && arr[prev] > curr){
                arr[prev + 1 ] = arr[prev];
                prev--;
            }
            //Insertion 
            arr[prev + 1] = curr;
        }
    }
    public static void countingSorting(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0 ;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int [largest +1];
        for(int i =0 ;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j =0;
        for(int i=0 ;i< count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i=0 ; i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String [] args){
        
       // int arr[] = {5,1,4,3,2};
        int arr[] = { 3,6,2,1,8,7,4,5,3,1};
       // bubbleSorting(arr);
       //selectionSorting(arr);
       insertionSorting(arr);
        printarr(arr);
    }
}
