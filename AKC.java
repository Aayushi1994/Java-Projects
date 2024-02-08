//Java program to get the elements of Linkedlist 

package collectiondemos;

import java.util.LinkedList;

public class AKC {

	public static void main(String[] args) {
		
		LinkedList<String> akc = new LinkedList<String>();
		
		akc.add("Apple");
		akc.add("Mango");
		akc.add("Lime");
		
		System.out.println("LinkedList elements: ");
		
		for(int i=0; i < akc.size(); i++) {
			System.out.println("The element at index "+ i + "is: " + akc.get(i));
		}
			

	}

}
