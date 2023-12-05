package methods;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int num1 = sc.nextInt();
       int num2 = sc.nextInt(); 
       primeNumberOrNot(num1, num2);
    }
    static void primeNumberOrNot(int a , int b){
       int prime = 1 ;
       for (int i=a;i<b;i++){
            for (int j=2;j<=i;j++){
                if (i%j==0){
                    prime = 0;
                    break;
                }
            }
            if (prime == 1 ){
                System.out.println(i);
            }
       }
    }
}
