package BinarySearch;

public class Infinite {
    public static void main(String[] args) {
        int [] arr = {2,3,5,6,7,8,10,11,12,15,20,23,30};
        //An array with infinte length find target element Question on geeks for geeks 
        int target = 12;
        System.out.println(ans(arr, target));   
    }
    static int ans(int []arr , int target){
        // array with two size
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int temp = end + 1;
            //double the box value 
            // end = previous end + sizeof box * 2 
            end = end + (end - start + 1) * 2 ;
            start  = temp;
        }
        return search(arr, target, start, end);
    }
    static int search(int [] arr , int target , int start , int end ){
        while (start <= end ){
            int mid = start + (end - start)/2;
            if (target < arr[mid]){
                end = mid - 1 ;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    
}
