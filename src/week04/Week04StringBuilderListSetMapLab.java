//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package week04;
//import java.io.*;
import java.util.*;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
		List<Character> alphabet = new ArrayList<>();
		for(int i = 97; i < (97 + 26); i++){
		    alphabet.add((char)i);
		}

		alphabet.remove(0);
		System.out.println(alphabet);
		
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length
			List<String> newList = new ArrayList<>();
			newList.add("Knicks");
			newList.add("Lakers");
			newList.add("Heat");
			newList.add("Nuggets");
			newList.add("Celtics");
		
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
			
			System.out.println("The shortest string on the list is: "+longestString(newList));
		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
			System.out.println("My list is: "+ switchingFirstAndLast(newList));
		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
			System.out.println("My concatinated string is: "+ concatinatedStrings(newList));
		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
			List<String> anotherList = new ArrayList<>();
			anotherList.add("Appreciation"); 
			anotherList.add("Hospital");
			anotherList.add("Falling");
			anotherList.add("Purification");
			anotherList.add("Aviation");
			anotherList.add("ionic");
			
			String word = "ion";
			
			System.out.println("Words on my list that contain ion : "+ inclusionOfStringInList(anotherList,word));
		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5

		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
			System.out.println("The length of each string on the list are :"+lenghtOfEachString(anotherList));

		
		// 9. Create a set of strings and add 5 values
			Set<String> carMakes = new HashSet<>();
			carMakes.add("Honda");
			carMakes.add("Toyota");
			carMakes.add("BWM");
			carMakes.add("Mercedes");
			carMakes.add("Ford");
			
			System.out.println("Items on the car list are :"+carMakes);
		
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
			char testingChar = 'b';
			Set<String> testingSet = new HashSet<>();
			testingSet.add("Buffalo");
			testingSet.add("Bingo");
			testingSet.add("Domino");
		    testingSet.add("Cart");
		    testingSet.add("beautiful");
			
			System.out.println("The words on the set that start with "+testingChar+" are "+wordsThatStartWithChar(testingSet, testingChar));

		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
			System.out.println("The new set to a string are: "+setToList(testingSet));
		

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set


		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word

	
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)

		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
		

	}
	
	// Method 3:
	public static String longestString(List<String> someList) {
		String shortestString = someList.get(0);
		for(String item: someList) {
			if(shortestString.length()<item.length()) {
				shortestString = item;
			}
		}
		return shortestString;
	}
	
	//Method 4:
	public static List<String> switchingFirstAndLast(List<String> someList) {
		List<String> newList = new ArrayList<>(someList);
		newList.set(0,someList.get(someList.size()-1));
		newList.set(someList.size()-1,someList.get(0));
		
		return newList;	
	}
	
	//Method 5:
	public static String concatinatedStrings(List<String> someList) {
		String concat = "";
		for(int i=0 ; i < someList.size()-1; i++) {
			concat+= someList.get(i)+", ";
		}
		concat+=someList.get(someList.size()-1)+".";
		return concat;
	}
	
	//Method 6:
	public static List<String> inclusionOfStringInList(List<String> someList, String word) {
		List<String> newList = new ArrayList<String>();
		for(String item: someList) {
			if( item.contains(word)) {
				newList.add(item);
			}
		}
		return newList;
	}
	
	//Method 7:
	
	
	// 7. Write and test a method that takes a list of integers 
	//			and returns a List<List<Integer>> with the following conditions specified
	//			for the return value:
	//		a. The first List in the returned value contains any number from the input list 
	//			that is divisible by 2
	//		b. The second List contains values from the input list that are divisible by 3
	//		c. The third containing values divisible by 5, and 
	//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
	
	
	//Method 8:
		public static List<Integer> lenghtOfEachString(List<String> stringList) {
			List<Integer> newList = new ArrayList<>();
			for(String len: stringList) {
				newList.add(len.length());
			}
			return newList;
		}
	//Method10:
		public static Set<String> wordsThatStartWithChar(Set<String> someSet, char character) {
			Set<String> newSet = new HashSet<>();
			for(String item: someSet) {
				if(item.charAt(0) == character) {
					newSet.add(item);
				}
			}
			return newSet;
		}
			
	//Method 11:
		public static List<String> setToList(Set<String> someSet) {
			List<String> newList = new ArrayList<>(someSet);
			return newList;
		}

	// Method 15:
	
	
	
	// Method 14:
	

	
	// Method 12:
	

	
	// Method 11:
	


	// Method 10:
	

	
	// Method 8:
	

	
	// Method 7:
	

	
	// Method 6:
	

	
	// Method 5:
	
	
	
	// Method 4:
	
	
	
	// Method 3:
	
	

}