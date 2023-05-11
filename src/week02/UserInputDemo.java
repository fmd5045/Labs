package week02;
import java.util.*; 
public class UserInputDemo {

	public static void main(String[] args)  {
		// System.in is a standard input stream  
		Scanner sc= new Scanner(System.in);    
		System.out.print("What is your first name:  ");   
		String firstName = sc.nextLine();   
		System.out.print("What is your last name: "); 
		String lastName = sc.nextLine();               
		System.out.println("Pleassure to meet you "+firstName+" "+ lastName+"!");
	}
}


//bmi calc
// for imperial system its 703*(weight[lbs]/height^2[in])
// for metric system its weight[kg]/height[meters]