package basicJava;

import java.util.Scanner;

public class FibonnaciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // to calculate fibonnaci series up to n numbers
        int a = 0 , b = 1 , c  ;   // fibonacci series is addition of two variable into the third variable 
        int n = sc.nextInt();
        for (int i = 2 ;i<n;i++){
            c = a+b;
            System.out.println(c);
            a = b ;
            b = c ;
        }
    }
}
