package projects;
import java.util.*;

public class TicTacToe {
	public static void main(String[] args) {
		char[][] board = new char[3][3];
		
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				board[i][j]=' ';
			}
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DO you want to play: (Y/N)");
		
		char choice = sc.next().charAt(0);
		boolean gameOver=false;
		
		do {
			System.out.println("Do you want to be player X: (Y/N)");
			char ch = sc.next().charAt(0);
			char player = (ch == 'y' || ch == 'Y') ? 'X' : 'O';
			char currentPlayer = player;
			
			while(!gameOver) {
				printBoard(board);
				playerMove(board,currentPlayer,sc);
				
				boolean result = checkGameOver(board,player);
				if(result) {
					System.out.println("Player "+player+ " has won!!!!!");
					gameOver=true;
				}
				else if (isBoardFull(board)) {
                    printBoard(board);
                    System.out.println("The game is a draw!");
                    gameOver = true;
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
			}
			
			System.out.println("Do you want to play Again: (Y/N)");
			choice=sc.next().charAt(0);
			if(choice=='n' || choice=='N') {
				System.out.println("Thankyou for playing..");
			}
			resetBoard(board);
			gameOver=false;
			
		}while(choice=='Y' || choice=='y');
		
	}

	private static boolean isBoardFull(char[][] board) {
		 for (int i = 0; i < board.length; i++) {
	         for (int j = 0; j < board[0].length; j++) {
	             if (board[i][j] == ' ') {
	                 return false;
	             }
	         }
	    }
		return true;
	}

	private static void resetBoard(char[][] board) {
		
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board.length;j++) {
				board[i][j]=' ';
			}
		}
		
	}

	private static boolean checkGameOver(char[][] board ,char player) {
		
		for(int i=0;i<board.length;i++) {
			if(board[i][0]==player && board[i][1]==player && board[i][2]==player) {
				return true;
			}
		}
		for(int j=0;j<board.length;j++) {
			if(board[0][j]==player && board[1][j]==player && board[2][j]==player) {
				return true;
			}
		}
		if(board[0][0]==player && board[1][1]==player && board[2][2]==player ) {
			return true;
		}
		if(board[1][1]==player && board[0][2]==player && board[2][0]==player) {
			return true;
		}
		return false;
	}

	private static void playerMove(char[][] board, char currentPlayer, Scanner sc) {
		
		int row,col;
		while(true) {
			System.out.println("Player " + currentPlayer +" , Enter your move: (row and column)");
			row=sc.nextInt();
			col=sc.nextInt();
			
			if(row>=0 && row<3 && col<3 && col>=0 && board[row][col]==' ') {
				board[row][col]=currentPlayer;
				break;
			}
			else {
				System.out.println("Enter a valid move!");
			}
		}
	}

	private static void printBoard(char[][] board) {
		System.out.println("-----------");
		for(int row = 0;row<board.length;row++) {
			if (row > 0) {
                System.out.println("-----------");
            }
			for(int col=0;col<board[0].length;col++) {
				if (col > 0) {
                    System.out.print(" | ");
                }
				System.out.print(board[row][col]+" ");
			}
			System.out.println();
		}
		System.out.println("-----------");
		System.out.println();
		
	}
}
