// use this class in deck.java
public class Card {
	
	// properties
	private int suit; // anything outside the class cannot access private 
	private int value;
	// get & set methods - right click - source and generate get and set - once you have declared suit and value
	public int getSuit() {
		return suit;
	}


	public void setSuit(int suit) {
		this.suit = suit;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}
	
	// constructor - special function - fn that gets called when object is created - a constructor has the 
	//exact same name as the class - constructors should be public - anyone should be able to create an instance of your class
	//constructor - almost every method has a return type - even if return type is void
	//can have as many versions of the function as you like as long as the no of parameters different
	public Card (){
		
	}
	
	public Card (int value, int suit){
		this.value = value;
		this.suit = suit;
	}

	// other methods
	public void display() {
		// display the card
		//System.out.println("value:" + value + ", suit:" + suit);
		
		//String c = " " + value;
		
		String c = "";
		
		switch (value){
		case 1:
			c = "A";
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			c = "" + value;
			break;
		case 10:
			c = "" + value;
			break;
		case 11:
			c = "J";
			break;
		case 12:
			c = "Q";
			break;
		case 13:
			c = "K";
			break;
			default: break;
		}	
			
	if (suit == 1) {
			c = c + "H ";
		} else if (suit == 2){
			c = c + "S ";
		} else if (suit == 3){
			c = c + "C ";
		} else if (suit == 4){
		c = c + "D ";
		} else {
		c = c+ "?";}
		
		System.out.print(c);
		
		}


	public static void main(String[] args) { // public anyone can access the public 
		// TODO Auto-generated method stub

			Card card = new Card (1,1); // object of type card - 1 and 1 will be Ace of hearts, suit and value
			Card card2 = new Card (13, 4);// King of Diamonds
			
			card.display(); // should display AH - ace of hearts
			card2.display(); // should display KD
			
			//System.out.println();
			//should really test all 52 cards
			
			for (int s=1; s<=4; s++){
				for (int v=1; v<=13; v++){
					Card c = new Card(v,s);
				c.display();
			}
	}

		// now test some out of bounds conditions
		Card c = new Card (0,0);
		c.display();

	

}
}