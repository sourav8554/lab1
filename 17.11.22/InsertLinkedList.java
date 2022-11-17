

//Write a Java program to insert the specified element at the front of a
//linked list.

package javaprogram1;

import java.util.LinkedList;
import java.util.List;

public class InsertLinkedList {

	public static void main(String[] args) {
		LinkedList<String>ll=new LinkedList<>();//creating linked list
		ll.add("Rose");//adding elements to the list
		ll.add("Sunflower");
		ll.add("Jasmine");
    System.err.println(ll);//printing the list
      ll.addFirst("Orchid");//adding Orchid in the 1st position
      System.err.println(ll);
	}
}