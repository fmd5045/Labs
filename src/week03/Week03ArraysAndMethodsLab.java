//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//


package week03;

import java.io.*;
import java.util.*;

public class Week03ArraysAndMethodsLab {
	

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
			int[] arrayOfInts = { 1, 5, 2, 8, 13, 6};
		
		// 2. Print out the first element in the array
			System.out.println(arrayOfInts[0]);
		
		// 3. Print out the last element in the array without using the number 5
			System.out.println(arrayOfInts[arrayOfInts.length-1]);
		
		// 4. Print out the element in the array at position 6, what happens?
			//System.out.println(arrayOfInts[6]);
			//Error "Index 6 out of bounds for length 6"
			
		// 5. Print out the element in the array at position -1, what happens?
			//System.out.println(arrayOfInts[-1]);
			//Error "Index -1 out of bounds for length 6"
			
		// 6. Write a traditional for loop that prints out each element in the array
			System.out.println(">>Start of question #6<<");
			for(int i =0; i<arrayOfInts.length; i++) {
				System.out.println(arrayOfInts[i]);
			}
			
		// 7. Write an enhanced for loop that prints out each element in the array
			System.out.println(">>Start of question #7<<");
			for(int num: arrayOfInts) {
				System.out.println(num);
			}
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
			int sum = 0;
			for(int i =0; i<arrayOfInts.length; i++){
				sum += arrayOfInts[i];
			}
			
		// 9. Create a new variable called average and assign the average value of the array to it
			double average = sum/arrayOfInts.length;
			System.out.println("Average is: "+average);
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
			for(int num: arrayOfInts) {
				if(num%2==0) {
				System.out.println(num);
				}
			}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
			String[] names = {"Sam", "Sally", "Thomas", "Robert"};
		
		// 12. Calculate the sum of all the letters in the new array
			int totalLetters = 0;
			for(int i =0; i<names.length; i++) {
				totalLetters += names[i].length();
			}
			System.out.println(totalLetters);
			
		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
			String name = "Jordan";
			greetingPrint(name);
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
			String name2 = "Jeffrey";
			System.out.println(greetingReturn(name2));
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?	
				// Difference is that one returns a nothing and the other returns data.
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
			System.out.println("The string is larger than the integer: "+stringIsGreaterThanInt("Mountain", 15));
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
			String[] arr = {"McDonald", "BurgerKing", "Arbys", "Wendys", "Subway"};
			String str = "chuck";
			System.out.println("The array does contain the string "+ str+ " :"+ arrayContains(arr, str));
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
			int[] manyNumbers = {1,2,3,4,5,6,7,8,9,-22,45};
			System.out.println("The smallest # on the collection is: "+smallestOnList(manyNumbers));
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		double[] significantFigures = {2.22,4.34,67.3,90.123,45.09,-11.22};
		System.out.println("The average of collection is: "+ averageOnList(significantFigures));

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		String[] strArr = {"Love", "Hate", "Passion", "Joy", "Sad", "Distaste"};
		
		System.out.println("Length of each word on the array are: "+ Arrays.toString(eachWordLength(strArr)));
		
	
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
			String[] someWords = {"something","class", "teams", "java", "mango","tv","stocks"};
			System.out.println("The sum of even word length is greater than the sum of sum of odd word length: "+ oddVsEvenCompare(someWords));
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
			String wordUsed = "kayak";
			System.out.println("The word "+wordUsed+" is a palindrome: "+ palindrome(wordUsed));
			

	/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/ 
	}


	
	// Method 13:
	public static void greetingPrint(String name){
    
		System.out.println("Hello, please to meet you "+name);
	}

	// Method 14:
	public static String greetingReturn(String name) {
		return("Hello, please to meet you "+ name);
	}
	
	// Method 15:
	public static boolean stringIsGreaterThanInt(String str, int number ) {
		return (str.length()> number);
	}

	// Method 16:
	public static boolean arrayContains(String[] arr, String str) {
		boolean variable = true;
		for(int i =0; i< arr.length; i++) {
			if(arr[i].equals(str)) {
				variable =  true;
			}
			else {
				variable = false;
			}
		}
		return variable;
	}
	
	// Method 17:
	public static int smallestOnList(int[] number) {
		int smallest = number[0];
		for(int element: number) {
			if(element< smallest) {
				smallest = element;
			}
		}
		return smallest;
	}
	
	// Method 18:
	public static double averageOnList(double[] sumNumbers) {
		double sum=0;
		for(double number: sumNumbers) {
			sum+= number;
		}
		return (sum/(sumNumbers.length));
	}
	
	// Method 19:
	public static int[] eachWordLength(String[] collection) {
		int[] wordSize = new int[collection.length];
		for(int i=0; i<collection.length; i++) {
			wordSize[i] = collection[i].length();
		}
		return wordSize;
	}
	
	// Method 20:
		public static boolean oddVsEvenCompare(String[] words) {
			int evenWords = 0;
			int oddWords = 0;
			for(String word: words) {
				if(words.length%2 ==0) {
					evenWords+= word.length();
				}
				else {
					oddWords+= word.length();
				}
			}
			return evenWords>oddWords;
		}
	
	// Method 21:
		public static boolean palindrome(String word) {
			String revWord="";
			for(int i=1; i<=word.length(); i++) {
				revWord+= word.charAt(word.length()-i);
			}
			
			return(word.equals(revWord));
			
		}
		
		
		
		
}