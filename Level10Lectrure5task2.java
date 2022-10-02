public class Level10Lectrure5task2 {

	//package com.javarush.task.pro.task09.task0914;
	//update jdk path
	
	public static void main(String[] args) {

    }

    public static String changePath(String path, String jdk) {
        int firstIndex = path.indexOf("jdk");
        int lastIndex = path.indexOf("/", firstIndex);
        String oldJdk = path.substring(firstIndex, lastIndex);

        return path.replace(oldJdk, jdk);
    }
}