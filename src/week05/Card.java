package week05;

public class Card {
	// 		a. name field
	String name;
	//		b. suit field
	String suit;
	//		c. value field for comparing against other cards.
	int value;
	
	void describe(){
	//		a. describe() to display the card information to the Console.
		System.out.println(name+" of "+suit+ " with a value of "+value);
		
	}
	
	//Constructor
	public Card(String name,String suit,int value){
		this.name = name;
		this.suit = suit;
		this.value = value;
	}
	
	//Re adding the default constructor
	public Card() {}
	
	//		b. Getters & Setters 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}
