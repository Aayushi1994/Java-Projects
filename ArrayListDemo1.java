package collectiondemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class ArrayListDemo1 {
	
	public static void sortArrlist(int n, ArrayList<Integer> arr1) {
		for (int i=1;i <= n;i++) {
			
			arr1.add(i);
		}
		
		System.out.println("Arraylist: "+arr1);
		System.out.println(arr1.size());
		
		arr1.set(1, 1);
		arr1.add(2, 6);
		arr1.remove(5);
		
		System.out.println("New Array List: "+arr1);
		
		Collections.sort(arr1);
		
		System.out.println("Array list after sorting: "+arr1);
			
	}

	public static void main(String[] args) {
		
		int n = 5;
		ArrayList <Integer> arr1 = new ArrayList<>(n);
		
		ArrayListDemo1.sortArrlist(n, arr1);
		
//		for (int i=1;i <= n;i++) {
//			
//			arr1.add(i);`
//		}
//		
//		System.out.println("Arraylist: "+arr1);
//		System.out.println(arr1.size());
//		
//		arr1.set(1, 1);
//		arr1.add(2, 6);
//		arr1.remove(5);
//		
//		System.out.println("New Array List: "+arr1);
//		
//		Collections.sort(arr1);
//		
//		System.out.println("Array list after sorting: "+arr1);
//		
		
		
	}

}
