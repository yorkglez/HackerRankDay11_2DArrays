package com.hackerrankday112darrays.app;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //Variables declaration
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        //const declaration
        final int ELEMENTS = 4;
        //Array declaration
        int[][] arr = new int[6][6];

        //Object declaration
        Scanner in = new Scanner(System.in);

        //Input numbers
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        //Process hourglass sum
        for(int row = 0; row < ELEMENTS; row++)
        {
            for(int col = 0; col < ELEMENTS; col++)
            {
                sum = arr[row][col] + arr[row][col+1] + arr[row][col+2]
                        + arr[row+1][col+1]
                        + arr[row+2][col] + arr[row+2][col+1] + arr[row+2][col+2];

                //Validate that the current sum is greater than the previous sum
                if(sum > maxSum)
                {
                    maxSum = sum;
                }
            }
        }

        //Output result
        System.out.println(maxSum);
        //Close input
        in.close();
    }
}
