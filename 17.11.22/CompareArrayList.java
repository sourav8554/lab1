//Write a Java program to compare two array lists.

package Lab_17thNov;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareArrayList {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>(Arrays.asList("red","blue","white","green"));
		ArrayList<String>al2=new ArrayList<>(Arrays.asList("red","blue","white","black","green"));
System.out.println(al);
System.out.println(al2);

if(al.get(0).equals(al2.get(0))) {
	System.err.println("yes");
}
else System.out.println("no");
if(al.get(1).equals(al2.get(1))) {
	System.err.println("yes");
}
else System.out.println("no");
if(al.get(2).equals(al2.get(2))) {
	System.err.println("yes");
}
else System.out.println("no");
if(al.get(3).equals(al2.get(3))) {
	System.err.println("yes");
}
else System.out.println("no");
if(al2.get(4) != null) {
	System.err.println("yes");
}
else System.out.println("no");
	}

}