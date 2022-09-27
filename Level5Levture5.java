import java.util.Scanner;

public class Level5Levture5 {
	// package com.javarush.task.pro.task05.task0511;
	// int[][] multiArray. Scan first N integer as a number of strings
	// scan N times numbers of elements for each string
	// Example: Enter 5
	// Enter 1,7,5,9,3
	// MultiArray should looks like:
	// []
	// [][][][][][][]
	// [][][][][]
	// [][][][][][][][][]
	// [][][]

	public static int[][] multiArray;

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int N = console.nextInt();
		multiArray = new int[N][];
		for (int i = 0; i < N; i++) {
			multiArray[i] = new int[console.nextInt()];
		}
		console.close();

	}

}
