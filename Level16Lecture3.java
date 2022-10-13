
public class Level16Lecture3 {

	//https://javarush.ru/quests/lectures/questsyntaxpro.level12.lecture03
	//create your own ArrayList implementation.
	
	public static void main(String[] args) {
        CustomStringArrayList arrayList = new CustomStringArrayList();
        for(int i = 0; i < 25; i++) {
            arrayList.add("count" + i);
        }
	}
}

	class CustomStringArrayList {

	    private int size;
	    private int capacity;
	    private String[] elements;

	    public CustomStringArrayList() {
	        capacity = 10;
	        size = 0;
	        elements = new String[capacity];
	    }

	    public void add(String element) {
	        if (size == capacity) {
	            grow();
	        }
	        elements[size] = element;
	        size++;
	    }

	    private void grow() {
	    	//increase capacity x1.5 for new Array
	        capacity *= 1.5;
	        String[] newArr = new String[capacity];
	        int i = 0;
	        for(String s : elements){
	            newArr[i++] = s;
	        }
	        elements = newArr;
	    }

	}

