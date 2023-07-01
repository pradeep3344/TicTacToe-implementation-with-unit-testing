package com.tictactoe.code;
public class ResultAnalyser {
    private char[][] board;

    public ResultAnalyser(char[][] board) {
        this.board = board;
    }

    public ResultType analyze() {
        if (checkForWin('X')) {
            return ResultType.Win;
        } else if (checkForWin('O')) {
            return ResultType.Win;
        } else if (isBoardFull()) {
            return ResultType.Draw;
        } else {
            return ResultType.Progress;
        }
    }

    private boolean checkForWin(char symbol) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
            return true;
        }
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
            return true;
        }

        return false;
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
