package core;

import junit.framework.TestCase;

public class DeckTest extends TestCase{
	
	public void testCount() {
		Deck counter = new Deck();
		assertEquals(52,counter.count());
	}
}
