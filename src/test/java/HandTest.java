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
	
	public void testAce11() {
		Deck decktest = new Deck();
		decktest.add("H3", 3);
		decktest.add("DA",11);
		Hand testhand = new Hand();
		decktest.deal(testhand);
		assertEquals(11,testhand.getCardValue(0));
	}
	
	public void testAce1() {
		Deck decktest = new Deck();
		decktest.add("H3", 3);
		decktest.add("DK",10);
		decktest.add("DA",11);
		Hand testhand = new Hand();
		decktest.deal(testhand);
		decktest.hit(testhand);
		assertEquals(1,testhand.getCardValue(0));
	}
	
	public void testAce11then1() {
		Deck decktest = new Deck();
		decktest.add("H3", 3);
		decktest.add("DA",11);
		decktest.add("DK",10);
		Hand testhand = new Hand();
		decktest.deal(testhand);
		assertEquals(11,testhand.getCardValue(1));
		decktest.hit(testhand);
		assertEquals(1,testhand.getCardValue(1));
	}
	
	public void testAcetwo1() {
		Deck decktest = new Deck();
		decktest.add("H3", 3);
		decktest.add("DK",10);
		decktest.add("DA",11);
		decktest.add("HA",11);
		Hand testhand = new Hand();
		decktest.deal(testhand);
		decktest.hit(testhand);
		decktest.hit(testhand);
		assertEquals(1,testhand.getCardValue(1));
		assertEquals(1,testhand.getCardValue(0));
	}
	
	public void testAceOne1One11() {
		Deck decktest = new Deck();
		decktest.add("H3", 3);
		decktest.add("DA",11);
		decktest.add("HA",11);
		Hand testhand = new Hand();
		decktest.deal(testhand);
		decktest.hit(testhand);
		assertEquals(11,testhand.getCardValue(1));
		assertEquals(1,testhand.getCardValue(0));
	}
	
	
}
