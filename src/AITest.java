import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AITest {

	Board b = new Board();
	State testState;

	@Before
	public void setUp() throws Exception {
		b.makeMove(new Move(Player.RED, 0));
		b.makeMove(new Move(Player.RED, 0));
		testState = new State(Player.RED, b, new Move(Player.RED, 0));
		AI.createGameTree(testState, 3);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testThat4inRowIsLeaf() {
		assertTrue(testState.getChildren().length==0);
		for(State s:testState.getChildren()){
			if(s.getBoard().hasConnectFour()!=null){
				assertTrue(s.getChildren().length!=0);
			}
		}
	}


}
