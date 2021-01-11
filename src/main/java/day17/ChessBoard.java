package day17;

public class ChessBoard {
    ChessPiece[][] chessPieces;

    public ChessBoard(ChessPiece[][] chessPieces) {
        this.chessPieces = chessPieces;
    }

   public void print() {
        for (int i = 0; i < chessPieces.length; i++) {
            for (int j = 0; j < chessPieces[i].length; j++) {
                System.out.print(chessPieces[i][j].getPicture());
            }
            System.out.println();
        }
    }
}
