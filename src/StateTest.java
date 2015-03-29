import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class StateTest {
	
    /**
     * 
     * INITIALIZE CHILDREN
     * 
     * Retrieves the possible moves and initializes this State's children.
     * The result is that this State's children reflect the possible
     * States that can exist after the next move. Remember, in the
     * children it is the opposite player's turn. This method
     * initializes only this State's children; it does not recursively
     * initialize all descendants.
     */

	Board b = new Board();
	State s; 

	@Before
	public void setUp() throws Exception {
		s = new State(Player.RED, b, null);
		s.initializeChildren();
	}



	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testThatItIsOppositePlayersTurnInChildren() {
		assertTrue(s.getChildren()[0].getPlayer()!=s.getPlayer());
	}
	
	@Test
	public void testThatThereAre7Children(){
		assertTrue(s.getChildren().length==7);
	}
	
	

}
