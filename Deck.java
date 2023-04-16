package week6codingAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//import Card;

public class Deck {
	List<Card>cards = new ArrayList<Card>();
	
	
	public   Deck() {
		int[] values = new int[12];
		for(int i=2 ; i<=11; i++) {
			values[i-2]=i;
		}
		String[] names= {"Diamonds","Hearts","Spades","Clubs",};
		for (int value:values) {
			
		
				for(String name:names) {
					Card card =new Card(value , name);
					this.cards.add(card);
	}
		}
		}
	
	
	
	
	
	
	
	
	
	
	
	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

public void describe() {
	for (Card card:cards) {
		card.describe();
	}
	
}









	public   void shuffle () {
		Collections.shuffle(cards);	
	}
	
	
	public  Card draw( ) {
		Card card = this.cards.remove(0);
		
	return card ;	
	}

}

