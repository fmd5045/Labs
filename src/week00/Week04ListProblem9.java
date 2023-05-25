package week00;

//import java.io.*;
import java.util.*;

public class Week04ListProblem9 {
static void beginEnd(int endNum) {
	    
	    // WRITE YOUR CODE HERE
	    if(endNum>0){
            List<Integer> newList = new ArrayList<Integer>();
            
            for(int i=1; i<=endNum; i++){
                newList.add(i);
            }
            System.out.println("The first number in the List is " + newList.get(0));
            System.out.println("The last number in the List is "+ newList.get(newList.size()-1));
            
	    }
	    else{
	        System.out.println("Your List cannot be created with a number less than one.");
	    }
}
}

