package projects.tictactoe;

public class TicTacToe {
    private TicTacToe()
    {

    }
    public static void runGame() {
        GameFunction gf=new GameFunction();
        gf.gameBoard();
        gf.fillGameBoard();
    }

}
