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
		/*if (username.equals("samy123") && password.equals("12345")) {
		 System.out.println("Welcome back " + username);
		    } else { 
		 System.out.println("Inaccurate credentials!"); 
		} // end of else 
		 }   // end of main() 
		}  // end of UserInputDemo class*/
