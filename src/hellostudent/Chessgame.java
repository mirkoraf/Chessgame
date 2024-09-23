package hellostudent;

public class Chessgame {

	public static void main(String[] args) {

		int size = 8;

		String[][] chessboard = new String[size][size];

		String pawn = "P";
		String rook = "R";
		String knight = "X";
		String bishop = "B";
		String king = "K";
		String queen = "Q";

		chessboard[0][0] = rook + "(B)";
		chessboard[0][1] = knight + "(B)";
		chessboard[0][2] = bishop + "(B)";
		chessboard[0][3] = king + "(B)";
		chessboard[0][4] = queen + "(B)";
		chessboard[0][5] = bishop + "(B)";
		chessboard[0][6] = knight + "(B)";
		chessboard[0][7] = rook + "(B)";
		
		chessboard[size-1][0] = rook + "(W)";
		chessboard[size-1][1] = knight + "(W)";
		chessboard[size-1][2] = bishop + "(W)";
		chessboard[size-1][3] = king + "(W)";
		chessboard[size-1][4] = queen + "(W)";
		chessboard[size-1][5] = bishop + "(W)";
		chessboard[size-1][6] = knight + "(W)";
		chessboard[size-1][7] = rook + "(W)";

		for (int i = 0; i < size; i++) {
			chessboard[1][i] = pawn + "(B)";
			chessboard[size - 2][i] = pawn + "(W)";
		}
		for (int i = 0; i < chessboard.length; i++) {
			
			for (int j = 0; j < chessboard.length; j++) {
				System.out.print(chessboard[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
