package chessGame;

public class King {
	public boolean getPermission(String [][] grid,int j, int i, int l, int k, char colour) {
		boolean result = false;

		if((j == l) && ((i + 1 == k) || (i - 1 == k)) && ((grid[k][l].charAt(3) == colour) || (grid[k][l].charAt(3) == '.') || (grid[k][l].charAt(3) == '*'))) {
			result = true;
			return result;
		}else if((i == k) && ((j + 1 == l) || (j - 1 == l)) && ((grid[k][l].charAt(3) == colour) || (grid[k][l].charAt(3) == '.') || (grid[k][l].charAt(3) == '*'))){
			result = true;
			return result;
		}else if((((i + 1 == k) && (j + 1 == l)) || ((i - 1 == k) && (j + 1 == l)) || ((i + 1 == k) && (j - 1 == l)) || ((i - 1 == k) && (j - 1 == l))) && ((grid[k][l].charAt(3) == colour) || (grid[k][l].charAt(3) == '.') || (grid[k][l].charAt(3) == '*'))) {
			result = true;
			return result;
		}
		return result;	
	}
}
		


