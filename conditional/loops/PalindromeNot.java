package conditional.loops;

import java.util.Scanner;

public class PalindromeNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n ;
        int rev= 0  , rem ;
        while (temp > 0 ){
            rem = temp  % 10 ;
            rev = rev*10 + rem ;
            temp /= 10;
        }
        System.out.println(rev);
    }
    
}
