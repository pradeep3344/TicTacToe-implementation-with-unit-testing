package com.tictactoe.code;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class ResultAnalyserTest {
    @Test
    public void testAnalyze() {
        char[][] board = {
                {'X', 'O', 'O'},
                {'X', 'X', 'O'},
                {'O', 'X', 'X'}
        };
        ResultAnalyser analyser = new ResultAnalyser(board);
        ResultType result = analyser.analyze();
        assertEquals(ResultType.Win, result);
    }
}
