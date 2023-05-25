package week00;

import java.util.*;

public class Week04QuizProblem4 {

	private static List<String> returnValuesForKeysStartingWithA( Map<String, String> dictionary) {
		List<String> resultList = new ArrayList<>();
		Set<String> keySet = dictionary.keySet();
		
		//System.out.println(keySet);
		
		for(String key: keySet) {
			if( key.toLowerCase().charAt(0) == 'a') {
				resultList.add(dictionary.get(key));
			}
		}
		
		return resultList;

}
	
	
	public static void main(String[] args) {
		Map<String, String> myMap = new HashMap<String, String>();
		
		myMap.put("Alex", "Someone i dont like much");
		myMap.put("Roberto", "Someone i like a little");
		myMap.put("Amigo", "My hispanic friend");
		myMap.put("Berny", "He is okay");
		myMap.put("anthony", "This is my cousin!");
		
		System.out.println(returnValuesForKeysStartingWithA(myMap));
		System.out.println("Number of entries in javaDictionary: " + myMap.size());
		System.out.println(myMap);
	}
	

}