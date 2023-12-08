package LinearSearch;

public class Leetcode1672 {
    public static void main(String[] args) {
        // leetcode 1672 
    }
    static int maxWealth(int [][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int [] persons : accounts){
            int sum = 0;
            for (int account  : persons){
                sum += account;
            }
            if (sum > ans){
                ans = sum ;
            }
        }
        return ans ;
    }
    
}
