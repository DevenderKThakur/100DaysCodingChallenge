package ArraysComplete.LeetcodeQuestions;

import java.util.Arrays;

public class leetcode217 {
    public static void main(String[] args) {
        int nums [] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }
    static boolean containsDuplicate(int [] nums){
        Arrays.sort(nums);
        for (int row = 0 ;row<nums.length;row++){
            if (nums[row] == nums[row+1]){
                return true;
            }
        }
        return false ;
    }
    
}
