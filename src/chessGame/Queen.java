package chessGame;

public class Queen {
	private Rock rock;
	private Bishop bishop;
	
	public Queen() {
		this.rock = new Rock();
		this.bishop = new Bishop();
	}
	
	public boolean getPermission(String [][] grid,int j, int i, int l, int k,char colour) {
		boolean result = false;
		
		if((j == l) || (i == k) ) {
			 result = this.rock.getPermission(grid, j, i, l, k,colour);
		}else if(((l - j) / (k - i) == 1) || ((l - j) / (k - i) == -1)) {
			 result = this.bishop.getPermission(grid, j, i, l, k,colour);
		}
		return result;
	}
}
