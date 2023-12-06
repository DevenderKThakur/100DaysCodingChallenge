package Arrays;

public class MaxMinval {
    public static void main(String[] args) {
        int [] arr = {1,3,23,9,18};
        System.out.println(find_max_val(arr));
    }
    static int find_max_val(int [] arr){
        int max = arr[0];
        for (int row =0;row<arr.length;row++){
            if (max < arr[row]){
                max = arr[row];
            }
        }
        return max;
    }   
}
