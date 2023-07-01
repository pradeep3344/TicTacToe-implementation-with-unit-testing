package com.tictactoe.code;

class Board {
    private final int SIZE = 3;
    private Cell[][] cells;

    public Board() {
        cells = new Cell[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    public int getSize() {
        return SIZE;
    }

    public Cell getCell(int row, int col) {
        return cells[row][col];
    }

    public void markCell(int row, int col, MarkType mark) {
        if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
            throw new InvalidLocationException("Invalid cell location.");
        }

        Cell cell = cells[row][col];
        if (!cell.isEmpty()) {
            throw new CellAlreadyMarkedException("Cell already marked.");
        }

        cell.setMark(mark);
    }
}