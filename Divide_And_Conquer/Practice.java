package DivideAndConquer;

//
public class Practice {
    public static int search(int arr[],int target,int si,int ei){
        //kaam
        int mid = (si + ei)/2;
        //best case
        if(arr[mid] == target){
            return mid;
        }
        // mid lie L1
        if(arr[si] <= arr[mid]){
            //case a : left
            if(arr[si] <= target && target <= arr[mid]){
                return search(arr, target, si, mid-1);
            }
            else{
                //case b : right
                return search(arr, target, mid+1, ei);
            }
        }
        //mid lie on L2
        else{
            //case c: right
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
        int arr[] = {1,2,4,5,3,6,0,9,8};
        int target = 0;
        int tarInd = search(arr, target, 0, arr.length-1);
        System.out.println(tarInd);
    }
}
