package methods;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       boolean result = findEvenOdd(num);
       System.out.println(result);
    }
    static boolean findEvenOdd(int num){
        if (num%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}
