package DivideAndConquer;

// Search in Rotated Sorted Array
// input - sorted, Roated array with distinct numbers
//(in ascending order)
//It is roatated at a pivot point .
// find the index of given element.

public class RotatedSortedArray {
    public static int search(int arr[], int target, int si, int ei){
        // kam 
        int mid = (si + ei) / 2;

        //case FOUND
        if(arr[mid] == target){
            return mid;
        }

        // mid on L1
        if(arr[si] <= arr[mid]){
            //case a : left
            if(arr[si] <= target && target <= arr[mid]){
                return search(arr, target, si, mid);
            }
            else{
                // case b : right 
                return search(arr, target, mid+1, ei);
            }
        }
        // mid on L2
        else{
            //case c : right 
            if(arr[mid] <= target && target <= arr[ei]){
                return search(arr, target, mid+1, ei);
            }
            else{
                //case d : left
                return search(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 6;
        int tarIdx = search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);
    }
}
