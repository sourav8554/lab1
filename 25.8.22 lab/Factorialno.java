package javaprogram2;

import java.util.Scanner;

public class Factorialno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	        
	       System.out.println("Enter the number: ");
	        int num=sc.nextInt();
	        int i=1,fact=1;
	        while(i<=num)
	        {
	            fact=fact*i;
	            i++;
	        }
	        System.out.println("Factorial number is: "+fact);  
	     }   
	
	}


