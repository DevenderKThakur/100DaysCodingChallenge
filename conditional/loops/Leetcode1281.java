package conditional.loops;

import java.util.Scanner;

public class Leetcode1281 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       int num = sc.nextInt();
       int sum = 0 , prod = 1 ;
       int temp = num ;
       while (temp > 0 ){
            sum += (temp%10) ;
            prod *=  (temp%10)  ;
            temp = temp/10;
       }
       System.out.println(prod-sum);
    }
    
}
