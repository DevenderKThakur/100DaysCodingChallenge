package BinarySearch;

public class Order_Agnostic {
    public static void main(String[] args) {
        int [] arr = {2,3,4,16,18,21};
        int answer = Order_Agnostic(arr, 16);
        System.out.println(answer);
    }  
    // Order-Agnostic-Binary Search means that we don't  know in which  order are array is arranged 
    static int  Order_Agnostic(int [] arr , int target ){
        int start = 0 ;
        int end = arr.length-1;
        
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
