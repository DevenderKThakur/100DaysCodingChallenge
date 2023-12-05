package basicJava;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // to find the given string is palindrome or not 
        String enter_string = sc.next();
        
        String  temp = (enter_string).toLowerCase();

        String rev = "";
        for (int i=temp.length()-1;i>=0;i--){
            rev += temp.charAt(i);
        }

        if (enter_string.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
