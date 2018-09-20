import java.util.List;
import java.util.ArrayList;

public class Hand {
	List<Card> hand;
	
	public Hand() {
		this.hand = new ArrayList<Card>();
	}
	
	public List<Card> getHand(){
		return this.hand;
	}
	
	public String getCardName(int x) { //for testing
		return this.hand.get(x).getName();
	}
	
	public int getCardValue(int x) { //for testing
		return this.hand.get(x).getValue();
	}
	
	public int getHandValue() {
		int x = 0;
		for(int i = 0; i <this.hand.size();i++) { 
			x = x + (this.hand.get(i).getValue());
		}
		return x;
	}
	
	public void printHand() {
		int x = 0;
		for(int i = 0; i <this.hand.size();i++) {
			System.out.print(this.hand.get(i).getName()+ ",");
		}
		for(int i = 0; i <this.hand.size();i++) { 
			x = x + (this.hand.get(i).getValue());
		}
		System.out.print(" And the value of the hand is: "+ x );
		System.out.println();
	}
	
	public boolean soft17(){
		for(int i = 0; i <this.hand.size();i++) { 
			if(this.hand.get(i).getValue() == 11) {
				return true;
			}
		}
		return false;
	}
	
	public void printDealerHand() {
		int x = 0;
		System.out.print("Facedown,");
		for(int i = 1; i <this.hand.size();i++) {
			System.out.print(this.hand.get(i).getName()+ ",");
		}
		for(int i = 0; i <this.hand.size();i++) { 
			x = x + (this.hand.get(i).getValue());
		}
		System.out.print(" And the value of the hand is: ?");
		System.out.println();
	}
	
	public boolean checkBust() {
		int x = 0;
		for(int i = 0; i <this.hand.size();i++) { 
			x = x + (this.hand.get(i).getValue());
		}
		if (x > 21) {
			for(int i = 0; i <this.hand.size();i++) { 
				if(this.hand.get(i).getValue() == 11) {
					this.hand.get(i).setValue(1);
					return (this.checkBust());
				}
			}
			return true;
		}
		return false;
	}
	
	public int stand() {
		int x = 0;
		for(int i = 0; i <this.hand.size();i++) { 
			x = x + (this.hand.get(i).getValue());
		}
		return x;
	}
	
	public boolean checkBlackjack() {
		int x = 0;
		for(int i = 0; i <this.hand.size();i++) { 
			x = x + (this.hand.get(i).getValue());
		}
		if (x == 21) {
			return true;
		}
		return false;
	}
}
