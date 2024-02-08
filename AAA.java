package collectiondemos;

import java.util.LinkedList;

import java.util.Iterator;

public class AAA {

	public static void main(String[] args) {
		
        LinkedList<String> abc = new LinkedList<String>();
		
		abc.add("Please");
		abc.add("Sit");
		abc.add("Down");
		
        Iterator<String> it = abc.iterator();
        
        System.out.println("The elements of the LinkedList: ");
        
        int j = 0;
        
        while(it.hasNext()) {
        	
        	System.out.println("The element at index: " + j + " ");
        	String str = it.next();
        	
        	System.out.println(str);
        	System.out.println("\n");
        	
        	j++;
        	
        }
        
        
        }

}
