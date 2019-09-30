
import java.util.Scanner;
import java.util.Random;
import java.math.*;

public class Game {
	
	private static boolean isBoardFull(char[][] board) {
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				if (board[x][y] == ' ') {
					return false;
				}
			}
		}
		return true;
	}

	private static int checkBoard(char[][] board) {
		
		for (int x = 0; x < 3; x++) {
			if (board[x][0] != ' ' && board[x][0] == board[x][1] && board[x][0] == board[x][2]) {
				return board[x][0];
			}
			if (board[0][x] != ' ' && board[0][x] == board[1][x] && board[0][x] == board[2][x]) {
				return board[0][x];
			}
		}
		
		if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
			return board[0][0];
		}
		
		if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
			return board[0][0];
		}
		
		if (isBoardFull(board)) {
			return 99;
		}
		
		return 0;
	}
	
	public static void drawBoard(char[][] board) {
		System.out.println("X Y0 1 2");
		System.out.println("0: " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("1: " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("2: " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
	}

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Random rn = new Random();
		
		int win = 0;
		
		char[][] board = new char[3][3];
		
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				board[x][y] = 32;
			}
		}
		
		/* Draw ascii stuff
		for (char x = 32; x < 'z'; x++) {
			System.out.print(x + 0);
			System.out.println(":" + x);
		}
		*/
		
		
		
		while (win == 0) {
			drawBoard(board);
			
			System.out.print("Enter position (x y): ");
			int x = sn.nextInt();
			int y = sn.nextInt();
			
		
			if (x >= 0 && y >=0 && x < 3 && y < 3) {
				board[x][y] = 88;
			
			
				while (board[x][y] != 32) {
					x = Math.abs(rn.nextInt()) % 3;
					y = Math.abs(rn.nextInt()) % 3;
				} 
				
				board[x][y] = 79;
			}
			
			win = checkBoard(board);
			
		}
		
		if (win == 99) {
			System.out.println("It's a tie!");
		} else if (win == 88) { //88 is ascii chart number for 'X'
			System.out.println("X has won!");
		} else {				//79 is ascii chart number for 'O'
			System.out.println("O has won!");
		}
		
		drawBoard(board);

		//Java starts program here.
		
		/*
		
		Token.count = 100;
		System.out.println(Token.getCount());
		
		
		
		
		
		Token x = new Token("X");
		Token y = new Token("Y");
		Token p = x;
		
		
		x.symbol = "Z";
		
		p.Draw();
		p = y;
		p.Draw();
		*/
		/*
		addTwo a = new addTwo();
		addTwo b = new addTwo();
		
		System.out.println(addTwo.count);
		
		a.count = 100;
		
		System.out.println(b.count);
		*/

	}


}

