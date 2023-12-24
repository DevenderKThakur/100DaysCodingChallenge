package BinarySearch;

import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        int [] nums = {5,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    static int[] searchRange(int [] nums , int target){
        int start = 0;
        int end = nums.length-1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target < nums[mid]){
                end = mid-1;
            }
            else if (target > nums[mid]){
                start = mid+1;
            }
            else{
                return new int[]{start,end};
            }
        }
        return new int[] {-1,-1};
    }
}
