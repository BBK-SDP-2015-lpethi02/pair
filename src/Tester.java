import java.util.ArrayList;

public class Tester {
	public static void main(String[] args) {
		//if(testGetChildren()){System.out.println("Test State Works");};
		//testCreateGameTree();
		testMinMax();
		//testGetChildren();
		//testGetMoves();
		//testMinMaxValues();
		
	};
	
	public static void testGetMoves(){
		Board b = new Board();
		Solver et = new AI(Player.RED, 3);
		for(Move m: et.getMoves(b)){
			System.out.println(m);
		};
		
	}


	public static void testGetChildren() {
		Board b = new Board();
		State testState = new State(Player.RED, b, new Move(Player.RED, 4));
		testState.initializeChildren();
		for(State s: testState.getChildren()){
			//s.getBoard().makeMove(s.getLastMove());
			//System.out.println(s.getBoard());
			System.out.println("yipeee"+ s);
			try{
				s.getLastMove();
			}catch(NullPointerException ex){
				System.out.println("there is a null pointer exception");
			}
		}
	}

	
	public static void testCreateGameTree(){
		Board b = new Board();
		State testState = new State(Player.YELLOW, b, null);
		AI.createGameTree(testState, 4);
		testState.writeToFile();
	
	}
	
	public static void TestGetMoves(){
		Board b = new Board();
		State testState = new State(Player.YELLOW, b, null);
	}
	
	public static void testMinMax(){
		Board b = new Board();
		Move m = new Move(Player.YELLOW, 0);
		b.makeMove(m);
		m = new Move(Player.YELLOW, 0);
		b.makeMove(m);
		m = new Move(Player.YELLOW, 0);
		b.makeMove(m);
		
		State testState = new State(Player.RED, b, null);
		AI.createGameTree(testState, 2);
		AI.minimax(new AI(Player.RED, 5),testState);
		
		testState.writeToFile();	
	}
	
	public static void testMinMaxValues(){
		Board b = new Board();
		State testState = new State(Player.RED, b, null);
		AI.createGameTree(testState, 1);
		AI.minimax(new AI(Player.RED, 5),testState);
		for(State s:testState.getChildren()){
			System.out.println(s.getValue());
		};

	}
}

