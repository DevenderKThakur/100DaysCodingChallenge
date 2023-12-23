package ArraysRecursion;

public class LinearRecursion {
    public static void main(String[] args) {
        int [] arr = {3,2,1,12,9};
        System.out.println(search(arr, 12, 0));
    }
    static int search(int [] arr , int target , int index){
        if (index == arr.length-1){
            return -1;
        }        
        if (target != arr[index]){
            return search(arr, target, index+1);
        }
        return index;
    }
}
