public class CountZero {
    public static void main(String[] args) {
        System.out.println(count(13040));
        //Count the number of zero in a number 
    }
    static int  count(int n){
        return helper(n,0);
    }
    private static int helper(int n ,int c){
        if (n == 0){
            return c ;
        }
        int rem = n%10;
        if (rem == 0){
            return helper(n/10 , c+1);
        }
        return helper(n/10, c);
    }
}
