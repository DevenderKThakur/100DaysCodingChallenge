package conditional.loops;

import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int negative_numbers = 0 , even_numbers = 0 , odd_numbers = 0 ;
        while (true){
            int num = sc.nextInt();

            if (num == 0){
                break;
            }

            if (num < 0 ){
                negative_numbers += num;
            }
            else if (num%2 ==0){
                even_numbers += num;
            }
            else {
                odd_numbers +=num;
            }
        }
        System.out.println(negative_numbers);
        System.out.println(even_numbers);
        System.out.println(odd_numbers);
    }
}
