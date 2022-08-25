package javaprogram2;

import java.util.Scanner;

public class Prime_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num, i, count=0;
	      Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter a Number: ");
	      num = s.nextInt();
	      
	      for(i=2; i<num; i++)
	      {
	         if(num%i == 0)
	         {
	            num++;
	            break;
	         }
	      }
	      
	      if(num==0)
	         System.out.println("this is a Prime Number.");
	      else
	         System.out.println("this is not a Prime Number.");
	   }
	

	}


