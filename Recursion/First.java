package Recursion;

public class First {
    public static void main(String[] args) {
        // Recursion is when function calls itself 
        print(1);
    }
    static void print(int n){
        if (n == 5){  // Base condition to stop the recursion 
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
