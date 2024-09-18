package chessGame;

public class Knight {
	public boolean getPermission(String [][] grid,int j, int i, int l, int k, char colour) {
		boolean result = false;
		
		if((i + 2 == k) || (i - 2 == k) ) {
			result = checkPath1(grid, j, l, k,result,colour);
		}else if((j + 2 == l) || (j - 2 == l) ) {
			result = checkPath2(grid, i, l, k,result,colour);
		}
		return result;
		
	}
	
	
	public boolean checkPath1(String [][] grid,int j, int l, int k, boolean result, char colour) {
		if(((j + 1 == l) || (j - 1 == l)) && ((grid[k][l].charAt(3) == colour) || (grid[k][l].charAt(3) == '.') || (grid[k][l].charAt(3) == '*'))) {
			result = true;
			return result;
		}
		return result;
	}
	
	public boolean checkPath2(String [][] grid, int i, int l, int k, boolean result, char colour) {
		if(((i + 1 == k) || (i - 1 == k)) && ((grid[k][l].charAt(3) == colour) || (grid[k][l].charAt(3) == '.') || (grid[k][l].charAt(3) == '*'))) {
			result = true;
			return result;
		}
		return result;
	}

}
