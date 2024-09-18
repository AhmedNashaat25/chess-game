package chessGame;
// (i , j)  (k , l)  
public class Bishop {
	public boolean getPermission(String [][] grid,int j, int i, int l, int k, char colour) {
		boolean result = false;

		if(((l - j) / (k - i) == 1) && ((grid[k][l].charAt(3) == colour) || (grid[k][l].charAt(3) == '.') || (grid[k][l].charAt(3) == '*'))) {
			result = true;
			if (k > i) {
				result = checkPath1(grid, j, i, k, result);
			}else {
				result = checkPath2(grid, j, i, k, result);
			}
			if (result) {
					return result;
			}
		}else if(((l - j) / (k - i) == -1) && ((grid[k][l].charAt(3) == colour) || (grid[k][l].charAt(3) == '.') || (grid[k][l].charAt(3) == '*'))){
			result = true;
			if (l > j) {
				result = checkPath3(grid, j, i, l, result);
			}else {
				result = checkPath4(grid, j, i, l, result);
			}
			if (result) {
					return result;
			}
		}
		return result;
		
	}
	
	public boolean checkPath1(String [][] grid,int j, int i, int k, boolean result) {
		for(int n = i + 1; n < k; n++) {
			j++;
			if((grid[n][j].charAt(3) == '.') || (grid[n][j].charAt(3) == '*')) {
				result = true;
			}else {
				result = false;
				break;
			}
		}
		return result;
	}
	
	public boolean checkPath2(String [][] grid,int j, int i, int k, boolean result) {
		for(int n = i - 1; n > k; n--) {
			j--;
			if((grid[n][j].charAt(3) == '.') || (grid[n][j].charAt(3) == '*')) {
				result = true;
			}else {
				result = false;
				break;
			}
		}
		return result;
	}
	
	public boolean checkPath3(String [][] grid,int j, int i, int l, boolean result) {
		for(int n = j + 1; n < l; n++) {
			i--;
			if((grid[i][n].charAt(3) == '.') || (grid[i][n].charAt(3) == '*')) {
				result = true;
			}else {
				result = false;
				break;
			}
		}
		return result;
	}
	
	public boolean checkPath4(String [][] grid,int j, int i, int l, boolean result) {
		for(int n = j - 1; n > l; n--) {
			i++;
			if((grid[i][n].charAt(3) == '.') || (grid[i][n].charAt(3) == '*')) {
				result = true;
			}else {
				result = false;
				break;
			}
		}
		return result;
	}
}
