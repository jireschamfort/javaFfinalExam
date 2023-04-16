package week6codingAssignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Player {
	 List<Card> hand = new ArrayList<Card>();
	 String name;
	int score;
	
	public  void describe() {
		System.out.println( this.name  );
		System.out.println("List of Cards");
		for(Card card:hand) {
			System.out.println(card);
		}
	}
	
	
	public Player(String name, List<Card> hands) {
		this.score=0;
	}
	public   Card flip() {
		this.hand.remove(0);
		return hand;
	}
}
