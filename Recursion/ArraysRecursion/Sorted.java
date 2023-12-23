package ArraysRecursion;

public class Sorted {
    public static void main(String[] args) {
        int arr[] = {1,2,9,4,5,6,8};
        System.out.println(sorted(arr, 0));
    }
    //check if the array is sorted 
    static boolean sorted(int [] arr , int index){
        if (index  == arr.length-1){
            return true ;
        }
        if (arr[index] < arr[index+1]){
            return sorted(arr, index+1);
        }
        return false;
    }
}
