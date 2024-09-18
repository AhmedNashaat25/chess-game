package chessGame;

public class Pawn {
	
	public boolean getPermissionWhite(String [][] grid,int j, int i, int l, int k) {
		boolean result = false;
	
		if(i == 1) {
			if((j == l) && ((i + 1 == k) || (i + 2 == k))) {
				for(int n = i + 1; n <= k; n++) {
					if((grid[n][j].charAt(3) == '.') || (grid[n][j].charAt(3) == '*')) {
						result = true;
					}else {
						result = false;
						break;
					}
				}
				if (result) {
					return result;
				}
			}else if(((j + 1 == l) || (j - 1 == l)) && (i + 1 == k) && (grid[k][l].charAt(3) != 'w') && (grid[k][l].charAt(3) != '.') && (grid[k][l].charAt(3) != '*')) {
				result = true;
				return result;
			}
		}else {
			if((j == l) && (i + 1 == k ) && ((grid[k][l].charAt(3) == '.') || (grid[k][l].charAt(3) == '*'))) {
				result = true;
				return result;
			}else if(((j + 1 == l) || (j - 1 == l)) && (i + 1 == k) && (grid[k][l].charAt(3) != 'w') && (grid[k][l].charAt(3) != '.') && (grid[k][l].charAt(3) != '*')) {
				result = true;
				return result;
			}	
		}
		return result;
		
	}
	
	public boolean getPermissionBlack(String [][] grid,int j, int i, int l, int k) {
		boolean result = false;
		
		if(i == 6) {
			if((j == l) && ((i - 1 == k) || (i - 2 == k))) {
				for(int n = i - 1; n >= k; n--) {
					if((grid[n][j].charAt(3) == '.') || (grid[n][j].charAt(3) == '*')) {
						result = true;
					}else {
						result = false;
						break;
					}
				}
				if (result) {
					return result;
				}
			}else if(((j + 1 == l) || (j - 1 == l)) && (i + 1 == k) && (grid[k][l].charAt(3) != 'b') && (grid[k][l].charAt(3) != '.') && (grid[k][l].charAt(3) != '*')) {
				result = true;
				return result;
			}
		}else {
			if((j == l) && (i - 1 == k ) && ((grid[k][l].charAt(3) == '.') || (grid[k][l].charAt(3) == '*'))) {
				result = true;
				return result;
			}else if(((j + 1 == l) || (j - 1 == l)) && (i + 1 == k) && (grid[k][l].charAt(3) != 'b') && (grid[k][l].charAt(3) != '.') && (grid[k][l].charAt(3) != '*')) {
				result = true;
				return result;
			}	
		}
		return result;
	}
}
