/*1. Develop a java class with a method storeEvenNumbers(int N) using ArrayList to store 
even numbers from 2 to N, where N is a integer which is passed as a parameter to the 
method storeEvenNumbers(). The method should return the ArrayList (A1) created. 
2. In the same class create a method printEvenNumbers()which iterates through the 
arrayList A1 in step 1, and It should multiply each number with 2 and display it in format 
4,8,12….2*N. and add these numbers in a new ArrayList (A2). The new ArrayList (A2)
created needs to be returned.
3. Create a method retrieveEvenNumber(int N) parameter is a number N. This method 
should search the arrayList (A1) for the existence of the number ‘N’ passed. If exists it 
should return the Number else return zero.
Hint: Use instance variable for storing the ArrayList A1 and A2.
NOTE: You can test the methods using a main method.*/


package Lab_17thNov;

import java.util.ArrayList;

public class TestQuestion {


	ArrayList<Integer> num = new ArrayList<Integer>();
	ArrayList<Integer> num2 = new ArrayList<Integer>();
	
	public ArrayList<Integer> storeEvenNumbers(int N) {
		for(int i = 2; i<N ; i=i+2)
			num.add(i);
		return num;
	}
	public ArrayList<Integer> printEvenNumbers() {
		for(int i : num)
			num2.add(i*2);
		return num2;
	}
	public int retrieveEvenNumbers(int N) {
		int n = 0;
		for(int i : num) {
			if(i==N) 
				n = N;
		}
		return n;
	}
	public static void main(String[] args) {
		
		TestQuestion ev = new TestQuestion();
		System.out.println(ev.storeEvenNumbers(25));
		System.out.println(ev.printEvenNumbers());
		System.out.println(ev.retrieveEvenNumbers(14));
		System.out.println(ev.retrieveEvenNumbers(30));
	}
}