package week02;
import java.util.*; 
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class UserInputDemo {
	
	private static final DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args)  {
		// System.in is a standard input stream  
		Scanner sc= new Scanner(System.in); 
		System.out.print("What is your first name:  ");   
		String firstName = sc.nextLine();   
		System.out.print("What is your last name: "); 
		String lastName = sc.nextLine();   
		String fullName = firstName+ " "+ lastName;
		System.out.println("Hello "+fullName+" this program will calculate your BMI.");
		
		System.out.println("Would you like to provide your weight and height in: ");
		System.out.println("1) Kilograms and Meters OR");
		System.out.println("2) Pounds ands Inches");
		System.out.print("Unit selection: ");
		int unitSelection = sc.nextInt(); 
		
		double goodWeightLow = 0, goodWeightHigh = 0;
		double bmi = 0;
		switch(unitSelection) {
		case 1:
			System.out.print("Please Enter your weight in Kilograms: ");
			double weightkg = sc.nextDouble();
			System.out.print("Please Enter your height in Meters: ");
			double heightM = sc.nextDouble();
			bmi = (weightkg/(heightM*heightM));
			System.out.println("Your BMI is "+df.format(bmi));
			goodWeightLow = 18.5*heightM*heightM;
			goodWeightHigh = 24.9*heightM*heightM;
			break;
		case 2:
			System.out.print("Please Enter your weight in Pounds: ");
			double weightlbs = sc.nextDouble();
			System.out.print("Please Enter your height in Inches: ");
			double heightIn = sc.nextDouble();
			bmi = (703*(weightlbs/(heightIn*heightIn)));
			System.out.println("Your BMI is "+ df.format(bmi));
			goodWeightLow = (18.5/703)*heightIn*heightIn;
			goodWeightHigh = (24.9/703)*heightIn*heightIn;
			break;
		}
		if (bmi< 18.5) {
			System.out.println(fullName+" you are underweight.");
		}
		else if(bmi>=18.5 && bmi<24.9) {
			System.out.println(fullName+" you have a healthy weight.");
		}
		else if(bmi>=24.9 && bmi<29.9){
			System.out.println(fullName+" you are overweight.");
		}
		else {
			System.out.println(fullName+ " you are obese.");
		}
	System.out.println("A good weight range for you is: "+(int)goodWeightLow+"-"+(int)goodWeightHigh+"lbs.");
	//how to set it up where i can have two output options one for lbs and one kg???
	}
	
}	


//bmi calc
// for imperial system its 703*(weight[lbs]/height^2[in])
// for metric system its weight[kg]/height[meters]