package day2;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i=0; i< arr.length;i++){
            arr[i] = in.nextInt();
        }

        for (int element: arr
        ) {
            System.out.println(element);
        }
       /* int[][] arr = new int[4][4];
        for (int i=0; i< arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                arr[i][j] = in.nextInt();
            }
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
           }
           System.out.println();
        }*/
    }
}
