//Q.4 Write a Java program to break an integer into a sequence of individual



package javaprogram2;
import java.util.Scanner;

public class Seq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner in = new Scanner(System.in);
	        System.out.print("Input six non-negative digits: ");
	        int input = in.nextInt();
	        int n1 = input / 100000 % 10;
	        int n2 = input / 10000 % 10;
	        int n3 = input / 1000 % 10;
	        int n4 = input / 100 % 10;
	        int n5 = input / 10 % 10;
	        int n6 = input % 10;
	      System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);

	    }
	}

	


