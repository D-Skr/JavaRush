import java.util.ArrayList;

public class Level13Lecture1 {
	//package com.javarush.task.pro.task13.task1305;
	//create ArrayLists with Strings
	//Iterate through collection and remove String "bug"
	//use 3 different ways to remove it.
	//case ignoring
	
	public static void main(String[] args) {
		 ArrayList<String> words = new ArrayList<>();
	        words.add("Hello world!");
	        words.add("Bob");
	        words.add("Elly");
	        words.add("Sam");
	        words.add("Bug");
	        words.add("bug");
	        words.add("B ug");
	        words.add("Bill");

	        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
	        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
	        ArrayList<String> copyWordsThird = new ArrayList<>(words);

	}

}
