package BinarySearch;

public class Question {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int target = 8;
        System.out.println(search2(arr, target));
        //smallest in the array but greater or equal to target is ceiling of a number 
        // floor of a number is smallest or a equal number to a target 
    }
    static int search(int [] arr , int target ){
        int start = 0;
        int end = arr.length-1;
        while (start <= end ){
            int mid = start + (end - start)/2;
            if (target == arr[mid]){
                return mid;
            }
            else if (target < arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }  
    static int search2(int [] arr , int target ){
        int start = 0;
        int end = arr.length-1;
        while (start <= end ){
            int mid = start + (end - start)/2;
            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return end;
    }  
}
