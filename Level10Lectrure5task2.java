public class Level10Lectrure5task2 {

	//package com.javarush.task.pro.task09.task0914;
	//update jdk path
	
	public static void main(String[] args) {
		String path = "/usr/java/jdk1.8/bin/";
        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int firstIndex = path.indexOf("jdk");
        System.out.println(firstIndex);
        int lastIndex = path.indexOf("/", firstIndex);
        System.out.println(lastIndex);
        String oldJdk = path.substring(firstIndex, lastIndex);

        return path.replace(oldJdk, jdk);
    }
}