import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> deckOfCards;
	
	public Deck() {
		this.deckOfCards = new ArrayList<Card>();
		
		for(int i = 2; i <=10;i++) {
			deckOfCards.add(new Card("D"+ i,i));
		}		
		deckOfCards.add(new Card("DA",11));
		deckOfCards.add(new Card("DJ",10));
		deckOfCards.add(new Card("DQ",10));
		deckOfCards.add(new Card("DK",10));
		
		for(int i = 2; i <=10;i++) {
			deckOfCards.add(new Card("S"+ i,i));
		}
			deckOfCards.add(new Card("SA",11));
			deckOfCards.add(new Card("SJ",10));
			deckOfCards.add(new Card("SQ",10));
			deckOfCards.add(new Card("SK",10));
			
		for(int i = 2; i <=10;i++) {
			deckOfCards.add(new Card("C"+ i,i));
		}
			deckOfCards.add(new Card("CA",11));
			deckOfCards.add(new Card("CJ",10));
			deckOfCards.add(new Card("CQ",10));
			deckOfCards.add(new Card("CK",10));
			
		for(int i = 2; i <=10;i++) {
			deckOfCards.add(new Card("H"+ i,i));
		}
			deckOfCards.add(new Card("HA",11));
			deckOfCards.add(new Card("HJ",10));
			deckOfCards.add(new Card("HQ",10));
			deckOfCards.add(new Card("HK",10));
	}
	
	public int shuffle() {
		Collections.shuffle(deckOfCards);
		return deckOfCards.size();
	}
	
	public void deal(Hand hand) {
		
		Card topCard = deckOfCards.remove(0);
        hand.getHand().add(topCard);
        Card topCard2 = deckOfCards.remove(0);
        hand.getHand().add(topCard2);
	}
	
	public void hit(Hand hand) {
		Card topCard = deckOfCards.remove(0);
        hand.getHand().add(topCard);
	}
	
	public void add(String s, int n) { //used in tests
		deckOfCards.add(0,(new Card(s,n)));
	}
}
