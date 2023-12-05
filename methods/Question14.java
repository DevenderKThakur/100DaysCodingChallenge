package methods;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = sumOfNatural(num);
        System.out.println(result);
    }
    static int sumOfNatural(int num){
        int sum = 0 ;
        for (int i=1;i<=num;i++){
            sum+=num;
        }
        return sum ;
    }
    
}
