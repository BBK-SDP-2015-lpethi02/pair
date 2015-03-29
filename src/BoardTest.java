import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BoardTest {

	Board b = new Board();

	@Before
	public void setUp() throws Exception {
		State s = new State(Player.RED, b, null);
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * 
	 * Get Possible Moves
	 * 
	 * 
	 * Return an array of all moves that can possibly be made by Player p on
	 * this board. The moves must be in order of increasing column number. Note:
	 * The length of the array must be the number of possible moves. Note: If
	 * the board has a winner (four things of the same colour in a row), no move
	 * is possible because the game is over. Note: If the game is not over, the
	 * number of possible moves is the number of columns that are not full.
	 * Thus, if all columns are full, return an array of length 0.
	 */

	@Test
	public void testForWinner() {
		b.makeMove(new Move(Player.RED, 0));
		b.makeMove(new Move(Player.RED, 0));
		b.makeMove(new Move(Player.RED, 0));
		b.makeMove(new Move(Player.RED, 0));
		assertTrue(b.getPossibleMoves(Player.YELLOW).length == 0);
	}

	@Test
	public void testGetPossibleMovesReturnsExactLength() {
		b.makeMove(new Move(Player.RED, 0));
		b.makeMove(new Move(Player.YELLOW, 0));
		b.makeMove(new Move(Player.RED, 0));
		assertTrue(b.getPossibleMoves(Player.YELLOW).length == 7);
	}
	
	@Test
	public void checkForIncreasingColumnNumber() {
		b.makeMove(new Move(Player.YELLOW, 0));
		b.makeMove(new Move(Player.RED, 0));
		b.makeMove(new Move(Player.YELLOW, 0));
		assertTrue(b.getPossibleMoves(Player.YELLOW)[0].getColumn() < b.getPossibleMoves(Player.YELLOW)[1].getColumn());
	}

	public void test2() {
		assertTrue(true);
	}

}
