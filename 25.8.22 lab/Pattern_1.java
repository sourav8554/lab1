package javaprogram2;

import java.util.Scanner;

public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int k = s.nextInt();
 
     
        for (int i = 1; i <= k; i++) {
 
           
            for (int j = k; j >= i; j--) {
                System.out.print(" ");
            }
 
            
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
 
            
            System.out.println();
        }
    }
}
	
	





