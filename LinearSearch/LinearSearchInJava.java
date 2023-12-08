package LinearSearch;

public class LinearSearchInJava {
    public static void main(String[] args) {
        int [] nums = {23,45,1,2,8,16,28};
        int target = 19;
        System.out.println(linear_search(nums, target));       
    }
    static int linear_search(int [] arr , int target ){
        if (arr.length == 0){
            return -1;
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
