package BinarySearch;

public class Leetcode1095 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(findInMountainArray(target, arr));
    }
    static  int findInMountainArray(int target, int arr[]) {
        int peak = findPeakIndexInMountain(arr);
        int firsttry = order(arr, target, 0, peak);
        if (firsttry != -1){
            return firsttry;
        }
        return -1;
    }
    static int findPeakIndexInMountain(int [] arr ){
        int start = 0;
        int end = arr.length-1;
        while (start <= end ){
            int mid = start + (end - start)/2;
            if (arr[mid] < arr[mid+1]){
                start = mid+1; 
            }
            else {
                end = mid;
            }
        }
        return start;
    }
    static int order(int arr[] , int target , int start , int end){        
        boolean isAscending = arr[start] < arr[end];
        while (start <= end ){
            int mid = start + (end - start)/2;

            if (arr[mid] == target){
                return mid ;
            }

            if (isAscending == true ){
                if (arr[mid] < target){
                    start = mid + 1 ;
                }
                else {
                    end = mid - 1;
                }
            }
            else {
                if (arr[mid] < target){
                    end = mid - 1 ;
                }
                else {
                    start = mid + 1 ;
                }
            }
        }
        return -1;
    }
}
