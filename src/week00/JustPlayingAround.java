package week00;

import java.io.*;
import java.util.*;

public class JustPlayingAround {

	public static void main(String args[]) {
		int n, temp, digit, count = 0;
		// object of the Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		// getting input from the user
		n = sc.nextInt();
		// copy the entered number in a temp variable
		temp = n;
		// the loop determines the position of the digit
		while (n > 0) {
			// dividing the number by 10
			n = n / 10;
			// increments the count variable by 1
			count++;
		}
		// the loop breaks the number into digits
		while (temp > 0) {
			// finding the remainder
			digit = temp % 10;
			// prints the position and digit
			System.out.println("Digit at place " + count + " is: " + digit);
			temp = temp / 10;
			// decrements the digit by 1
			count -- ;
		}
		
		for(int index = 0; index <= 100;index++) {
			if(index% 2 ==0 ) {
				System.out.println(index);
			}
		}
		String result = "";
		String name = "Shauna";
		for (int index = 0; index < 3; index ++) {
			result += name;
		}
		System.out.println(result);
		
		String word = "";
		for(int index = 0; index<=5; index ++) {
			word+=index;
		}
		System.out.println(word);
			
	}
}