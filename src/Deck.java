
public class Deck {

	// properties
	private Card[] cards = new Card[52];
	
	
	//get & set methods
	
	public Card[] getCards() {
		return cards;
	}


	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	
	// constructor(s) //same name as the class, no return value, 
	public Deck() {
		// created an instance of each card
		int n = 0;
		for (int s=1; s<=4; s++){
			for (int v=1; v<=13; v++){
				Card c = new Card(v,s);
				cards[n++] = c;
			}
		}
		
	}
	
	
	// other methods
	public void display() {
		//TODO needs to be finished
		
	for (int i =0; i<cards.length; i++) {
		cards[i].display();
		
		if (i == 12 || i == 25 || i == 38 || i == 51) {
			System.out.println();
		}
		
	}
		
}

	public void shuffle(int n) {
		//TODO needs to be finished
		
		
		for (int i=0; i < n ; i++ ) {
		int r1 = (int)(Math.random() * 52); //0.1 to 1.0 * 51 and int should leave with no 0-51
		int r2 = (int)(Math.random() * 52);
		
		// swap the variables - need temp variable to swap
		
		Card t = cards[r1];
		cards[r1] = cards[r2];
		cards[r2] = t;

		} // end of for loop
		
	} // end of public void shuffle


	public static void main(String[] args) {
		
		System.out.println("test");
		System.out.print("this \n has \n a \n newline \n");
		
		System.out.println("a \t n \t c \t\n"); // good for columnar things
		System.out.println("xxx\tyyy\tzzz\twww\n");
		
		// TODO Auto-generated method stub
		
		Deck deck = new Deck();
		
		deck.display();
		
		deck.shuffle(1);
		
		deck.display();
		
		deck.shuffle(10);
		
		deck.display();
		
		deck.shuffle(100);
		
		deck.display();
		
		deck.shuffle(1000);
		
		deck.display();

	}

}
