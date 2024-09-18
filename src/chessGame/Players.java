package chessGame;

import java.util.Scanner;

public class Players {
	private Pawn pawn;
	private Rock rock;
	private Knight knight;
	private Bishop bishop;
	private King king;
	private Queen queen;
	private int j;
	private int i;
	private int l;
	private int k;
	
	public Players() {
		this.pawn = new Pawn();
		this.rock = new Rock();
		this.knight = new Knight();
		this.bishop = new Bishop();
		this.king = new King();
		this.queen = new Queen();
	}
	
	public boolean enterMove(String [][] grid,boolean flag) {
		Scanner input = new Scanner(System.in);
		String move = input.nextLine();
		this.j = (int) (72 - move.charAt(0));
		this.i = (int) (move.charAt(1) - 49);
		this.l = (int) (72 - move.charAt(3));
		this.k = (int) (move.charAt(4) - 49);
		if((grid[i][j].charAt(3) =='w') && (flag == true)) {
			return true;
		}else if((grid[i][j].charAt(3) =='b') && (flag == false)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean executPermissionWhite(String [][] grid) {
		boolean result = false;
		if(grid[i][j].charAt(4) =='P'){
			result = this.pawn.getPermissionWhite(grid,this.j,this.i,this.l,this.k);
			return result;
		}else if(grid[i][j].charAt(4) =='R') {
			result = this.rock.getPermission(grid,this.j,this.i,this.l,this.k,'b');
			return result;
		}else if(grid[i][j].charAt(4) =='N') {
			result = this.knight.getPermission(grid,this.j,this.i,this.l,this.k,'b');
			return result;
		}else if(grid[i][j].charAt(4) =='B') {
			result = this.bishop.getPermission(grid,this.j,this.i,this.l,this.k,'b');
			return result;
		}else if(grid[i][j].charAt(4) =='Q') {
			result = this.queen.getPermission(grid,this.j,this.i,this.l,this.k,'b');
			return result;
		}else if(grid[i][j].charAt(4) =='K') {
			result = this.king.getPermission(grid,this.j,this.i,this.l,this.k,'b');
			return result;
		}
		return result;
	}
	
	public boolean executPermissionBlack(String [][] grid) {
		boolean result = false;
		if(grid[i][j].charAt(4) =='P'){
			result = this.pawn.getPermissionBlack(grid,this.j,this.i,this.l,this.k);
			return result;
		}else if(grid[i][j].charAt(4) =='R') {
			result = this.rock.getPermission(grid,this.j,this.i,this.l,this.k,'w');
			return result;
		}else if(grid[i][j].charAt(4) =='N') {
			result = this.knight.getPermission(grid,this.j,this.i,this.l,this.k,'w');
			return result;
		}else if(grid[i][j].charAt(4) =='B') {
			result = this.bishop.getPermission(grid,this.j,this.i,this.l,this.k,'w');
			return result;
		}else if(grid[i][j].charAt(4) =='Q') {
			result = this.queen.getPermission(grid,this.j,this.i,this.l,this.k,'w');
			return result;
		}else if(grid[i][j].charAt(4) =='K') {
			result = this.king.getPermission(grid,this.j,this.i,this.l,this.k,'w');
			return result;
		}
		return result;
	}
	
	public int getJ() {
		return j;
	}
	
	public int getI() {
		return i;
	}
	
	public int getL() {
		return l;
	}
	
	public int getK() {
		return k;
	}
}
