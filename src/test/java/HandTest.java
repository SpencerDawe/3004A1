import junit.framework.TestCase;

public class HandTest extends TestCase{
	
	public void testCheckBust() {
		Deck decktest = new Deck();
		decktest.add("H3", 3);
		decktest.add("DA",11);
		decktest.add("DJ",10);
		Hand testhand = new Hand();
		decktest.deal(testhand);
		decktest.hit(testhand);
		assertEquals(true,testhand.checkBust());
	}
	
	public void testCheckBust2() {
		Deck decktest = new Deck();
		decktest.add("DA",11);
		decktest.add("DJ",10);
		Hand testhand = new Hand();
		decktest.deal(testhand);
		assertEquals(false,testhand.checkBust());
	}
	
	public void testCheckBlackjack() {
		Deck decktest = new Deck();
		decktest.add("DA",11);
		decktest.add("DJ",10);
		Hand testhand = new Hand();
		decktest.deal(testhand);
		assertEquals(true,testhand.checkBlackjack());
	}
	
	public void testCheckBlackjack2() {
		Deck decktest = new Deck();
		decktest.add("D2",2);
		decktest.add("DJ",10);
		Hand testhand = new Hand();
		decktest.deal(testhand);
		assertEquals(false,testhand.checkBlackjack());
	}
	
	public void testStand() {
		Deck decktest = new Deck();
		decktest.add("H3", 3);
		decktest.add("DA",11);
		Hand testhand = new Hand();
		decktest.deal(testhand);
		assertEquals(14,testhand.stand());
	}
}
