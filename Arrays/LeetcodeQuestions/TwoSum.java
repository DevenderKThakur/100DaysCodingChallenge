package ArraysComplete.LeetcodeQuestions;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int nums [] = {2,7,11,15};
        int target = 26;
        System.out.println(Arrays.toString(TwoSum(nums,target)));      
    }
    static int[] TwoSum(int [] nums , int target){
        for (int row = 0 ; row<nums.length;row++){
            for (int col = row + 1 ;col < nums.length; col++){
                if (nums[row] + nums[col] == target){
                    return new int[] {row,col};
                }
            }
        }
        return null;
    }
    
}
