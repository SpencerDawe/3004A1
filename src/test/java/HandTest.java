import junit.framework.TestCase;

public class HandTest extends TestCase{
	
	public void testDeal() {
		Deck counter = new Deck();
		counter.shuffle();
		Hand testHand = new Hand();
		assertEquals(2,testHand.deal());
	}
	
	public void testHit() {
		
	}
	
	public void testCheckBlackjack() {
		
	}
	
	public void testStand() {
		
	}
}
