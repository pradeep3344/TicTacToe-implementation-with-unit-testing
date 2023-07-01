package com.tictactoe.code;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoardTest {
    private Board board;

    @BeforeEach
    public void setUp() {
        board = new Board();
    }

    @Test
    public void testBoardCreation() {
        assertEquals(3, board.getSize());

        for (int row = 0; row < board.getSize(); row++) {
            for (int col = 0; col < board.getSize(); col++) {
                Cell cell = board.getCell(row, col);
                assertEquals(MarkType.Empty, cell.getMark());
            }
        }
    }

    @Test
    public void testMarkCell() {
        board.markCell(0, 0, MarkType.X);
        assertEquals(MarkType.X, board.getCell(0, 0).getMark());
    }
}