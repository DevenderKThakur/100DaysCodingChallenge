package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }
    static int fibo(int n){
        // Base condition according to the condition 
        if (n < 2){
            return n ;
        }
        return fibo(n-1) + fibo(n-2);  // recurance relation formula of fibonacci
    }
}
