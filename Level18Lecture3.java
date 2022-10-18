import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Level18Lecture3 {

	// package com.javarush.task.pro.task13.task1306;
	// implement your own Collections methods copy, addAll, replaceAll
	// reverse, rotate, shuffle, sort

	// Collections.copy(destination, source);
	public static void copy(ArrayList<String> destination, ArrayList<String> source) {
		if (destination.size() < source.size()) {
			throw new IndexOutOfBoundsException("Source does not fit in dest");
		}
		for (int i = 0; i < source.size(); i++) {
			destination.set(i, source.get(i));
		}
	}
	
	//Collections.addAll(list,strings);
    public static void addAll(ArrayList<String> list, String... strings) {
         for (String string : strings) {
             list.add(string);
         }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
