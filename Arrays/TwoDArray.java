package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3]; // declaration and initalization of array 
        // take input in the array 
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // print the 2d array 
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        // print 2d array uisng .toString()
        for (int row = 0; row <arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        // print the array using enhanced for loop 
        for (int[] row : arr){
            System.out.println(Arrays.toString(arr));
        }
    }
}
