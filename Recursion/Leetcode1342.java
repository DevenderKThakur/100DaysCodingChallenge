public class Leetcode1342 {
    public static void main(String[] args) {
        
    }
    static int numberofSteps(int num){
        return helper(num , 0);
    }
    private static int helper(int num ,int c){
        if (num == 1){
            return c;
        }
        if (num % 2 == 0){
            return helper(num/2, c+1);
        }
        return helper(num-1, c+1);
    }
}
