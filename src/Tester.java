public class Tester {
	public static void main(String[] args) {
		if(testGetChildren()){System.out.println("Test State Works");};
		//testCreateGameTree();
		testMinMax();
		
	};

	public static boolean testGetChildren() {
		Board b = new Board();
		b.makeMove(new Move(Player.RED, 4));
		b.makeMove(new Move(Player.RED, 4));
		State testState = new State(Player.RED, b, new Move(Player.RED, 4));
		testState.initializeChildren();

		if (testState.getChildren().length > 0) {
			return true;
		}
		return false;
	}
	
	public static void testCreateGameTree(){
		Board b = new Board();
		b.makeMove(new Move(Player.RED, 4));
		b.makeMove(new Move(Player.RED, 4));
		State testState = new State(Player.YELLOW, b, new Move(Player.YELLOW, 1));
		AI.createGameTree(testState, 3);
		testState.writeToFile();	
	}
	
	public static void testMinMax(){
		Board b = new Board();
		b.makeMove(new Move(Player.RED, 4));
		b.makeMove(new Move(Player.RED, 4));
		State testState = new State(Player.YELLOW, b, new Move(Player.YELLOW, 1));
		AI.createGameTree(testState, 3);
		AI.minimax(new AI(Player.RED, 3),testState);
		testState.writeToFile();	
	}
}

