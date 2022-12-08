//Write a Java program to replace an element in a linked list.


package Lab_17thNov;

import java.util.LinkedList;
import java.util.List;

public class ReplaceLList {

	public static void main(String[] args) {
		List<String>ll=new LinkedList<>();//creating linked list
		ll.add("Dev");//adding elements to the list
		ll.add("Arnab");
		ll.add("Deep");
      System.out.println(ll);//printing the list before replace
      ll.set(0, "DEBKANTA");//Replacing in the position 1
      System.out.println(ll);//printing the list after replace
	}

}