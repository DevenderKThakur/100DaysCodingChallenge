package conditional.loops;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 1 ;
        if (n == 0 ){
            System.out.println("1");
        }
        for (int i = 1 ;i<=n;i++){
            f= f * i ;
        }
        System.out.println(f);
    }   
}
