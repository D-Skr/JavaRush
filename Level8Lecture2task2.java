import java.util.Arrays;
import java.util.Scanner;

public class Level8Lecture2task2 {

	// package com.javarush.task.jdk13.task06.task0627;
	// revert input array 
	// 1 2 3
	// 4 5 6
	// 7 8 9
	
	// to output array
	// 1 4 7
	// 2 5 8
	// 3 6 9
	
	public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
            	//revert column and string in array
                array[j][i] = console.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(array));
        console.close();
    }
}
