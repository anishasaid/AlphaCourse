package DivideAndConquer;

public class Practice1 {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    //merge sort - recursion function
    public static void mergeSort(int arr[],int si,int ei){
        // base case
        if(si >= ei){
            return ;
        }
        //kam
        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid); // left part
        mergeSort(arr, mid+1, ei); // right part
        merge(arr,si,mid,ei);
    }

    //merging
    public static void merge(int arr[], int si, int mid,int ei){
        //create temp array
        int temp[] = new int[ei-si+1];
        //create iterator 
        int i = si;  // left array
        int j = mid+1;  // right array
        int k = 0;  // temp array

        while(i<=si && j<=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //for remaining left array element 
        while(i<=mid){
            temp[k++] = arr[i++];
        }

        //for remaining right array element
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        //copy the temp array into original array
        for(k=0, i=si; k< temp.length;k++, i++){
            arr[i] = temp[k];
        }
    }
   public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        print(arr);
   }
}
