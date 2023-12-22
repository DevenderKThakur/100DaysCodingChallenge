public class Question1 {
    public static void main(String[] args) {
        // printrev(5);
        // print(1);
        // System.out.println(fact(5));
        // System.out.println(sum(5));
        // System.out.println(sumofdigits(1234));
        System.out.println(product(23));
    }
    // to print the number from n to 1 
    static void printrev(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        printrev(n-1);
    }
    // print from n to 5 
    static void print(int n){
        if (n == 6){
            return;
        }
        System.out.println(n);
        print(n+1);
    }
    //factorial using recursion 
    static int fact(int n){
        if (n == 0 ){
            return 1;
        }
        return n * fact(n-1);
    }
    // sum of n numbers  n to 1 
    static int sum(int n){
        if (n == 1){
            return n ;
        }
        return n + sum(n-1);
    }
    // sum of digits 
    static int sumofdigits(int n){
        if (n == 0){
            return 0 ;
        }
        return n%10 + sumofdigits(n/10);
    }
    // product of digits
    static int product(int n){
        if (n%10 == n){
            return n;
        }
        return (n%10) * (product(n/10));
    }
}
