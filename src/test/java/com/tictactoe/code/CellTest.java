package com.tictactoe.code;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CellTest {
    private Cell cell;

    @BeforeEach
    public void setUp() {
        cell = new Cell();
    }

    @Test
    public void testCellCreation() {
        assertEquals(MarkType.Empty, cell.getMark());
    }

    @Test
    public void testSetMark() {
        cell.setMark(MarkType.X);
        assertEquals(MarkType.X, cell.getMark());
    }

    @Test
    public void testIsEmpty() {
        assertEquals(true, cell.isEmpty());
        cell.setMark(MarkType.O);
        assertEquals(false, cell.isEmpty());
    }
}