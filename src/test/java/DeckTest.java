import junit.framework.TestCase;

public class DeckTest extends TestCase{
	
	public void testShuffle() {
		Deck counter = new Deck();
		assertEquals(52,counter.shuffle());
	}
}