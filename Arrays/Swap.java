package Arrays;

import java.util.*;
public class Swap {
    public static void main(String[] args) {
        // Swap to value in the array 
        int [] arr = {1,3,23,9,18};
        System.out.println(Arrays.toString(arr)); //array before swapping
        swap(arr, 0, 3);
        System.out.println(Arrays.toString(arr)); //array after swapping 
    }
    static void swap(int [] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
