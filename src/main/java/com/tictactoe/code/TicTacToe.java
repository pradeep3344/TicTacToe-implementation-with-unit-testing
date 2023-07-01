package com.tictactoe.code;

class TicTacToe {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private ResultAnalyser resultAnalyser;

    public TicTacToe() {
        this.board = new Board();
        this.resultAnalyser = new ResultAnalyser(null);
    }

    public void startGame(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        currentPlayer = player1;
    }

    public void markCell(int row, int col) {
        board.markCell(row, col, currentPlayer.getMark());
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    public ResultType checkResult() {
        return resultAnalyser.analyze();
    }
}
