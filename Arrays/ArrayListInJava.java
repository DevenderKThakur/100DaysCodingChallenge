package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        // list.add(2); // to add value in the array
        // System.out.println(list);
// take input in arrayLsit 
        for(int row = 0;row <5 ;row++){
            list.add(sc.nextInt());
        }       
// get item at any index // print the array 
        for (int row=0;row<5;row++){
            System.out.println(list.get(row));
        }
// print arraylist 
        // System.out.println(list); 
    }
    
}
