import junit.framework.TestCase;

public class DeckTest extends TestCase{
	
	public void testShuffle() {
		Deck counter = new Deck();
		assertEquals(52,counter.shuffle());
	}
	
	public void testDeal() {
		Deck decktest = new Deck();
		decktest.add("DA",11);
		decktest.add("DJ",10);
		Hand testhand = new Hand();
		decktest.deal(testhand);
		assertEquals("DJ",testhand.getCardName(0));
		assertEquals("DA",testhand.getCardName(1));
	}
	
	public void testHit() {
		Deck decktest = new Deck();
		decktest.add("H3", 3);
		decktest.add("DA",11);
		decktest.add("DJ",10);
		Hand testhand = new Hand();
		decktest.deal(testhand);
		decktest.hit(testhand);
		assertEquals("H3",testhand.getCardName(2));
	}
	
	public void testHit2() {
		Deck decktest = new Deck();
		decktest.add("H3", 3);
		decktest.add("D2",2);
		decktest.add("H2",2);
		decktest.add("DJ",10);
		Hand testhand = new Hand();
		decktest.deal(testhand);
		decktest.hit(testhand);
		decktest.hit(testhand);
		assertEquals("D2",testhand.getCardName(2));
		assertEquals("H3",testhand.getCardName(3));
	}
	
	public void testJQK() {
		Deck decktest = new Deck();
		decktest.add("DQ",10);
		decktest.add("DJ",10);
		decktest.add("DK",10);
		Hand testhand = new Hand();
		decktest.deal(testhand);
		decktest.hit(testhand);
		assertEquals("DK",testhand.getCardName(0));
		assertEquals("DJ",testhand.getCardName(1));
		assertEquals("DQ",testhand.getCardName(2));
	}
}