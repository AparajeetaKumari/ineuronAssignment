package gettingStarted;

import java.util.Scanner;

public class SwapNumbers {
	
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the value of a and b"); 
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = a;
		a = b;
		b= x;
		System.out.println("Swapped values:: a="+a + "," +"b=" +b); 
		
	}

}
