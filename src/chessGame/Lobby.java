package chessGame;

public class Lobby {
	static Players whitePlayer = new Players();
	static Players blackPlayer = new Players();
	static boolean flag = true;	
	static boolean terminate = false;//true mean white turn
	public static void main(String[] args) {
		String [][] grid = new String [8][8];
		
		grid = fillGrid(grid);
		
		System.out.println("Welcom to chess game");
		printGrid(grid);
		
		
	}
	

	public static String [] [] fillGrid(String [] [] grid){
		boolean white = true;
		for(int i = 5; i >= 2; i--) {
			for(int j = 7; j >= 0; j--) {
				if(white) {
					grid[i][j] = "   ..";
					white = false;
				}else {
					grid[i][j] = "   **";
					white = true;
				}
			}
			white = !white;
		}
		
		for(int i = 0; i <= 7; i++) {
			grid[1][i] = "   wP";
			grid[6][i] = "   bP";
		}
		
		grid [0][0] = "   wR";
		grid [0][7] = "   wR";
		grid [7][0] = "   bR";
		grid [7][7] = "   bR";
		grid [0][1] = "   wN";
		grid [0][6] = "   wN";
		grid [7][1] = "   bN";
		grid [7][6] = "   bN";
		grid [0][2] = "   wB";
		grid [0][5] = "   wB";
		grid [7][2] = "   bB";
		grid [7][5] = "   bB";
		grid [0][3] = "   wK";
		grid [0][4] = "   wQ";
		grid [7][3] = "   bK";
		grid [7][4] = "   bQ";
		return grid;
	}
	
	public static void printGrid(String [][] grid) {
		for(int i = 65; i < 73; i++) {
			System.out.print("    "+(char) i);
		}
		System.out.println("");
		System.out.println("");
		for(int i = 7; i >= 0; i--) {
			System.out.print(i + 1);
			for(int j = 7; j >= 0; j--) {
					System.out.print(grid[i][j]);
			}
			System.out.println("");
			System.out.println("");
		}
		enterMove(grid);
	}
	
	public static void enterMove(String [][] grid){
		if(flag) {
			System.out.println("============");
			System.out.println("White player");
			System.out.println("============");
			if(whitePlayer.enterMove(grid, flag)) {
				if(whitePlayer.executPermissionWhite(grid)) {
					flag = !flag;
					executeMove(grid,whitePlayer,'w');
				}else {
					System.out.println("invalid movement");
					enterMove(grid);
				}
			}else {
				System.out.println("invalid movement");
				enterMove(grid);
			}	
		}else {
			System.out.println("============");
			System.out.println("black player");
			System.out.println("============");
			if(blackPlayer.enterMove(grid, flag)) {
				if(blackPlayer.executPermissionBlack(grid)) {
					flag = !flag;
					executeMove(grid,blackPlayer,'b');
				}else {
					System.out.println("invalid movement");
					enterMove(grid);
				}
			}else {
				System.out.println("invalid movement");
				enterMove(grid);
			}
		}	
	}
	
	public static void executeMove(String [][] grid,Players player,char colour) {
		if (grid[player.getK()][player.getL()].charAt(4) == 'K') {
			terminate = true;
		}
		
		grid[player.getK()][player.getL()] = grid[player.getI()][player.getJ()];
		
		if((grid[player.getK()][player.getL()].charAt(4) == 'P') && (colour == 'w') && (player.getK() == 7)) {
			grid[player.getK()][player.getL()] = "   wQ";
		}else if((grid[player.getK()][player.getL()].charAt(4) == 'P') && (colour == 'b') && (player.getK() == 0)) {
			grid[player.getK()][player.getL()] = "   bQ";
		}
		
		if(player.getI() % 2 == 0) {
			if(player.getJ() % 2 == 0) {
				 grid[player.getI()][player.getJ()] = "   ..";
			}else {
				 grid[player.getI()][player.getJ()] = "   **";
			}
		}else {
			if(player.getJ() % 2 == 0) {
				 grid[player.getI()][player.getJ()] = "   **";
			}else {
				 grid[player.getI()][player.getJ()] = "   ..";
			}
		}
		if(terminate && colour == 'w') {
			System.out.println("white player is winner");
		}else if(terminate && colour == 'b') {
			System.out.println("black player is winner");
		}else {
			printGrid(grid);
		}
		
	}
}
