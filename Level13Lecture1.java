import java.util.ArrayList;
import java.util.Iterator;

public class Level13Lecture1 {
	//package com.javarush.task.pro.task13.task1305;
	//create ArrayLists with Strings.
	//Iterate through collection and remove String "bug".
	
	//just "for-each" iteration does not work here
	//because it is not possible to iterate and remove element 
	//from same collection.
	
	//use 3 different ways to remove it.
	//case ignoring: Bug, bUg, bug, BUG.
	
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
	        
	        removeBugWithFor(copyWordsFirst);
	        removeBugWithWhile(copyWordsSecond);
	        removeBugWithCopy(copyWordsThird);
	        
	        copyWordsFirst.forEach(System.out::println);
	        String line = "~~~~~~~~~~";
	        System.out.println(line);
	        copyWordsSecond.forEach(System.out::println);
	        System.out.println(line);
	        copyWordsThird.forEach(System.out::println);
	        System.out.println(line);

	}
	
	//"For" cycle for iterating through the collection
    public static void removeBugWithFor(ArrayList<String> list) {
    	for(int i = 0; i < list.size(); i++){
            if(list.get(i).equalsIgnoreCase("bug")){ 
                list.remove(i);
                i--;
            }
        }
    }
    
    //Explicit casting with Iterator object for iterating through the collection
    public static void removeBugWithWhile(ArrayList<String> list) {
        Iterator it = list.iterator();
        while(it.hasNext()){
            String s = (String)it.next();
            if(s.equalsIgnoreCase("bug")) it.remove();
        }
    }

    //Iterating through copy of collection and removing element from original collection.
    public static void removeBugWithCopy(ArrayList<String> list) {
        ArrayList<String> listCopy = new ArrayList<>(list);
        for(String s : listCopy){
            if(s.equalsIgnoreCase("bug")) list.remove(s);
        }
    }
}
