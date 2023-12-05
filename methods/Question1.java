package methods;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max_answer = maxNum(a, b, c);
        int min_answer = minNum(a, b, c);
        System.out.println(max_answer);
        System.out.println(min_answer);
    }
    static int maxNum(int a , int b , int c ){
        if (a > b && a>c){
            return a ;
        }
        else if (b > a && b > c ){
            return b ;
        }
        else {
            return c ;
        }
    }
    static int minNum(int a , int b , int c ){
        if (a<b && a<c){
            return a;
        }
        else if (b<c && b<a){
            return b;
        }
        else {
            return c ;
        }
    }
}
