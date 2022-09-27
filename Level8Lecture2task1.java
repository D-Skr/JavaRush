import java.util.Scanner;

public class Level8Lecture2task1 {

	// package com.javarush.task.jdk13.task06.task0625;
	// Fill the matrix 3x3 with keyboard input
	// count sum of each column and string
	// print the min sum

	public static int[][] array = new int[3][3];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				array[i][j] = scanner.nextInt();
			}
		}

		int minSum = Integer.MAX_VALUE;

		// string sum
		for (int i = 0; i < 3; i++) {
			int currentSum = array[0][i] + array[1][i] + array[2][i];
			if (minSum > currentSum) {
				minSum = currentSum;
			}
		}

		// column sum
		for (int i = 0; i < 3; i++) {
			int currentSum = array[i][0] + array[i][1] + array[i][2];
			if (minSum > currentSum) {
				minSum = currentSum;
			}
		}

		System.out.println("Min sum is: " + minSum);
		scanner.close();
	}
}