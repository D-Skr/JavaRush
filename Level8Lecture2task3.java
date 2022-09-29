import java.util.Scanner;

public class Level8Lecture2task3 {
	//package com.javarush.task.jdk13.task06.task0632;
	//char[][] array. Input number - hight of the pyramid.
	//fill the pyramid and print it
	//Example: for input 5 it should be like
	//    #    
	//   ###   
	//  #####  
	// ####### 
	//#########
	
	public static char[][] array;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the hight of pyramid: ");
        int hight = sc.nextInt();
        array = new char[hight][hight * 2 -1];
        for(int i = 0; i < hight; i++){
            for(int j = 0; j < hight * 2 - 1; j++){
                if(j < hight - i - 1) array[i][j] = ' ';
                if(j >= hight - i - 1) array[i][j] = '#';
                if(j > hight + i - 1) array[i][j] = ' ';
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}

