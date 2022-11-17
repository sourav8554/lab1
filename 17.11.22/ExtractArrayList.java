//Write a Java program to extract a portion of an array list.

package javaprogram1;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtractArrayList {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>(Arrays.asList("red","blue","white","green","black","pink"));
		System.out.println(al);
		System.err.println(al.subList(0, 3));//extracting from position 1 to 4
	}

}