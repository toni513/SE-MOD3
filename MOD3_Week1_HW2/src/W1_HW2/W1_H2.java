package W1_HW2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class W1_H2 {

	public static void main(String[] args) {
		
		
		ArrayList<String> arrList1 = new ArrayList<String>(
	    Arrays.asList("redball", "blueball", "yellowball")); 
		System.out.println("The Arraylist is: " + arrList1);
		
		
		ArrayList<String> arrList2 = new ArrayList<String>(
		Arrays.asList("","",""));
	
		
		Collections.copy(arrList2, arrList1);	
		System.out.println("Copying the original array list to new ArrayList: " + arrList2);
		
		
		ArrayList<String> arrList3 = new ArrayList<String>(
		Arrays.asList("ten","twenty","thirty","fourty","fifty","sixty"));
		System.out.println("Given array is: " + arrList3);
		System.out.println("I want to extract from third element to last element" + arrList3.subList(3, 6));
		
		
		ArrayList<Integer> intArr = new ArrayList<Integer>(
		Arrays.asList(10,20,30,40,50,60));
		//swap the elements using Collections
		System.out.println("Original Array List is:" + intArr);
		Collections.swap(intArr, 4, 5);
		System.out.println("Swaping elements(at position 4 and 5)in arrayList: " + intArr );
		
	
		ArrayList<Integer> intArr2 = new ArrayList<Integer>(
		Arrays.asList(10,20,30,40,50,60));
		System.out.println("The list is: " + intArr2);
		System.out.println("The arrayList is empty(true) or not empty(false): " + intArr2.isEmpty());
		
		
		ArrayList<Integer> intArr3 = new ArrayList<Integer>(
		Arrays.asList());
		System.out.println("The list is: " + intArr3);
		System.out.println("The arrayList is empty(true) or not empty(false): " + intArr3.isEmpty());


		ArrayList<String> arrList4 = new ArrayList<String>(
		Arrays.asList("Coffee","Tea","Juice","Water","Milk"));
		System.out.println("Swap elements(at position 1 and 2)in arrayList: " + intArr );
	    System.out.println("Original ArrayList: " + arrList4);		
		
	    arrList4.set(3, "Mimosa");
		System.out.println("Replace the third element: " + arrList4);
	
		
		
		ArrayList<Integer> intArr4 = new ArrayList<Integer>(6);
		intArr4.add(20);
		intArr4.add(30);		
		intArr4.trimToSize();
			for(Integer num: intArr4) {
				System.out.println("Array List = " + num);
				}
			
				
		HashSet<String> hset = new HashSet<>(3);
		System.out.println("Hash Set empty(true) / not empty(false): " + hset.isEmpty());
		hset.add("square");
		hset.add("circle");
	    hset.add("triangle");
		System.out.println("The size of Hash Set is: " + hset.size());
			for(String shapes : hset) {
				System.out.println("items in the set are: " + shapes);
				}
			
			
		String[] arr = new String[hset.size()];
		hset.toArray(arr); //converting the set to array
				
			for(String next: arr) {
				System.out.println("The item in the array is: " + next);
				}
				
			
			}

		}
	