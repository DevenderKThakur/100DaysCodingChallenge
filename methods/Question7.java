package methods;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean answer = findPrimeOrNot(num);
        System.out.println(answer);

    }
    static boolean findPrimeOrNot(int num){
        int prime = 1;
        for (int i=2;i<num/2;i++){
            if (num % i == 0){
                prime = 0;
                break;
            }
        }
        if(prime ==1){
           return true;
        }
        else{
           return false;
        }
    }
}
